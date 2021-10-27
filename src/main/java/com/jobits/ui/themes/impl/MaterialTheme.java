/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.themes.impl;

import com.jgoodies.binding.value.ValueModel;
import com.jobits.pos.ui.DefaultValues;
import com.jobits.ui.components.swing.buttons.MaterialButton;
import com.jobits.ui.components.swing.buttons.MaterialIconButton;
import com.jobits.ui.components.swing.buttons.MaterialSecondaryButton;
import com.jobits.ui.components.swing.containers.MaterialFrame;
import com.jobits.ui.components.swing.containers.MaterialPanel;
import com.jobits.ui.components.swing.containers.MaterialWindow;
import com.jobits.ui.components.swing.displayers.Card;
import com.jobits.ui.components.swing.displayers.LoadingPanel;
import com.jobits.ui.components.swing.input.MaterialPasswordField;
import com.jobits.ui.components.swing.input.MaterialTextField;
import com.jobits.ui.themes.ThemeService;
import com.jobits.ui.themes.ThemeType;
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
import javax.swing.plaf.TabbedPaneUI;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXList;

/**
 *
 * @author Home
 */
public class MaterialTheme extends AbstractTheme implements ThemeService {

    public MaterialTheme() {
        super(ThemeType.MATERIAL.getThemeName());
    }

    @Override
    public JButton getMaterialButton() {
        return new MaterialButton();
    }

    public JButton getOutlinedButton() {
        return new MaterialSecondaryButton(false);
    }

    public JButton getLinedButton() {
        return new MaterialSecondaryButton(true);
    }

    public JButton getCloseButton() {
        return new MaterialButton(MaterialIcons.CLOSE);
    }

    public JButton getMaximizeButton() {
        return new MaterialButton(MaterialIcons.EXPAND_MORE);
    }

    public JButton getMinimizeButton() {
        return new MaterialButton(MaterialIcons.EXPAND_LESS);
    }

    public JButton getBackButton() {
        return new MaterialSecondaryButton(MaterialIcons.ARROW_BACK);
    }

    public JButton getEditButton() {
        return new MaterialSecondaryButton(MaterialIcons.UPDATE);
    }

    public JButton getAcceptButton() {
        return new MaterialButton();
    }

    public JButton getCancelButton() {
        return new MaterialSecondaryButton(MaterialIcons.REMOVE.deriveIcon(30f));
    }

    public JButton getIconButton(ImageIcon imageIcon) {
        return new MaterialIconButton(imageIcon);
    }

    public JButton getMenuButton() {
        return new MaterialSecondaryButton(MaterialIcons.MENU.deriveIcon(30f));
    }

    public JButton getAddButton() {
        return new MaterialSecondaryButton(MaterialIcons.ADD.deriveIcon(30f));
    }

    public MaterialProgressSpinner getRoundLoading() {
        return _MaterialProgressSpinner.from();
    }

    public JComboBox getComboBox(String label) {
        MaterialComboBox comboBox = MaterialComboBoxFactory.build();
        comboBox.setLabel(label);
        comboBox.setHint("Seleccione...");
        return comboBox;
    }

    public MaterialYearPicker getYearComboBox() {
        MaterialYearPicker year = MaterialDatePickersFactory.buildYearPicker();
        year.setObject(Year.of(LocalDate.now().getYear()));
        return year;
    }

    public MaterialMonthPicker getMonthComboBox() {
        MaterialMonthPicker month = MaterialDatePickersFactory.buildMonthPicker();
        month.setObject(_Month.from(LocalDate.now().getMonthValue()));
        return month;
    }

    public JLabel getLabel() {
        return new JLabel();
    }

    public JComponent getLoadingPanel(String loadingMessage) {
        return new LoadingPanel(loadingMessage);
    }

    public JLabel getH3Label() {
        return new JLabel();
    }

    public JList getList() {
        return new JXList();

    }

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

    public Card getSmallCard(
            String imageURL,
            String title,
            String secondaryText,
            ValueModel valueModel,
            Action... menuActions) {
        return new Card(imageURL, title, secondaryText, menuActions);
    }

