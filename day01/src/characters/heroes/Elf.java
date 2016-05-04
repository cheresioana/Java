package characters.heroes;

/**
 * Created by asus on 05/04/2016.
 */
public class Elf extends Heroe {
    public Elf(String nickname)
    {
        this.life = 50;
        this.type = Type.Elf;
        this.nickName = nickname;
        this.attackDamage = 20;
        this.spellDamage = 80;
    }
}
