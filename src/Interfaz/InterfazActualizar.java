package Interfaz;

import DAO.DAOOperaciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazActualizar {

    private JTextField textField1;
    private JButton btnVolver;
    private JPanel panel;
    private JButton btnConsultar;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private final JFrame v = new JFrame("Actualizar");

    public InterfazActualizar(){
        lanzarVentana(v);
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.dispose();
                new InterfazEmpresa();
            }

        });
        //Boton para realizar una actualizacion a los datos de un cliente
        btnConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //A traves del metodo actualizar se retorna un 1 si la actualizacion ha sido generada correctamente para ello se deberan recuperar los datos
                //de los textField de la interfaz los cuales contienen los nuevos y ademas del dato a consultar para realizar la actualizacion
                if (DAOOperaciones.actualizar(textField1.getText(),textField2.getText(), textField3.getText(), textField4.getText()) == 1){
                    JOptionPane.showMessageDialog(null,"Actualizacion ha sido completada");
                }else
                    JOptionPane.showMessageDialog(null,"La actualizacion no ha sido completada");
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
