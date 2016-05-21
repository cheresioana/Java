package ro.game;

import ro.characters.heroes.Heroe;
import ro.characters.heroes.Mage;
import ro.characters.heroes.Ninja;
import ro.characters.heroes.Shaman;

import java.io.*;

/**
 * Created by asus on 05/08/2016.
 */
public class Data {

    public static void save(Heroe e)
    {

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
        System.out.println(path);
        String s[] = path.split(" ");
        System.out.println(s[0]);
        System.out.println(s[1]);
        Object o = new Object();
        Heroe heroe1 = null;
        try
        {
            File f = new File(s[0]);
            if (!f.exists())
                return null;
            FileInputStream fileIn = new FileInputStream(s[0]);
            System.out.println("pula1");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            System.out.println("pula1");
            switch (s[1])
            {
                case "Mage":
                    Mage m =(Mage) in.readObject();
                    System.out.println("Haloooo");
                    heroe1 = m;
                    break;
                case "Shaman":
                    Shaman sh =(Shaman) in.readObject();
                    heroe1 = sh;
                    break;
                case "Ninja":
                   Ninja n =(Ninja) in.readObject();
                    heroe1 = n;
                    break;
            }

            //o = in.readObject();
           // if (o instanceof Mage)
            //    heroe1 = (Mage)o;
            //heroe1 = (Heroe)in.readObject();
          //  System.out.println("pula2");
            in.close();
            fileIn.close();
            return heroe1;
        }catch(IOException i)
        {
            i.printStackTrace();
            return null;
        }catch(ClassNotFoundException c)
        {
            System.out.println("User not found");
            c.printStackTrace();
            return null;
        }

    }
}
