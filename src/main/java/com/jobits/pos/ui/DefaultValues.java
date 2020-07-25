/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.ui;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import com.jhw.swing.material.standars.MaterialColors;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class DefaultValues {

    public static final Color PRIMARY_COLOR = MaterialColors.INDIGO_500;
    public static final Color PRIMARY_COLOR_LIGHT = MaterialColors.INDIGO_200;
    public static final Color PRIMARY_COLOR_DARK = MaterialColors.INDIGO_800;

    public static Color SECONDARY_COLOR_LIGHT = MaterialColors.BLUEGREY_100;
    public static Color SECONDARY_COLOR = MaterialColors.BLUEGREY_300;
    public static Color SECONDARY_DARK = MaterialColors.BLUEGREY_500;

    public static int BORDER_LINE_THICK = 3;

    public static Border LINE_BORDER = new LineBorder(PRIMARY_COLOR, BORDER_LINE_THICK, true);

}
