/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.swing;

import com.jobits.pos.ui.presenters.AbstractViewPresenter;

/**
 *
 * @author Jorge
 */
public interface NavigatorHandler {

    public void setNextNavigatorHandler(NavigatorHandler nextNavigator);
    
    public void navigateTo(String viewUniqueName, AbstractViewPresenter presenter);

}
