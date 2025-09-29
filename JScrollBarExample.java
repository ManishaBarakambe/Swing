package Swing1;

import javax.swing.*;
public class JScrollBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollBar Example");
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(100, 50, 20, 100);
        frame.add(scrollBar);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}