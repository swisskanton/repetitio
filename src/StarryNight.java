import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        Color[] colors = {new Color(255, 255, 255), new Color(242, 242, 242), new Color(230, 230, 230), new Color(217, 217, 217), new Color(204, 204, 204)};
        // -->  panel.setBackground(Color.black);
        for (int i = 0; i < 50; i++) {
            int size = (int) (Math.random() * 5);
            graphics.setColor(colors[(int) (Math.random() * 5)]);
            graphics.fillRect((int) (Math.random() * (WIDTH - size)), (int) (Math.random() * (HEIGHT - size)) ,size, size);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(Color.black);
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