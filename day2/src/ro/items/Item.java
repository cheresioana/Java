package ro.items;

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
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        else if (this instanceof LifePotion && obj instanceof LifePotion || this instanceof SpellElixir && obj instanceof SpellElixir
                ||this instanceof Sword && obj instanceof Sword || this instanceof VenomPotion && obj instanceof VenomPotion
                || this instanceof Armor && obj instanceof Armor)
            return true;
        return false;
    }
}
