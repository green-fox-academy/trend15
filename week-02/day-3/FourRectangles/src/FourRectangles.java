import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){

            graphics.setColor(new Color(40,80,120));
            graphics.fillRect(40,40,40,60);

            graphics.setColor(new Color(120,50,99));
            graphics.fillRect(80,80,40,80);

            graphics.setColor(new Color(90,75,220));
            graphics.fillRect(200,200,40,90);

            graphics.setColor(new Color(2,2,45));
            graphics.fillRect(280,280,40,10);


        // draw four different size and color rectangles.
        // avoid code duplication.
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