package com.jobits.pos.ui;

import com.jgoodies.binding.adapter.Bindings;
import java.util.List;
import com.jobits.pos.ui.presenters.AbstractListViewPresenter;
import com.jobits.pos.ui.utils.BindableTableModel;
import com.jobits.pos.ui.viewmodel.AbstractListViewModel;
import com.jobits.ui.components.MaterialComponentsFactory;
import util.materials.MaterialIcons;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Jorge
 * @param <T>
 */
public abstract class AbstractListViewPanel<T> extends AbstractViewPanel {

    protected BindableTableModel<T> model;

    public AbstractListViewPanel(AbstractListViewPresenter presenter) {
        super(presenter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuClickDerecho = new javax.swing.JPopupMenu();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanelControlesSuperiores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanelTabla = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldBusqueda = MaterialComponentsFactory.Input.getTextField("Buscar...", "");
        jLabel2 = new javax.swing.JLabel();
        jPanelExtra = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableList = new javax.swing.JTable();
        jLabelCantidad = new javax.swing.JLabel();
        jXPanelControles = new org.jdesktop.swingx.JXPanel();
        jButtonAdd = MaterialComponentsFactory.Buttons.getMaterialButton();

        jPopupMenuClickDerecho.setInvoker(jTableList);

        jButtonEdit.setMnemonic('e');
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/jobits/pos/ui/Bundle"); // NOI18N
        jButtonEdit.setText(bundle.getString("label_editar")); // NOI18N
        jButtonEdit.setPreferredSize(new java.awt.Dimension(80, 40));
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setMnemonic('d');
        jButtonDelete.setText(bundle.getString("label_eliminar")); // NOI18N
        jButtonDelete.setPreferredSize(new java.awt.Dimension(95, 40));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        setMinimumSize(getMinimumSize());
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanelControlesSuperiores.setOpaque(false);
        jPanelControlesSuperiores.setLayout(new javax.swing.BoxLayout(jPanelControlesSuperiores, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Nombre Tabla");
        jPanelControlesSuperiores.add(jLabel1);
        jPanelControlesSuperiores.add(filler1);

        add(jPanelControlesSuperiores, java.awt.BorderLayout.NORTH);

        jPanelTabla.setOpaque(false);
        jPanelTabla.setLayout(new java.awt.BorderLayout());

        jPanelHeader.setBackground(new java.awt.Color(204, 204, 204));
        jPanelHeader.setOpaque(false);
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
        jLabel2.setSize(new java.awt.Dimension(45, 40));
        jPanel1.add(jLabel2, java.awt.BorderLayout.LINE_END);

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
        jTableList.setShowGrid(false);
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

        add(jPanelTabla, java.awt.BorderLayout.CENTER);

        jXPanelControles.setBackground(new java.awt.Color(204, 204, 204));
        jXPanelControles.setOpaque(false);
        jXPanelControles.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButtonAdd.setMnemonic('a');
        jButtonAdd.setText(bundle.getString("label_agregar")); // NOI18N
        jButtonAdd.setMaximumSize(new java.awt.Dimension(125, 50));
        jButtonAdd.setMinimumSize(new java.awt.Dimension(125, 50));
        jButtonAdd.setPreferredSize(new java.awt.Dimension(125, 50));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jXPanelControles.add(jButtonAdd);

        add(jXPanelControles, java.awt.BorderLayout.PAGE_END);
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
    protected javax.swing.Box.Filler filler1;
    protected javax.swing.JButton jButtonAdd;
    protected javax.swing.JButton jButtonDelete;
    protected javax.swing.JButton jButtonEdit;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabelCantidad;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanelControlesSuperiores;
    protected javax.swing.JPanel jPanelExtra;
    protected javax.swing.JPanel jPanelHeader;
    protected javax.swing.JPanel jPanelTabla;
    protected javax.swing.JPopupMenu jPopupMenuClickDerecho;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTableList;
    protected javax.swing.JTextField jTextFieldBusqueda;
    protected org.jdesktop.swingx.JXPanel jXPanelControles;
    // End of variables declaration//GEN-END:variables

    /*
    public void updateView() {
        model = generateTableModel(getController().getItems());
        jLabelCantidad.setText(getController().getItems().size() + " Elementos");
        model.addTableModelListener((TableModelEvent e) -> {
            jLabelCantidad.setText(getController().getItems().size() + " Elementos");
        });
        jTableList.setModel(model);
        jTableList.setRowSorter(model.getSorter());
        if (!jTextFieldBusqueda.getText().isEmpty()) {
            model.filterByString(jTextFieldBusqueda.getText());
        }

    }

    private void delete() {
        if (jTableList.getSelectedRows().length > 0) {
            int[] selecteds = jTableList.getSelectedRows();
            int r = JOptionPane.showConfirmDialog(this, "Desea borrar " + selecteds.length + " elementos de la lista."
                    + "\n Esta accion no se puede deshacer");
            if (r == JOptionPane.YES_OPTION) {
                ArrayList<T> sel = new ArrayList<>();
                for (int s : selecteds) {
                    sel.add(model.getObjectAt(s));
                }
                for (T x : sel) {
                    getController().destroy(x, true);
                }
                JOptionPane.showMessageDialog(this, R.RESOURCE_BUNDLE.getString("accion_realizada_correctamente"),
                        R.RESOURCE_BUNDLE.getString("label_informacion"), JOptionPane.INFORMATION_MESSAGE,
                        new javax.swing.ImageIcon(getClass().getResource("/restManager/resources/images/exitoso.png")));
            }
        } else {
            getController().setSelected(model.getObjectAtSelectedRow());
            getController().destroy(getController().getSelected());
        }

    }
*/
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
        Bindings.bind(jTextFieldBusqueda, getPresenter().getModel(AbstractListViewModel.PROP_FILTER_BY));
        Bindings.bind(jLabel1, getPresenter().getModel(AbstractListViewModel.PROP_TITULO_VISTA));
        Bindings.bind(jLabelCantidad, getPresenter().getModel(AbstractListViewModel.PROP_CATIDAD_ELEMENTOS));
        jButtonAdd.setIcon(MaterialIcons.ADD);
    }

    @Override
    public void uiInit() {
        initComponents();
    }

    public abstract BindableTableModel<T> generateTableModel(List<T> items);

}
