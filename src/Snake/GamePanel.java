package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class GamePanel extends JPanel implements ActionListener {
    static final int screen_Width = 600;
    static final int screen_Height = 600;
    static final int unit_Size = 25;
    static final int game_Unit = (screen_Width * screen_Height) / unit_Size;
    static final int delay = 75;
    final int x[] = new int[game_Unit];
    final int y[] = new int[game_Unit];
    int bodyParts = 6;
    int applesEaten = 0;
    int appleX;
    int appleY;
    char direction = 'R';
    char choice;
    boolean running = false;
    Timer timer;
    Random random;

    public GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(screen_Width, screen_Height));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new myKeyAdapter());
        startGame();

    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(delay, this);
        timer.start();


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }

    public void draw(Graphics g) {
        if (running) {
            for (int i = 0; i < screen_Height / unit_Size; i++) {
                g.drawLine(i * unit_Size, 0, i * unit_Size, screen_Height);
                g.drawLine(0, i * unit_Size, screen_Width, i * unit_Size);

            }
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, unit_Size, unit_Size);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], unit_Size, unit_Size);
                } else {
                    g.setColor(Color.blue);
                    g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255),random.nextInt(255)));
                    g.fillRect(x[i], y[i], unit_Size, unit_Size);
                }
                g.setColor(Color.red);
                g.setFont(new Font("INK FREE", Font.BOLD, 40));
                FontMetrics metrics = getFontMetrics(g.getFont());
                g.drawString("Score: " + applesEaten, (screen_Width - metrics.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
            }

        } else {
            playAgain(g);

        }
    }

    public void newApple() {
        appleX = random.nextInt((int) (screen_Width / unit_Size)) * unit_Size;
        appleY = random.nextInt((int) (screen_Height / unit_Size)) * unit_Size;


    }

    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];

        }
        switch (direction) {
            case 'U' -> y[0] = y[0] - unit_Size;
            case 'D' -> y[0] = y[0] + unit_Size;
            case 'L' -> x[0] = x[0] - unit_Size;
            case 'R' -> x[0] = x[0] + unit_Size;
        }

    }

    public void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }

    public void checkCollision() {
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0]) == y[i]) {
                running = false;
                break;
            }
        }
        //check if head touches left border
        if (x[0] < 0) {
            running = false;
        }
        if (x[0] > screen_Width) {
            running = false;

        }
        if (y[0] < 0) {
            running = false;
        }
        if (y[0] > screen_Height) {
            running = false;
        }
        if (!running) {
            timer.stop();
        }


    }
    public void playAgain(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("INK FREE", Font.BOLD, 75));
        FontMetrics metrics3 = getFontMetrics(g.getFont());
        g.drawString("PLAY AGAIN? Y   N", (screen_Width - metrics3.stringWidth("Play again? Y   N")) / 2, screen_Height / 2);

        if (choice == 'Y') {
            running = true;
        }else{
            gameOver(g);
        }
    }

    public void gameOver(Graphics g) {
        //score
        g.setColor(Color.red);
        g.setFont(new Font("INK FREE", Font.BOLD, 40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: " + applesEaten, (screen_Width - metrics1.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
       //game over
        g.setColor(Color.red);
        g.setFont(new Font("INK FREE", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("GAME OVER", (screen_Width - metrics2.stringWidth("GAME OVER")) / 2, screen_Height / 2);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollision();
        }
        repaint();

    }

    public class myKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }


        }
    }
}
