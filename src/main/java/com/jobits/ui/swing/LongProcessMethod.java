/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jobits.ui.swing;

/**
 * 
 * JoBits
 * @author Jorge
 * 
 */
public interface LongProcessMethod {//TODO: aqui hay que hacer un handler para 
                                    //registrar en el proceso los avances y 
                                    //reportarlos a la vista principal mientras sale la ventana de cargando

    public void execute();
    
    
}
