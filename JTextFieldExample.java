package Swing1;

import javax.swing.*;
public class JTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Example");
        JTextField textField = new JTextField("Type here");
        textField.setBounds(50, 100, 200, 30);
        frame.add(textField);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}