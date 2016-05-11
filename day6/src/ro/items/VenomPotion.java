package ro.items;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class VenomPotion extends Item implements Serializable {

    public VenomPotion() {
        this.spellDamage = 40;
        this.attackDamage = 30;
        this.life = 20;
        this.type = Type.VenomPotion;
    }
    public int getLife()
    {
        return this.life;

    }

}
