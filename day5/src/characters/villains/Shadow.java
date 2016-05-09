package ro.characters.villains;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class Shadow extends Villain implements Serializable {

    public Shadow() {
        super();
        this.attackDamage = 30;
        this.type = Type.Shadow;
        this.life = 40;
    }
}
