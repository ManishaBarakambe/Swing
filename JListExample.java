package Swing1;

import javax.swing.*;
public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        String[] items = {"Apple", "Banana", "Cherry"};
        JList<String> list = new JList<>(items);
        list.setBounds(100, 50, 100, 60);
        frame.add(list);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}