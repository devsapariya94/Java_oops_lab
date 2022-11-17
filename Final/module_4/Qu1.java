
import javax.swing.*;
import java.awt.*;

public class Qu1 extends JFrame {
    public Qu1() {
        super("Welcome JAVA-GUI");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new Qu1();
    }
}
