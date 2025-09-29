package Swing1;

import javax.swing.*;
public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");
        JTextArea area = new JTextArea("Multiline text...");
        area.setBounds(50, 50, 200, 100);
        frame.add(area);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}