import characters.heroes.Heroe;
import characters.heroes.Mage;
import characters.villains.CrazyMonkey;
import characters.villains.Villain;
import items.SpellElixir;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CrazyMonkey villain = new CrazyMonkey();
        Mage mage = new Mage("yoyo");
        System.out.println(mage.toString());
        SpellElixir sp = new SpellElixir();
        System.out.println(villain.toString());
        System.out.println(sp.toString());
    }
}
