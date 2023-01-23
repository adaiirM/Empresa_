package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static DAO.DAOOperaciones.*;

public class InterfazEliminar {
    private JButton btnEliminar;
    private JButton eliminarPorNombreButton;
    private JTextField textField1;
    private JButton btnVolver;
    private JPanel panel;
    private final JFrame v = new JFrame("Eliminar");

    public InterfazEliminar() {

        lanzarVentana(v);
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.dispose();
                new InterfazEmpresa();
            }
        });
        //Para eliminar los adeudos de un cliente se solicitan ya sea el id o el nombre
        //Eliminar por el ID
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //If, para comparar que la eliminacion sea correcto ya que si se retorna un 0 el proceso fue incorrecto
                if (eliminarRenta(Integer.parseInt(textField1.getText())) == 1 && eliminarAlimento(Integer.parseInt(textField1.getText())) == 1){
                    JOptionPane.showMessageDialog(null,"Eliminacion completada");
                }else
                    JOptionPane.showMessageDialog(null,"La eliminacion no fue completada");
            }

        });
        eliminarPorNombreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void lanzarVentana(JFrame v) {
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setContentPane(panel);
        v.pack();
        v.setVisible(true);
        v.setSize(500, 700);
        v.setLocationRelativeTo(null);
    }
}
