package ro.items;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class Armor extends Item implements Serializable {
    public Armor() {
        this.spellDamage = 0;
        this.attackDamage = 20;
        this.life = 20;
        this.type = Type.Armor;
    }
}
