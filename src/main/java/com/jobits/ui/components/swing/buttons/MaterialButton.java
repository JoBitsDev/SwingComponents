package com.jobits.ui.components.swing.buttons;

import com.jhw.swing.material.components.button._MaterialButton;
import com.jhw.swing.util.icons.icon_ttf.IconTTF;
import com.jobits.pos.ui.DefaultValues;
import java.awt.Color;
import javax.swing.Icon;
import com.jhw.swing.util.Utils;

/**
 * A Material Design button.
 *
 * @author bilux (i.bilux@gmail.com)
 */
public class MaterialButton extends _MaterialButton {

    public MaterialButton() {
        setBackground(DefaultValues.PRIMARY_COLOR);
        setForeground(Utils.getForegroundAccording(getBackground()));
    }

    public MaterialButton(Icon icon) {
        this();
        setText("");
        setIcon(((IconTTF)icon).deriveIcon(getForeground()));
        setSize(40, 40);
    }

    public MaterialButton(Icon icon, Color color) {
        this(icon);
        setBackground(color);
    }

    public MaterialButton(Color color) {
        this();
        setText("");
        setBackground(color);
    }
}
