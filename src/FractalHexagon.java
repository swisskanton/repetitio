import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FractalHexagon {

    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/fractalHexagons.png

        drawHexagon(WIDTH / 4 + 5, 0, WIDTH / 2 - 10, graphics);
    }
    public static void drawHexagon(int x, int y ,int size, Graphics graphics) {
        graphics.drawLine(x, y, x + size, y);
        graphics.drawLine(x + size, y, x + size * 3 / 2, y + size);
        graphics.drawLine(x + size * 3 / 2, y + size, x + size, y + size * 2);
        graphics.drawLine(x + size, y + size * 2, x, y + size * 2);
        graphics.drawLine(x, y + size * 2, x - size / 2, y + size);
        graphics.drawLine(x - size / 2, y + size, x, y);

        if (size > 3) {
            drawHexagon(x, y, size / 3, graphics);
            drawHexagon(x + size * 2 / 3, y, size / 3, graphics);
            drawHexagon(x + size, y + size * 2 / 3, size / 3, graphics);
            drawHexagon(x + size * 2 / 3, y + size * 4 / 3, size / 3, graphics);
            drawHexagon(x, y + size * 4 / 3, size / 3, graphics);
            drawHexagon(x - size / 3, y + size * 2 / 3, size / 3, graphics);
        }
    }

    static int WIDTH = 340;
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
