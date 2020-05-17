/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components;

import com.jobits.pos.ui.DefaultValues;
import com.jobits.ui.components.swing.input.MaterialPasswordField;
import com.jobits.ui.components.swing.input.MaterialTextField;
import com.jobits.ui.components.swing.buttons.MaterialButton;
import com.jobits.ui.components.swing.buttons.MaterialIconButton;
import com.jobits.ui.components.swing.buttons.MaterialSecondaryButton;
import com.jobits.ui.components.swing.containers.MaterialPanel;
import com.jobits.ui.components.swing.containers.MaterialFrame;
import com.jobits.ui.components.swing.containers.MaterialWindow;
import com.jobits.ui.components.swing.displayers.LoadingPanel;
import com.jobits.ui.components.swing.displayers.MaterialComboBox;
import components.comboboxes._MaterialComboBox;
import components.labels._MaterialLabel;
import components.textfields.validados._MaterialTextFieldMoneyPositive;
import components.toggle._MaterialCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
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
            return new MaterialSecondaryButton(MaterialIcons.ARROW_BACK);
        }

        public static JButton getEditButton() {
            return new MaterialSecondaryButton(MaterialIcons.UPDATE);
        }

        public static JButton getAcceptButton() {
            return new MaterialButton();
        }

        public static JButton getCancelButton() {
            return new MaterialSecondaryButton();
        }

        public static JButton getOutlinedButton() {
            return new MaterialSecondaryButton();
        }

        public static JButton getIconButton(ImageIcon imageIcon) {
            return new MaterialIconButton(imageIcon);
        }

        public static JButton getMenuButton() {
            return new MaterialSecondaryButton(MaterialIcons.MENU.deriveIconTTF(30f));
        }

        public static JButton getAddButton() {
            return new MaterialSecondaryButton(MaterialIcons.ADD.deriveIconTTF(30f));
        }

    }

    public static class Displayers {

        public static JComboBox getComboBox() {
            return new JComboBox();
        }

        public static JLabel getLabel() {
            return new JLabel();
        }

        public static JComponent getLoadingPanel(String loadingMessage) {
            return new LoadingPanel(loadingMessage);
        }

        public static JLabel getH3Label() {
            return new _MaterialLabel();
        }
    }

    public static class Input {

        public static JTextField getTextField(String hintName, String header) {
            return new MaterialTextField(hintName, header);
        }

        public static JFormattedTextField getFormattedTextField(String hintName, String title) {
            return new JFormattedTextField();
        }

        public static JPasswordField getPasswordField(String hint, String title) {
            return new MaterialPasswordField(hint, title);
        }

        public static JTextField getTextFielPrecioVenta(String hint, String title,String coin) {
            _MaterialTextFieldMoneyPositive textField = new _MaterialTextFieldMoneyPositive();
            textField.setHint(hint);
            textField.setLabel(title);
            textField.setExtra(coin);
            return textField;
        }

        public static JCheckBox getCheckBox() {
            return new JCheckBox();
        }

    }

    public static class Containers {

        public static JPanel getTransparentPanel() {
            return new MaterialPanel(MaterialColors.TRANSPARENT);
        }

        public static JPanel getPrimaryPanel() {
            return new MaterialPanel(DefaultValues.SECONDARY_COLOR_LIGHT);
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
            return new MaterialPanel(MaterialColors.WHITE);
        }

        public static JPanel getHeaderPanel() {
            return new MaterialPanel(DefaultValues.SECONDARY_COLOR_LIGHT);
        }

    }

}
