package main.java.inhatc.cse.java.app.ex3_guiChat;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat extends JFrame {
    private JTextArea textArea1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton Button;
    private ServerSocket server = null;
    private Socket socket = null;
    private BufferedReader in = null;
    private BufferedWriter out = null;


    public ServerChat() {
        setTitle("서버");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        add(panel1);
        setVisible(true);
        Button.addActionListener(e -> {
            inputMsg();
        });
        textField1.addActionListener(e -> {
            inputMsg();
        });
    }

    private void inputMsg() {


        try {
            socket = new Socket("localhost", 9999);


            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            textArea1.append("[서버에 연결되었습니다]\n");


            Thread receiveThread = new Thread(() -> {
                try {
                    while (true) {
                        String inMsg = in.readLine();
                        if (inMsg == null) {
                            textArea1.append("[서버와 연결이 끊어졌습니다]\n");
                            break;
                        }

                        textArea1.append("서버 >> : " + inMsg + "\n");
                    }
                } catch (IOException e) {
                    textArea1.append("[서버 연결 종료]\n");
                } finally {

                }
            });
            receiveThread.start();

        } catch (IOException e) {
            textArea1.append("[서버 연결 실패]\n");
            e.printStackTrace();
        }

    }

    static void main(String[] args) {
        ServerChat sc = new ServerChat();
        try {
            sc.setSocket();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setSocket() throws IOException {
        server = new ServerSocket(9999);
        Scanner sc = new Scanner(System.in);

        textArea1.append("연결 대기중 \n");

        socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        textArea1.append("연결 완료! " + "\n");


        while (true) {
            String inMsg = in.readLine();

            if (inMsg.equals("bye")) {
                textArea1.append("통신 종료 \n");
                break;
            }
            textArea1.append("클라이언트 : " + inMsg + "\n");

        }
    }


}


