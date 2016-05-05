package ro.characters.heroes;
import ro.items.Item;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by asus on 05/04/2016.
 */

public class Heroe {
    private int life;
    private int attackDamage;
    protected int spellDamage;
    public String nickName;
    protected int level;
    public Item item;
    public int id;
    private static int ID = 0;
    private final AtomicInteger counter = new AtomicInteger();

    public void changeLife(int val)
    {
        this.life = this.getLife() + val;
    }
    public void changeAttackDmanage(int val)
    {
        this.attackDamage = this.getAttackDamage() + val;
    }
    public void changeSpellDamage(int val)
    {
        this.attackDamage = this.getAttackDamage() + val;
    }

    public int getLife() {
        return life;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
    public int getSpellDamage() {
        return spellDamage;
    }

    public enum Type {Mage , Ninja, Elf, Shaman};
    public Type type;

    public Heroe()
    {
        this.id = ID;
        ID++;
    }
    public String toString()
    {
        return  ( this.type + " user:" + this.nickName + " " + ((item == null)? ("") : item.toString()) + " id:"+this.id);
    }
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        else if (this instanceof Mage && obj instanceof Mage || this instanceof Elf && obj instanceof Elf
                ||this instanceof Ninja && obj instanceof Ninja || this instanceof Shaman && obj instanceof Shaman)
            return true;
        return false;
    }
    public int getDamage()
    {
        return (this.getDamage() + ((item == null) ? (0) : item.getDamage())) * (this.level + 1);
    }

    public void changeLevel()
    {
        level++;
        changeSpellDamage(10);
        changeLife(10);
        changeAttackDmanage(10);
    }
}
