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

    public ServerChat() {
        setTitle("서버");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        String text = textField1.getText();
        textArea1.append(text + "\n");
        textField1.setText("");

        try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));) {
            out.write(text + "\n");
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
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


