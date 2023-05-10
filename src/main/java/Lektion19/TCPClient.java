package Lektion19;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        final int PORT = 5200;
        final String HOST = "localhost";

        try (Socket connectionToServer = new Socket(HOST, PORT);
             ObjectOutputStream os = new ObjectOutputStream(connectionToServer.getOutputStream());
             ObjectInputStream is = new ObjectInputStream(connectionToServer.getInputStream());
        ) {
            while (connectionToServer.isConnected()) {

                // send guess object to server
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter guess: ");
                String guess = sc.nextLine();
                os.writeObject(new Guess(guess));
                os.flush();

                // receive response object from server
                Response response = (Response) is.readObject();

                // print response
                System.out.println(response.getMessage());
                if (response.isFinished()) {
                    System.out.println(response.getMessage());
                    System.exit(0);
                } else if (response.isCorrect()) {
                    System.out.println("You guessed a Letter!");
                } else {
                    System.out.println("Wrong guess.");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static class Guess implements Serializable {
        String answer;
        public Guess(String answer){
            this.answer=answer;
        }

        @Override
        public String toString(){
            return answer;
        }
    }
}