/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.swing;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public interface LongProcessActionService {

    public void processInBackground(String actionName, LongProcessMethod method);
    public void processInBackground(LongProcessMethod method);


}
