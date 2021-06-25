/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.menus;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Action;

/**
 *
 * @author Home
 */
public class PopClickListener extends MouseAdapter {

    PopUpMenu menu = new PopUpMenu();

    public PopClickListener(Action... menuActions) {
        menu = new PopUpMenu(menuActions);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            doPop(e);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            doPop(e);
        }
    }

    private void doPop(MouseEvent e) {
        menu.show(e.getComponent(), e.getX(), e.getY());
    }
}
