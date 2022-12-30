package Calculator;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButton = new JButton[10];
    JButton[] functionButton = new JButton[9];
    JButton addButton, subButton, multiButton, divideButton;
    JButton deciButton, equButton, deleButton, clearButton,negButton;
    JPanel panel;
    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);


        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divideButton = new JButton("/");
        deciButton = new JButton(".");
        equButton = new JButton("=");
        deleButton = new JButton("del");
        clearButton = new JButton("C");
        negButton = new JButton("(-)");

        functionButton[0] = addButton;
        functionButton[1] = subButton;
        functionButton[2] = multiButton;
        functionButton[3] = divideButton;
        functionButton[4] = deciButton;
        functionButton[5] = equButton;
        functionButton[6] = deleButton;
        functionButton[7] = clearButton;
        functionButton[8] = negButton;


        for (int i = 0; i < 9; i++) {
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(myFont);
            functionButton[i].setFocusable(false);
        }
        for (int i = 0; i < 10; i++) {
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
            numberButton[i].setFont(myFont);
            numberButton[i].setFocusable(false);

        }
        deleButton.setBounds(150, 430, 150, 50);
        clearButton.setBounds(250, 430, 150, 50);
        negButton.setBounds(50,430,100,50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
//        panel.setBackground(Color.gray);
        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(addButton);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(subButton);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(multiButton);
        panel.add(deciButton);
        panel.add(numberButton[0]);
        panel.add(equButton);
        panel.add(divideButton);

        frame.add(panel);
        frame.add(clearButton);
        frame.add(deleButton);
        frame.add(negButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i =0; i<10; i++){
            if(e.getSource()==numberButton[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==deciButton){
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource()==addButton){
            num1=Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if(e.getSource()==subButton){
            num1=Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if(e.getSource()==multiButton){
            num1=Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if(e.getSource()==divideButton){
            num1=Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if(e.getSource()==equButton){
            num2=Double.parseDouble(textField.getText());
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
            }
            textField.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clearButton){
            textField.setText("");
        }
        if(e.getSource()==deleButton){
            String string =textField.getText();
            textField.setText("");
            for(int i =0;i<string.length()-1;i++){
                textField.setText(textField.getText()+string.charAt(i));
            }
            if(e.getSource()==negButton){
                double temp= Double.parseDouble(textField.getText());
                temp *=-1;
                textField.setText(String.valueOf(temp));
            }
        }


    }
}
