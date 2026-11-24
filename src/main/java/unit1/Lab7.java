// Write a program to draw 2d shapes(line, rect and circle)  in Frame.
package unit1;

import java.awt.*;

public class Lab7 extends Frame {

    public Lab7() {
        setTitle("2D Shapes");
        setSize(500, 400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        // Draw Line
        g.setColor(Color.RED);
        g.drawLine(50, 80, 200, 80);

        // Draw Rectangle
        g.setColor(Color.BLUE);
        g.drawRect(50, 120, 150, 80);

        // Draw Circle
        g.setColor(Color.GREEN);
        g.drawOval(250, 100, 100, 100);
    }

    public static void main(String[] args) {
        new Lab7();
    }
}
