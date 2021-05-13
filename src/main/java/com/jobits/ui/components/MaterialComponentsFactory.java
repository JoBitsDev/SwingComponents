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
import com.jobits.ui.themes.ThemeHandler;
import com.jobits.ui.utils.MoneyFormateer;
import com.root101.swing.material.components.combobox.MaterialComboBox;
import com.root101.swing.material.components.combobox.MaterialComboBoxFactory;
import com.root101.swing.material.components.datepicker.MaterialDatePicker;
import com.root101.swing.material.components.datepicker.MaterialDatePickersFactory;
import com.root101.swing.material.components.datepicker.MaterialMonthPicker;
import com.root101.swing.material.components.datepicker.MaterialYearPicker;
import com.root101.swing.material.components.datepicker._Month;
import com.root101.swing.material.components.progress.MaterialProgressSpinner;
import com.root101.swing.material.components.progress._MaterialProgressSpinner;
import com.root101.swing.material.components.scrollpane.MaterialScrollPane;
import com.root101.swing.material.components.scrollpane._MaterialScrollPaneCore;
import com.root101.swing.material.components.spinner._MaterialSpinnerInteger;
import com.root101.swing.material.components.textfield.MaterialFormatedTextField;
import com.root101.swing.material.components.textfield.MaterialTextFactory;
import com.root101.swing.material.standards.MaterialColors;
import com.root101.swing.material.standards.MaterialIcons;
import com.root101.swing.ui.MaterialLookAndFeel;
import com.root101.swing.ui.componentsui.list.MaterialListUI;
import com.root101.swing.ui.componentsui.tabbedpane.MaterialTabbedPaneUI;
import java.time.LocalDate;
import java.time.Year;
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
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
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
            return ThemeHandler.getThemeService().getMaterialButton();
        }

        public static JButton getOutlinedButton() {
            return ThemeHandler.getThemeService().getOutlinedButton();
        }

        public static JButton getLinedButton() {
            return ThemeHandler.getThemeService().getLinedButton();
        }

        public static JButton getCloseButton() {
            return ThemeHandler.getThemeService().getCloseButton();
        }

        public static JButton getMaximizeButton() {
            return ThemeHandler.getThemeService().getMaximizeButton();
        }

        public static JButton getMinimizeButton() {
            return ThemeHandler.getThemeService().getMinimizeButton();
        }

        public static JButton getBackButton() {
            return ThemeHandler.getThemeService().getMinimizeButton();
        }

        public static JButton getEditButton() {
            return ThemeHandler.getThemeService().getEditButton();
        }

        public static JButton getAcceptButton() {
            return ThemeHandler.getThemeService().getAcceptButton();
        }

        public static JButton getCancelButton() {
            return ThemeHandler.getThemeService().getCancelButton();
        }

        public static JButton getIconButton(ImageIcon imageIcon) {
            return ThemeHandler.getThemeService().getIconButton(imageIcon);
        }

        public static JButton getMenuButton() {
            return ThemeHandler.getThemeService().getMenuButton();
        }

        public static JButton getAddButton() {
            return ThemeHandler.getThemeService().getAddButton();
        }

    }

    public static class Displayers {

        public static MaterialProgressSpinner getRoundLoading() {
            return ThemeHandler.getThemeService().getRoundLoading();
        }

        public static JComboBox getComboBox(String label) {
            return ThemeHandler.getThemeService().getComboBox(label);
        }

        public static MaterialYearPicker getYearComboBox() {
            return ThemeHandler.getThemeService().getYearComboBox();
        }

        public static MaterialMonthPicker getMonthComboBox() {
            return ThemeHandler.getThemeService().getMonthComboBox();
        }

        public static JLabel getLabel() {
            return ThemeHandler.getThemeService().getLabel();
        }

        public static JComponent getLoadingPanel(String loadingMessage) {
            return ThemeHandler.getThemeService().getLoadingPanel(loadingMessage);
        }

        public static JLabel getH3Label() {
            return ThemeHandler.getThemeService().getH3Label();
        }

        public static JList getList() {
            return ThemeHandler.getThemeService().getList();

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
            return ThemeHandler.getThemeService().getLongCard(imageURL, title, secondaryText, mediaURL, supportText, mainButtonAction, secundaryButtonAction, valueModelTitle, valueModelSecondaryText, valueModelImageIcon, menuActions);
        }

        public static Card getSmallCard(
                String imageURL,
                String title,
                String secondaryText,
                ValueModel valueModel,
                Action... menuActions) {
            return ThemeHandler.getThemeService().getSmallCard(imageURL, title, secondaryText, valueModel, menuActions);
        }

        public static Card getSmallCardValueModel(
                String imageURL,
                String title,
                String secondaryText,
                ValueModel valueModel,
                Action... menuActions) {
            return ThemeHandler.getThemeService().getSmallCardValueModel(imageURL, title, secondaryText, valueModel, menuActions);
        }

        public static Card getSmallCardImageValueModel(
                String imageURL,
                String title,
                String secondaryText,
                ValueModel valueModel,
                ValueModel valueModelIcon,
                Action... menuActions) {
            return ThemeHandler.getThemeService().getSmallCardImageValueModel(imageURL, title, secondaryText, valueModel, valueModelIcon, menuActions);
        }

    }

    public static class Input {

        public static JTextField getTextField(String hintName, String header) {
            return ThemeHandler.getThemeService().getTextField(hintName, header);
        }

        public static JFormattedTextField getFormattedTextField(String hintName, String title) {
            return ThemeHandler.getThemeService().getFormattedTextField(hintName, title);
        }

        public static JPasswordField getPasswordField(String hint, String title) {
            return ThemeHandler.getThemeService().getPasswordField(hint, title);
        }

        public static JTextField getTextFielPrecioVenta(String hint, String title, String coin) {
            return ThemeHandler.getThemeService().getTextFielPrecioVenta(hint, title, coin);
        }

        public static JCheckBox getCheckBox() {
            return ThemeHandler.getThemeService().getCheckBox();
        }

        public static JXDatePicker getDatePicker() {
            return ThemeHandler.getThemeService().getDatePicker();
        }

        public static JXDatePicker getUnlabeledDatePicker() {
            return ThemeHandler.getThemeService().getUnlabeledDatePicker();
        }

        public static <T> JComboBox<T> getComboBoxEditable() {
            return ThemeHandler.getThemeService().getComboBoxEditable();
        }

        public static JSpinner getSpinnerNumber() {
            return ThemeHandler.getThemeService().getSpinnerNumber();
        }
    }

    public static class Containers {

        public static JPanel getTransparentPanel() {
            return ThemeHandler.getThemeService().getTransparentPanel();
        }

        public static JPanel getPrimaryPanel() {
            return ThemeHandler.getThemeService().getPrimaryPanel();
        }

        public static JPanel getSecondaryPanel() {
            return ThemeHandler.getThemeService().getSecondaryPanel();
        }

        public static JFrame getMaterialWindow() {
            return ThemeHandler.getThemeService().getMaterialWindow();
        }

        public static JFrame getMaterialFrame() {
            return ThemeHandler.getThemeService().getMaterialFrame();
        }

        public static JFrame getMaterialDialog() {
            return ThemeHandler.getThemeService().getMaterialDialog();
        }

        public static JPanel getHeaderPanel() {
            return ThemeHandler.getThemeService().getHeaderPanel();
        }

        public static JScrollPane getScrollPane() {
            return ThemeHandler.getThemeService().getScrollPane();
        }

        public static JTabbedPane getTabPane() {
            return ThemeHandler.getThemeService().getTabPane();
        }

        public static MaterialListUI getListUI() {
            return ThemeHandler.getThemeService().getListUI();
        }

    }

    public static class UI {

        public static TabbedPaneUI getTabbedPaneUI() {
            return ThemeHandler.getThemeService().getTabbedPaneUI();
        }

        public static LookAndFeel getLooks() throws UnsupportedLookAndFeelException {
            return ThemeHandler.getThemeService().getLooks();
        }

    }
}
