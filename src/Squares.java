import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Squares {

    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/recursionSquares.png

        graphics.setColor(Color.yellow);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.black);
        graphics.drawRect(0, 0, WIDTH, HEIGHT);

        drawSquares(0, 0, WIDTH, graphics);
    }

    public static void drawSquares(int x, int y ,int size, Graphics graphics) {

        graphics.drawLine(x + size / 3, y, x + size / 3, y + size);
        graphics.drawLine(x + size * 2 / 3, y, x + size * 2 / 3, y + size);
        graphics.drawLine(x, y + size / 3, x + size, y + size / 3);
        graphics.drawLine(x, y + size * 2 / 3, x + size, y + size * 2 / 3);

        if (size > 20) {
            drawSquares(x + size / 3, y, size / 3, graphics);
            drawSquares(x , y + size / 3, size / 3, graphics);
            drawSquares(x + size * 2 / 3, y + size / 3, size / 3, graphics);
            drawSquares(x + size / 3, y + size * 2 / 3, size / 3, graphics);
        }
    }

    static int WIDTH = 590;
    static int HEIGHT = 590;

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
            drawImage(graphics);
        }
    }
}
