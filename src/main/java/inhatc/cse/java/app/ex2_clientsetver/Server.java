package main.java.inhatc.cse.java.app.ex2_clientsetver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(9999);
             Scanner sc = new  Scanner(System.in);
        ){
            System.out.println("연결 대기중");

            try(Socket socket  = server.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            ) {
                System.out.println("연결 완료");


                while (true) {
                    String inMsg = in.readLine();

                    if (inMsg.equals("bye")) {
                        System.out.println("통신 종료");
                        break;
                    }
                    System.out.println("클라이언트 : " + inMsg);
                    System.out.print("보내기 >>");
                    String outMsg = sc.nextLine();
                    out.write(outMsg + "\n");
                    out.flush();
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
