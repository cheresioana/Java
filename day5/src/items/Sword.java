package ro.items;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class Sword extends Item implements Serializable {

    public Sword() {
        this.spellDamage = 0;
        this.attackDamage = 60;
        this.life = 0;
        this.type = Type.Sword;
    }
}
