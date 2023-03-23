import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Hexagons {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/recursionHexagons.png

        drawHexagon(WIDTH / 4, 0, WIDTH / 2, graphics);
    }

    public static void drawHexagon(int x, int y ,int size, Graphics graphics) {
        graphics.drawLine(x, y, x + size, y);
        graphics.drawLine(x + size, y, x + size * 3 / 2, y + size);
        graphics.drawLine(x + size * 3 / 2, y + size, x + size, y + size * 2);
        graphics.drawLine(x + size, y + size * 2, x, y + size * 2);
        graphics.drawLine(x, y + size * 2, x - size / 2, y + size);
        graphics.drawLine(x - size / 2, y + size, x, y);

        if (size > 10) {
            drawHexagon(x, y, size / 2, graphics);
            drawHexagon(x + size * 3 / 4 , y + size / 2, size / 2, graphics);
            drawHexagon(x, y + size, size / 2, graphics);
        }
    }

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
            drawImage(graphics);
        }
    }
}