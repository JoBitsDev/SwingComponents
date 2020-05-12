/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components;

import com.jobits.ui.components.swing.input.MaterialPasswordField;
import com.jobits.ui.components.swing.input.MaterialTextField;
import com.jobits.ui.components.swing.buttons.MaterialButton;
import com.jobits.ui.components.swing.buttons.MaterialIconButton;
import com.jobits.ui.components.swing.containers.MaterialPanel;
import com.jobits.ui.components.swing.containers.MaterialFrame;
import com.jobits.ui.components.swing.containers.MaterialWindow;
import com.jobits.ui.components.swing.displayers.MaterialComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import util.materials.MaterialColors;
import util.materials.MaterialIcons;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class MaterialComponentsFactory {//TODO material outlined buttons instead of different colors

    public static class Buttons {

        public static JButton getCloseButton() {
            return new MaterialButton(MaterialIcons.CLOSE);
        }

        public static JButton getMaximizeButton() {
            return new MaterialButton(MaterialIcons.EXPAND_MORE);
        }

        public static JButton getMinimizeButton() {
            return new MaterialButton(MaterialIcons.EXPAND_LESS);
        }

        public static JButton getMaterialButton() {
            return new MaterialButton();
        }

        public static JButton getBackButton() {
            return new MaterialButton(MaterialIcons.NAVIGATE_BEFORE, MaterialColors.GREY_400);
        }

        public static JButton getEditButton() {
            return new MaterialButton(MaterialIcons.UPDATE, MaterialColors.LIGHTBLUEA_200);
        }

        public static JButton getAcceptButton() {
            return new MaterialButton(MaterialColors.LIGHTBLUE_200);
        }

        public static JButton getCancelButton() {
            return new MaterialButton(MaterialColors.COSMO_RED);
        }
        
        public static JButton getOutlinedButton(){
            return new MaterialButton();
        }

        public static JButton getIconButton(ImageIcon imageIcon) {
            return new MaterialIconButton(imageIcon);
        }

    }

    public static class Displayers {

        public static JComboBox getComboBox() {
            return new MaterialComboBox();
        }

        public static JLabel getLabel() {
            return new JLabel();
        }

        public static JComponent getProgressDialog() {
            return new JLabel();
        }
    }

    public static class Input {

        public static JTextField getTextField(String hintName, String header) {
            return new MaterialTextField(hintName, header);
        }

        public static JFormattedTextField getFormattedTextField(String hintName, String header) {
            return new JFormattedTextField();
        }

        public static JPasswordField getPasswordField(String hint, String header) {
            return new MaterialPasswordField(hint, header);
        }

    }

    public static class Containers {

        public static JPanel getTransparentPanel() {
            return new MaterialPanel();
        }

        public static JPanel getPrimaryPanel() {
            return new MaterialPanel();
        }

        public static JFrame getMaterialWindow() {
            return new MaterialWindow();
        }

        public static JFrame getMaterialFrame() {
            return new MaterialFrame();
        }

        public static JFrame getMaterialDialog() {
            return new MaterialFrame();
        }

        public static JPanel getSecondaryPanel() {
            return new MaterialPanel(MaterialColors.BLUEA_100);
        }

    }

}
