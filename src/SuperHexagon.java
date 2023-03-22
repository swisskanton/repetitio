import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/drawingProjectSuperHexagon.png

        int size = 44;
        int x = WIDTH / 2 - size / 4;
        int y = 0;
        for (int i = 7; i >3 ; i--) {
            for (int j = 0; j < i; j++) {
                if (i == 7)
                    drawHexagon(x, y + j * size, size, graphics);
                else {
                    drawHexagon(x - (7 - i) * size * 3 / 4, y + j * size + (7 - i) * size / 2, size, graphics);
                    drawHexagon(x + (7 - i) * size * 3 / 4, y + j * size + (7 - i) * size / 2, size, graphics);
                }


            }
       }
    }

    public static void drawHexagon(int x, int y ,int size, Graphics graphics) {
        graphics.drawLine(x, y, x + size / 2, y);
        graphics.drawLine(x + size / 2, y, x + size * 3 / 4, y + size / 2);
        graphics.drawLine(x + size * 3 / 4, y + size / 2, x + size / 2, y + size);
        graphics.drawLine(x + size / 2, y + size, x, y + size);
        graphics.drawLine(x, y + size, x - size / 4, y + size / 2);
        graphics.drawLine(x - size / 4, y + size / 2, x, y);
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
