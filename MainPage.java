package com.company;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
public class MainPage extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainPage frame = new MainPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public MainPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPane = new JPanel();
        contentPane.setForeground(Color.WHITE);
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(UIManager.getBorder("Button.border"));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblWelcomeToConvert = new JLabel("Welcome to Converter");
        lblWelcomeToConvert.setForeground(Color.WHITE);
        lblWelcomeToConvert.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToConvert.setFont(new Font("Candara", Font.BOLD, 30));
        lblWelcomeToConvert.setBounds(12, 13, 441, 79);
        contentPane.add(lblWelcomeToConvert);

        JButton btnT = new JButton("Temperature");
        btnT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Temperature temp = new Temperature();
                temp.setVisible(true);
                dispose();
            }
        });
        btnT.setBackground(Color.BLUE);
        btnT.setForeground(Color.WHITE);
        btnT.setIcon(null);
        btnT.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
        btnT.setBounds(100, 100, 250, 50);
        contentPane.add(btnT);

        JButton btnC = new JButton("Currency");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CurrencyConverter currency = new CurrencyConverter();
                currency.setVisible(true);
                dispose();
            }
        });
        btnC.setBackground(Color.BLUE);
        btnC.setForeground(Color.WHITE);
        btnC.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
        btnC.setBounds(100, 200, 250, 50);
        contentPane.add(btnC);

        JButton btnL = new JButton("Length");
        btnL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Length length = new Length();
                length.setVisible(true);
                dispose();
            }
        });
        btnL.setBackground(Color.BLUE);
        btnL.setForeground(Color.WHITE);
        btnL.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
        btnL.setBounds(100, 300, 250, 50);
        contentPane.add(btnL);




        JButton button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button.setBackground(Color.RED);
        button.setBounds(318,507, 135, 33);
        contentPane.add(button);


    }
}

