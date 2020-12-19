/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.notifications;

import com.jobits.pos.notification.TipoNotificacion;
import com.jhw.swing.notification.toast.TOAST;
import com.jhw.swing.notification.toast.types.notification.DialogNotificationToastGeneral;
import com.jhw.swing.material.standars.MaterialColors;
import com.jhw.swing.material.standars.MaterialIcons;
import com.jobits.pos.notification.NotificationChannel;
import java.awt.Color;
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
public class NotificationHandler implements NotificationChannel {

    public boolean permanentNotification = false;

    @Override
    public void notify(String text, TipoNotificacion severidad) {
        switch (severidad) {
            case INFO:
                TOAST.makeNotificationInfo(text);
                break;
            case ERROR:
                TOAST.makeNotificationFAIL(text);
                break;
            case SUCCESS:
                TOAST.makeNotificationOK(text);
                break;
            case WARNING:
                new DialogNotificationToastGeneral(3, text, MaterialIcons.WARNING, MaterialColors.AMBERA_400);
                break;
            default:
                throw new IllegalArgumentException("Bad call with " + severidad + " to notify");

        }

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
                return Optional.of(showConfirmDialog(text));
            case DIALOG_CONFIRM:
                return Optional.of(showConfirmDialog(text));
            case DIALOG_INPUT:
                return Optional.ofNullable(showInputDialog(text));
            default:
                throw new IllegalArgumentException();
        }
    }

    //
    //Protected Methods
    //
    protected boolean showConfirmDialog(String text) {
        return JOptionPane.showConfirmDialog(KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow(),
                text, "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/restManager/resources/images/pregunta.png")))
                == JOptionPane.YES_OPTION;
    }

    protected String showInputDialog(String text) {
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
