package HangMan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class HGFrame extends JFrame implements ActionListener {

    JTextArea anwserArea = new JTextArea(10,10);

    JButton hintButton = new JButton("Hint");
    JButton backButton = new JButton("Back");
    JButton restartButton = new JButton("Restart");

public HGFrame(){
    setTitle("Hangman");
    setSize(1000, 1000);
    setLayout(new BorderLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel drawingPanel = new JPanel(new BorderLayout());
drawingPanel.setPreferredSize(new Dimension(500,500));
drawingPanel.setBackground(Color.yellow);

JPanel textPanel = new JPanel(new BorderLayout());
textPanel.setPreferredSize(new Dimension(100,100));
add(drawingPanel, BorderLayout.NORTH);
add(textPanel, BorderLayout.CENTER);

JPanel buttonBar = new JPanel(new GridLayout(1,3));
add(buttonBar, BorderLayout.SOUTH);
buttonBar.setPreferredSize(new Dimension(100,100));
buttonBar.add(backButton);
buttonBar.add(restartButton);
buttonBar.add(hintButton);
buttonBar.setBackground(Color.green);


textPanel.add(anwserArea);


    setVisible(true);

}









    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
