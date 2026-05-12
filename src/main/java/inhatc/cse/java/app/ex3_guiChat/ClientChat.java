package main.java.inhatc.cse.java.app.ex3_guiChat;

import main.java.inhatc.cse.java.app.ex1_frame.Main;

import javax.swing.*;

public class ClientChat extends javax.swing.JFrame {
    private JTextArea textArea1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton Button;

    public ClientChat() {
        setTitle("클라");
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
    }

    static void main(String[] args) {
        new ClientChat();

    }
}
