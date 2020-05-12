package com.jobits.ui.components.swing.input;

import components.passwordfields._MaterialPasswordField;

/**
 * A Material Design password field.
 *
 * @see <a href="https://www.google.com/design/spec/components/text-fields.html">Text fields (Google design guidelines)</a>
 */
public class MaterialPasswordField extends _MaterialPasswordField {

    public MaterialPasswordField(String hint, String header) {
    super.setHint(hint);
    super.setLabel(header);
    }
  
}
