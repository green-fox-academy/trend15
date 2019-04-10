import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        for (int i=0;i<=320;i+=40) {
            for (int j = 0; j <= 320; j += 40) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(i, j, 20, 20);
            }
        }
        for (int i=20;i<=320;i+=40) {
            for (int j = 20; j <= 320; j += 40) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(i, j, 20, 20);
            }
        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
            mainDraw(graphics);
        }
    }
}