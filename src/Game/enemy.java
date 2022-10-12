package Game;

public class enemy extends consoleAdventureGame {
String name;
    int Health;
    int minDps;
    int maxDps;
    int maxSpeed;
    int minSpeed;
    int exp;
    int randomChanceRate;
    int potionDropRate;
    int missChances;
    int criticalRate;
    public enemy( String name ,int Health, int minDps, int maxDps, int maxSpeed, int minSpeed ,int exp ,int randomChanceRate,int potionDropRate, int missChances ,int criticalRate){

        this.name=name;
         this.Health =Health;
         this.minDps=minDps;
         this.maxDps=maxDps;
         this.criticalRate=criticalRate;
         this.exp=exp;
         this.maxSpeed=maxSpeed;
         this.minSpeed=minSpeed;
         this.randomChanceRate=randomChanceRate;
         this.potionDropRate= potionDropRate;
         this.missChances= missChances;

            }

    @Override
    public String toString() {
        return "enemy{" +
                "name='" + name + '\'' +
                ", Health=" + Health +
                '}';
    }

    public static void main(String[] args) {
        // Room one Enemies stats
//enemy zombie = new enemy("Zombie",50,5,20,10,5,30,50,10,30,10);
//
//enemy witch =new enemy("Witch",30,20,50,35,30,30,30,30,20,5);
//
//enemy  mummy = new enemy("Mummy",100,10,20,20,10,45,30,30,20,45);
//
//enemy goblin = new enemy("Goblin",20,10,30,50,20,10,40,40,30,30);
//
//enemy ghost = new enemy("Ghost",100,1,99,100,1,0,22,50,20,30);



//
//            enemy randomGuyWithABat = new enemy();
//            randomGuyWithABat.Health = 80;
//            randomGuyWithABat.minDps = 50;
//            randomGuyWithABat.minDps = 100;
//            randomGuyWithABat.minSpeed = 50;
//            randomGuyWithABat.maxSpeed = 70;
//            randomGuyWithABat.randomChanceRate = 1;
//            randomGuyWithABat.potionDropRate = 100;
//            randomGuyWithABat.missChances = 0;
//            randomGuyWithABat.criticalRate = 60;
//
//
        }
    }
