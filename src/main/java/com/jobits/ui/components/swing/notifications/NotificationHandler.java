/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.notifications;

import com.jobits.pos.notification.TipoNotificacion;
import bundles.toast.TOAST;
import bundles.toast.types.notification.DialogNotificationToastGeneral;
import com.jobits.pos.notification.NotificationChannel;
import java.awt.Color;
import util.materials.MaterialColors;
import util.materials.MaterialIcons;

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

        }

    }

}
