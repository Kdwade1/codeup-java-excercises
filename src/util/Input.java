package util;

import java.util.Random;
import java.util.Scanner;

public class Input {
    private Scanner input =new Scanner(System.in);
    private Random scanner;

   public String getString(){
        System.out.println("Enter anything");
 return this.input.nextLine();

    }
   public boolean yesNo() {
        System.out.println("Enter yes");
        String[] yes = {"yes", "Ye", "Yep", "Y", "yeah"};
        String reply = input.nextLine();
        for (int i = 0; i < yes.length; i++) {
            if (reply.equalsIgnoreCase(yes[i])) {
                return true;
            }else{
                return false;
            }
            }
        return yesNo();
        }



     int getInt(int min, int max){

         System.out.println("PLease enter a integer between 1-10");
        int answer = input.nextInt();
        if (answer >= min && answer <= max){
            return answer;
        }
        return getInt(min,max);
    }
    int getInt(){
        System.out.println("Please enter a integer.");
 try {
           return Integer.valueOf(getString());

        }catch(Exception e){
            e.printStackTrace();
            return getInt();
        }
        }

    public int getIntegerSecret(int min, int max) {
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + (max - 1) + ".");
            input = this.scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }
   public double getDouble(double min, double max){
        System.out.println("Please enter a decimal number between 1.0-10.0");
        double answers= input.nextDouble();
        if (answers > min && answers< max){
            return answers;
        }
        return getDouble(min, max);
    }
   public  double getDouble(){
        System.out.println("Please enter a decimal number.");
//        double ans = input.nextDouble();
       try{
           return Double.valueOf(getString());
//           System.out.println("It's a double");
       }catch(Exception e){
           e.printStackTrace();
           return getDouble();
       }
//        return 0;
    }
   static int getBinary(String binary){
//        String binaryString = "1010";
//int decimal = Integer.parseInt(binaryString,2);
return Integer.parseInt(binary,2);
   }
 static int getHex(String hex){
        try {
            return Integer.parseInt(hex, 16);
        }catch(NumberFormatException e){
            e.printStackTrace();
            return getHex();
        }
 }

    private static int getHex() {
        return 0;
    }

    public static void main(String[] args) {
//        Input in = new Input();
//        System.out.println(in.getDouble());
//        in.getDouble(0.9, 9.9);
//        in.getString();
//        System.out.println(in.getInt());
//        in.getInt(1,10 );
//        System.out.println(in.yesNo());
//        in.getString();
//        System.out.println(getBinary("11111"));
        System.out.println(getHex("10"));


    }
    }

