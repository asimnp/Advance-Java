package unit1;

import javax.swing.*;
import java.awt.*;

public class Lab4 {

    public Lab4() {

        JFrame frame = new JFrame("Addition and Subtraction");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JTextField result = new JTextField();

        JButton add = new JButton("Add");
        JButton subtract = new JButton("Subtract");

        result.setEditable(false);

        frame.setLayout(new GridLayout(5, 2, 5, 5));

        frame.add(new JLabel("First Number:"));
        frame.add(num1);

        frame.add(new JLabel("Second Number:"));
        frame.add(num2);

        frame.add(new JLabel("Result:"));
        frame.add(result);

        frame.add(add);
        frame.add(subtract);

        // Addition
        add.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());

            result.setText(String.valueOf(a + b));
        });

        // Subtraction
        subtract.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());

            result.setText(String.valueOf(a - b));
        });

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Lab4();
    }
}
