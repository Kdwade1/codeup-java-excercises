package movies;

import java.util.Scanner;

public class MovieApplication {
    Movie[] mov = MoviesArray.findAll();


    public static void app(){
        System.out.println("Would you like to view our movies? (Y/N)");
        Scanner in = new Scanner(System.in);

        String response = in.nextLine();
        if(response.equalsIgnoreCase("y")){
            System.out.println("Great here are all our movies!");
        }else{
            System.out.println("That's such a shame but I understand!");
        }

    }
    public static void main(String[] args) {
   app();
    }
}
