public class player {
    int health;
    int minDamage;
    int maxDamage;
    int missChances;
    int criticalRate;
    int speed;
    int numberOfPotions;
    int runChance;
    public static void main(String[] args) {


        player warrior=new player();
        warrior.health=150;
        warrior.minDamage= 25;
        warrior.maxDamage= 60;
        warrior.missChances=10;
        warrior.speed =50;
        warrior.numberOfPotions =3;
        warrior.runChance = 40;
        warrior.criticalRate=20;

        player archer = new player();
        archer.health =125;
        archer.minDamage=12;
        archer.maxDamage= 35;
        archer.missChances= 15;
        archer.speed= 60;
        archer.numberOfPotions =7;
        archer.runChance = 80;
        archer.criticalRate= 50;

        player tank = new player();
        tank.health=200;
        tank.minDamage =10;
        tank.maxDamage = 40;
        tank.missChances =5;
        tank.speed = 20;
        tank.numberOfPotions= 6;
        tank.runChance = 60;
        tank.criticalRate = 10;


    }
}
