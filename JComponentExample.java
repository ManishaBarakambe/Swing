package Swing1;

import javax.swing.*;
import java.awt.*;
public class JComponentExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComponent Example");
        JComponent customComponent = new JComponent() {
            protected void paintComponent(Graphics g) {
                g.drawString("Custom JComponent", 50, 50);
            }
        };
        customComponent.setBounds(50, 50, 200, 100);
        frame.add(customComponent);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}