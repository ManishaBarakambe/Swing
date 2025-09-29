package Swing1;

import javax.swing.*;
public class JButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Example");
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 40);
        frame.add(button);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}