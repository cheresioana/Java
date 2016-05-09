package ro.characters.heroes;

import characters.heroes.Heroe;
import ro.items.Item;
import ro.items.LifePotion;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class Elf extends Heroe  implements Serializable {

    //LifePotion item;

    public Elf(String nickname)
    {
        this.life = 1000;
        this.type = Type.Elf;
        this.nickName = nickname;
        this.attackDamage = 20;
        this.spellDamage = 80;
    }

    public void  addItem(Item item)
    {
        if (item instanceof LifePotion)
        {
            this.item = item;
        }
    }
     public static String getDescription()
    {
        return "life: " + "80" + " attack: " + "60" + " spellDamage " + 80;
    }

}
