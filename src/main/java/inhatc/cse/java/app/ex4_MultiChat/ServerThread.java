package main.java.inhatc.cse.java.app.ex4_MultiChat;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {
    private Socket socket;
    private ArrayList<ServerThread> threadList;
    private BufferedWriter out;
    private BufferedReader in;

    // [수정 1] 넘겨받은 객체를 멤버 변수에 확실히 저장합니다.
    public ServerThread(Socket socket, ArrayList<ServerThread> threadList) {
        this.socket = socket;
        this.threadList = threadList;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                String inMsg = in.readLine();
                // 클라이언트가 종료(null)했거나 강제 종료("bye" 등) 신호를 보내면 루프 탈출
                if (inMsg == null || inMsg.equalsIgnoreCase("bye")) {
                    break;
                }

                // [수정 3] 읽어온 메시지를 모든 클라이언트에게 방송(Broadcast)합니다.
                sendToAllClients(inMsg);
            }

        } catch (IOException e) {
            System.out.println("클라이언트 연결 끊김 오류");
        } finally {
            // [추가] 클라이언트가 나가면(break) 리스트에서 자신을 지우고 자원을 닫습니다.
            threadList.remove(this);
            try {
                if (in != null) in.close();
                if (out != null) out.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendToAllClients(String outMsg) {
        // threadList를 돌면서 '각 스레드가 가진' out을 사용해 전송합니다.
        for (ServerThread serverThread : threadList) {
            try {
                // [수정 2] out -> serverThread.out 으로 변경!
                serverThread.out.write(outMsg + "\n");
                serverThread.out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}