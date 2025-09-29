package Swing1;

import javax.swing.*;
public class JComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(100, 100, 100, 30);
        frame.add(comboBox);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}