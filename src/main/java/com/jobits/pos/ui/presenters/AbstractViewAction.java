/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.ui.presenters;

import javax.swing.AbstractAction;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public abstract class AbstractViewAction extends AbstractAction implements ViewAction {

    private final String ACTION_NAME;

    public AbstractViewAction(String actionName) {
        super(actionName);
        this.ACTION_NAME = actionName;
    }

    public AbstractViewAction(String actionName, boolean setNameToUI) {
        super("");
        if (setNameToUI) {
            putValue(NAME, actionName);
        }
        this.ACTION_NAME = actionName;
    }

    public String getActionName() {
        return ACTION_NAME;
    }

}
