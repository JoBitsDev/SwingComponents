/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.ui.swing.utils;

import com.jgoodies.binding.adapter.Bindings;
import com.jgoodies.binding.list.SelectionInList;
import com.jgoodies.common.collect.ArrayListModel;
import com.jidesoft.hints.AbstractListIntelliHints;
import java.util.List;
import javax.swing.JList;
import javax.swing.text.JTextComponent;

/**
 * JoBits
 *
 * @author Jorge
 * @param <K> tipo de dato de la lista de elementos
 *
 */
public class BindableListIntelliHint<K> extends AbstractListIntelliHints {

    private final SelectionInList<K> listDataHolder;
    private final List<K> originalList;

    public BindableListIntelliHint(SelectionInList<K> listDataHolder, JTextComponent textComponent) {
        super(textComponent);
        this.listDataHolder = listDataHolder;
        this.originalList = listDataHolder.getList();
    }

    @Override
    public boolean updateHints(Object context) {
        ArrayListModel<K> ret = new ArrayListModel<>();
        for (K x : originalList) {
            if (x.toString().toLowerCase().contains(context.toString().toLowerCase())) {
                ret.add(x);
            }
        }
        listDataHolder.setList(ret);
        return true;
    }

    public List<K> getCompletitionList() {
        return listDataHolder.getList();
    }

    @Override
    protected JList createList() {
        JList ret = super.createList();
        Bindings.bind(ret, listDataHolder);
        return ret;
    }
}
