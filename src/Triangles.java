import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/drawingProjectTriangles.png

        int size = 14;
        int x = WIDTH / 2;
        int y = 0;
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j <= i; j++) {
                drawTriangle(x - i * size / 2 + j * size, y + i * size, size, graphics);
            }
        }
    }

    public static void drawTriangle(int x, int y ,int size, Graphics graphics) {
        graphics.drawLine(x - size / 2, y + size, x, y);
        graphics.drawLine(x, y, x + size / 2, y + size);
        graphics.drawLine(x - size / 2, y + size, x + size / 2, y + size);
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
