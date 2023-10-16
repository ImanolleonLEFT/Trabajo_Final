package pe.utp.edu.controllers;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame=new Animales();
                frame.setSize(1200,1000);
                frame.setVisible(true);
            }
        });
    }
}
