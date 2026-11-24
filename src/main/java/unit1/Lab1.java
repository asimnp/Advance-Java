// Write a java program to display a simple Jframe.
package unit1;

import javax.swing.JFrame;

public class Lab1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
