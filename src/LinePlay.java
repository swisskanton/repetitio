import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlay {

    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/drawingProjectLinePlay.png

        int step = WIDTH / 15;
        for (int i = 0; i < 14; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(5, (i + 1) * step, (i + 1) * step, HEIGHT - 5);
            graphics.setColor(Color.magenta);
            graphics.drawLine((i + 1) * step,5, HEIGHT - 5, (i + 1) * step );
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
