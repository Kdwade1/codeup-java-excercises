package Pi;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//ToDO implement the player stats
//ToDO implement enemies array
//toDo create rooms
//Todo Learn about random encounters
//ToDo Create bosses
//toDo create level up system
//toDo have fun?





// Instantiating classes
public class consoleAdventureGame {

    static player tank;
    static player archer;
    static player warrior;
    static player basic;
    static player hero;

/// slow print
    static void slowPrint(String output) {
        for (int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
//        PreBuilds
        // todo update hero class to not be completely broken only unlocked if you beat game as a basic person
        player basic =new player("The nobody",100,10,30,30,70,30,5,100);
        player warrior = new player("The Warrior", 150, 25, 60, 10, 40, 50, 3, 40);
        player tank = new player("The Tank", 200, 10, 40, 5, 10, 20, 2, 60);
        player archer = new player("The Archer", 125, 10, 35, 15, 50, 60, 4, 80);
        player hero = new player("Hero", 700, 800, 1000, 0, 200, 700, 600, 100);

        // Room 1 enemies

        enemy cowboy = new enemy("Cowboy", 50, 5, 20, 10, 5, 30, 50, 10, 30, 10);

        enemy witch = new enemy("Witch", 30, 20, 50, 35, 30, 30, 30, 30, 20, 5);

        enemy randomPerson = new enemy("Random Person", 100, 10, 20, 20, 10, 45, 30, 30, 20, 45);

        enemy hipster = new enemy("Hipster", 20, 10, 30, 50, 20, 10, 40, 40, 30, 30);

        enemy ghost = new enemy("Ghost", 100, 1, 99, 100, 1, 0, 22, 50, 20, 30);
//---------------------------------------Room 2 enemies ------------------------------------------------------------------------

        /////system object

        Scanner in = new Scanner(System.in);
        Random ran = new Random();

        //game variables

        enemy[] foes = {ghost, hipster, randomPerson, witch, cowboy};
        String[] enemies = {"Ghost", "Mummy", "Zombie", "Goblin", "Witch"};
        String[] strongEnemies = {"Dragon", "Demon", "Cowboy", "Random guy with a bat"};
        int maxEnemyHealth = 70;
        int maxAttack = 25;
        int minAttack = 10;


        //Pi.player variables

        int health = 100;
        int dps = 50;
        int numberOfPotions = 3;
        int healthPotionHeal = 20;
        int healthPotionDropChance = 30;//<--%


        boolean running = true;

/// Game Intro

//        for (enemy foe : foes) {
//            System.out.println(foe.toString());
//        }
        slowPrint("You come across a mysterious dungeon that you found, coming across your travels.. Before you adventure begins we need to know who exactly are you\n");



                System.out.println("What is your name you deviant!");
                String name = in.nextLine();
                slowPrint("Ah so your name is " + name + "! That's a stupid name...Anyways what class are you?\n");
                System.out.println("\t 1. The Warrior");
                System.out.println("\t 2. The Archer");
                System.out.println("\t 3. The Tank");
                System.out.println("\t 4. The Hero");
                String build = in.nextLine();
                switch (build) {
                    case "1" -> {
                        slowPrint("Ah you are " + name + " " + warrior.name + "\n");
                        health = warrior.health;
                        dps = warrior.maxDamage;

                    }
                    case "2" -> {
                        slowPrint("Ah so you're " + name + " " + archer.name + "\n");
                        health = archer.health;
                        dps = archer.maxDamage;
                    }
                    case "3" -> {
                        slowPrint("Ah so you're " + name + " " + tank.name + "\n");
                        health = tank.health;
                        dps = tank.maxDamage;
                    }
                    case "4" -> {
                        slowPrint("....So you're " + name + "  the " + hero.name + "! Kinda cheap...\n");
                        health = hero.health;
                        dps = hero.maxDamage;
                    }
                    default -> {
                        System.out.println("So you're .." + name + "  The" +basic.name +"....interesting choice \n");
                         health = basic.health;
                         dps = basic.maxDamage;

                    }

                }
                System.out.println("Shall you enter?...(Y/N)");
                String confirm = in.nextLine().toLowerCase();


                switch (confirm) {
                    case "y" -> {
                        slowPrint("Fine...Be that way.......\n");
                    }
                    case "n" -> {
                        System.out.println("Thank you for listening!");
                        System.exit(0);

                    }
                    default -> {
                        System.out.println("Funny guy eh....");
                        numberOfPotions = 0;
                        System.out.println("There you get no potions!");

                    }


                }


// Game starts
                Game:
                while (running) {
                    System.out.println("----------------------");
                    int enemyHealth = ran.nextInt(maxEnemyHealth);
                    String enemy = enemies[ran.nextInt(enemies.length)];
                    System.out.println("\t# " + enemy + " has appeared #\n");

                    label:
                    while (enemyHealth > 0) {


                        System.out.println("\t" + name + "'s HP: " + health);
                        System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                        System.out.printf("\n\t What are you going to do %s?\n", name);
                        System.out.println("1. \tAttack");
                        System.out.println("2. \tItems");
                        System.out.println("3. \tRun");
                        // Battle system
                        String input = in.nextLine();
                        switch (input) {
                            case "1" -> {
                                int damageDealt = ran.nextInt(dps);
                                int damageTaken = ran.nextInt(maxAttack);

                                enemyHealth -= damageDealt;

                                System.out.println("\t> You struck the " + enemy + " for " + damageDealt + "damage. ");
                                if (enemyHealth > 0) {
                                    System.out.println("\t The " + enemy + " attacked...");
                                    System.out.println("\t> You taken " + damageTaken + " damage.");
                                    health -= damageTaken;
                                }
                                if (enemyHealth <= 0) {
                                    System.out.println("The enemy cursed you with its last breath..");
                                }

                                if (health < 1) {
                                    System.out.printf("Wow this is awkward...it seems that you lost.....I told you not to come here %s...\n", name);
                                    break label;
                                }


                            }

                            case "2" -> {
                                int damageDealt = ran.nextInt(dps);
                                int damageTaken = ran.nextInt(maxAttack);


                                if (numberOfPotions > 0) {
                                    health += healthPotionHeal;
                                    numberOfPotions--;
                                    System.out.println("\t> This seems kinda cheap but you've healed for " + healthPotionHeal + "HP. \n\t You now have " + health + "HP. The monster looks really disappointed in you..\n\t> You now have " + numberOfPotions + "potions left.");
                                    if (health > 0) {
                                        System.out.println("\t The " + enemy + " attacked...");
                                        System.out.println("\t> You taken " + damageTaken + " damage.");
                                        health -= damageTaken;
                                    }
                                } else {
                                    System.out.println("Hahaha you're luck ran out. The monster looks gleeful!");
                                }
//                        break;
                            }
                            case "3" -> {
                                System.out.println("\t You've run away from the " + enemy + "! You've pondered on why you've even entered the dungeon if you're just going to run.");
                                continue Game;
                            }
                            default -> {
                                System.out.println("Invalid....can't you read the option....");
                                health -= 30;
                                if (health < 1) {
                                    System.out.println("Wow...Okay...I guess you die then..Bye I guess...");
                                    break label;
                                }
                            }
                        }
                    }
                    if (health < 1) {

                        break;
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println(" # " + enemy + " was taken down.. # ");
                    System.out.println(" # you have " +
                            +health + "hp left.");
                    if (ran.nextInt(100) > healthPotionDropChance) {
                        numberOfPotions++;
                        System.out.println(" # You stolen the " + enemy + " health potion # ");
                        System.out.println(" # You now have " + numberOfPotions + " health potion(s). # ");
                    }
                    System.out.println("-----------------------------------------------------");
                    System.out.println("What will you do next....");
                    System.out.println("1. Continue disobeying");
                    System.out.println("2. Actually listen for once.");

                    String input = in.nextLine();

                    while (!input.equals("1") && (!input.equals("2"))) {
                        System.out.println("Seriously pay attention");
                        input = in.nextLine();

                    }
                    if (input.equals("1")) {
                        System.out.println("I guess you're going to keep going...");

                    } else if (input.equals("2")) {
                        System.out.println("You've finally learned your lesson huh");
                        break;
                    }

                }

            }


        }

