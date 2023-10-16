package pe.utp.edu.controllers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Animales extends JFrame {
    private JButton ingresarButton;
    private JTextField textUsuario;
    private JPasswordField passwordField1;
    private JButton salirButton;
    private JLabel labelUsuario;
    private JLabel labelContrasena;
    private JPanel panel1;

    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;


    public Animales() {
        super("Ejemplo de java swing");

        setContentPane(panel1);
        menuBar =new JMenuBar();
        archivo =new JMenu("Archivo");
        salir=new JMenuItem("Salir");

        menuBar.add(archivo);
        archivo.add(salir);

        setJMenuBar(menuBar);


        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Bienvenido a la enciclopedia de animales");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }


        });



        panel1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);


            }
        });
    }






}
