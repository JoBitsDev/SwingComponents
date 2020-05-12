/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.displayers;

import javax.swing.Icon;
import org.jdesktop.swingx.JXTaskPane;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class MaterialTaskPane extends JXTaskPane {

    boolean shrinked = false;
    private int margin = 5;

    public MaterialTaskPane(Icon icon, String title) {
        super.setIcon(icon);
        super.setTitle(title);
    }
  
    public void setShrinked(boolean shrinked) {
        this.shrinked = shrinked;
        setCollapsed(!shrinked);
        setScrollOnExpand(!shrinked);
        setSize(getIcon().getIconWidth() + margin , getIcon().getIconHeight() + margin);
    }

    
    
    
    

}
