package Lektion22.YingYang;

public class Main {
    public static void main(String[] args){
        AutoMessager am = new AutoMessager("test");
        am.start();
        Thread yang = new Yang();
        yang.start();
        Thread anonym = new Thread(){
        @Override
        public void run(){
            while (true){
                System.out.println("Yang");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        }};
        anonym.start();
        AutoMessagerInterface amI = new AutoMessagerInterface();
        Thread amIt = new Thread(amI);
        amIt.start();
        while(true){
            System.out.println("Ying");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){e.printStackTrace();}
        }

    }
    public static class Yang extends Thread{
        @Override
        public void run(){
            while (true){
                System.out.println("Yang");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
