package Swing1;

import javax.swing.*;
import java.awt.*;
public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setBounds(50, 50, 200, 100);
        frame.add(panel);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
