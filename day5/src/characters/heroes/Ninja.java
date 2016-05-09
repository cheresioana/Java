package ro.characters.heroes;

import characters.heroes.Heroe;
import ro.items.Armor;
import ro.items.Item;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class Ninja extends Heroe implements Serializable {
  //  public Armor item;
  //  public SpellElixir item2;
    public Ninja(String nickname) {
        this.life = 900;
        this.type = Type.Ninja;
        this.nickName = nickname;
        this.attackDamage = 70;
        this.spellDamage = 0;
    }
    public void  addItem(Item item)
    {
        if (item instanceof Armor)
            this.item = item;

    }
     public static String getDescription()
    {
        return "life: " + 100 + " attack: " + "20" + " spellDamage " + 10;
    }
}
