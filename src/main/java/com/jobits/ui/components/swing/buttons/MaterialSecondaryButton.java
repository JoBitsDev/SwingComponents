/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.buttons;

import com.jobits.pos.ui.DefaultValues;
import com.root101.swing.derivable_icons.DerivableIcon;
import com.root101.swing.material.components.button._MaterialButton;
import com.root101.swing.material.standards.MaterialColors;
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

    public MaterialSecondaryButton(boolean linedBorder) {
        setBackground(MaterialColors.TRANSPARENT);
        setForeground(DefaultValues.PRIMARY_COLOR);
        setBorderColor(linedBorder ? getForeground() : getBackground());
        setBorderThickness(DefaultValues.BORDER_LINE_THICK);
    }

    public MaterialSecondaryButton(Icon icon) {
        this();
        setIcon(((DerivableIcon) icon).deriveIcon(getForeground()));
    }

}
