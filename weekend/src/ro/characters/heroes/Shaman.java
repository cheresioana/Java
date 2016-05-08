package ro.characters.heroes;

import ro.items.Item;
import ro.items.Sword;

/**
 * Created by asus on 05/04/2016.
 */
public class Shaman extends Heroe {
    //public Sword item;
    public Shaman(String nickname) {
        this.life = 800;
        this.type = Type.Shaman;
        this.nickName = nickname;
        this.attackDamage = 40;
        this.spellDamage = 60;
    }


}
