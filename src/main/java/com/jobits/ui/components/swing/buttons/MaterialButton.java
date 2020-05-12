package com.jobits.ui.components.swing.buttons;

import components.buttons._MaterialButton;
import java.awt.Color;
import javax.swing.Icon;

/**
 * A Material Design button.
 *
 * @author bilux (i.bilux@gmail.com)
 */
public class MaterialButton extends _MaterialButton {

    public MaterialButton() {
    }

    public MaterialButton(Icon icon) {
        setText("");
        setIcon(icon);
        setSize(40, 40);
    }

    public MaterialButton(Icon icon, Color color) {
        setText("");
        setIcon(icon);
        setSize(40, 40);
        setBackground(color);
    }

    public MaterialButton(Color color) {
        setText("");
        setBackground(color);
    }
}
