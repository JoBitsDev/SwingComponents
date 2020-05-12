/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.ui.components.swing.notifications;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
import com.jobits.ui.utils.MaterialColor;
import java.awt.*;
import javax.swing.*;

class ToastDialog extends JDialog {

    //String of toast 
    String toastText;

    // JWindow 
    JDialog parentComponent;

    public ToastDialog(String toastText, JFrame parent, int x, int y) {
        parentComponent = new JDialog(parent, false);

        // make the background transparent 
        parentComponent.setBackground(MaterialColor.TRANSPARENT);

        // create a panel 
        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                int wid = g.getFontMetrics().stringWidth(toastText);
                int hei = g.getFontMetrics().getHeight();

                // draw the boundary of the toast and fill it 
                g.setColor(MaterialColor.CYAN_700);
                g.fillRoundRect(10, 10, wid + 30, hei + 10,10,10);
                g.setColor(MaterialColor.CYAN_700);
                g.drawRoundRect(10, 10, wid + 30, hei + 10,10,10);

                // set the color of text 
                g.setColor(MaterialColor.GREY_900);
                g.drawString(toastText, 25, 27);
                int t = 250;

                // draw the shadow of the toast 
                for (int i = 0; i < 4; i++) {
                    t -= 60;
                    g.setColor(new Color(0, 0, 0, t));
                    g.drawRect(10 - i, 10 - i, wid + 30 + i * 2,
                            hei + 10 + i * 2);
                }
            }
        };

        parentComponent.add(p);
        parentComponent.setLocation(x, y);
        parentComponent.setSize(300, 100);
    }

    // function to pop up the toast 
    public void showtoast() {
        try {
            parentComponent.setOpacity(1);
            parentComponent.setVisible(true);

            // wait for some time 
            Thread.sleep(2000);

            // make the message disappear  slowly 
            for (double d = 1.0; d > 0.2; d -= 0.1) {
                Thread.sleep(100);
                parentComponent.setOpacity((float) d);
            }

            // set the visibility to false 
            parentComponent.setVisible(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showToast(String message, JFrame parent) {
        new ToastDialog(message, parent, 150, 400).showtoast();
    }
}
