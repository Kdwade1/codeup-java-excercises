public class enemies {
    int Health;
    int minDamage;
    int maxDamage;
    int maxSpeed;
    int minSpeed;
    int exp;
    int randomChanceRate;
    int potionDropRate;
    int missChances;
    int criticalRate;

    public static void main(String[] args) {
        enemies zombie = new enemies();
        zombie.Health = 50;
        zombie.minDamage=5;
        zombie.maxDamage = 20;
        zombie.exp = 30;
        zombie.maxSpeed = 10;
        zombie.minSpeed= 5;
        zombie.randomChanceRate=50;
        zombie.potionDropRate=10;
        zombie.missChances= 30;
        zombie.criticalRate=10;


        enemies witch=new enemies();
        witch.Health= 30;
        witch.minDamage=20;
        witch.maxDamage= 50;
        witch.exp = 30;
        witch.maxSpeed= 35;
        witch.minSpeed =30;
        witch.randomChanceRate= 30;
        witch.potionDropRate =30;
        witch.missChances =20;
        witch.criticalRate= 5;

        enemies mummy =new enemies();
        mummy.Health = 100;
        mummy.minDamage=10;
        mummy.maxDamage = 20;
        mummy.exp = 45;
        mummy.maxSpeed=20;
        mummy.minSpeed = 10;
        mummy.randomChanceRate =30;
        mummy.potionDropRate =30;
        mummy.missChances= 20;
        mummy.criticalRate = 45;

        enemies goblin = new enemies();
        goblin.Health= 20;
        goblin.minDamage= 10;
        goblin.maxDamage = 30;
        goblin.exp= 10;
        goblin.maxSpeed=50;
        goblin.minSpeed =20;
        goblin.randomChanceRate=40;
        goblin.potionDropRate =40;
        goblin.missChances = 30;
        goblin.criticalRate =30;


        enemies ghost = new enemies();
        ghost.Health=1;
        ghost.minDamage=1;
        ghost.maxDamage=99;
        ghost.maxSpeed =100;
        ghost.minSpeed=1;
        ghost.randomChanceRate= 22;
        ghost.potionDropRate=50;
        ghost.missChances= 20;
        ghost.criticalRate= 30;

        enemies randomGuyWithABat= new enemies();
        randomGuyWithABat.Health= 80;
        randomGuyWithABat.minDamage =50;
        randomGuyWithABat.minDamage = 100;



    }

}

