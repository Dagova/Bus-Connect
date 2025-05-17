package example.Interfaz;


import example.GPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.PrintStream;

public class Interfaz {
    private GPS gps;
    private JFrame frame;
    private JPanel panel;
    private JTextArea textArea;
    private final PrintStream consolaOriginal = System.out;

    public Interfaz() {
        gps = new GPS();

        // Crear la ventana principal
        frame = new JFrame("Consulta de Buses");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null); // centra la ventana
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // elimina boton de cerrar
        // Crear el panel
        panel = new JPanel();
        panel.setLayout(new BorderLayout());


        // Crear un área de texto para mostrar los resultados
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Crear los botones con GridLayout para asegurarnos que caben los cuatro
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4)); // 1 fila, 4 columnas

        JButton btnBus1 = new JButton("Consultar Bus 1");
        JButton btnBus2 = new JButton("Consultar Bus 2");
        JButton btnBus3 = new JButton("Consultar Bus 3");
        JButton btnBus4 = new JButton("Salir");

        buttonPanel.add(btnBus1);
        buttonPanel.add(btnBus2);
        buttonPanel.add(btnBus3);
        buttonPanel.add(btnBus4);

        panel.add(buttonPanel, BorderLayout.NORTH);

        // Agregar el panel a la ventana
        frame.add(panel);
        frame.setVisible(true);


        // Definir los listeners para los botones
        btnBus1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Redirigir la salida estándar (System.out) al JTextArea
                Reescritura();

                textArea.append("Consulta Bus 1.\n");
                gps.actualizacionBus1();
                textArea.append("");

                // Redirigir la salida al formato estandar
                RestaurarSalidaConsola();
            }
        });

        btnBus2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Redirigir la salida estándar (System.out) al JTextArea
                Reescritura();

                textArea.append("Consulta Bus 2.\n");
                gps.actualizacionBus2();
                textArea.append("");


                // Redirigir la salida al formato estandar
                RestaurarSalidaConsola();
            }
        });

        btnBus3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Redirigir la salida estándar (System.out) al JTextArea
                Reescritura();

                textArea.append("Consulta Bus 3 .\n");
                gps.actualizacionBus3();
                textArea.append("");

                // Redirigir la salida al formato estandar
                RestaurarSalidaConsola();
            }
        });

        btnBus4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gps.guardarDatos();
                System.exit(0);
            }
        });

        Timer timer = new Timer(2000, new ActionListener() {
            //Cada 2 segundos se actualiza posicion
            @Override
            public void actionPerformed(ActionEvent e) {
                gps.actualizacionBus1();
                gps.actualizacionBus2();
                gps.actualizacionBus3();
            }
        });
        timer.start();
    }

    private void Reescritura() {
        // Crear un PrintStream que escriba en el JTextArea
        OutputStream os = new OutputStream() {
            @Override
            public void write(int b) {
                textArea.append(String.valueOf((char) b));
            }
        };
        PrintStream ps = new PrintStream(os);
        System.setOut(ps); // Redirige System.out a este PrintStream
    }

    private void RestaurarSalidaConsola() {
        // Redirigir la salida al formato estandar
        System.setOut(consolaOriginal);
    }
}
