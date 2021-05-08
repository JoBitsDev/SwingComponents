/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.themes.impl;

import com.jgoodies.binding.value.ValueModel;
import com.jobits.pos.ui.DefaultValues;
import com.jobits.ui.components.swing.displayers.Card;
import com.jobits.ui.components.swing.displayers.LoadingPanel;
import com.jobits.ui.themes.ThemeService;
import com.jobits.ui.themes.ThemeType;
import com.root101.swing.material.components.datepicker.MaterialDatePickersFactory;
import com.root101.swing.material.components.datepicker.MaterialMonthPicker;
import com.root101.swing.material.components.datepicker.MaterialYearPicker;
import com.root101.swing.material.components.datepicker._Month;
import com.root101.swing.material.components.progress.MaterialProgressSpinner;
import com.root101.swing.material.components.progress._MaterialProgressSpinner;
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
import javax.swing.plaf.TabbedPaneUI;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXList;

/**
 *
 * @author Home
 */
public class DefaultTheme extends AbstractTheme implements ThemeService {

    public DefaultTheme() {
        super(ThemeType.DEFAULT.getThemeName());
    }

    @Override
    public JButton getMaterialButton() {
        return new JButton();
    }

    @Override
    public JButton getOutlinedButton() {
        return new JButton();
    }

    @Override
    public JButton getLinedButton() {
        return new JButton();
    }

    @Override
    public JButton getCloseButton() {
        return new JButton();
    }

    @Override
    public JButton getMaximizeButton() {
        return new JButton();
    }

    @Override
    public JButton getMinimizeButton() {
        return new JButton();
    }

    @Override
    public JButton getBackButton() {
        return new JButton();
    }

    @Override
    public JButton getEditButton() {
        return new JButton();
    }

    @Override
    public JButton getAcceptButton() {
        return new JButton();
    }

    @Override
    public JButton getCancelButton() {
        return new JButton();
    }

    @Override
    public JButton getIconButton(ImageIcon imageIcon) {
        return new JButton(imageIcon);
    }

    @Override
    public JButton getMenuButton() {
        return new JButton();
    }

    @Override
    public JButton getAddButton() {
        return new JButton();
    }

    @Override
    public MaterialProgressSpinner getRoundLoading() {
        return _MaterialProgressSpinner.from();
    }

    @Override
    public JComboBox getComboBox(String label) {
        return new JComboBox();
    }

    @Override
    public MaterialYearPicker getYearComboBox() {
        MaterialYearPicker year = MaterialDatePickersFactory.buildYearPicker();
        year.setObject(Year.of(LocalDate.now().getYear()));
        return year;
    }

    @Override
    public MaterialMonthPicker getMonthComboBox() {
        MaterialMonthPicker month = MaterialDatePickersFactory.buildMonthPicker();
        month.setObject(_Month.from(LocalDate.now().getMonthValue()));
        return month;
    }

    @Override
    public JLabel getLabel() {
        return new JLabel();
    }

    @Override
    public JComponent getLoadingPanel(String loadingMessage) {
        return new LoadingPanel(loadingMessage);
    }

    @Override
    public JLabel getH3Label() {
        return new JLabel();
    }

    @Override
    public JList getList() {
        return new JXList();

    }

    @Override
    public Card getLongCard(
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

    @Override
    public Card getSmallCard(
            String imageURL,
            String title,
            String secondaryText,
            ValueModel valueModel,
            Action... menuActions) {
        return new Card(imageURL, title, secondaryText, menuActions);
    }

    @Override
    public Card getSmallCardValueModel(
            String imageURL,
            String title,
            String secondaryText,
            ValueModel valueModel,
            Action... menuActions) {
        return new Card(imageURL, title, secondaryText, valueModel, menuActions);
    }

    @Override
    public Card getSmallCardImageValueModel(
            String imageURL,
            String title,
            String secondaryText,
            ValueModel valueModel,
            ValueModel valueModelIcon,
            Action... menuActions) {
        return new Card(imageURL, title, secondaryText, valueModel, valueModelIcon, menuActions);
    }

    @Override
    public JTextField getTextField(String hintName, String header) {
        return new JTextField();
    }

    @Override
    public JFormattedTextField getFormattedTextField(String hintName, String title) {
        return new JFormattedTextField();
    }

    @Override
    public JPasswordField getPasswordField(String hint, String title) {
        return new JPasswordField();
    }

    @Override
    public JTextField getTextFielPrecioVenta(String hint, String title, String coin) {
        return new JTextField();
    }

    @Override
    public JCheckBox getCheckBox() {
        return new JCheckBox();
    }

    @Override
    public JXDatePicker getDatePicker() {
        return new JXDatePicker();
    }

    @Override
    public JXDatePicker getUnlabeledDatePicker() {
        return new JXDatePicker();
    }

    @Override
    public <T> JComboBox<T> getComboBoxEditable() {
        return new JComboBox();
    }

    @Override
    public JSpinner getSpinnerNumber() {
        return new JSpinner();
    }

    @Override
    public JPanel getTransparentPanel() {
        JPanel transperentPanel = new JPanel();
        transperentPanel.setOpaque(false);
        transperentPanel.setToolTipText(null);
        return transperentPanel;
    }

    @Override
    public JPanel getPrimaryPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(DefaultValues.SECONDARY_COLOR_LIGHT);
        panel.setToolTipText(null);
        return panel;
    }

    @Override
    public JPanel getSecondaryPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(DefaultValues.WHITE);
        panel.setToolTipText(null);
        return panel;
    }

    @Override
    public JFrame getMaterialWindow() {
        return new JFrame();
    }

    @Override
    public JFrame getMaterialFrame() {
        return new JFrame();
    }

    @Override
    public JFrame getMaterialDialog() {
        return new JFrame();
    }

    @Override
    public JPanel getHeaderPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(DefaultValues.SECONDARY_COLOR_LIGHT);
        panel.setToolTipText(null);
        return panel;
    }

    @Override
    public JScrollPane getScrollPane() {
        return new JScrollPane();
    }

    @Override
    public JTabbedPane getTabPane() {
        return new JTabbedPane();
    }

    @Override
    public MaterialListUI getListUI() {
        return new MaterialListUI();
    }

    @Override
    public TabbedPaneUI getTabbedPaneUI() {
        return new MaterialTabbedPaneUI();
    }

    @Override
    public LookAndFeel getLooks() {
        return new MaterialLookAndFeel();
    }

}
