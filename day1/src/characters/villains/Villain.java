package characters.villains;

/**
 * Created by asus on 05/04/2016.
 */
public class Villain {

    public Object villain;
    protected int life;
    protected int attackDamage;

    public enum Type {CrazyMonkey , DarkFrog, Shadow};
    public Type type;


    public  String toString()
    {
        return this.type.toString();
    }
}
