package Swing1;

import javax.swing.*;
public class JDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Parent Frame");
        JDialog dialog = new JDialog(frame, "Dialog Example", true);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }
}
