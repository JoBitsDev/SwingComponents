/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.ui.presenters;

import com.jobits.pos.ui.viewmodel.AbstractListViewModel;
import java.util.Optional;

/**
 *
 * JoBits
 *
 * @author Jorge
 * @param <T>
 *
 */
public abstract class AbstractListViewPresenter<T extends AbstractListViewModel>
        extends AbstractViewPresenter<T> {

    public static final String ACTION_AGREGAR = "Agregar";
    public static final String ACTION_EDITAR = "Editar";
    public static final String ACTION_ELIMINAR = "Eliminar";

    public AbstractListViewPresenter(T bean, String viewName) {
        super(bean);
        getBean().setTitulo_vista(viewName);
    }

    protected abstract void onAgregarClick();

    protected abstract void onEditarClick();

    protected abstract void onEliminarClick();

    @Override
    protected void registerOperations() {
        registerOperation(new AbstractViewAction(ACTION_AGREGAR) {
            @Override
            public Optional doAction() {
                onAgregarClick();
                return Optional.empty();
            }
        });
        registerOperation(new AbstractViewAction(ACTION_EDITAR) {
            @Override
            public Optional doAction() {
                onEditarClick();
                return Optional.empty();
            }
        });
        registerOperation(new AbstractViewAction(ACTION_ELIMINAR) {
            @Override
            public Optional doAction() {
                onEliminarClick();
                return Optional.empty();
            }
        });
    }

    @Override
    protected Optional refreshState() {
        setListToBean();
        return super.refreshState();
    }

    protected abstract void setListToBean();
//TODO: pifia no se usa en esta clase el metodo por tanto puede ser opcional implementarlo en los hijos no obligado

}
