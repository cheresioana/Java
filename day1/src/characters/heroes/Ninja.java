package characters.heroes;

/**
 * Created by asus on 05/04/2016.
 */
public class Ninja extends Heroe{
    public Ninja(String nickname) {
        this.life = 90;
        this.type = Type.Ninja;
        this.nickName = nickname;
        this.attackDamage = 70;
        this.spellDamage = 0;
    }
}
