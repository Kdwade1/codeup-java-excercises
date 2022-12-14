package practice;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){
        JFrame jFrame = new JFrame();

        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout());
    }

    public static void main(String[] args) {
        new GUI();

    }
}
