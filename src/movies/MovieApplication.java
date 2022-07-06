package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MovieApplication {


    public static void app() {
        boolean running = true;
        Movie[] mov = MoviesArray.findAll();
        Input sc = new Input();

        while (running) {

            System.out.println("Select a number!");
            System.out.println("0- Exit");
            System.out.println("1 - Movie's list");
            System.out.println("2- See Musical genre");
            System.out.println("3 - Drama movies");
            System.out.println("4 - Horror movies");
            System.out.println("5 - sci-fi movies");
            System.out.println("6- Add a movie");
//            int num = sc.getIntegerSecret(0,7);
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case ("0") -> {
                    System.out.println("Are you sure?");
                    in.nextLine();
                    boolean confirm = sc.yesNo();
                    if (confirm) {
                        System.out.println("Fine....Be that way! closing.....");
                        running = false;

                    } else {
                        System.out.println("Okay then!");

                    }
                }
                case ("1") -> {
                    for (Movie movie : mov) {
                        System.out.println(movie.getName() + "---" + movie.getGenre());
                    }
                }
                case ("2") -> {
                    for (Movie movie : mov) {
                        if (movie.getGenre().equals("musical")) {
                            System.out.println(movie.getName() + "-----" + movie.getGenre());
                        }
                    }
                }
                case ("3") -> {
                    for (Movie movie : mov) {
                        if (movie.getGenre().equals("drama")) {
                            System.out.println(movie.getName() + "-----" + movie.getGenre());
                        }
                    }
                }
                case ("4") -> {
                    for (Movie movie : mov) {
                        if (movie.getGenre().equals("horror")) {
                            System.out.println(movie.getName() + "-----" + movie.getGenre());
                        }
                    }
                }
                case ("5") -> {
                    for (Movie movie : mov) {
                        if (movie.getGenre().equals("sci-fi")) {
                            System.out.println(movie.getName() + "-----" + movie.getGenre());
                        }
                    }
                }
                case ("6") -> {
                    in.nextLine();
                    System.out.println("What the title of this movie...");
                    String title = sc.getString();
                    System.out.println("What Genre is your movie?");
                    String genre = sc.getString().toLowerCase();
                    Movie newMov = new Movie(title, genre);
                    mov = addMovie(mov, newMov);
                    System.out.println("New movie is now added! Confirm?");
                    boolean response = sc.yesNo();
                    if (response) {
                        for (Movie movie : mov) {
                            System.out.println(movie.getName() + "----------" + movie.getGenre());
                        }

                    } else {
                        System.out.println("I see...okay then..");
                    }

            }

        }



        }
    }
    private static Movie[] addMovie(Movie[] movies, Movie movie){
        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length - 1] = movie;
        return movies;
    }

    public static void main(String[] args) {
   app();
    }
}
