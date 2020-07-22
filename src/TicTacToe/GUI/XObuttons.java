package TicTacToe.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class XObuttons extends JButton implements ActionListener {
    public JPanel GamePanel;

    static int value = 0;
    ImageIcon X, O;

    XObuttons() {
        X = new ImageIcon(this.getClass().getResource("icons8-x-100.png"));
        O = new ImageIcon(this.getClass().getResource("icons8-o-100.png"));
        this.addActionListener(this);
        //System.out.println(value);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            value++;
        System.out.println(value);
        if(value%2 == 1){
            setIcon(X);
            setEnabled(false);
            setBackground(Color.orange);
        }else if(value%2 ==0){
            setIcon(O);
           setEnabled(false);
           setBackground(Color.cyan);
        }else{
            setIcon(null);
        }
        }
    }


