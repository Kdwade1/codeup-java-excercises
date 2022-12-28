package Calculator;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton[] numberButton =new JButton[10];
    JButton[] functionButton =new JButton[8];
    JButton addButton,subButton,multiButton,divideButton;
    JButton deciButton,equButton,deleButton,clearButton;
    JPanel panel;
    Font myFont = new Font("Ink Free",Font.BOLD,30);
    double num1=0, num2=0,result =0;
    char operator;

    public Calculator() {
        frame= new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
