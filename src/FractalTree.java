import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FractalTree {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/fractalTree.png

        graphics.setColor(new Color(0, 49, 63));
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.yellow);
        fractalTree(WIDTH / 2,HEIGHT - HEIGHT / 10, 30, -90.0, graphics);
    }

    private static void fractalTree(int x, int y, int size, double angle, Graphics graphics) {
        double rad = Math.PI / 180;

        int x1 = (int) (x + size * Math.cos(angle * rad));
        int y1 = (int) (y + size * Math.sin(angle * rad));

        graphics.drawLine(x, y, x1, y1);

        if (size > 15) {
            fractalTree(x1, y1, size - 2, angle, graphics);
            fractalTree(x1, y1, size - 2, angle + 27, graphics);
            fractalTree(x1, y1, size - 2, angle - 27, graphics);
        }
    }

    static int WIDTH = 400;
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
