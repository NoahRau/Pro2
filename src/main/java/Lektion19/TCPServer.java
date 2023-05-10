package Lektion19;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        final int PORT = 5200;
        final String WORD = "network";
        int remainingAttempts = 6;
        String guessedWord = "_______";

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is listening on port " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                     ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream())) {

                    while (remainingAttempts > 0 && !guessedWord.equals(WORD)) {
                        // receive object from client
                        TCPClient.Guess guessx = (TCPClient.Guess) ois.readObject();
                        System.out.println(guessx);
                        String guess = guessx.answer;

                        // process guess
                        boolean correct = false;
                        for (int i = 0; i < WORD.length(); i++) {
                            if (WORD.charAt(i) == guess.charAt(0)) {
                                guessedWord = guessedWord.substring(0, i) + guess + guessedWord.substring(i + 1);
                                correct = true;
                            }
                        }
                        if (!correct) {
                            remainingAttempts--;
                        }

                        // prepare response object
                        String message = "Remaining attempts: " + remainingAttempts + "\nGuessed word: " + guessedWord;
                        if (guessedWord.equals(WORD)) {
                            message += "\nYou won!";
                        } else if (remainingAttempts == 0) {
                            message += "\nYou lost!";
                        }
                        boolean finished = guessedWord.equals(WORD) || remainingAttempts == 0;
                        Response response = new Response(message, finished, correct);

                        // send response object to client
                        oos.writeObject(response);
                        oos.flush();
                    }
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                remainingAttempts = 6;
                guessedWord = "_______";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

