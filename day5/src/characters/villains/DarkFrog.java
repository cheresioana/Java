package ro.characters.villains;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class DarkFrog extends Villain implements Serializable {
    public DarkFrog() {
        this.attackDamage = 30;
        this.type = Type.DarkFrog;
        this.life = 30;
    }
}
