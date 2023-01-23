package Interfaz;

import DAO.DAOOperaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import static DAO.DAOOperaciones.*;

public class InterfazConsultar {
    private JPanel panel;
    private JButton consultarPorIDButton;
    private JButton btnConsultarAlimentoNombre;
    private JButton consultarPorNombreButton1;
    private JButton btnConsultarTodosAlimentos;
    private JButton volverButton;
    private JTextField textField1;
    private JButton consultarTodosLosRegistrosButton;
    private JTextArea textArea1;
    private JButton btnConsultarAlimentoID;
    private JButton btnConsultarTodosRenta;
    private final JFrame v = new JFrame("Consultar");

    public InterfazConsultar(){
        lanzarVentana(v);

        //Boton para volver a la ventana anterior en este caso la principal
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.dispose();
                new InterfazEmpresa();
            }
        });
        //Boton para consultar por el ID del cliente sus adeudos en renta
        consultarPorIDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    //llama al metodo estatico de consulta el cual debe recibir un arrayList, por lo cual se utiliza el metodo estatico de DAOOperaciones
                    //el cual recibe un int dicho se obtendra del elemento textField de nuestar interfaz quien recupera un string y lo convierte en un entero para su manejo
                    consulta(DAOOperaciones.consultarAdeudos(Integer.parseInt(textField1.getText())));
                }catch (Exception ex){
                    //Si se detecta una letra se genera una excepcion que muestra un mensaje flotante en pantalla indicando que el valor ingresado no es un numero
                    JOptionPane.showMessageDialog(null, "ERROR. Ingresa un numero");
                }
            }
        });
        //Boton para consultar por el nombre  del cliente sus adeudos en renta
        consultarPorNombreButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    consulta(consultarAdeudos(textField1.getText()));
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "ERROR. Vuelve a intentarlo ");
                }
            }
        });

        //Boton para consultar por el ID del cliente sus adeudos en alimentos

        btnConsultarAlimentoID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    consulta(consultarAdeudo2(Integer.parseInt(textField1.getText())));
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "ERROR. Ingresa un numero");
                }
            }
        });

        //Boton para consultar por el nombre  del cliente sus adeudos en alimentos
        btnConsultarAlimentoNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    consulta(consultarAdeudo2(textField1.getText()));
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            }
        });

        btnConsultarTodosAlimentos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    consulta(consultarTodo());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "ERROR. Vuelve a intentarlo ");
                }
            }
        });
        btnConsultarTodosRenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    consulta(consultarTodo2());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "ERROR. Vuelve a intentarlo ");
                }
            }
        });
    }

    private void lanzarVentana(JFrame v) {
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setContentPane(panel);
        v.pack();
        v.setVisible(true);
        v.setSize(800, 900);
        v.setLocationRelativeTo(null);
        v.setBackground(Color.CYAN);
    }

    private void crearPDF(){
        int result = JOptionPane.showConfirmDialog(v, "¿Deseas obtener un reporte de tu consulta?");
        if(result == 1){
        }
    }

    //Metodo que recibe un ArrayList de tipo no especfiicado de tal manera que pueda recibir cualquier tipo de objeto
    private void consulta(ArrayList<?> array) throws Exception{
            textArea1.setText("");
            //For, para mostrar los datos de array en el textArea
            for (int i = 0; i < array.size(); i ++){
                textArea1.setText(textArea1.getText() + "Consulta " + (i+1) + "\n\n");
                textArea1.setText("\n"+textArea1.getText() + array.get(i)+"\n\n");
            }
    }
}
