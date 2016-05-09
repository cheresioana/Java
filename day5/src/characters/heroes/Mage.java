package ro.characters.heroes;

import characters.heroes.Heroe;
import ro.items.Item;
import ro.items.VenomPotion;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class Mage  extends Heroe implements Serializable {

   // public VenomPotion  item;
    public Mage(String nickname) {

        this.life = 800;
        this.type = Type.Mage;
        this.nickName = nickname;
        this.attackDamage = 10;
        this.spellDamage = 80;
    }
    public void  addItem(Item item)
    {
        if (item instanceof VenomPotion)
            this.item = item;
    }
    
    public static String getDescription()
    {
        return "life: " + 100 + " attack: " + "70" + " spellDamage " + 60;
    }

}
