package items;

/**
 * Created by asus on 05/04/2016.
 */
public class SpellElixir extends Item{
    public SpellElixir() {
        this.spellDamage = 50;
        this.attackDamage = 0;
        this.life = 0;
        this.type = Type.SpellElixir;
    }
}
