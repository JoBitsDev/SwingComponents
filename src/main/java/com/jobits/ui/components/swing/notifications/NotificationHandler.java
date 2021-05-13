/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.notifications;

import com.jobits.pos.ui.DefaultValues;
import com.root101.clean.core.app.services.NotificationService;
import com.root101.clean.core.app.services.utils.TipoNotificacion;
import com.root101.swing.material.standards.MaterialColors;
import com.root101.swing.notification.NotificationBuilder;
import com.root101.swing.notification.NotificationFactory;
import java.awt.Container;
import java.awt.KeyboardFocusManager;
import java.util.Optional;
import javax.swing.JOptionPane;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
public class NotificationHandler implements NotificationService {

    public boolean permanentNotification = false;

    @Override
    public boolean contain(String string) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notify(String text, TipoNotificacion severidad) {
        NotificationBuilder.builder b = NotificationBuilder.builder().text(text);

        switch (severidad) {
            case INFO:
                b.color(DefaultValues.PRIMARY_COLOR_LIGHT);
                break;
            case ERROR:
                b.color(MaterialColors.REDA_700);
                break;
            case SUCCESS:
                b.color(MaterialColors.GREENA_700);
                break;
            case WARNING:
                b.color(MaterialColors.YELLOWA_700);
                break;
            default:
                throw new IllegalArgumentException("Bad call with " + severidad + " to notify");

        }
        NotificationFactory.buildNotificationTOAST(b);

    }

    @Override
    public boolean showConfirmDialog(String string, Object t) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional showDialog(String text, TipoNotificacion tipoNotificacion) {
        switch (tipoNotificacion) {
            case SUCCESS:
                showSuccessDialog(text);
                return Optional.empty();
            case ERROR:
                showErrorDialog(text);
                return Optional.empty();
            case INFO:
                showMessage(text);
                return Optional.empty();
            case WARNING:
                return Optional.of(showConfirmDialog2(text));
            case DIALOG_CONFIRM:
                return Optional.of(showConfirmDialog2(text));
            case DIALOG_INPUT:
                return Optional.ofNullable(showInputDialog2(text));
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Object showInputDialog(String string, Object t) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showNotification(String string, Object t) {
        throw new UnsupportedOperationException(); //To change body of generated methods, choose Tools | Templates.
    }

    //
    //Protected Methods
    //
    protected boolean showConfirmDialog2(String text) {
        return JOptionPane.showConfirmDialog(KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow(),
                text, "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/restManager/resources/images/pregunta.png")))
                == JOptionPane.YES_OPTION;
    }

    protected String showInputDialog2(String text) {
        String ret = JOptionPane.showInputDialog(KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow(),
                text, "Entrada", JOptionPane.QUESTION_MESSAGE);
        return ret;
    }

    protected String showInputDialog(Container view, String text, Object defaultValue) {
        String ret = JOptionPane.showInputDialog(view, text, defaultValue);
        return ret;
    }

    protected Object showInputDialog(Container view, String msg, String title, Object[] selections, Object initialValue) {
        Object ret = JOptionPane.showInputDialog(view, msg, title,
                JOptionPane.QUESTION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/restManager/resources/images/pregunta.png")),
                selections, initialValue);
        return ret;
    }

    private void showSuccessDialog(String text) {
        JOptionPane.showMessageDialog(KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow(), "Acción realizada exitosamente",
                "Información", JOptionPane.INFORMATION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/restManager/resources/images/exitoso.png")));

    }

    private void showErrorDialog(String text) {
        JOptionPane.showMessageDialog(KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow(), text,
                "Error", JOptionPane.ERROR_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/restManager/resources/images/alerta.png")));

    }

    private void showMessage(String text) {
        JOptionPane.showMessageDialog(KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow(),
                text,
                "Información", JOptionPane.INFORMATION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/restManager/resources/images/exitoso.png")));
    }
}
