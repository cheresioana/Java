package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class ChangingButton extends JButton {

    private final int[][] fModel;
    private final int fX;
    private final int fY;

    public ChangingButton(final int x, final int y, final int[][] model) {
        fX= x;
        fY= y;
        fModel= model;

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fModel[fX][fY] = fModel[fX][fY] == 1 ? 0 : 1;
                updateNameFromModel();
            }


        });
        updateNameFromModel();
    }

    private void updateNameFromModel() {
        setText(String.valueOf(fModel[fX][fY]));
    }

}
