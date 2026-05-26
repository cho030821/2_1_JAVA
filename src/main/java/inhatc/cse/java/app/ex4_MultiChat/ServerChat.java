package inhatc.cse.java.app.ex4_MultiChat;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerChat extends JFrame {

    private JPanel panel1;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton Button;

    private ServerSocket server = null;
    public ArrayList<main.java.inhatc.cse.java.app.ex4_MultiChat.ServerThread> threadList;

    public ServerChat() {
        setTitle("멀티 채팅 서버");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        add(panel1);
        setVisible(true);

        Button.addActionListener(e -> sendMessage());
        textField1.addActionListener(e -> sendMessage());
    }

    private void sendMessage() {
        String outMsg = textField1.getText();
        if (outMsg.isEmpty()) return;

        textArea1.append("[서버] : " + outMsg + "\n");
        textField1.setText("");
        textField1.requestFocus();
    }

    private void setSocket() {
        try {
            threadList = new ArrayList<>();
            server = new ServerSocket(9999);
            textArea1.append("연결 대기중.....\n");

            new Thread(() -> {
                try {
                    while (true) {
                        Socket socket = server.accept();
                        textArea1.append("새로운 클라이언트가 연결되었습니다.\n");

                        ServerThread st = new ServerThread(socket, threadList);
                        threadList.add(st);
                        st.start();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ServerChat sc = new ServerChat();
        sc.setSocket();
    }
}