import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // src/sources/drawingProjectLinePlay.png
        // Divide the canvas into 4/16/64 equal parts and repeat the line play pattern in each quarter

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of parts on the canvas (4/16/64): ");
        int quarters = scanner.nextInt();
        int parts = (int) (Math.sqrt(quarters));
        int size = WIDTH / parts;
        for (int i = 0; i < parts; i++) {
            for (int j = 0; j < parts; j++) {
                drawQuarter(i * size, j * size, size, graphics);
            }
        }
    }

    public static void drawQuarter(int x, int y ,int size, Graphics graphics) {
        int step = size / 15;
        for (int i = 0; i < 14; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(x, y + (i + 1) * step, x + (i + 1) * step, y + size);
            graphics.setColor(Color.magenta);
            graphics.drawLine(x + (i + 1) * step,y, x + size, y + (i + 1) * step );
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
