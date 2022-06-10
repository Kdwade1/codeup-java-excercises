import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {


        double pi = 3.14159;
        System.out.format("This value of pie is: %.2f%n",pi);

        Scanner scanner = new Scanner(System.in);
// Asking for number.
        System.out.println("Enter a number.");
        int userNum = scanner.nextInt();
        scanner.nextLine();
// Enter three words
        System.out.println("Enter 3 words");
        String first = scanner.next();
        String second= scanner.next();
        String third= scanner.next();
        System.out.println("You said:"+first);
        System.out.println("You said:"+second);
        System.out.println("You said:"+third);
// Giving user a sentence
        scanner.nextLine();
        System.out.println("Enter a sentence.");
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence was: " +userSentence);
        //Parsing
        System.out.println("Enter the length of the classroom.");
        String classLength =  scanner.nextLine();
        System.out.println("This is the length: "+ classLength);
        System.out.println("Enter the width of the classroom.");
        String classWidth = scanner.nextLine();
        System.out.println("This is the width " + classWidth);
        scanner.nextLine();

        int lengthNum = Integer.parseInt(classLength);
        int widthNum=Integer.parseInt(classWidth);
        int areaOFClass= lengthNum * widthNum;
        int perimeterOfClass= lengthNum *2 + widthNum *2;
        System.out.println(areaOFClass);
        System.out.println(perimeterOfClass);


    }

}
