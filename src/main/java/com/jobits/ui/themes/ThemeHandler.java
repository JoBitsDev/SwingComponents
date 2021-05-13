/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.themes;

import java.util.Objects;

/**
 *
 * @author Home
 */
public class ThemeHandler {

    private static ThemeService themeService;

    private ThemeHandler() {
    }

    public static void registerThemeService(ThemeService newService) {
        if (themeService != null) {
            throw new IllegalArgumentException("ThemeService ya se encuentra registrado");
        }
        Objects.requireNonNull(newService, "ThemeService can't be null");

        themeService = newService;
    }

    public static ThemeService getThemeService() {
        if (themeService == null) {
            throw new IllegalArgumentException("ThemeService no se encuentra registrado");
        }
        return themeService;
    }

}
