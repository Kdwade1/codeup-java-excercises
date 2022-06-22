package movies;

public class Movie {
   private String name;
    private String genre;

//public Movie(String name, String genre){
//    this.name= name;
//    this.genre=genre;



    public String getName(String name) {
        return name;
    }

    public String getGenre(String genre) {
        return genre;
    }

    public Movie(String name, String genre){
        this.name= name;
        this.genre=genre;

    }
}