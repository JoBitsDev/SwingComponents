package com.jobits.pos.ui;

import com.jgoodies.binding.adapter.Bindings;
import com.jgoodies.binding.list.SelectionInList;
import com.jobits.pos.ui.presenters.AbstractListViewPresenter;
import com.jobits.pos.ui.swing.utils.BindableTableModel;
import com.jobits.ui.components.MaterialComponentsFactory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXPanel;
import static com.jobits.pos.ui.viewmodel.AbstractListViewModel.*;
import com.root101.swing.material.standards.MaterialIcons;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 *
 * @author Jorge
 * @param <T> tipo de dato del modelo
 */
public abstract class AbstractListViewPanel<T> extends AbstractViewPanel {

    protected BindableTableModel<T> model;

    public AbstractListViewPanel(AbstractListViewPresenter presenter) {
        super(presenter);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                jTextFieldBusqueda.requestFocus();
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuClickDerecho = new javax.swing.JPopupMenu();
        jPanel2 = MaterialComponentsFactory.Containers.getSecondaryPanel();
        jPanelControlesSuperiores = MaterialComponentsFactory.Containers.getTransparentPanel();
        jLabel1 = MaterialComponentsFactory.Displayers.getH3Label();
        jPanelTabla = MaterialComponentsFactory.Containers.getPrimaryPanel();
        jPanelHeader = MaterialComponentsFactory.Containers.getTransparentPanel();
        jPanel1 = MaterialComponentsFactory.Containers.getTransparentPanel();
        jTextFieldBusqueda = MaterialComponentsFactory.Input.getTextField("Buscar...", "");
        jLabel2 = new javax.swing.JLabel();
        jPanelControles = MaterialComponentsFactory.Containers.getTransparentPanel();
        jButtonDelete = MaterialComponentsFactory.Buttons.getLinedButton();
        jButtonEdit = MaterialComponentsFactory.Buttons.getLinedButton();
        jButtonAdd = MaterialComponentsFactory.Buttons.getMaterialButton();
        jPanelExtra = MaterialComponentsFactory.Containers.getTransparentPanel();
        jScrollPane1 = MaterialComponentsFactory.Containers.getScrollPane();
        jTableList = new javax.swing.JTable();
        jLabelCantidad = new javax.swing.JLabel();

        jPopupMenuClickDerecho.setInvoker(jTableList);

        setMinimumSize(getMinimumSize());
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 0, 5, 0));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanelControlesSuperiores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        jPanelControlesSuperiores.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nombre Tabla");
        jPanelControlesSuperiores.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanelControlesSuperiores, java.awt.BorderLayout.NORTH);

        jPanelTabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanelTabla.setLayout(new java.awt.BorderLayout());

        jPanelHeader.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jTextFieldBusqueda.setPreferredSize(new java.awt.Dimension(200, 26));
        jTextFieldBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldBusqueda, java.awt.BorderLayout.CENTER);

        jLabel2.setIcon(MaterialIcons.SEARCH);
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel2, java.awt.BorderLayout.LINE_END);

        jPanelControles.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButtonDelete.setMnemonic('d');
        jButtonDelete.setText("Eliminar");
        jButtonDelete.setPreferredSize(new java.awt.Dimension(125, 50));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanelControles.add(jButtonDelete);

        jButtonEdit.setMnemonic('e');
        jButtonEdit.setText("Editar");
        jButtonEdit.setPreferredSize(new java.awt.Dimension(125, 50));
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanelControles.add(jButtonEdit);

        jButtonAdd.setMnemonic('a');
        jButtonAdd.setText("Agregar");
        jButtonAdd.setMaximumSize(new java.awt.Dimension(125, 50));
        jButtonAdd.setMinimumSize(new java.awt.Dimension(125, 50));
        jButtonAdd.setPreferredSize(new java.awt.Dimension(125, 50));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanelControles.add(jButtonAdd);

        jPanel1.add(jPanelControles, java.awt.BorderLayout.SOUTH);

        jPanelHeader.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanelExtra.setOpaque(false);
        jPanelExtra.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        jPanelHeader.add(jPanelExtra, java.awt.BorderLayout.PAGE_END);

        jPanelTabla.add(jPanelHeader, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBorder(null);

        jTableList.setAutoCreateRowSorter(true);
        jTableList.setBackground(getBackground());
        jTableList.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableList.setRowHeight(25);
        jTableList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableList.getTableHeader().setReorderingAllowed(false);
        jTableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableListMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableListMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableList);
        jTableList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanelTabla.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabelCantidad.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 13)); // NOI18N
        jLabelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCantidad.setText("xx Elementos");
        jPanelTabla.add(jLabelCantidad, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanelTabla, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListMouseClicked

    }//GEN-LAST:event_jTableListMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTextFieldBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaKeyTyped

    }//GEN-LAST:event_jTextFieldBusquedaKeyTyped

    private void jTextFieldBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaKeyReleased
        model.filterByString(jTextFieldBusqueda.getText());
    }//GEN-LAST:event_jTextFieldBusquedaKeyReleased

    private void jTableListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListMousePressed
    }//GEN-LAST:event_jTableListMousePressed

    private void jTableListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListMouseReleased
    }//GEN-LAST:event_jTableListMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jButtonAdd;
    protected javax.swing.JButton jButtonDelete;
    protected javax.swing.JButton jButtonEdit;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabelCantidad;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanelControles;
    protected javax.swing.JPanel jPanelControlesSuperiores;
    protected javax.swing.JPanel jPanelExtra;
    protected javax.swing.JPanel jPanelHeader;
    protected javax.swing.JPanel jPanelTabla;
    protected javax.swing.JPopupMenu jPopupMenuClickDerecho;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTableList;
    protected javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables

    @Override
    public void wireUp() {
        jButtonAdd.setAction(getPresenter().getOperation(AbstractListViewPresenter.ACTION_AGREGAR));
        jButtonEdit.setAction(getPresenter().getOperation(AbstractListViewPresenter.ACTION_EDITAR));
        jButtonDelete.setAction(getPresenter().getOperation(AbstractListViewPresenter.ACTION_ELIMINAR));
        jTableList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    jButtonEdit.doClick();
                }
            }

        });

        jTableList.setRowSorter(model.getSorter());
        Bindings.bind(jTableList,
                new SelectionInList(getPresenter().getModel(PROP_LISTA_ELEMENTOS),
                        getPresenter().getModel(PROP_ELEMENTO_SELECCIONADO)));
        Bindings.bind(jTextFieldBusqueda, getPresenter().getModel(PROP_FILTER_BY));
        Bindings.bind(jLabel1, getPresenter().getModel(PROP_TITULO_VISTA));
        Bindings.bind(jLabelCantidad, getPresenter().getModel(PROP_CATIDAD_ELEMENTOS));
        jButtonAdd.setIcon(MaterialIcons.ADD.deriveIcon(jButtonAdd.getForeground()));
        jButtonEdit.setIcon(MaterialIcons.EDIT.deriveIcon(jButtonEdit.getForeground()));
        jButtonDelete.setIcon(MaterialIcons.DELETE_FOREVER.deriveIcon(jButtonDelete.getForeground()));

        model.filterByString("");
    }

    @Override
    public void uiInit() {
        initComponents();
        model = generateTableModel();
        jTableList.setModel(model);
        setBackground(DefaultValues.SECONDARY_COLOR_LIGHT);

    }

    public abstract BindableTableModel<T> generateTableModel();

    //
    // Getters Setters
    //
    public JPanel getjPanelControlesSuperiores() {
        return jPanelControlesSuperiores;
    }

    public JPanel getjPanelExtra() {
        return jPanelExtra;
    }

    public JPanel getjPanelControles() {
        return jPanelControles;
    }

}
