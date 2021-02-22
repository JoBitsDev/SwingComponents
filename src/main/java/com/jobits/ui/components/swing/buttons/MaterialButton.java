package com.jobits.ui.components.swing.buttons;

import com.jobits.pos.ui.DefaultValues;
import com.root101.swing.derivable_icons.DerivableIcon;
import com.root101.swing.material.components.button._MaterialButton;
import com.root101.swing.util.Utils;
import java.awt.Color;
import javax.swing.Icon;

/**
 * A Material Design button.
 *
 * @author bilux (i.bilux@gmail.com)
 */
public class MaterialButton extends _MaterialButton {

    public MaterialButton() {
        setBackground(DefaultValues.PRIMARY_COLOR_DARK);
        setForeground(Utils.getForegroundAccording(getBackground()));
    }

    public MaterialButton(DerivableIcon icon) {
        this();
        setText("");
        setIcon(((DerivableIcon) icon).deriveIcon(getForeground()));
        setSize(40, 40);
    }

    public MaterialButton(DerivableIcon icon, Color color) {
        this(icon);
        setBackground(color);
    }

    public MaterialButton(Color color) {
        this();
        setText("");
        setBackground(color);
    }
}
