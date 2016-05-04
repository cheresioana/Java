package characters.heroes;

/**
 * Created by asus on 05/04/2016.
 */
public class Shaman extends Heroe {
    public Shaman(String nickname) {
        this.life = 80;
        this.type = Type.Shaman;
        this.nickName = nickname;
        this.attackDamage = 40;
        this.spellDamage = 60;
    }
}
