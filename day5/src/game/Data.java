package ro.game;

import characters.heroes.Heroe;

import java.io.*;
import java.util.Random;

/**
 * Created by asus on 05/08/2016.
 */
public class Data {

    public static void save(Heroe e)
    {
        /*PrintWriter writer = null;
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
        writer.close();*/
        FileOutputStream fileOut = null;
        ObjectOutputStream out = null;
        try {
            fileOut = new FileOutputStream(e.nickName);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
             out = new ObjectOutputStream(fileOut);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            if (out != null) out.writeObject(e);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            fileOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Heroe loadFromFile(String path)
    {
       /* BufferedReader br = null;
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
        }*/
        Heroe heroe1;
        try
        {
            FileInputStream fileIn = new FileInputStream("D:\\prog\\game\\" + path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            heroe1 = (Heroe) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return null;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not 6found");
            c.printStackTrace();
            return null;
        }
        return heroe1;
    }
}
