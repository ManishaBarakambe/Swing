package Swing1;

import javax.swing.*;
public class JMenuBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenuBar Example");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setSize(300, 250);
        frame.setVisible(true);
    }
}