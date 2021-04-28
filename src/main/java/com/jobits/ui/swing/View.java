/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.swing;

import com.jobits.pos.ui.presenters.AbstractViewPresenter;
import java.awt.Component;

/**
 *
 * @author Jorge
 */
public interface View {

    void wireUp();

    /**
     * En este metodo hay que llamar a initComponents();
     */
    void uiInit();

    public String getViewName();
    
    public Component getViewComponent();
    
    public void setPresenter(AbstractViewPresenter presenter);
    
    public AbstractViewPresenter getPresenter();
}
