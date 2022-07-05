import java.util.Scanner;

public class HighLow {

    public static void game() {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        int randomNumber = (int) (Math.random() * 100) + 1;

        while (running) {

            System.out.println("Guess a number between 1 and 100");
            int input = scan.nextInt();
            if (input == randomNumber) {
                System.out.println("How about that.... You got it!");
                System.out.println("Wanna try again? (Y/N)");
                String choice = scan.next();
                if (choice.equalsIgnoreCase("n")) {
                    running = false;
                }
            } else if (input < randomNumber) {
                System.out.println("Higher");

            } else if (input > randomNumber) {
                System.out.println("Lower");

            }

        }
    }

    public static void main(String[] args) {
        game();
    }
}
