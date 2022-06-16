import java.util.Random;
import java.util.Scanner;
import Pi.enemies;

public class consoleAdventureGame {
    public static void main(String[] args) {
        /////system object
        Scanner in=new Scanner(System.in);
        Random ran = new Random();

        //game variables

        Object[] foes ={};
        String[] enemies={"Ghost", "Mummy", "Zombie", "Goblin", "Witch"};
        String[] strongEnemies={"Dragon", "Demon", "Cowboy","Random guy with a bat"};
        int maxEnemyHealth=70;
        int maxAttack=25;
int minAttack = 10;



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
    if(input.equals("1")){
        int damageDealt= ran.nextInt(dps);
        int damageTaken= ran.nextInt(maxAttack);

        enemyHealth-=damageTaken;
        health-=damageTaken;

        System.out.println("\t> You struck the "+enemy + " for "+ damageDealt+"damage. ");
        if (enemyHealth >1) {
            System.out.println("\t The " + enemy + " attacked...");
            System.out.println("\t> You taken "+damageTaken+" damage.");
        }

        if(health <1){
            System.out.println("Wow this is awkward...it seems that you lost.....I told you not to come here..");
            break;
        }

    } else if (input.equals("2")) {
        if(numberOfPotions>0){
            health+=healthPotionHeal;
            numberOfPotions--;
            System.out.println("\t> This seems kinda cheap but you've healed for "+ healthPotionHeal+"HP. \n\t You now have "+ health+"HP. The monster looks really disappointed in you..\n\t> You now have "+numberOfPotions +"potions left.");
        }else{
            System.out.println("Hahaha you're luck ran out. The monster looks gleeful!");
        }
    } else if (input.equals("3")) {
        System.out.println("\t You've run away from the "+enemy+"! You've pondered on why you've even entered the dungeon if you're just going to run.");
        continue Game;
    }else{
        System.out.println("Invalid....can't you read the option....");
    }
}
if(health<1){
    System.out.println("The monsters laugh at you for not reading the sign. You crawl out of the dungeon to disobey another day...");
    break;
}
            System.out.println("-----------------------------------------------------");
            System.out.println(" # " +enemy + " was taken down.. # ");
            System.out.println(" # you have " +
                    + health+"hp left.");
            if(ran.nextInt(100)>healthPotionDropChance){
                numberOfPotions++;
                System.out.println(" # You stolen the "  + enemy +" health potion # ");
                System.out.println(" # You now have "+ numberOfPotions+ " health potion(s). # ");
        }
            System.out.println("-----------------------------------------------------");
            System.out.println("What will you do next....");
            System.out.println("1. Continue disobeying");
            System.out.println("2. Actually listen for once.");

            String input= in.nextLine();

            while(!input.equals("1")&&(!input.equals("2"))){
                System.out.println("Seriously pay attention");
                input = in.nextLine();
            }
            if (input.equals("1")){
                System.out.println("I guess you're going to keep going...");

            }
            else if (input.equals("2")) {
                System.out.println("You've finally learned your lesson huh");
                break;
            }

        }

    }

}
