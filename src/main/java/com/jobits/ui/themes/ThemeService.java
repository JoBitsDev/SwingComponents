/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.themes;

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
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.TabbedPaneUI;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXList;

/**
 *
 * @author Home
 */
public interface ThemeService {

    public JButton getMaterialButton();

    public JButton getOutlinedButton();

    public JButton getLinedButton();

    public JButton getCloseButton();

    public JButton getMaximizeButton();

    public JButton getMinimizeButton();

    public JButton getBackButton();

    public JButton getEditButton();

    public JButton getAcceptButton();

    public JButton getCancelButton();

    public JButton getIconButton(ImageIcon imageIcon);

    public JButton getMenuButton();

    public JButton getAddButton();

    public MaterialProgressSpinner getRoundLoading();

    public JComboBox getComboBox(String label);

    public MaterialYearPicker getYearComboBox();

    public MaterialMonthPicker getMonthComboBox();

    public JLabel getLabel();

    public JComponent getLoadingPanel(String loadingMessage);

    public JLabel getH3Label();

    public JList getList();

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
            Action... menuActions);

    public Card getSmallCard(
            String imageURL,
            String title,
            String secondaryText,
            ValueModel valueModel,
            Action... menuActions);

    public Card getSmallCardValueModel(
            String imageURL,
            String title,
            String secondaryText,
            ValueModel valueModel,
            Action... menuActions);

    public Card getSmallCardImageValueModel(
            String imageURL,
            String title,
            String secondaryText,
            ValueModel valueModel,
            ValueModel valueModelIcon,
            Action... menuActions);

    public JTextField getTextField(String hintName, String header);

    public JFormattedTextField getFormattedTextField(String hintName, String title);

    public JPasswordField getPasswordField(String hint, String title);

    public JTextField getTextFielPrecioVenta(String hint, String title, String coin);

    public JCheckBox getCheckBox();

    public JXDatePicker getDatePicker();

    public JXDatePicker getUnlabeledDatePicker();

    public <T> JComboBox<T> getComboBoxEditable();

    public JSpinner getSpinnerNumber();

    public JPanel getTransparentPanel();

    public JPanel getPrimaryPanel();

    public JPanel getSecondaryPanel();

    public JFrame getMaterialWindow();

    public JFrame getMaterialFrame();

    public JFrame getMaterialDialog();

    public JPanel getHeaderPanel();

    public JScrollPane getScrollPane();

    public JTabbedPane getTabPane();

    public MaterialListUI getListUI();

    public TabbedPaneUI getTabbedPaneUI();

    public LookAndFeel getLooks();

}
