package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Time;
import java.util.Random;


public class GamePanel extends JPanel implements ActionListener {
    static final int screen_Width =600;
    static final int screen_Height =600;
    static final int unit_Size= 25;
    static final int game_Unit =(screen_Width*screen_Height)/unit_Size;
    static final int delay=75;
     final int x[]= new int[game_Unit];
     final int y[]= new int[game_Unit];
     int bodyParts=6;
     int applesEaten=0;
     int appleX;
     int appleY;
     char direction='d';
     boolean running=false;
     Time timer;
     Random random;
    public GamePanel() {

    }
    public void startGame(){

    }
    public void paintComponent(Graphics g){

    }
    public void draw(Graphics g){

    }
    public void move(){

    }
    public void checkApple(){

    }
    public void checkCollision(){

    }
    public void gameOver(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public class myKeyAdapter extends KeyAdapter{
        @Override public void keyPressed(KeyEvent e){

        }
    }
}
