/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.ui.presenters;

import com.jgoodies.binding.PresentationModel;
import com.jobits.pos.ui.viewmodel.AbstractViewModel;
import com.root101.clean.core.app.services.NotificationHandler;
import com.root101.clean.core.app.services.utils.TipoNotificacion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

/**
 *
 * JoBits
 *
 * @author Jorge
 * @param <T>
 *
 */
public abstract class AbstractViewPresenter<T extends AbstractViewModel> extends PresentationModel<T> {

    private HashMap<String, AbstractViewAction> operationsAllowed;
    public static final String ACTION_REFRESH_STATE = "Refresh state";

    public AbstractViewPresenter() {
        super();
        operationsAllowed = new HashMap<>();
        operationsAllowed.put(ACTION_REFRESH_STATE, new AbstractViewAction(ACTION_REFRESH_STATE) {
            @Override
            public Optional doAction() {
                return refreshState();
            }
        });

        registerOperations();

    }

    public AbstractViewPresenter(T bean) {
        super(bean);
        operationsAllowed = new HashMap<>();
        operationsAllowed.put(ACTION_REFRESH_STATE, new AbstractViewAction(ACTION_REFRESH_STATE) {
            @Override
            public Optional doAction() {
                return refreshState();
            }
        });
        registerOperations();

    }

    protected abstract void registerOperations();

    protected void registerOperation(AbstractViewAction action) {
        operationsAllowed.put(action.getActionName(), action);
    }

    protected Optional refreshState() {
        return Optional.empty();
    }

    public AbstractViewAction getOperation(String ACTION_) {
        AbstractViewAction action = operationsAllowed.get(ACTION_);
        if (action == null) {
            throw new IllegalArgumentException(ACTION_ + " no posee ninguna accion registrada en " + this.getClass().getName());
        } else {
            return action;
        }
    }

    public HashMap<String, AbstractViewAction> getOperationsAllowed() {
        return new HashMap<>(operationsAllowed);
    }

    public void fireNotification(Collection<String> notifications) {
        String ret = "";
        for (String s : notifications) {
            ret += "\n" + s;
        }
        NotificationHandler.notify(ret, TipoNotificacion.INFO);

    }

    public void fireToast(String toast) {//TODO: cambiar implementacion
        ArrayList<String> ret = new ArrayList<>();
        ret.add(toast);
        fireNotification(ret);

    }
}
