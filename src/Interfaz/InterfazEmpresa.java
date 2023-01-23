package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazEmpresa {
    private JButton consultarButton;
    private JButton eliminarButton;
    private JButton actualizarButton;
    private JButton insertarButton;
    private JPanel panel1;

    public InterfazEmpresa(){
        JFrame v = new JFrame("Empresa");
        lanzarVentana(v);
        //Al precionar cada boton de consultar, eliminar, actualizar o insertar inicializa una nueva ventana segun sea la necesidad


        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Cierra la ventana actual
                v.dispose();
                new InterfazConsultar();
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.dispose();
                new InterfazEliminar();
            }
        });
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.dispose();
                new InterfazActualizar();
            }
        });
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    //Metodo para lanzar la ventana actual
    private void lanzarVentana(JFrame v) {
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setContentPane(panel1);
        v.pack();
        v.setVisible(true);
        v.setSize(500, 700);
        v.setLocationRelativeTo(null);
    }
}

