package main.java.inhatc.cse.java.app.ex3_guiChat;

import javax.swing.*;
import java.io.*;
import java.net.Socket;

public class ClientChat extends javax.swing.JFrame {
    private JTextArea textArea1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton Button;

    private Socket socket;
    private BufferedReader in;
    private BufferedWriter out;

    public ClientChat() {
        setTitle("클라");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        add(panel1);
        setVisible(true);


        Button.addActionListener(e -> inputMsg());
        textField1.addActionListener(e -> inputMsg());
    }


    private void inputMsg() {
        String text = textField1.getText();



        if (out == null) {
            textArea1.append("[오류] 서버와 연결되지 않았습니다.\n");
            return;
        }

        try {

            out.write(text + "\n");
            out.flush();

            textArea1.append("나 >> " + text + "\n");
            textField1.setText("");


            if (text.equalsIgnoreCase("bye")) {
                closeAll();
                System.exit(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
            textArea1.append("메시지 전송 실패\n");
        }
    }


    public void setSocket() {
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
                    closeAll();
                }
            });
            receiveThread.start();

        } catch (IOException e) {
            textArea1.append("[서버 연결 실패]\n");
            e.printStackTrace();
        }
    }


    private void closeAll() {
        try {
            if (out != null) out.close();
            if (in != null) in.close();
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClientChat cc = new ClientChat();
        cc.setSocket();
    }
}