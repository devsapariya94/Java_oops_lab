import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

class Frame {
    Frame(){
        CardLayout c = new CardLayout(40,30);
        JFrame f = new JFrame();
        f.setLayout(c);
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        f.add("a",b1);
        f.add("b",b2);
        f.add("c",b3);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.next(f.getContentPane());
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.next(f.getContentPane());
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.next(f.getContentPane());
            }
        });


    }
}

public class Qu9 {
    public static void main(String[] args) {
        new Frame();
    }
}
