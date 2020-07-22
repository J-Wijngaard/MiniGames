package TicTacToe.GUI;

import com.sun.jdi.Value;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

//
//public class GamePanel extends JPanel implements ActionListener{
//
//    JPanel tileGrid = new JPanel(new GridLayout(3,3));
//    JPanel players = new JPanel(new FlowLayout());
//    XObuttons[] XOtile = new XObuttons[9];// Jbutton array
//    JButton back = new JButton("Back");
//
//    public TextField player = new TextField(" ");
//
//
//
//    public GamePanel() {
//        setLayout(new BorderLayout());
//        setBackground(Color.lightGray);
//        setSize(500, 500);
//
//        // Grid Layout
//        tileGrid.setBorder(new EmptyBorder(100, 10, 100, 10));
//        add(tileGrid, BorderLayout.CENTER);
//        add(players, BorderLayout.NORTH);
//        players.setBackground(Color.lightGray);
//
//
//        // Place Tiles
//        for (int i = 0; i < 9; i++) {
//            XOtile[i] = new XObuttons();
//            tileGrid.add(XOtile[i]);
//        }
//
//        players.add(back);
//        players.add(player);
//        JLabel turnTekst = new JLabel("ronde" + XObuttons.value);
//        players.add(turnTekst);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == back){
//        }
//    }
//}


