import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class frame {
    JTextField t3 = new JTextField("");

    public frame(){
        JFrame f = new JFrame("Calculator");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new BorderLayout());
        JLabel l1 = new JLabel("First Number");
        JLabel l2 = new JLabel("Second Number");
        JLabel l3 = new JLabel("Answer");
        
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        //Grid Layout North Region add all lable
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        f.add(p1, BorderLayout.NORTH);

        //Grid Layout Add Button in south region
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 4));
        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Subtract");
        JButton b3 = new JButton("Multiply");
        JButton b4 = new JButton("Clear");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        f.add(p2, BorderLayout.SOUTH);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText(String.valueOf(c));
            }
        });
    
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                t3.setText(String.valueOf(c));
            }
        });
    
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                t3.setText(String.valueOf(c));
            }
        });
    
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });

    }

  
}

public class Qu5{
    public static void main(String[] args) {
        new frame();
    }
}