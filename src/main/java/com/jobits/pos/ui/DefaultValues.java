/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.ui;

import com.root101.swing.material.standards.MaterialColors;
import com.root101.swing.material.standards.MaterialFontRoboto;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Font;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class DefaultValues {

    public static final Color PRIMARY_COLOR = MaterialColors.INDIGO_300;
    public static final Color PRIMARY_COLOR_LIGHT = MaterialColors.INDIGO_100;
    public static final Color PRIMARY_COLOR_DARK = MaterialColors.INDIGO_500;

    public static Color SECONDARY_COLOR_LIGHT = MaterialColors.GREY_200;
    public static Color SECONDARY_COLOR = MaterialColors.GREY_300;
    public static Color SECONDARY_DARK = MaterialColors.GREY_400;

    public static Font DEFAULT_FONT = MaterialFontRoboto.REGULAR;

    public static int BORDER_LINE_THICK = 3;

    public static Border LINE_BORDER = new LineBorder(PRIMARY_COLOR, BORDER_LINE_THICK, true);

    public static final Color[] DEFAULT_COLOR_PALETE = {
        MaterialColors.RED_300,
        MaterialColors.ORANGE_300,
        MaterialColors.YELLOW_300,
        MaterialColors.GREEN_300,
        MaterialColors.BLUE_300,
        MaterialColors.INDIGO_300,
        MaterialColors.GREY_300};

}
