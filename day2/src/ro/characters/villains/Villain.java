package ro.characters.villains;

/**
 * Created by asus on 05/04/2016.
 */
public class Villain {

    private int life;
    private int attackDamage;
    public int id;
    private static int ID = 0;

    public int getLife() {
        return life;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public enum Type {CrazyMonkey , DarkFrog, Shadow};
    public Type type;

    public Villain()
    {
        this.id = ID;
        ID++;
    }
    public  String toString()
    {
        return this.type.toString() + " " + this.id;
    }
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        else if (this instanceof CrazyMonkey && obj instanceof CrazyMonkey || this instanceof Shadow && obj instanceof Shadow
                ||this instanceof DarkFrog && obj instanceof DarkFrog )
            return true;
        return false;
    }
}
