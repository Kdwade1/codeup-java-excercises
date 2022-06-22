package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Students> student = new HashMap<>();

        Students keller = new Students("Keller");
        keller.addGrade(40);
        keller.addGrade(50);
        keller.addGrade(70);

        Students jackson = new Students("Jackson");
        jackson.addGrade(98);
        jackson.addGrade(78);
        jackson.addGrade(80);

        Students nivlek = new Students("Nivlek");
        nivlek.addGrade(100);
        nivlek.addGrade(96);
        nivlek.addGrade(96);

        Students jake = new Students(" Jake");
        jake.addGrade(40);
        jake.addGrade(70);
        jake.addGrade(90);

//Student usernames/ names
        student.put("Kira", keller);
        student.put("KonkeyDanger", jackson);
        student.put("JakersJakeJack", nivlek);
        student.put("NivlikIsWeird", jake);


        Scanner input = new Scanner(System.in);

        System.out.print("Welcome!\n Here are the GitHub usernames of our student:\n ");
        //Loop
        student.forEach((username, students) -> {

//            System.out.println(students.getName());

            System.out.println("|"+username+"|");

        });

        while (true) {
            System.out.println("Which student would you like information on?");
            String reply = input.nextLine();
            System.out.println(reply);
//            System.out.println(student);
            if(!student.containsKey(reply)){
                System.out.println("Invalid choice.");
            } else {
                System.out.println("Nice!");
                Students foundStudent = student.get(reply);
                System.out.println(foundStudent.getName());
                System.out.println(foundStudent.getGradeAverage());
                student.forEach((key, val) -> {
                    if(val.equals(foundStudent)) System.out.println(key);
                });



            }


//            student.containsKey(reply);
//            student.get(reply).

//if (student.containsKey(reply))
//    System.out.println(student);
//            switch (reply) {
//                case "1" -> {
//                    System.out.println(keller.getName());
//                    System.out.println(keller.getGradeAverage());
//                    break;
//
//                }
//                case "2" -> {
//                    System.out.println(jackson.getName());
//                    System.out.println(jackson.getGradeAverage());
//                    break;
//                }
//                case "3" -> {
//                    System.out.println(nivlek.getName());
//                    System.out.println(nivlek.getGradeAverage());
//                    break;
//                }
//                case "4" -> {
//                    System.out.println(jake.getName());
//                    System.out.println(jake.getGradeAverage());
//                    break;
//                }
//                default -> {
//                    System.out.println("PLease enter a valid username!");
//                    continue;
//
//                }


            }
        }


        //enhance for loop keyset! or forEach
        //create private scanner ;;
        //student.get(Scanner)
        //if statement
    }
//}
