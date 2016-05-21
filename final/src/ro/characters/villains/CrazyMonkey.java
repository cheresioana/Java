package ro.characters.villains;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class CrazyMonkey extends Villain implements Serializable {
    public CrazyMonkey() {
        this.attackDamage = 40;
        this.type = Type.CrazyMonkey;
        this.life = 40;
    }
}
