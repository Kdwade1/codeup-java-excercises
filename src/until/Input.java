package until;

import java.util.Scanner;

public class Input {
    private Scanner input =new Scanner(System.in);

    String getString(){
        System.out.println("Enter anything");
 return input.nextLine();

    }
    boolean yesNo() {
        System.out.println("Enter yes");
        String[] yes = {"yes", "Ye", "Yep", "Y", "yeah"};
        String reply = input.nextLine();
        for (int i = 0; i < yes.length; i++) {
            if (reply.equalsIgnoreCase(yes[i])) {
                return true;
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
        return input.nextInt();
    }
    double getDouble(double min, double max){
        System.out.println("Please enter a decimal number between 1.0-10.0");
        double answers= input.nextDouble();
        if (answers > min && answers< max){
            return answers;
        }
        return getDouble(min, max);
    }
    double getDouble(){
        System.out.println("Please enter a decimal number.");
        double ans = input.nextDouble();
        return ans;
    }

    public static void main(String[] args) {
        Input in = new Input();
        System.out.println(in.getDouble());
        in.getDouble(0.9, 9.9);
        System.out.println(in.getInt());
        in.getInt(1,10 );
        System.out.println(in.yesNo());
        in.getString();


    }
    }

