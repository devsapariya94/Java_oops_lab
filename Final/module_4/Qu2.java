import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

class Frame extends JFrame implements ActionListener {
    JLabel l1 = new JLabel("Greet");

    Frame() {
        super("Welcome JAVA-GUI");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton button = new JButton("GREET");
        button.addActionListener(this);
        add(button);
        add(l1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour >= 0 && hour < 12) {
            l1.setText("Good Morning");
        } else if (hour >= 12 && hour < 16) {
            l1.setText("Good Afternoon");
        } else if (hour >= 16 && hour < 21) {
            l1.setText("Good Evening");
        } else if (hour >= 21 && hour < 24) {
            l1.setText("Good Night");
        }

    }
}

public class Qu2 {
    public static void main(String[] args) {
        new Frame();
    }
}
