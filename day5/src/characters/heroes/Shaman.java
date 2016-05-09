package ro.characters.heroes;

import characters.heroes.Heroe;
import ro.items.Item;
import ro.items.Sword;

import java.io.Serializable;

/**
 * Created by asus on 05/04/2016.
 */
public class Shaman extends Heroe implements Serializable {
    //public Sword item;
    public Shaman(String nickname) {
        this.life = 800;
        this.type = Type.Shaman;
        this.nickName = nickname;
        this.attackDamage = 40;
        this.spellDamage = 60;
    }

     public static String getDescription()
    {
        return "life: " + 60 + " attack: " + "90" + " spellDamage " + 80;
    }
}
