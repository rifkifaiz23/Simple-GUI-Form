package org.rifkifaiz.pemdal.gui;

import javax.swing.*;

public class RunFormUser {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame ("Form User");
        jFrame.setContentPane(new FormUser().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
