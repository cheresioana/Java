package ro.game;

import ro.characters.villains.CrazyMonkey;
import ro.characters.villains.DarkFrog;
import ro.characters.villains.Shadow;
import ro.characters.villains.Villain;
import ro.items.*;

import java.util.Random;

/**
 * Created by asus on 05/05/2016.
 */
public class Mission {

    Villain[] villains;
    Item[] items;
    private int vNr;
    private int iNr;
    private Random random = new Random();
    private int vIndex;
    private int iIndex;
    public Mission(int level)
    {
        iNr = 5/3 * level + 0;
        vNr = level * 2;
        //region create Villains
        villains = new Villain[vNr];
        for (int i = 0; i< level * 2; i++)
        {
            switch (random.nextInt(3))
            {
                case 0:
                    villains[i] = new CrazyMonkey();
                    break;
                case 1:
                    villains[i] = new DarkFrog();
                    break;
                case 2:
                    villains[i] = new Shadow();
                    break;
            }
        }
        //endregion
        //region create Items
        items = new Item[iNr];
        for (int i = 0; i< iNr; i++)
        {
            switch (random.nextInt(5))
            {
                case 0:
                    items[i] = new Armor();
                    break;
                case 1:
                    items[i] = new LifePotion();
                    break;
                case 2:
                    items[i] = new SpellElixir();
                    break;
                case 3:
                    items[i] = new Sword();
                    break;
                case 4:
                    items[i] = new VenomPotion();
                    break;
            }
        }
        //endregion


    }

    public Villain spamMonster()
    {
        if (vIndex < vNr)
            return villains[vIndex];
        return null;
    }

    public Item spamItem()
    {
        if (iIndex < iNr)
            return items[iIndex];
        return null;
    }

}
