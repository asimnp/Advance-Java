// Write a program to take two inputs using JOptionPane Dialog and sum those inputs then display the result in information dialog box.
package unit1;

import javax.swing.JOptionPane;

public class Lab6 {

    public static void main(String[] args) {

        // Take first input
        String input1 = JOptionPane.showInputDialog(
                "Enter first number:"
        );

        // Take second input
        String input2 = JOptionPane.showInputDialog(
                "Enter second number:"
        );

        // Convert String inputs into integers
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        // Calculate sum
        int sum = num1 + num2;

        // Display result
        JOptionPane.showMessageDialog(
                null,
                "Sum = " + sum,
                "Result",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
