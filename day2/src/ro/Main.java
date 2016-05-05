package ro;

import ro.characters.heroes.Elf;
import ro.characters.heroes.Mage;
import ro.characters.villains.CrazyMonkey;
import ro.characters.villains.DarkFrog;
import ro.characters.villains.Shadow;
import ro.items.LifePotion;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LifePotion life = new LifePotion();

        CrazyMonkey villain = new CrazyMonkey();
        Mage mage = new Mage("yoyo");
        Elf elf = new Elf("user2");
        DarkFrog frog = new DarkFrog();
        DarkFrog frog2 = new DarkFrog();
        Shadow shadow = new Shadow();
        elf.addItem(life);
        System.out.println(elf.toString());
        //System.out.println(life);
       /* Mage mage2 = new Mage("yolo");
        System.out.println(mage2.equals(mage));
        System.out.println(mage2.equals(frog));
        System.out.println(frog.equals(mage));
        System.out.println(frog2.equals(frog));
        System.out.println(frog.toString());
        System.out.println(shadow.toString());
        System.out.println(elf.toString());
        System.out.println(mage.toString());
        SpellElixir sp = new SpellElixir();
        System.out.println(villain.toString());
        System.out.println(sp.toString());
        */
    }
}
