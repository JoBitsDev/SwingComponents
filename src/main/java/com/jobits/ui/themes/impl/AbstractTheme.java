/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.themes.impl;

/**
 *
 * @author Home
 */
public abstract class AbstractTheme {

    private String themeName;

    protected AbstractTheme(String themeName) {
        this.themeName = themeName;
    }

    public String getThemeName() {
        return themeName;
    }

}
