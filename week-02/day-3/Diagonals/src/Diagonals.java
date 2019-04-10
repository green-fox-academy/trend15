import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {

    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void mainDraw(Graphics graphics,int x,int y) {
        // Draw the canvas' diagonals.

        // If it starts from the upper-left corner it should be green, otherwise it should be red.
        if (x == 0 && y == 0) {
            graphics.setColor(Color.GREEN);
        } else {
            graphics.setColor(Color.RED);
        }
        graphics.drawLine(x, y, WIDTH, HEIGHT);
    }

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please give me the x cordinat to draw a diagonal: ");
            int x = scanner.nextInt();
            System.out.println("Please give me the y cordinat to draw a diagonal: ");
            int y = scanner.nextInt();
            mainDraw(graphics,x,y);
        }
    }
}