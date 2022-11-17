import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
class JFrame1 {

    public JFrame1() {
        JFrame f = new JFrame("Calculator");
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);

        JTextArea input = new JTextArea("input");
        JTextArea output = new JTextArea("output");
        JTextArea answer = new JTextArea("answer");
        JTextArea textEqual = new JTextArea("=");
        JButton buttonSum = new JButton("+");
        JButton buttonSub = new JButton("-");
        JButton buttonMul = new JButton("*");
        JButton buttonClear = new JButton("clear");

        Border blackline = BorderFactory.createLineBorder(Color.black);
        input.setBorder(blackline);
        output.setBorder(blackline);

        //using grid
        java.awt.GridLayout grid = new GridLayout(2, 4);
        f.setLayout(grid);
        answer.setEditable(false);
        //adding components
        f.add(input);
        f.add(output);
        f.add(textEqual);
        f.add(answer);
        f.add(buttonSum);
        f.add(buttonSub);
        f.add(buttonMul);
        f.add(buttonClear);
       
        //adding action listener
        buttonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSumActionPerformed(evt);
            }

            private void buttonSumActionPerformed(ActionEvent evt) {
                int a = Integer.parseInt(input.getText());
                int b = Integer.parseInt(output.getText());
                int c = a + b;
                System.out.println(c);
                answer.setText(Integer.toString(c));
            }
        });
        f.setVisible(true);
        
    }
}


public class CalculatorSwing{

    public static void main(String[] args) {
        new JFrame1();
    }
}