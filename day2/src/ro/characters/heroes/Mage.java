package ro.characters.heroes;

import ro.items.Item;
import ro.items.VenomPotion;

/**
 * Created by asus on 05/04/2016.
 */
public class Mage  extends Heroe{

   // public VenomPotion  item;
    public Mage(String nickname) {

        this.life = 80;
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

}
