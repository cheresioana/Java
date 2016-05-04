package items;

/**
 * Created by asus on 05/04/2016.
 */
public class LifePotion extends Item {
    public LifePotion() {
        this.spellDamage = 0;
        this.attackDamage = 0;
        this.life = 80;
        this.type = Type.LifePotion;
    }
}
