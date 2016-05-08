package ro.Map;

import ro.characters.villains.CrazyMonkey;
import ro.characters.villains.DarkFrog;
import ro.characters.villains.Shadow;
import ro.characters.villains.Villain;
import ro.items.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by asus on 05/07/2016.
 */
public class Map {
        protected String name;

        protected Villain [][] map = new Villain[21][21];
        public String getName()
        {
            return name;
        }
    public Map(String s)
        {
            name = s;
            BufferedReader br = null;
            FileReader fr = null;
            Random r = new Random();
            File file ;

            file = new File(s);
            System.out.println(file.canRead());

            try {
              br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                System.out.println("crapa la File Reader");
               // e.printStackTrace();
            }


            int c = 0;
                for (int i = 0; i< 21; i++)
            {
                for (int j = 0; j< 21; j++) {
                    try {
                        c = br.read();
                    } catch (IOException e) {
                        System.out.println("null maybe");
                        e.printStackTrace();
                    }
                    switch (c) {
                        case '0':
                            map[i][j] = null;
                            break;
                        case 'C':
                            map[i][j] = new CrazyMonkey();
                            break;
                        case 'S':
                            map[i][j] = new Shadow();
                            break;
                        case 'D':
                            map[i][j] = new DarkFrog();
                            break;
                        default:
                            map[i][j] = null;
                            break;
                    }
                }
            }

            try {
                fr.close();
            } catch (IOException e)  {
                System.out.println("close");
            }
            catch (NullPointerException x)
            {
                System.out.println("close");
            }

        }
        public  Villain getMapVillain(int x, int y) {
            return map[x][y];
        }
        }
