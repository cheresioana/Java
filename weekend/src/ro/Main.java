package ro;

import ro.characters.heroes.Elf;
import ro.characters.heroes.Heroe;
import ro.characters.heroes.Mage;
import ro.characters.villains.CrazyMonkey;
import ro.characters.villains.DarkFrog;
import ro.characters.villains.Shadow;
import ro.characters.villains.Villain;
import ro.game.Data;
import ro.game.Mission;
import ro.items.LifePotion;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");

        Mage mage =  new Mage("no_name");
        Data.loadFromFile(mage, "D:\\prog\\game\\yoyo");

       /* int i = 0;
        Mage mage = new Mage("yoyo");
        Villain v;
        mage.mission = new Mission(mage.getLevel());
        while ( mage.getLife() > 0 && i < 4)
        {

            if (( v = mage.mission.map.getMapVillain(mage.getX(), mage.getY())) != null)
                try {
                    mage.addItems(mage.fight(v));
                } catch (Exception e) {
                    System.out.println("nu are loc de mai multe iteme");
                }
            i++;
            mage.moveDown();
            System.out.println(mage);
        }
        Data.save(mage);*/
        //System.out.println(mage);
       // while ()
    }
}
