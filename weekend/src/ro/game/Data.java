package ro.game;

import ro.characters.heroes.Heroe;

import java.io.*;
import java.util.Random;

/**
 * Created by asus on 05/08/2016.
 */
public class Data {

    public static void save(Heroe heroe)
    {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(heroe.nickName, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer.println(heroe.type);
        writer.println(heroe.getLevel());
        writer.println(heroe.getX());
        writer.println(heroe.getY());
        writer.println(heroe.getLife());
        writer.println(heroe.getAttackDamage());
        writer.println(heroe.getSpellDamage());
        writer.println(heroe.mission.map.getName());
        writer.close();
    }

    public static void loadFromFile(Heroe heroe, String path)
    {
        BufferedReader br = null;
        FileReader fr = null;
        Random r = new Random();
        File file ;


        file = new File(path);
        System.out.println(file.canRead());

        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("crapa la File Reader la loadData");
            try {
                c = br.read();
            } catch (IOException e) {
                System.out.println("null maybe");
                e.printStackTrace();
            }
        }


    }
}
