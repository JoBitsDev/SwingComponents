package com.jobits.ui.components.swing.buttons;

import com.jobits.pos.ui.DefaultValues;
import components.buttons._MaterialButton;
import java.awt.Color;
import javax.swing.Icon;
import util.Utils;
import util.icon_ttf.IconTTF;

/**
 * A Material Design button.
 *
 * @author bilux (i.bilux@gmail.com)
 */
public class MaterialButton extends _MaterialButton {

    public MaterialButton() {
        setBackground(DefaultValues.BUTTON_COLOR);
        setForeground(Utils.getForegroundAccording(getBackground()));
    }

    public MaterialButton(Icon icon) {
        this();
        setText("");
        setIcon(((IconTTF)icon).deriveIconTTF(getForeground()));
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
