package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame{
    public Chat() throws  HeadlessException{
        setTitle("Chat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,800,800);
        setVisible(true);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(100,100, 200,200);
        add(textArea, BorderLayout.CENTER);
        JTextArea textArea1 = new JTextArea();
        textArea.setBounds(100,100, 50,50);
        add(textArea, BorderLayout.SOUTH);
        JButton button1 = new JButton("Отправить");
        add(button1, BorderLayout.SOUTH);
        button1.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                       textArea.setText(textArea.getText("Cooбщение"));
                                     }
                                 }

        );
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText(textArea.getText("Сообщение"));
            }
        }

    }
    public static void mail(String[] args) {
        new Chat();
    }
}
