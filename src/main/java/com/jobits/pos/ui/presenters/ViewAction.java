/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.ui.presenters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

/**
 *
 * @author Jorge
 */
interface ViewAction extends ActionListener {

    public Optional doAction();

    @Override
    public default void actionPerformed(ActionEvent e) {
        doAction();
    }

    
}
