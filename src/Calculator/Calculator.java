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

        textField= new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(false);
        frame.add(textField);

        addButton=new JButton("+");
        subButton=new JButton("-");
        multiButton=new JButton("*");
        divideButton=new JButton("/");
        deciButton=new JButton(".");
        equButton=new JButton("=");
        deleButton=new JButton("del");
        clearButton=new JButton("C");

        functionButton[0]=addButton;
        functionButton[1]=subButton;
        functionButton[2]=multiButton;
        functionButton[3]=divideButton;
        functionButton[4]=deciButton;
        functionButton[5]=equButton;
        functionButton[6]=deleButton;
        functionButton[7]=clearButton;

        for (int i =0; i<8; i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(myFont);
            functionButton[i].setFocusable(false);
        }

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
