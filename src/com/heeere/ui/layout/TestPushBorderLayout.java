/*
 */

package com.heeere.ui.layout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 */
public class TestPushBorderLayout {

    // component generator
    static int i = 0;
    static Component newComponent() {
        JLabel res = new JLabel("Comp " + i++);
        res.setBorder(new CompoundBorder(new LineBorder(Color.BLACK), new EmptyBorder(4, 4, 4, 4)));
        return res;
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("PushBorderLayout !");
        Container c = f.getContentPane();
        c.setLayout(new PushBorderLayout());
        c.add(newComponent(), PushBorderLayout.LINE_START);
        c.add(newComponent(), PushBorderLayout.LINE_START);
        c.add(newComponent(), PushBorderLayout.LINE_END);
        c.add(newComponent(), PushBorderLayout.PAGE_START);
        c.add(newComponent(), PushBorderLayout.LINE_START);
        c.add(newComponent(), PushBorderLayout.PAGE_END);
        c.add(PushBorderLayout.pad(10), PushBorderLayout.PAGE_END);
        c.add(newComponent(), PushBorderLayout.PAGE_END);
        c.add(newComponent(), PushBorderLayout.LINE_END);
        c.add(PushBorderLayout.pad(10), PushBorderLayout.LINE_END);
        c.add(newComponent());
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
