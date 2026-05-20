package main.java.inhatc.cse.java.basic.app.ex0_frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextArea sTextArea;
    private JTextField textField1;
    private JButton button1;

    public Main(){
        setTitle("내 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500,400);
        setVisible(true);

        add(panel1);

        button1.addActionListener(this);
    }

    static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == button1){
            JOptionPane.showMessageDialog(this,"버튼이 눌렸어요");
        }
    }
}
