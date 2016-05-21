package ro.characters.heroes;
import ro.characters.villains.Villain;
import ro.game.Mission;
import ro.items.*;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Random;

/**
 * Created by asus on 05/04/2016.
 */

public class Heroe implements Serializable{
    protected int life;
    protected int xp;
  //  private static final long serialVersionUID = 1L;
    protected int attackDamage;
    protected int spellDamage;
    public String nickName;
    protected int level;
    public Item item;
    public int id;
    private int x;
    private int y;
    private int iNr;
    private int maxItems = 4;
    public Mission mission;
    ArrayList<Item> inventory = new ArrayList<>();
    private static int ID = 0;


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

    public  int getLevel()
    {
        return this.level;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public enum Type {Mage , Ninja, Elf, Shaman;

        public String getDescription() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       
    };
    public Type type;

    public Heroe()
    {
        Random r = new Random();
        this.id = ID;
        this.setX(r.nextInt(15) + 3);
        this.setY(r.nextInt(15) + 3);
        this.mission = new Mission(0);
        ID++;
    }
    public String toString()
    {
        //return  ( this.type + " user:" + this.nickName + " " + ((item == null)? ("") : item.toString()) + " id:"+this.id
       //  + " position : " + getPosition() + " level: " + this.level);
        return (this.type + " life: " + this.life + " attack: " + this.getDamage());
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
        int damage = 0;
        for (Item i:inventory) {
            damage+= i.getDamage();
        }
        return ((this.attackDamage + this.spellDamage  + damage)  / (level + 4));
        //return (this.getDamage() + ((item == null) ? (0) : item.getDamage())) * (this.level + 1);
    }
    public void takeDamage(int val){this.life -= val;}
    public void changeLevel()
    {
        level++;
        changeSpellDamage(10);
        changeLife(80);
        changeAttackDmanage(10);
        maxItems *= 2;

    }

    @Override
    public int hashCode() {
        return this.type.hashCode();
    }
    public void addItems(ArrayList<Item> item) throws Exception {
        if (item != null)
        for (Item k: item) {
            if (inventory.size() < maxItems)
            {
                System.out.println(k.type);
                inventory.add(k);
            }
            else throw new Exception("Not enough space");

        }
    }
    public String getPosition()
    {
        return  x + " " + y;
    }
    public void moveUp()
    {
        setX(this.x - 1);
    }
    public void moveDown()
    {
        setX(this.x + 1);
    }
    public void moveLeft()
    {
        setY(this.y - 1);
    }
    public void moveRight()
    {
        setY(this.y + 1);
    }
    public boolean inBounds()
    {
        if (this.getX() >= 20 )
            return false;
        if (this.getX() <= 0)
            return false;
        if (this.getY() >= 20)
            return false;
        if (this.getY() <= 0)
            return false;
        return true;
    }
    public ArrayList<Item> spamItems(int level)
    {
        Random random = new Random();
        iNr =  16 * (level + 1);
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i< iNr; i++)
        {
            switch (random.nextInt(5))
            {
                case 0:
                    items.add(new Armor());
                    break;
                case 1:
                    items.add(new LifePotion());
                    break;
                case 2:
                    items.add(new SpellElixir());
                    break;
                case 3:
                    items.add(new Sword());
                    break;
                case 4:
                    items.add(new VenomPotion());
                    break;
            }
        }
        return items;
    }
    public ArrayList<Item> fight( Villain villain)
    {
        System.out.println("FIGHT");
        while (this.getLife() > 0 && villain.getLife() > 0)
        {
            System.out.println("You:" + this.getLife() + " life "  + this.getDamage() + " attack " + " Opponent :" + villain.getLife() + "life " +
            villain.getAttackDamage() + " attack");
            this.takeDamage(villain.getAttackDamage());
            villain.takeDamage(this.getDamage());
        }
        if (this.getLife() <= 0)
        {
            this.xp += 20/(level + 1);
            System.out.println("You  lost against Villain: " + villain.type + "  who has " + villain.getLife() + "life");
        }
        else
        {
            this.xp += 200;
            if (this.xp >= 100)
                this.changeLevel();
            System.out.println("U won against : " + villain.type);
            return spamItems(this.getLevel());
        }
        if (this.xp >= 100)
            this.changeLevel();
        return null;

    }
    //private final IdentityHashMap.serialVersionUID;

}
