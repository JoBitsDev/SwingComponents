package com.jobits.ui.components.swing.containers;

import com.jobits.ui.utils.MaterialColor;
import components.containers.panels._MaterialPanel;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * A JPanel customized for Material components. What makes these panels special
 * is the possibility of assigning them an elevation level. Elevation can help
 * distinguishing elements inside a Material-based GUI, and any changes done to
 * them result in nicely animated transitions, helping to achieve that Material
 * flow.
 *
 * However, there is a catch: shadows are kinda expensive to compute, as Java2D
 * relies on the CPU for anything other than images, so having a lot of elements
 * with a given elevation (and thus, a shadow) can reduce performance when these
 * elevations change due to the triggered animations.
 *
 * Letting the components suggest a prefered size based on their contents is
 * still under development, so it is not advised to use your favorite
 * {@link LayoutManager} inside a {@code MaterialPanel} unless you set the
 * prefered, minimum and maximum size of each component by yourself. Currently,
 * the prefereable approach to follow is overriding {@link #doLayout()} and
 * taking care of any arrangements by yourself.
 *
 * @author bilux (i.bilux@gmail.com)
 */
public class MaterialPanel extends _MaterialPanel {


    /**
     * Creates a new {@code MaterialPanel}. These panels cast a shadow below
     * them, although technically it is painted inside its borders. If you don't
     * need a shadow to be casted from this panel, use a {@link JPanel} instead.
     */
    public MaterialPanel(Color backgroundColor) {
        setBackground(backgroundColor);
    }

    public MaterialPanel() {
    }
    
    


}
