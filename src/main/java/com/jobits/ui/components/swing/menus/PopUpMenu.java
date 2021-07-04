/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.menus;

import java.util.List;
import javax.swing.Action;
import javax.swing.JPopupMenu;

/**
 *
 * @author Home
 */
public class PopUpMenu extends JPopupMenu {

    public PopUpMenu(List<Action> menuActionsList) {
        menuActionsList.forEach(action -> {
            add(action);
        });
    }

    public PopUpMenu(Action... menuActions) {
        if (menuActions != null) {
            for (Action action : menuActions) {
                add(action);
            }
        }
    }

}
