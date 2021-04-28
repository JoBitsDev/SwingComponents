/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.ui.swing.utils;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

/**
 * FirstDream
 *
 * @author Jorge
 * @param <T>
 *
 */
public abstract class BindableTableModel<T> extends AbstractTableAdapter<T> {

    protected JTable table;
    private RestManagerTableRowFilter filter;
    private TableRowSorter<BindableTableModel<T>> sorter;
    protected boolean totalRowShowing = false;
    protected int columnTotal = -1;

    public BindableTableModel(JTable table) {
        super();
        this.table = table;
        initFilterAndSorter();
    }

    public BindableTableModel() {
        super();
    }

    private void initFilterAndSorter() {
        sorter = new TableRowSorter<>(this);
        filter = new RestManagerTableRowFilter();
        sorter.setRowFilter(filter);
        table.setRowSorter(sorter);
    }

    public void setTable(JTable table) {
        this.table = table;
        initFilterAndSorter();
    }

    @Override
    public abstract int getColumnCount();

    @Override
    public abstract String getColumnName(int column);

    
    
    /**
     * Shows the rows that contains the string passed by parameter this method
     * is case sensitive
     *
     * @param s the string to search in the table
     */
    public void filterByString(String s) {
        if (filter == null) {
            throw new IllegalStateException("Bad call on filter");
        }
        filter.setSearchParam(s);
        sort();

    }

    /**
     * Sorts and filters the rows in the view based on the sort keys of the
     * columns currently being sorted and the filter, if any, associated with
     * this sorter. An empty sortKeys list indicates that the view should
     * unsorted, the same as the model.
     */
    public void sort() {
        sorter.sort();
    }

    public T getObjectAt(int rowIndex) {
        return getRow(rowIndex);
    }

    public T getObjectAtSelectedRow() {
        if (table.getSelectedRow() == -1) {
            throw new NullPointerException("No hay ningun elemento seleccionado");//TODO:argumento
        }
        return getRow(table.convertRowIndexToModel(table.getSelectedRow()));
    }

    public int getItemsSize(){
        return getListModel().getSize();
    }
    
    public RestManagerTableRowFilter getFilter() {
        return filter;
    }

    public TableRowSorter<BindableTableModel<T>> getSorter() {
        return sorter;
    }

    public class RestManagerTableRowFilter extends RowFilter<AbstractTableModel, Integer> {

        private String searchParam;

        public RestManagerTableRowFilter() {
            searchParam = "";
        }

        public void setSearchParam(String searchParam) {
            this.searchParam = searchParam;
        }

        @Override
        public boolean include(RowFilter.Entry<? extends AbstractTableModel, ? extends Integer> entry) {
            if (searchParam.isEmpty()) {
                return true;
            }
            for (int i = entry.getValueCount() - 1; i >= 0; i--) {
                if (entry.getStringValue(i).toLowerCase().contains(searchParam.toLowerCase())) {
                    return true;

                }
            }
            return false;
        }

    }

}
