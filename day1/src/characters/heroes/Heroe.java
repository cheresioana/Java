package characters.heroes;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import items.Item;

/**
 * Created by asus on 05/04/2016.
 */
public class Heroe {
    protected int life;
    protected int attackDamage;
    protected int spellDamage;
    public String nickName;
    public Object heroe;
    public Item item;

    public void changeLife(int val)
    {
        this.life += val;
    }
    public void changeAttackDmanage(int val)
    {
        this.attackDamage += val;
    }
    public void changeSpellDamage(int val)
    {
        this.attackDamage += val;
    }

    protected int level;

    public enum Type {Mage , Ninja, Elf, Shaman};
    public Type type;

    public String toString()
    {
        return  ( this.type + " user:" + this.nickName + " " + ((item == null)? ("") : item.toString()));
    }

    public int getDamage()
    {
        return this.getDamage() + ((item == null) ? (0) : item.getDamage());
    }
}
