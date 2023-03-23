import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FractalTriangles {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/fractalTriangles.png

        fractalTrianles(10, 10, WIDTH - 20, graphics);
    }

    public static void fractalTrianles(int x, int y ,int size, Graphics graphics) {
        drawTriangle(x, y, size / 2, graphics);
        drawTriangle(x + size / 2, y, size / 2, graphics);
        drawTriangle(x + size / 4, y + size / 2, size / 2, graphics);

        if (size > 10) {
            fractalTrianles(x, y, size / 2, graphics);
            fractalTrianles(x + size / 2 , y, size / 2, graphics);
            fractalTrianles(x + size / 4, y + size / 2, size / 2, graphics);
        }
    }

    public static void drawTriangle(int x, int y, int size, Graphics graphics) {
        graphics.drawLine(x, y, x + size, y);
        graphics.drawLine(x + size, y, x + size / 2, y + size);
        graphics.drawLine(x + size / 2, y + size, x, y);
    }

    static int WIDTH = 360;
    static int HEIGHT = 360;

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
