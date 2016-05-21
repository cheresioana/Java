package ro.game;

import ro.Map.Map;
import ro.characters.villains.Villain;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by asus on 05/05/2016.
 */
public class Mission implements Serializable {

    Villain[] villains;

    private int vNr;
    private int iNr;
    private Random random = new Random();
    private int vIndex;
    private int iIndex;
    public Map map;

    public Mission(int level)
    {

        map = new Map("C:\\Users\\delia\\Desktop\\JavaApplication3\\src\\ro\\Map\\map.txt");
        //region create Villains
       /* villains = new Villain[vNr];
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
        }*/
        //endregion
        //region create Items
        /*ro.items = new Item[iNr];
        for (int i = 0; i< iNr; i++)
        {
            switch (random.nextInt(5))
            {
                case 0:
                    ro.items[i] = new Armor();
                    break;
                case 1:
                    ro.items[i] = new LifePotion();
                    break;
                case 2:
                    ro.items[i] = new SpellElixir();
                    break;
                case 3:
                    ro.items[i] = new Sword();
                    break;
                case 4:
                    ro.items[i] = new VenomPotion();
                    break;
            }
        }*/
        //endregion
    }

}
