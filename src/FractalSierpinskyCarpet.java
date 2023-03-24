import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FractalSierpinskyCarpet {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/fractalSierpinskyCarpet.png

        fractalSierpinskyCarpet(0, 0, WIDTH, graphics);
    }

    public static void fractalSierpinskyCarpet(int x, int y ,int size, Graphics graphics) {
        graphics.fillRect(x + size / 3, y + size / 3, size / 3,  size / 3);

        if (size > 5) {
            fractalSierpinskyCarpet(x, y, size / 3, graphics);
            fractalSierpinskyCarpet(x + size / 3, y, size / 3, graphics);
            fractalSierpinskyCarpet(x + size * 2 / 3, y, size / 3, graphics);
            fractalSierpinskyCarpet(x, y + size / 3, size / 3, graphics);
            fractalSierpinskyCarpet(x + size * 2 / 3, y + size / 3, size / 3, graphics);
            fractalSierpinskyCarpet(x, y + size * 2 / 3, size / 3, graphics);
            fractalSierpinskyCarpet(x + size / 3, y + size * 2 / 3, size / 3, graphics);
            fractalSierpinskyCarpet(x + size * 2 / 3, y + size * 2 / 3, size / 3, graphics);
        }
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
