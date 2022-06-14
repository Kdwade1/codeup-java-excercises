import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {

//


//        System.out.println(Addition(5, 4));
//        System.out.println(Subtraction(5, 4));
//        System.out.println(Multiply(5, 4));
//        System.out.println(Division(5, 4));
//        System.out.println(Modulus(8, 4));
//        System.out.println(multiplyWithoutSymbol(-90, -6));
//        System.out.println(7 % 4);
//        range(1, 10);
        Scanner sc = new Scanner(System.in);


//        while (true) {
//            System.out.println("Enter a number between One and Ten!");
//            int num = sc.nextInt();
//            if (num <= 10 && num >= 0) {
//                System.out.println("\nFactorial of " + num + " is " + factorial(num));
//            }
//
//            System.out.println("Would you like to choose another number? (Y/N)");
//            String userChoice = sc.next();
//            if (userChoice.equalsIgnoreCase("n")) break;
//
//        }
while(true) {
    System.out.println("Enter the number of sides of the dice");
    int userInput = sc.nextInt();
    System.out.println("Would you like to roll the dice?(y/n)");
    String choice = sc.next();
    if (choice.equalsIgnoreCase("y")) {
        dice();
    }else{
        System.out.println("lame");
        break;
    }

    System.out.println("Would you like to try again?(y/n)");
    String secondChoice = sc.next();
    if (secondChoice.equalsIgnoreCase("n")) {
        System.out.println("Lame");
    } else {
        dice();
    }
}




    }


    public static int Addition(int a, int b) {
        return a + b;
    }

    public static int Subtraction(int a, int b) {
        return a - b;
    }

    public static int Multiply(int a, int b) {
        return a * b;
    }

    public static double Division(double a, double b) {
        return a / b;
    }

    public static double Modulus(double a, double b) {
        return a % b;
    }

    public static int multiplyWithoutSymbol(int x, int y) {
        if (y == 0)
            return 0;

        if (y > 0)
            return x + multiplyWithoutSymbol(x, y - 1);


        if (y < 0)
            return -multiplyWithoutSymbol(x, -y);
        return -1;
    }

    //    Scanner scanner = new Scanner(System.in);


    public static void range(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10");
        int userInput = scanner.nextInt();
        if (userInput <= min || userInput >= max) {
            System.out.println("Please enter a valid number");
            range(min, max);
        } else
            System.out.println(userInput + " is valid");
//        range(min,max);


    }

    public static int factorial(int n) {

        int fact = 1;
        int i = 1;

        while (i <= n) {
            fact = fact * i;
            i++;
        }


        return fact;
    }

    public static void dice () {

        int die1= (int)(Math.random()*6+1);
        int die2= (int)(Math.random()*6+1);

        int die3=(int)(Math.random()*7+1);
        int die4=(int)(Math.random()*7+1);
        int die5=(int)(Math.random()*8+1);
        int die6=(int)(Math.random()*8+1);
        int die7=(int)(Math.random()*9+1);
        int die8=(int)(Math.random()*9+1);
        int die9=(int)(Math.random()*10+1);
        int die10=(int)(Math.random()*10+1);
        int sum1 = die1+die2;
        int sum2= die3+die4;
        int sum3= die5+die6;
        int sum4= die7+die8;
        int sum5= die9+die10;



//       int side6= System.out.println("First roll is: "+ die1+"second roll was"+ die2+" total is ="+sum1);
////       int side7= System.out.println(die3 "+" die4 "="sum2);






    }

    public static void playGame() {
        boolean decision=true;
        Scanner sc = new Scanner(System.in);
        int randoNumber = (int) Math.random() * 100 + 1;
        System.out.println("Guess the number between 1-100!");
        int userAnswer = sc.nextInt();
        int numOfGuesses = 5;
        int i, guess;
        for (i = 0; i < numOfGuesses; i++) {
            if (userAnswer == randoNumber) {
                System.out.println("Good Guess!");

            } else if (userAnswer < randoNumber) {
                System.out.println("Higher");

            } else if (userAnswer > randoNumber) {
                System.out.println("lower");

            }

        }
    }


}