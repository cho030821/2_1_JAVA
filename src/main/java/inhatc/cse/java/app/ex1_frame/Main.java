package inhatc.cse.java.app.ex1_frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextArea textArea1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton Button;

    public Main(){
        setTitle("채팅창");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        add(panel1);
        setVisible(true);
        Button.addActionListener(e ->{
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
        new Main();

    }
}
