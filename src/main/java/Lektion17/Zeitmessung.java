package Lektion17;

import java.io.*;

public class Zeitmessung {
    public void fileCopy(String filePath,String destFilePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            FileOutputStream fos = new FileOutputStream(destFilePath);

            long startTime = System.currentTimeMillis();
            int b;
            while ((b = fis.read()) != -1) fos.write(b);
            long endTime = System.currentTimeMillis();
            System.out.println("Kopieren dauerte: " + (endTime - startTime) + "ms");
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }catch (IOException e){System.out.println("Error");
            e.printStackTrace();
        }

    }
    public void bufferdFileCopy(String filePath,String destFilePath){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream(destFilePath);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            long startTime = System.currentTimeMillis();
            byte[] buffer = new byte[1024];
            int b;
            while ((b = bis.read(buffer)) != -1) bos.write(buffer,0,b);
            bos.flush();
            long endTime = System.currentTimeMillis();
            System.out.println("Kopieren dauerte: " + (endTime - startTime) + "ms");
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IOException e){System.out.println("Error");
            e.printStackTrace();}
    }
}
