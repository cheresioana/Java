package items;

/**
 * Created by asus on 05/04/2016.
 */
public class VenomPotion extends Item {

    public VenomPotion() {
        this.spellDamage = 40;
        this.attackDamage = 30;
        this.life = 20;
        this.type = Type.Armor;
    }
    public int getLife()
    {
        return this.life;

    }

}
