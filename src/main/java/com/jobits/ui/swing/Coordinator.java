/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.swing;

/**
 *
 * @author Jorge
 */
public interface Coordinator {

    public boolean canNavigateTo(String currentViewUID, String toViewUniqueName);
}
