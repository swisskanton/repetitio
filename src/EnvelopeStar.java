import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/drawingProjectEnvelopeStar.png

        int size = WIDTH / 2;
        drawQuarter(0, 0, size, graphics);
        //drawQuarter(size, 0, size, graphics);
        //drawQuarter(0, size, size, graphics);
        //drawQuarter(size, size, size, graphics);
    }

    public static void drawQuarter(int x, int y ,int size, Graphics graphics) {
        int step = size / 14;
        graphics.setColor(Color.green);
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(size, y + (i + 1) * step, x + size - (i + 1) * step, y + size);
            graphics.drawLine(x + size, y + (i + 1) * step, x + size + (i + 1) * step, y + size);
            graphics.drawLine(x + size - (i + 1) * step, y + size, size, y + HEIGHT - (i + 1) * step);
            graphics.drawLine(x + size + (i + 1) * step, size, size, y + HEIGHT - (i + 1) * step);
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
