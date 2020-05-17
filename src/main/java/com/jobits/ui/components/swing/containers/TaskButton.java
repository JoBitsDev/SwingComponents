/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.containers;

import com.jobits.pos.ui.DefaultValues;
import components.buttons._MaterialButton;
import components.labels._MaterialLabel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class TaskButton extends _MaterialLabel {

    public TaskButton(Action a) {
        super();
        setText(a.getValue(Action.NAME).toString());
        setFont(getFont().deriveFont(24f));
        setForeground(DefaultValues.PRIMARY_COLOR);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a.actionPerformed(null);
            }

        });
    }

    public TaskButton(Action a, int width) {
        this(a);
        //  setPreferredSize(new Dimension(width, getHeight()));
    }

}
