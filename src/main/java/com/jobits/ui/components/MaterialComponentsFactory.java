/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components;

import com.jgoodies.binding.value.ValueModel;
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
import com.jobits.ui.components.swing.displayers.Card;
import com.root101.swing.material.components.combobox.MaterialComboBoxFactory;
import com.root101.swing.material.components.datepicker.MaterialDatePicker;
import com.root101.swing.material.components.datepicker.MaterialDatePickersFactory;
import com.root101.swing.material.components.scrollpane._MaterialScrollPaneCore;
import com.root101.swing.material.components.textfield.MaterialFormatedTextField;
import com.root101.swing.material.components.textfield.MaterialTextFactory;
import com.root101.swing.material.standards.MaterialColors;
import com.root101.swing.material.standards.MaterialIcons;
import com.root101.swing.ui.MaterialLookAndFeel;
import com.root101.swing.ui.componentsui.tabbedpane.MaterialTabbedPaneUI;
import com.root101.utils.formateer.MoneyFormateer;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.TabbedPaneUI;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXList;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class MaterialComponentsFactory {//TODO material outlined buttons instead of different colors

    public static class Buttons {

        public static JButton getMaterialButton() {
            return new MaterialButton();
        }

        public static JButton getOutlinedButton() {
            return new MaterialSecondaryButton();
        }

        public static JButton getLinedButton() {
            return new MaterialSecondaryButton(true);
        }

        public static JButton getCloseButton() {
            return new MaterialButton(MaterialIcons.CLOSE);
        }

        public static JButton getMaximizeButton() {
            return new MaterialButton(MaterialIcons.EXPAND_MORE);
        }

        public static JButton getMinimizeButton() {
            return new MaterialButton(MaterialIcons.EXPAND_LESS);
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
            return new MaterialSecondaryButton(MaterialIcons.REMOVE.deriveIcon(30f));
        }

        public static JButton getIconButton(ImageIcon imageIcon) {
            return new MaterialIconButton(imageIcon);
        }

        public static JButton getMenuButton() {
            return new MaterialSecondaryButton(MaterialIcons.MENU.deriveIcon(30f));
        }

        public static JButton getAddButton() {
            return new MaterialSecondaryButton(MaterialIcons.ADD.deriveIcon(30f));
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
            return new JLabel();
        }

        public static JList getList() {
            return new JXList();

        }

        public static Card getLongCard(
                String imageURL,
                String title,
                String secondaryText,
                String mediaURL,
                String supportText,
                Action mainButtonAction,
                Action secundaryButtonAction,
                ValueModel valueModelTitle,
                ValueModel valueModelSecondaryText,
                ValueModel valueModelImageIcon,
                Action... menuActions) {
            return new Card(imageURL, title, secondaryText, mediaURL, supportText, mainButtonAction, secundaryButtonAction, valueModelTitle, valueModelSecondaryText, valueModelImageIcon, menuActions);
        }

        public static Card getSmallCard(
                String imageURL,
                String title,
                String secondaryText,
                ValueModel valueModel,
                Action... menuActions) {
            return new Card(imageURL, title, secondaryText, menuActions);
        }

        public static Card getSmallCardValueModel(
                String imageURL,
                String title,
                String secondaryText,
                ValueModel valueModel,
                Action... menuActions) {
            return new Card(imageURL, title, secondaryText, valueModel, menuActions);
        }

        public static Card getSmallCardImageValueModel(
                String imageURL,
                String title,
                String secondaryText,
                ValueModel valueModel,
                ValueModel valueModelIcon,
                Action... menuActions) {
            return new Card(imageURL, title, secondaryText, valueModel, valueModelIcon, menuActions);
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

        public static JTextField getTextFielPrecioVenta(String hint, String title, String coin) {
            MaterialFormatedTextField textField = MaterialTextFactory.buildFormatedRuntime(new MoneyFormateer());
            textField.setHint(hint);
            textField.setLabel(title);
            textField.setExtra(coin);
            return textField;
        }

        public static JCheckBox getCheckBox() {
            return new JCheckBox();
        }

        public static JXDatePicker getDatePicker() {
            MaterialDatePicker picker = MaterialDatePickersFactory.build();
            picker.setBackground(DefaultValues.SECONDARY_COLOR_LIGHT);
            return picker;
        }

        public static <T> JComboBox<T> getComboBoxEditable() {
            return MaterialComboBoxFactory.buildFiltrable();
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

        public static JScrollPane getScrollPane() {
            return new _MaterialScrollPaneCore();
        }

    }

    public static class UI {

//        public static  getMaterialLooks() throws UnsupportedLookAndFeelException {
//            return new ;
//        }
        public static TabbedPaneUI getTabbedPaneUI() {
            return new MaterialTabbedPaneUI();
        }

        public static LookAndFeel getLooks() throws UnsupportedLookAndFeelException {
            return new MaterialLookAndFeel();
        }

    }
}
