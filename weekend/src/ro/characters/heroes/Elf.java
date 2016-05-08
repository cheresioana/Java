package ro.characters.heroes;

import ro.items.Item;
import ro.items.LifePotion;

/**
 * Created by asus on 05/04/2016.
 */
public class Elf extends Heroe {

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

}
