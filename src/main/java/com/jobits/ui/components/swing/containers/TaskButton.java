/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.containers;

import com.jobits.pos.ui.DefaultValues;
import com.root101.swing.material.standards.MaterialColors;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class TaskButton extends JButton {

    public TaskButton(Action a) {
        setAction(a);
        setText(a.getValue(Action.NAME).toString());
        setFont(getFont().deriveFont(24f));
        setForeground(DefaultValues.SECONDARY_COLOR);
        setBackground(MaterialColors.TRANSPARENT);
        setHorizontalTextPosition(SwingConstants.LEADING);
        setHorizontalAlignment(SwingConstants.LEADING);
        setBorderPainted(false);
        setContentAreaFilled(false);
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                a.actionPerformed(null);
//            }
//
//        });
    }

    public TaskButton(Action a, int width) {
        this(a);
        //  setPreferredSize(new Dimension(width, getHeight()));
    }

}
