package items;
import characters.heroes.Heroe;

/**
 * Created by asus on 05/04/2016.
 */
public class Item {

    //public Object item;

    public enum Type {Armor , LifePotion, SpellElixir, Sword, VenomPotion};
    public Type type;
    int life;
    int attackDamage;
    int spellDamage;



    public String toString()
        {
            return  ("item:" + this.type.toString());
        }

    public int getDamage()
        {
            return this.spellDamage + this.attackDamage;
        }
}
