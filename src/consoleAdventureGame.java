import java.util.Random;
import java.util.Scanner;

public class consoleAdventureGame {
    public static void main(String[] args) {
        /////system object
        Scanner in=new Scanner(System.in);
        Random ran = new Random();

        //game variables
        String[] enemies={"Ghost", "Mummy", "Zombie", "Goblin", "Witch"};
        String[] strongEnemies={"Dragon, Demon, Cowboy,Random guy with a knife"};
        int maxEnemyHealth=70;
        int maxAttack=25;


        //player variables
        int health=100;
        int dps= 50;
        int numberOfPotions=3;
        int healthPotionHeal=20;
        int healthPotionDropChance= 30;//<--%


        boolean running= true;

        System.out.println("Welcome to the dungeon.....Now go away!");
        Game:
        while(running){
            System.out.println("----------------------");
           int enemyHealth = ran.nextInt(maxEnemyHealth);
           String enemy = enemies[ran.nextInt(enemies.length)];
            System.out.println("\t# "+ enemy +" has appeared #\n");

while (enemyHealth > 0){
    System.out.println("\t Your HP: "+ health);
    System.out.println("\t"+ enemy+ "'s HP: "+ enemyHealth);
    System.out.println("\n\t What are you going to do?");
    System.out.println("\tAttack");
    System.out.println("\tItems");
    System.out.println("\tRun");

    String input = in.nextLine();
}
        }
    }
    public static void player(){
         int hp;
         int maxHp;
         int xp;
         int atk;
         int def;
         int lvl;
         int potion;
    }

}
