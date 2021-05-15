/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.themes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public enum ThemeType {

    NIMBUS("Nimbus"),
    SIMPLE_MATERIAL("Material Simple"),
    //    DARK_MATERIAL("Material Oscuro"), TODO: en progreso tema oscuro
    MATERIAL("Material");

    private final String themeName;

    private ThemeType(String themeName) {
        this.themeName = themeName;
    }

    public String getThemeName() {
        return themeName;
    }

    public static List<String> stringValues() {
        List<String> aux = new ArrayList<>();
        for (ThemeType v : ThemeType.values()) {
            aux.add(v.getThemeName());
        }
        return aux;
    }

}
