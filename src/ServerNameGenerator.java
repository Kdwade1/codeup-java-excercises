import java.util.Random;
public class ServerNameGenerator {
    public static String randomElement(String [] arr) {
        int rand = new Random().nextInt(arr.length);
        return  arr[rand];
    }


    static String [] nouns ={"cat","dog","people","lizard","game","baby","computer","goat","water","fire"};
 static   String [] adjectives ={"Hot","Cold","Green","Sharp","rough","huge","small","gentle","charming","cruel"};

    public static void main(String[] args) {
        System.out.println(randomElement(nouns));
        System.out.println(randomElement(adjectives));
        System.out.println( randomElement(adjectives)+"-"+ randomElement(nouns));

    }

}
