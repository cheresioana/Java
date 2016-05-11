package ro.game;

import ro.characters.heroes.Heroe;

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

        Heroe heroe1;
        try
        {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\delia\\Desktop\\JavaApplication3\\yoyo" );
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
            System.out.println("User not found");
            c.printStackTrace();
            return null;
        }
        return heroe1;
    }
}
