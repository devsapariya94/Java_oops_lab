import java.awt.*;
import javax.swing.*;
import java.util.Random;

class Frame extends JFrame {
    Frame() {

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {

        g.setColor(new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
        g.fillOval(150, 150, 100, 100);
    }

}

class ColorChange extends Thread {
    Frame frame;

    ColorChange(Frame frame) {
        this.frame = frame;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            frame.repaint();
        }
    }

}

public class Qu10 {
    public static void main(String[] args) {
        Frame f = new Frame();
        ColorChange c = new ColorChange(f);
        c.start();
    }
}