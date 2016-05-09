package ro.items;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class LifePotion extends Item implements Serializable {
    public LifePotion() {
        this.spellDamage = 0;
        this.attackDamage = 0;
        this.life = 80;
        this.type = Type.LifePotion;
    }
}
