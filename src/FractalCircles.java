import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FractalCircles {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/fractalCircles.png

        fractalCircles(10, 10, WIDTH - 20, graphics);
    }

    public static void fractalCircles(int x, int y ,int size, Graphics graphics) {
        drawlCircle(x, y, size, graphics);

        if (size > WIDTH / 16) {
            fractalCircles(x + size / 4, y, size / 2, graphics);
            fractalCircles(x + size / 25, y + size * 3 / 8, size / 2, graphics);
            fractalCircles(x + size * 23 / 50, y + size * 3 / 8, size / 2, graphics);
        }
    }

    public static void drawlCircle(int x, int y, int size, Graphics graphics) {
        graphics.drawOval(x, y, size, size);
    }

    static int WIDTH = 400;
    static int HEIGHT = 400;

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
