/**
 * ************************************************************************
 * * The contents of this file are subject to the MRPL 1.2
 * * (the  "License"),  being   the  Mozilla   Public  License
 * * Version 1.1  with a permitted attribution clause; you may not  use this
 * * file except in compliance with the License. You  may  obtain  a copy of
 * * the License at http://www.floreantpos.org/license.html
 * * Software distributed under the License  is  distributed  on  an "AS IS"
 * * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * * License for the specific  language  governing  rights  and  limitations
 * * under the License.
 * * The Original Code is FLOREANT POS.
 * * The Initial Developer of the Original Code is OROCUBE LLC
 * * All portions are Copyright (C) 2015 OROCUBE LLC
 * * All Rights Reserved.
 * ************************************************************************
 */
package com.jobits.ui.swing;

import com.jobits.pos.ui.presenters.AbstractViewPresenter;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeEvent;

import javax.swing.JPanel;

public abstract class ViewPanel extends JPanel implements View, NavigatorHandler {

    protected AbstractViewPresenter presenter;
    protected NavigatorHandler nextNavigatorHandler;

    public ViewPanel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                onComponentShown(e);
            }
        });
        addPropertyChangeListener("enabled", (PropertyChangeEvent evt) -> {
            if ((boolean) evt.getNewValue()) {
                onComponentShown(null);
            }
        });
    }

    public ViewPanel() {
        this(true);
    }

    public ViewPanel(boolean isDoubleBuffered) {
        this(new FlowLayout(), true);
    }

    public ViewPanel(LayoutManager layout) {
        this(layout, true);
    }

    private void onComponentShown(ComponentEvent e) {
        presenter.getOperation(AbstractViewPresenter.ACTION_REFRESH_STATE).doAction();
    }

    @Override
    public Component getViewComponent() {
        return this;
    }

    @Override
    public void setPresenter(AbstractViewPresenter presenter) {
        this.presenter = null;
        this.presenter = presenter;
        wireUp();
    }

    @Override
    public void setNextNavigatorHandler(NavigatorHandler nextNavigator) {
        nextNavigatorHandler = nextNavigator;
    }

    @Override
    public void navigateTo(String viewUniqueName, AbstractViewPresenter presenter) {
        if (viewUniqueName.equals(getViewName())) {
            this.presenter.getOperation(AbstractViewPresenter.ACTION_REFRESH_STATE).doAction();
        } else if (nextNavigatorHandler != null) {
            nextNavigatorHandler.navigateTo(viewUniqueName, presenter);
        } else {
            throw new IllegalArgumentException("No navigation defined");
        }
    }

}
