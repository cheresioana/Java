/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.game;

import javax.swing.*;

import ro.characters.heroes.Heroe;

import ro.characters.heroes.Elf;
import ro.characters.heroes.Mage;
import ro.characters.heroes.Ninja;
import ro.characters.heroes.Shaman;
import ro.characters.villains.Villain;
import ui.RoundButton;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author asus
 */
public class Controller {
    static Controller controller;
    public static Heroe heroe;
    public String name;
    public boolean end = false;
    public Color idle = new Color(102, 102, 255);
    // public Icon icon;

    private Controller() {

    }

    public static Controller getController() {
        if (controller == null)
            controller = new Controller();
        return controller;
    }

    public void setHeroe(String s, String user, Image icon) {
        if (heroe == null) {
            switch (s) {
                case "Mage":
                    heroe = new Mage(user);
                    name = "mage";
                    break;
                case "Shaman":
                    heroe = new Shaman(user);
                    name = "shaman";
                    break;
                case "Ninja":
                    heroe = new Ninja(user);
                    name = "ninja";
                    break;
                case "Elf":
                    heroe = new Elf(user);
                    name = "elf";
                    break;
            }

        }
    }

    public RoundButton[][] genArray(JPanel jPanel1, JFrame frame) {
        frame.setVisible(false);
        int dim = 21;
        int matrix[][] = new int[21][21];
        RoundButton buttons[][] = new RoundButton[21][21];


        JPanel p = jPanel1;
        p.setLayout(new GridLayout(dim, dim));
        System.out.println(heroe.getX() + " " + heroe.getY());
        for (int r = 0; r < dim; r++) {
            for (int c = 0; c < dim; c++) {
                RoundButton button = new RoundButton("?");
                if (heroe.getX() != r || heroe.getY() != c) {

                    button.setBackground(idle);
                } else {
                    button.setText("Y");
                    button.setBackground(Color.green);
                }
                buttons[r][c] = button;
                p.add(button);
            }
        }
        frame.add(p);
        frame.setSize(460, 345);
        frame.pack();
        frame.setVisible(true);
        return buttons;
    }

    public int sendKey(int keyCode) {
        int ok = 0;
        switch (keyCode) {
            case KeyEvent.VK_UP:
                heroe.moveUp();
                System.out.println("UP");
                ok = 1;
                break;

            case KeyEvent.VK_DOWN:
                heroe.moveDown();
                System.out.println("DOWN");
                ok = 1;
                break;
            // handle down

            case KeyEvent.VK_LEFT:
                heroe.moveLeft();
                System.out.println("LEFT");
                ok = 1;
                break;
            // handle left

            case KeyEvent.VK_RIGHT:
                heroe.moveRight();
                System.out.println("RIGHT");
                ok = 1;
                break;
            case  KeyEvent.VK_S :
                Data.save(heroe);
                ok = -1;
                break;
            // handle right

        }
        if (ok == 1 && heroe.inBounds())
            return 1;
        else if (ok == 1)
            return 2;
        return 0;
    }

    public Villain fight() {
        Villain villain = heroe.mission.map.getMapVillain(heroe.getX(), heroe.getY());

        if (villain != null)
            return villain;
        return null;

    }
    public boolean fight(Heroe h, Villain v) {
        while (v.getLife() > 0 && h.getLife() > 0)
        {
            h.takeDamage(v.getAttackDamage());
            v.takeDamage(h.getDamage());
        }
        if (v.getLife() > 0)
            return false;
        return  true;
    }

    public static boolean loadHeroe(String user)
    {
        Heroe x = Data.loadFromFile(user);
        if ( x == null)
            return false;
        getController();
        heroe = x;
        return true;
    }
}