    public Card getSmallCardValueModel(
            String imageURL,
            String title,
            String secondaryText,
            ValueModel valueModel,
            Action... menuActions) {
        return new Card(imageURL, title, secondaryText, valueModel, menuActions);
    }

    public Card getSmallCardImageValueModel(
            String imageURL,
            String title,
            String secondaryText,
            ValueModel valueModel,
            ValueModel valueModelIcon,
            Action... menuActions) {
        return new Card(imageURL, title, secondaryText, valueModel, valueModelIcon, menuActions);
    }

    public JTextField getTextField(String hintName, String header) {
        return new MaterialTextField(hintName, header);
    }

    public JFormattedTextField getFormattedTextField(String hintName, String title) {
        return new JFormattedTextField();
    }

    public JPasswordField getPasswordField(String hint, String title) {
        return new MaterialPasswordField(hint, title);
    }

    public JTextField getTextFielPrecioVenta(String hint, String title, String coin) {
        return new MaterialTextField(hint, title + " (" + coin + " )");
//            TODO: Corregir error del money formatter

//            MaterialFormatedTextField textField = MaterialTextFactory.buildFormatedRuntime(new MoneyFormateer());
//            textField.setHint(hint);
//            textField.setLabel(title);
//            textField.setExtra(coin);
//            return textField;
    }

    public JCheckBox getCheckBox() {
        return new JCheckBox();
    }

    public JXDatePicker getDatePicker() {
        MaterialDatePicker picker = MaterialDatePickersFactory.build();
        picker.getMonthView().setMonthStringBackground(DefaultValues.PRIMARY_COLOR_LIGHT);
        return picker;
    }

    public JXDatePicker getUnlabeledDatePicker() {
        MaterialDatePicker picker = MaterialDatePickersFactory.build();
        picker.setLabel("");
        picker.setHint("");
        picker.getMonthView().setMonthStringBackground(DefaultValues.PRIMARY_COLOR_LIGHT);
        return picker;
    }

    public <T> JComboBox<T> getComboBoxEditable() {
        return MaterialComboBoxFactory.buildFiltrable();
    }

    public JSpinner getSpinnerNumber() {
        return new _MaterialSpinnerInteger();
    }

    public JPanel getTransparentPanel() {
        JPanel transperentPanel = new JPanel();
        transperentPanel.setOpaque(false);
        transperentPanel.setToolTipText(null);
        return transperentPanel;
    }

    public JPanel getPrimaryPanel() {
        JPanel secondaryPanel = new MaterialPanel(DefaultValues.SECONDARY_COLOR_LIGHT);
        secondaryPanel.setToolTipText(null);
        return secondaryPanel;
    }

    public JPanel getSecondaryPanel() {
        JPanel secondaryPanel = new MaterialPanel(DefaultValues.PRIMARY_COLOR_LIGHT);
        secondaryPanel.setToolTipText(null);
        return new MaterialPanel(DefaultValues.PRIMARY_COLOR_LIGHT);
    }

    public JFrame getMaterialWindow() {
        return new MaterialWindow();
    }

    public JFrame getMaterialFrame() {
        return new MaterialFrame();
    }

    public JFrame getMaterialDialog() {
        return new MaterialFrame();
    }

    public JPanel getHeaderPanel() {
        return new MaterialPanel(DefaultValues.SECONDARY_COLOR_LIGHT);
    }

    public JScrollPane getScrollPane() {
        MaterialScrollPane scrollPane = _MaterialScrollPaneCore.from();
        scrollPane.setBorderTitle("");//Sin no se settea este atributo se puede lanzar null pointer exception
        return scrollPane;
    }

    public JTabbedPane getTabPane() {
        JTabbedPane tabPane = new JTabbedPane();
        tabPane.setBackground(MaterialColors.TRANSPARENT);
        return tabPane;
    }

    public MaterialListUI getListUI() {
        MaterialListUI listUI = new MaterialListUI();
        return listUI;
    }

    public TabbedPaneUI getTabbedPaneUI() {
        return new MaterialTabbedPaneUI();
    }

    public LookAndFeel getLooks() {
        return new MaterialLookAndFeel();
    }

}
