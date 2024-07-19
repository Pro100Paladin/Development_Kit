package org.example.lesson1.homeWork1;


import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;


    private final JTextField loginField = new JTextField();


    Server() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setTitle("Чат сервера");
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel jlb1 = new JLabel("Введите логин: ");
        panel.add(jlb1);
        panel.add(loginField);
        JLabel jlb2 = new JLabel("Введите пароль: ");
        JTextField jtf2 = new JTextField();
        panel.add(jlb2);
        panel.add(jtf2);
        JLabel jlb3 = new JLabel("введите IP-адрес сервера: ");
        JTextField jtf3 = new JTextField();
        panel.add(jlb3);
        panel.add(jtf3);
        JLabel jlb4 = new JLabel("Введите номер порта: ");
        JTextField jtf4 = new JTextField();
        panel.add(jlb4);
        panel.add(jtf4);

        JButton btnLogin = new JButton("Подключиться");

        panel.add(btnLogin, BorderLayout.AFTER_LINE_ENDS);


        add(panel);
        btnLogin.addActionListener(e -> {
            String login = loginField.getText().trim();
            new Client(login);
        });

        setVisible(true);
    }
}
