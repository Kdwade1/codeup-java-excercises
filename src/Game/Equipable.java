package Game;

class Equipable extends items {
int boost;
String stat;

    public Equipable(String name, String effect,int boost) {
        super(name, effect);
        this.boost = boost;
    }

}
class Sword extends Equipable {

    public Sword(String name, int boost, String effect) {
        super(name,effect,boost);

    }
    Sword bronzeSword =new Sword("Bronze Sword",5,"Add + 5 to min and max damage");
}
