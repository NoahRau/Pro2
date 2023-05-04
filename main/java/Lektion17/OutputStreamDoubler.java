package Lektion17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

    public class OutputStreamDoubler extends OutputStream {
        private final OutputStream out1;
        private final OutputStream out2;
        private boolean error1 = false;
        private boolean error2 = false;

        public OutputStreamDoubler(OutputStream out1, OutputStream out2) {
            this.out1 = out1;
            this.out2 = out2;
        }

        @Override
        public void write(int b) throws IOException {
            try {
                out1.write(b);
            } catch (IOException e) {
                System.err.println("Error writing to out1:");
                e.printStackTrace();
                error1 = true;
            }
            try {
                out2.write(b);
            } catch (IOException e) {
                System.err.println("Error writing to out2:");
                e.printStackTrace();
                error2 = true;
            }
            if (error1 && error2) {
                throw new IOException("Both streams had errors");
            }
        }

        @Override
        public void close() throws IOException {
            IOException ex1 = null;
            IOException ex2 = null;
            try {
                out1.close();
            } catch (IOException e) {
                ex1 = e;
            }
            try {
                out2.close();
            } catch (IOException e) {
                ex2 = e;
            }
            if (ex1 != null || ex2 != null) {
                String msg = "";
                if (ex1 != null) {
                    msg += "Error closing out1: " + ex1.getMessage();
                }
                if (ex2 != null) {
                    if (!msg.isEmpty()) {
                        msg += "\n";
                    }
                    msg += "Error closing out2: " + ex2.getMessage();
                }
                throw new IOException(msg);
            }
        }
        public static void main(String[] args) throws IOException {
            FileOutputStream fos1 = new FileOutputStream("file1.txt");
            FileOutputStream fos2 = new FileOutputStream("file2.txt");
            OutputStreamDoubler doubler = new OutputStreamDoubler(fos1, fos2);

            doubler.write("Hello, world!".getBytes());

            doubler.close();
        }
    }
