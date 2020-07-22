package OpeningScreen;

//import TicTacToe.GUI.GamePanel;
import HangMan.HGFrame;
import TicTacToe.GUI.TTTFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpeningsScreen extends JFrame implements ActionListener {

//    public JPanel GamePanel = new GamePanel();

    public JPanel topBar = new JPanel(new FlowLayout());
    public JPanel GamePicker = new JPanel(new GridLayout(4, 4));

    public JLabel gamesTekst = new JLabel("MINIGAMES");

    public JButton tttGame = new JButton("TicTacToe");
    public JButton hangmanGame = new JButton("HangMan /Coming soon/");

    public OpeningsScreen() {
        setTitle("Games");
        setSize(1000, 1000);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        add(topBar, BorderLayout.NORTH);
        topBar.add(gamesTekst);


        add(GamePicker, BorderLayout.CENTER);
        GamePicker.add(tttGame);
        tttGame.addActionListener(this);
        GamePicker.add(hangmanGame);
        hangmanGame.addActionListener(this);
      //  GamePicker.setBackground(Color.YELLOW);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tttGame) {
            new TTTFrame();
            this.dispose();
        }
            if(e.getSource() == hangmanGame){
                new HGFrame();
                this.dispose();
            }
    }
}
