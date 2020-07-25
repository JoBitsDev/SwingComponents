/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.buttons;

import com.jhw.swing.material.components.button._MaterialButton;
import com.jhw.swing.material.standars.MaterialColors;
import com.jhw.swing.util.icons.icon_ttf.IconTTF;
import com.jobits.pos.ui.DefaultValues;
import com.jobits.ui.utils.MaterialIcons;
import javax.swing.Icon;
import javax.swing.border.LineBorder;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class MaterialSecondaryButton extends _MaterialButton {

    public MaterialSecondaryButton() {
        setBackground(MaterialColors.TRANSPARENT);
        setForeground(DefaultValues.PRIMARY_COLOR);
        setBorder(new LineBorder(getForeground(), DefaultValues.BORDER_LINE_THICK));

    }

    public MaterialSecondaryButton(Icon icon) {
        this();
        setIcon(((IconTTF)icon).deriveIcon(getForeground()));
    }


}
