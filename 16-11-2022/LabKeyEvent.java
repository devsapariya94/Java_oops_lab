import javax.security.auth.x500.X500Principal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LabKeyEvent extends JFrame implements KeyListener {
    int x=0;
    int y=0;
   public LabKeyEvent() {
      setTitle("LabKeyEvent");
      setSize(300, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(new Draw());
      addKeyListener(this);
   }

   class Draw extends JPanel{
        public void paintComponent(Graphics g) {
             g.setColor(Color.BLUE);
             g.fillRect(x, y, 50, 50);

        }
   }

   public void keyPressed(KeyEvent e){
        if(e.getKeyChar()=='u'){
            y-=10;
        }
        if(e.getKeyChar()=='d'){
            y+=10;
        }
        if(e.getKeyChar()=='l'){
            x-=10;
        }
        if(e.getKeyChar()=='r'){
            x+=10;
        }
        repaint();
   }
   public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public static void main(String[] args) {
        LabKeyEvent frame = new LabKeyEvent();
        frame.setVisible(true);
    }

}