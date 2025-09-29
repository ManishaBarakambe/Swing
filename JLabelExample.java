package Swing1;

import javax.swing.*;
public class JLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");
        JLabel label = new JLabel("Hello, Swing!");
        label.setBounds(100, 100, 100, 30);
        frame.add(label);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}