// Write a swing program to check whether given word by user is of length 5 or not.
package unit1;

import javax.swing.*;
import java.awt.*;

public class Lab3 {

    public Lab3() {

        JFrame frame = new JFrame("Word Length Checker");

        JLabel label = new JLabel("Enter a word:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Check");
        JLabel result = new JLabel("Result appears here");

        frame.setLayout(new GridLayout(4, 1, 5, 5));

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(result);

        button.addActionListener(e -> {

            String word = textField.getText().trim();

            if (word.length() == 5) {
                result.setText("Word has 5 characters");
            } else {
                result.setText("Word does not have 5 characters");
            }

        });

        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Lab3();
    }
}
