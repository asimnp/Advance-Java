// Write a Java program to display calculator like program. And also use event handling to make that calculator
// workable.
package unit1;

import javax.swing.*;
import java.awt.*;

public class Lab2 {

    private final JTextField t1;
    private final JTextField t2;
    private final JTextField result;

    public Lab2() {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(350, 250);
        frame.setLayout(new GridLayout(5, 2, 5, 5));

        t1 = new JTextField();
        t2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        add.addActionListener(e -> calculate('+'));
        sub.addActionListener(e -> calculate('-'));
        mul.addActionListener(e -> calculate('*'));
        div.addActionListener(e -> calculate('/'));

        frame.add(new JLabel("First Number:"));
        frame.add(t1);

        frame.add(new JLabel("Second Number:"));
        frame.add(t2);

        frame.add(new JLabel("Result:"));
        frame.add(result);

        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void calculate(char operator) {

        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double r = 0;

            switch (operator) {
                case '+': r = a + b; break;
                case '-': r = a - b; break;
                case '*': r = a * b; break;

                case '/':
                    if (b == 0) {
                        result.setText("Cannot divide by zero");
                        return;
                    }
                    r = a / b;
                    break;
            }

            result.setText(String.valueOf(r));

        } catch (NumberFormatException e) {
            result.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new Lab2();
    }
}
