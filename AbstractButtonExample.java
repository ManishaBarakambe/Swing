package Swing1;

import javax.swing.*;
public class AbstractButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AbstractButton Example");
        AbstractButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 40);
        frame.add(button);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}