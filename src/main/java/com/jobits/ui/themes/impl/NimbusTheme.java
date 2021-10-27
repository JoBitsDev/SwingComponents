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
import com.jobits.ui.components.swing.input.MaterialPasswordField;
import com.jobits.ui.components.swing.input.MaterialTextField;
import com.jobits.ui.themes.ThemeService;
import com.jobits.ui.themes.ThemeType;
import com.root101.swing.material.components.datepicker.MaterialDatePickersFactory;
import com.root101.swing.material.components.datepicker.MaterialMonthPicker;
import com.root101.swing.material.components.datepicker.MaterialYearPicker;
import com.root101.swing.material.components.datepicker._Month;
import com.root101.swing.material.components.progress.MaterialProgressSpinner;
import com.root101.swing.material.components.progress._MaterialProgressSpinner;
import com.root101.swing.material.standards.MaterialIcons;
import com.root101.swing.ui.componentsui.list.MaterialListUI;
import com.root101.swing.util.Utils;
import java.time.LocalDate;
import java.time.Year;
import javax.swing.Action;
import javax.swing.BorderFactory;
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
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXList;

/**
 *
 * @author Home
 */
public class NimbusTheme extends AbstractTheme implements ThemeService {

    public NimbusTheme() {
        super(ThemeType.NIMBUS.getThemeName());
    }

    public JButton getMaterialButton() {
        JButton button = new JButton();
        button.setBackground(DefaultValues.PRIMARY_COLOR_DARK);
        button.setForeground(Utils.getForegroundAccording(button.getBackground()));
        return button;
    }

    public JButton getOutlinedButton() {
        JButton button = new JButton();
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
    }

    public JButton getLinedButton() {
        JButton button = new JButton();
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        button.setBorderPainted(true);
        button.setBorder(BorderFactory.createLineBorder(DefaultValues.PRIMARY_COLOR_DARK, 2, true));
        return button;
    }

    public JButton getCloseButton() {
        JButton button = new JButton(MaterialIcons.CLOSE);
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
    }

    public JButton getMaximizeButton() {
        JButton button = new JButton(MaterialIcons.EXPAND_MORE);
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
    }

    public JButton getMinimizeButton() {
        JButton button = new JButton(MaterialIcons.EXPAND_LESS);
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
    }

    public JButton getBackButton() {
        JButton button = new JButton(MaterialIcons.ARROW_BACK);
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
    }

    public JButton getEditButton() {
        JButton button = new JButton(MaterialIcons.UPDATE);
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
    }

    public JButton getAcceptButton() {
        JButton button = new JButton();
        button.setBackground(DefaultValues.PRIMARY_COLOR_DARK);
        button.setForeground(Utils.getForegroundAccording(button.getBackground()));
        return button;
    }

    public JButton getCancelButton() {
        JButton button = new JButton(MaterialIcons.REMOVE.deriveIcon(30f));
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
    }

    public JButton getIconButton(ImageIcon imageIcon) {
        JButton button = new JButton(imageIcon);
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
    }

    public JButton getMenuButton() {
        JButton button = new JButton(MaterialIcons.MENU.deriveIcon(30f));
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
    }

    public JButton getAddButton() {
        JButton button = new JButton(MaterialIcons.ADD.deriveIcon(30f));
        button.setOpaque(false);
        button.setForeground(DefaultValues.PRIMARY_COLOR_DARK);
        return button;
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
        LoadingPanel loading = new LoadingPanel(loadingMessage);
        return loading;
    }

    @Override
    public JLabel getH3Label() {
        return new JLabel();
    }

    @Override
    public JList getList() {
        JXList list = new JXList();
        list.setBorder(BorderFactory.createLineBorder(DefaultValues.PRIMARY_COLOR_DARK, 1, true));
        return list;
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
        return new MaterialTextField(hintName, header);
    }

    @Override
    public JFormattedTextField getFormattedTextField(String hintName, String title) {
        return new JFormattedTextField();
    }

    @Override
    public JPasswordField getPasswordField(String hint, String title) {
        return new MaterialPasswordField(hint, title);
    }

    @Override
    public JTextField getTextFielPrecioVenta(String hint, String title, String coin) {
        return new MaterialTextField(hint, title + " (" + coin + " )");
//            TODO: Corregir error del money formatter

//            MaterialFormatedTextField textField = MaterialTextFactory.buildFormatedRuntime(new MoneyFormateer());
//            textField.setHint(hint);
//            textField.setLabel(title);
//            textField.setExtra(coin);
//            return textField;
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
        return new JComboBox<>();
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
        panel.setBackground(DefaultValues.PRIMARY_COLOR_LIGHT);
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
        return new BasicTabbedPaneUI();
    }

    @Override
    public LookAndFeel getLooks() {
        return new MetalLookAndFeel();
    }

}
