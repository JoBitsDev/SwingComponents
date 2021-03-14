package com.jobits.ui.components.swing.input;

import com.root101.swing.material.components.textfield._MaterialTextField;




/**
 * A Material Design single-line text field is the basic way of getting user
 * input. It includes a descriptive label that appears as a placeholder and then
 * floats above the text field as content is written. You can also set a hint
 * for it to appear below the label when the text field is empty.
 *
 *
 * @author bilux (i.bilux@gmail.com)
 */
public class MaterialTextField extends _MaterialTextField {

    public MaterialTextField(String hint, String header) {
        super.setHint(hint);
        super.setLabel(header);
    }

   
}
