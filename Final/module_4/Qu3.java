
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

class Frame implements ActionListener {
    JLabel label = new JLabel("Message");

    public Frame() {
        JFrame frame = new JFrame("Welcome JAVA-GUI");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Formats");
        JMenuItem date = new JMenuItem("Date");
        JMenuItem dayOfMonth = new JMenuItem("DayOfMonth");
        JMenuItem weekNumber = new JMenuItem("WeekNumber");
        JMenuItem hours = new JMenuItem("Hours");
        JMenuItem dayOfYear = new JMenuItem("DayOfYear");
        date.addActionListener(this);
        dayOfMonth.addActionListener(this);
        weekNumber.addActionListener(this);
        hours.addActionListener(this);
        dayOfYear.addActionListener(this);
        menu.add(date);
        menu.add(dayOfMonth);
        menu.add(weekNumber);
        menu.add(hours);
        menu.add(dayOfYear);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        Calendar calendar = Calendar.getInstance();
        if (e.getActionCommand().equals("Date")) {
            label.setText(calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-"
                    + calendar.get(Calendar.YEAR));
        } else if (e.getActionCommand().equals("DayOfMonth")) {
            label.setText(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
        } else if (e.getActionCommand().equals("WeekNumber")) {
            label.setText(String.valueOf(calendar.get(Calendar.WEEK_OF_YEAR)));
        } else if (e.getActionCommand().equals("Hours")) {
            label.setText(String.valueOf(calendar.get(Calendar.HOUR_OF_DAY)));
        } else if (e.getActionCommand().equals("DayOfYear")) {
            label.setText(String.valueOf(calendar.get(Calendar.DAY_OF_YEAR)));
        }

    }
}

public class Qu3 {
    public static void main(String[] args) {
        new Frame();
    }
}