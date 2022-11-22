package org.rifkifaiz.pemdal.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormUser {
    private JPanel rootPanel;
    private JTextField textUsername;
    private JTextField textId;
    private JButton saveButton;
    private JLabel labelOutput;

    public FormUser() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textUsername.getText();
                String id = textId.getText();
                User user = new User();
                user.setUsername(username);
                user.setId(id);
                labelOutput.setText(user.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
