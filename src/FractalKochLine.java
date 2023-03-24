import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FractalKochLine {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/fractalKochLine.png

        fractalKochLine(4,WIDTH - 25, HEIGHT / 2, 25, HEIGHT / 2,  graphics);
    }

    private static void fractalKochLine(int step, int x0, int y0, int x1, int y1, Graphics graphics) {
        double sq = Math.sqrt(3) / 6;

        int dx = x1 - x0;
        int x2 = x0 + dx / 3;
        int x3 = (int) ((x0 + x1) / 2 + sq * (y0 - y1));
        int x4 = x0 + dx * 2 / 3;

        int dy = y1 - y0;
        int y2 = y0 + dy / 3;
        int y3 = (int) ((y0 + y1) / 2 + sq * (x1 - x0));
        int y4 = y0 + dy * 2 / 3;

        if (step == 1) {
            graphics.drawLine(x0, y0, x1, y1);
        } else {
            fractalKochLine(step - 1, x0, y0, x2, y2, graphics);
            fractalKochLine(step - 1, x2, y2, x3, y3, graphics);
            fractalKochLine(step - 1, x3, y3, x4, y4, graphics);
            fractalKochLine(step - 1, x4, y4, x1, y1, graphics);
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
