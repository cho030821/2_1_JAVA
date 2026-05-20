package main.java.inhatc.cse.java.basic.chapter15.ex3_buffed;

import java.io.*;

public class BufferedArrayCopy {
    static void main(String[] args) {
        try( BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\cho03\\Downloads\\mysql-installer-community-8.0.46.0.msi"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Temp\\myfile.exe"));
             ){
            long time = 0;
            time = System.currentTimeMillis();
            byte[] buffer = new byte[1024];
          int i = 0;
           while((i = bis.read(buffer)) != -1){
               bos.write(buffer,0,i);
           }
           time = System.currentTimeMillis() - time;
            System.out.println("복사완료");
           System.out.println(((float)time)/1000+ "초");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
