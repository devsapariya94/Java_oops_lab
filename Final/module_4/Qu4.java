import javax.swing.*;

class StudentData {
    StudentData() {
        JFrame f = new JFrame("Student Data");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String data[][] = { { "1", "Dev", "90" },
                { "2", "Ronak", "96" },
                { "3", "Khush", "80" }
        };
        String column[] = { "Roll No", "NAME", "Marks" };

        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);

    }
}

public class Qu4 {
    public static void main(String[] args) {
        new StudentData();
    }
}