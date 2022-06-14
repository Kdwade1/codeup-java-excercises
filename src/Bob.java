import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello I'm bob. Please talk to me!");
        String input = scanner.nextLine();

        if(input.endsWith("?")){
            System.out.println("sure");
        }
        else if(input.endsWith("!")){
            System.out.println("Whoa, chill out bro!");
        }
        else if (input.equals("")) {
            System.out.println("Fine. Be that way!");
        }
        else{
            System.out.println("Whatever.");
        }
    }
}
