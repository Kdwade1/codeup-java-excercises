package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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
     char direction='R';
     boolean running=false;
     Timer timer;
     Random random;
    public GamePanel() {
         random=new Random();
        this.setPreferredSize(new Dimension(screen_Width,screen_Height));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new myKeyAdapter());
        startGame();

    }
    public void startGame(){
        newApple();
        running=true;
        timer=new Timer(delay,this);
        timer.start();


    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);

    }
    public void draw(Graphics g){
        for(int i =0; i<screen_Height/unit_Size;i++){
            g.drawLine(i*unit_Size,0,i*unit_Size,screen_Height);
            g.drawLine(0,i*unit_Size,screen_Width,i*unit_Size);

        }
        g.setColor(Color.red);
        g.fillOval(appleX,appleY,unit_Size,unit_Size);

    }
    public void newApple(){
        appleX=random.nextInt((int)(screen_Width/unit_Size))*unit_Size;
        appleY=random.nextInt((int)(screen_Height/unit_Size))*unit_Size;



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
