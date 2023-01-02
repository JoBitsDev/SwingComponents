/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.ui.viewmodel;

import com.jgoodies.common.collect.ArrayListModel;
import java.util.List;

/**
 *
 * JoBits
 *
 * @author Jorge
 * @param <T> tipo de la lista que se va a mostrar en pantalla
 *
 */
public class AbstractListViewModel<T> extends AbstractViewModel {

    protected ArrayListModel<T> lista_elementos = new ArrayListModel<>();

    public static final String PROP_LISTA_ELEMENTOS = "lista_elementos";

    protected T elemento_seleccionado;

    public static final String PROP_ELEMENTO_SELECCIONADO = "elemento_seleccionado";

    protected boolean agregar_button_enabled = true;

    public static final String PROP_AGREGAR_BUTTON_ENABLED = "agregar_button_enabled";

    protected boolean editar_button_enabled = true;

    public static final String PROP_EDITAR_BUTTON_ENABLED = "editar_button_enabled";

    protected boolean eliminar_button_enabled = true;

    public static final String PROP_ELIMINAR_BUTTON_ENABLED = "eliminar_button_enabled";

    protected String filter_by = "";

    public static final String PROP_FILTER_BY = "filter_by";

    protected String catidad_elementos;

    public static final String PROP_CATIDAD_ELEMENTOS = "catidad_elementos";

    protected String titulo_vista;

    public static final String PROP_TITULO_VISTA = "titulo_vista";

    /**
     * Get the value of titulo_vista
     *
     * @return the value of titulo_vista
     */
    public String getTitulo_vista() {
        return titulo_vista;
    }

    /**
     * Set the value of titulo_vista
     *
     * @param titulo_vista new value of titulo_vista
     */
    public void setTitulo_vista(String titulo_vista) {
        String oldTitulo_vista = this.titulo_vista;
        this.titulo_vista = titulo_vista;
        firePropertyChange(PROP_TITULO_VISTA, oldTitulo_vista, titulo_vista,false);
    }

    /**
     * Get the value of catidad_elementos
     *
     * @return the value of catidad_elementos
     */
    public String getCatidad_elementos() {
        return catidad_elementos;
    }

    /**
     * Set the value of catidad_elementos
     *
     * @param catidad_elementos new value of catidad_elementos
     */
    public void setCatidad_elementos(String catidad_elementos) {
        String oldCatidad_elementos = this.catidad_elementos;
        this.catidad_elementos = catidad_elementos;
        firePropertyChange(PROP_CATIDAD_ELEMENTOS, oldCatidad_elementos, catidad_elementos, false);
    }

    /**
     * Get the value of filter_by
     *
     * @return the value of filter_by
     */
    public String getFilter_by() {
        return filter_by;
    }

    /**
     * Set the value of filter_by
     *
     * @param filter_by new value of filter_by
     */
    public void setFilter_by(String filter_by) {
        String oldFilter_by = this.filter_by;
        this.filter_by = filter_by;
        firePropertyChange(PROP_FILTER_BY, oldFilter_by, filter_by, false);
    }

    /**
     * Get the value of eliminar_button_enabled
     *
     * @return the value of eliminar_button_enabled
     */
    public boolean isEliminar_button_enabled() {
        return eliminar_button_enabled;
    }

    /**
     * Set the value of eliminar_button_enabled
     *
     * @param eliminar_button_enabled new value of eliminar_button_enabled
     */
    public void setEliminar_button_enabled(boolean eliminar_button_enabled) {
        boolean oldEliminar_button_enabled = this.eliminar_button_enabled;
        this.eliminar_button_enabled = eliminar_button_enabled;
        firePropertyChange(PROP_ELIMINAR_BUTTON_ENABLED, oldEliminar_button_enabled, eliminar_button_enabled, false);
    }

    /**
     * Get the value of editar_button_enabled
     *
     * @return the value of editar_button_enabled
     */
    public boolean isEditar_button_enabled() {
        return editar_button_enabled;
    }

    /**
     * Set the value of editar_button_enabled
     *
     * @param editar_button_enabled new value of editar_button_enabled
     */
    public void setEditar_button_enabled(boolean editar_button_enabled) {
        boolean oldEditar_button_enabled = this.editar_button_enabled;
        this.editar_button_enabled = editar_button_enabled;
        firePropertyChange(PROP_EDITAR_BUTTON_ENABLED, oldEditar_button_enabled, editar_button_enabled, true);
    }

    /**
     * Get the value of agregar_button_enabled
     *
     * @return the value of agregar_button_enabled
     */
    public boolean isAgregar_button_enabled() {
        return agregar_button_enabled;
    }

    /**
     * Set the value of agregar_button_enabled
     *
     * @param agregar_button_enabled new value of agregar_button_enabled
     */
    public void setAgregar_button_enabled(boolean agregar_button_enabled) {
        boolean oldAgregar_button_enabled = this.agregar_button_enabled;
        this.agregar_button_enabled = agregar_button_enabled;
        firePropertyChange(PROP_AGREGAR_BUTTON_ENABLED, oldAgregar_button_enabled, agregar_button_enabled, true);
    }

    /**
     * Get the value of elemento_seleccionado
     *
     * @return the value of elemento_seleccionado
     */
    public T getElemento_seleccionado() {
        return elemento_seleccionado;
    }

    /**
     * Set the value of elemento_seleccionado
     *
     * @param elemento_seleccionado new value of elemento_seleccionado
     */
    public void setElemento_seleccionado(T elemento_seleccionado) {
        T oldElemento_seleccionado = this.elemento_seleccionado;
        this.elemento_seleccionado = elemento_seleccionado;
        firePropertyChange(PROP_ELEMENTO_SELECCIONADO, oldElemento_seleccionado, elemento_seleccionado, false);
    }

    /**
     * Get the value of lista_elementos
     *
     * @return the value of lista_elementos
     */
    public ArrayListModel<T> getLista_elementos() {
        return lista_elementos;
    }

    /**
     * Set the value of lista_elementos
     *
     * @param lista_elementos new value of lista_elementos
     */
    public void setLista_elementos(java.util.List<T> lista_elementos) {
        ArrayListModel<T> oldLista_elementos = this.lista_elementos;
        this.lista_elementos.clear();
        this.lista_elementos.addAll(lista_elementos);
        setCatidad_elementos(lista_elementos.size() + " Elemento(s)");
        firePropertyChange(PROP_LISTA_ELEMENTOS, oldLista_elementos, lista_elementos, false);
    }

    public AbstractListViewModel() {
    }

}
