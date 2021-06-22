/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.menus;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.Action;

/**
 *
 * @author Home
 */
public class PopClickListener extends MouseAdapter {

    List<Action> menuActionsList = new ArrayList<>();

    public PopClickListener(Action... menuActions) {
        if (menuActions != null) {
            menuActionsList.addAll(Arrays.asList(menuActions));
        }
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
        PopUpMenu menu = new PopUpMenu(menuActionsList);
        menu.show(e.getComponent(), e.getX(), e.getY());
    }
}
