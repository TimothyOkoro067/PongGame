import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class GameFrame extends JFrame{
    GamePanel panel;
    JFrame frame = new JFrame();
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(true);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
