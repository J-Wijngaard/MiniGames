package TicTacToe.GUI;


import OpeningScreen.OpeningsScreen;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTFrame extends JFrame implements ActionListener {

    JButton back = new JButton("Back");


    public TTTFrame() {
        setTitle("TicTacToe");
        setSize(1000, 1000);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        // Layouts & ButtonsArray
            JPanel tileGrid = new JPanel(new GridLayout(3, 3));
            JPanel players = new JPanel(new FlowLayout());
            XObuttons[] XOtile = new XObuttons[9];// Jbutton array


            // Grid Layout
            tileGrid.setBorder(new EmptyBorder(100, 10, 100, 10));
            add(tileGrid, BorderLayout.CENTER);
            add(players, BorderLayout.NORTH);
            players.setBackground(Color.lightGray);


            // Place Tiles
            for (int i = 0; i < 9; i++) {
                XOtile[i] = new XObuttons();
                tileGrid.add(XOtile[i]);
                XOtile[i].addActionListener(this);
            }



            players.add(back);
            back.addActionListener(this);

            JLabel turnTekst = new JLabel("ronde" + XObuttons.value);
            players.add(turnTekst);




            setVisible(true);

        }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            new OpeningsScreen();
            this.dispose();
        }
       //if(){}

    }
}
