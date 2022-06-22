package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String,Students> student = new HashMap<>();
        Students keller = new Students("Keller");
        keller.addGrade(40);
        keller.addGrade(50);
        keller.addGrade(70);

        Students jackson = new Students("Jackson");
        jackson.addGrade(98);
        jackson.addGrade(78);
        jackson.addGrade(80);

        Students nivlek =new Students("Nivlek");
        nivlek.addGrade(100);
        nivlek.addGrade(96);
        nivlek.addGrade(96);

        Students jake= new Students( " Jake");
        jake.addGrade(40);
        jake.addGrade(70);
        jake.addGrade(90);


        student.put("\t 1. Kira",keller);
        student.put("\t 2.DonkeyKanger",jackson);
        student.put("\t 3. JakersJakeJack",nivlek);
        student.put("\t 4. NivlikIsWeird",jake);


         Scanner input = new Scanner(System.in);

        System.out.print("Welcome!\n Here are the GitHub usernames of our student:\n ");
        student.forEach((username,students)->{

//            System.out.println(students.getName());

            System.out.println(username);

        });
        System.out.println("Which student would you like information on?");

        String reply = input.nextLine();
        student.get(reply);
        while(true){
        switch (reply) {
            case "1" -> {
                System.out.println(keller.getName());
                System.out.println(keller.getGradeAverage());

            }
            case "2" -> {
                System.out.println(jackson.getName());
                System.out.println(jackson.getGradeAverage());
            }
            case "3" -> {
                System.out.println(nivlek.getName());
                System.out.println(nivlek.getGradeAverage());
            }
            case "4" -> {
                System.out.println(jake.getName());
                System.out.println(jake.getGradeAverage());
            }
            default -> {
                System.out.println("PLease enter a valid username!");
                break;
            }
        }
        }



        //enhance for loop keyset! or forEach
        //create private scanner ;;
        //student.get(Scanner)
        //if statement
    }
}
