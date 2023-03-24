import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FractalSquareGrid {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/fractalSquareGrid.png

        fractalSquare(0, 0, WIDTH, 16, graphics);
    }

    public static void fractalSquare(int x, int y ,int size, int thick, Graphics graphics) {
        drawSquareGrid(x, y, size, thick, graphics);

        if (size > 50) {
            fractalSquare(x, y, size / 2, thick / 2, graphics);
            fractalSquare(x + size / 2 , y, size / 2, thick / 2, graphics);
            fractalSquare(x, y + size / 2, size / 2, thick / 2, graphics);
            fractalSquare(x + size / 2, y + size / 2, size / 2, thick / 2, graphics);
        }
    }

    public static void drawSquareGrid(int x, int y, int size, int thick, Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics.create();
        g2d.setStroke(new BasicStroke(thick));
        g2d.drawRect(x + size / 4, y + size / 4, size / 2, size / 2);
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
