package DAO;

import DTOs.DTODeudaAllimento;
import DTOs.DTODeudaRenta;
import dataBase.DbConection;
import dataBase.DbQuerys;

import java.sql.*;
import java.util.ArrayList;

public class DAOOperaciones {


    //Metodo para obtener datos a partir del id del cliente
    public static ArrayList<DTODeudaAllimento>  consultarAdeudos(int idConsulta){
        ArrayList<DTODeudaAllimento> adeudosAlimento= new ArrayList<>();
        try{
            Connection connection = DbConection.abrirConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DbQuerys.consulta1(idConsulta));
            while (resultSet.next()){
                int id = resultSet.getInt("id_deuda_alimento");
                String date = resultSet.getString("fecha_compra");
                String nombreCompleto = resultSet.getString("nombre_completo");
                String estadoPago =  resultSet.getString("nombre_estado_pago");
                String alimento = resultSet.getString("nombre_alimento");
                adeudosAlimento.add(new DTODeudaAllimento(id, date, nombreCompleto, estadoPago, alimento));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return adeudosAlimento;
    }

    //Metodo para obtener datos a partir del nombre del cliente
    public static ArrayList<DTODeudaAllimento>  consultarAdeudos(String nombre){
        ArrayList<DTODeudaAllimento> adeudosAlimento= new ArrayList<>();
        try{
            Connection connection = DbConection.abrirConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DbQuerys.consulta2(nombre));
            while (resultSet.next()){
                int id = resultSet.getInt("id_deuda_alimento");
                String date = resultSet.getString("fecha_compra");
                String nombreCompleto = resultSet.getString("nombre_completo");
                String estadoPago =  resultSet.getString("nombre_estado_pago");
                String alimento = resultSet.getString("nombre_alimento");
                adeudosAlimento.add(new DTODeudaAllimento(id, date, nombreCompleto, estadoPago, alimento));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return adeudosAlimento;
    }

    //Metodo para obtener datos a partir del id del cliente
    public static ArrayList<DTODeudaRenta> consultarAdeudo2(int idConsulta){
        ArrayList<DTODeudaRenta> deudaRenta = new ArrayList<>();
        try{
            Connection connection = DbConection.abrirConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DbQuerys.consulta3(idConsulta));
            while (resultSet.next()){
                int id = resultSet.getInt("id_deuda_renta");
                String nombreCompleto = resultSet.getString("nombre_completo");
                String periodo_renta = resultSet.getString("periodo_renta");
                int numero_cuarto =  resultSet.getInt("numero_cuarto");
                int costo_renta = resultSet.getInt("costo_renta");
                String nombre_estado_pago = resultSet.getString("nombre_estado_pago");
                deudaRenta.add(new DTODeudaRenta(id, nombreCompleto, periodo_renta, numero_cuarto, costo_renta, nombre_estado_pago));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return deudaRenta;
    }
    //Metodo para obtener datos a partir del nombre del cliente
    public static ArrayList<DTODeudaRenta> consultarAdeudo2(String nombre){
        ArrayList<DTODeudaRenta> deudaRenta = new ArrayList<>();
        try{
            Connection connection = DbConection.abrirConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DbQuerys.consulta4(nombre));
            while (resultSet.next()){
                int id = resultSet.getInt("id_deuda_renta");
                String nombreCompleto = resultSet.getString("nombre_completo");
                String periodo_renta = resultSet.getString("periodo_renta");
                int numero_cuarto =  resultSet.getInt("numero_cuarto");
                int costo_renta = resultSet.getInt("costo_renta");
                String nombre_estado_pago = resultSet.getString("nombre_estado_pago");
                deudaRenta.add(new DTODeudaRenta(id, nombreCompleto, periodo_renta, numero_cuarto, costo_renta, nombre_estado_pago));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return deudaRenta;
    }
    //Metodo para obtener datos generales a partir del id del cliente
    public static ArrayList<DTODeudaRenta> consultarTodo2(){
        ArrayList<DTODeudaRenta> deudaRenta = new ArrayList<>();
        try{
            Connection connection = DbConection.abrirConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DbQuerys.CONSULTARTODO2);
            while (resultSet.next()){

                int id = resultSet.getInt("id_deuda_renta");
                String nombreCompleto = resultSet.getString("nombre_completo");
                String periodo_renta = resultSet.getString("periodo_renta");
                int numero_cuarto =  resultSet.getInt("numero_cuarto");
                int costo_renta = resultSet.getInt("costo_renta");
                String nombre_estado_pago = resultSet.getString("nombre_estado_pago");
                deudaRenta.add(new DTODeudaRenta(id, nombreCompleto, periodo_renta, numero_cuarto, costo_renta, nombre_estado_pago));

            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return deudaRenta;
    }
    //Metodo para obtener datos generales
    public static ArrayList<DTODeudaAllimento> consultarTodo(){
        ArrayList<DTODeudaAllimento> deudaAllimentos= new ArrayList<>();
        try{
            Connection connection = DbConection.abrirConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DbQuerys.CONSULTARTODO);
            while (resultSet.next()){

                int id = resultSet.getInt("id_deuda_alimento");
                String date = resultSet.getString("fecha_compra");
                String nombreCompleto = resultSet.getString("nombre_completo");
                String estadoPago =  resultSet.getString("nombre_estado_pago");
                String alimento = resultSet.getString("nombre_alimento");
                deudaAllimentos.add(new DTODeudaAllimento(id, date, nombreCompleto, estadoPago, alimento));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return deudaAllimentos;
    }
    //Metodo para elminar datos a partir del id del cliente
    public static int eliminarRenta(int idCliente){
        try{
            Connection connection = DbConection.abrirConexion();
            PreparedStatement preparedStatement = connection.prepareStatement(DbQuerys.ELIMINAR2);
            preparedStatement.setInt(1, idCliente);
            return preparedStatement.executeUpdate();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    //Metodo para elminar datos a partir del id del cliente
    public static int eliminarAlimento(int idCliente){
        try{
            Connection connection = DbConection.abrirConexion();
            PreparedStatement preparedStatement = connection.prepareStatement(DbQuerys.ELIMINAR);
            preparedStatement.setInt(1, idCliente);
            return preparedStatement.executeUpdate();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    //Metodo para elminar datos a partir del nombre del cliente
    public static int eliminarRenta(String nombre){
        try{
            Connection connection = DbConection.abrirConexion();
            PreparedStatement preparedStatement = connection.prepareStatement(DbQuerys.ELIMINARBYNOMBRE2);
            preparedStatement.setString(1, nombre);
            return preparedStatement.executeUpdate();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    //Metodo para actualizar datos a partir del id del cliente,y recibiendo los nuevos datos en forma de String
    public static int actualizar(String nombreActual, String nombreCompelto, String direccion, String correoElectronico){
        int i = 0;
        try{
            Connection connection = DbConection.abrirConexion();
            PreparedStatement preparedStatement = connection.prepareStatement(DbQuerys.UPDATE);
            preparedStatement.setString(1, nombreCompelto);
            preparedStatement.setString(2, direccion);
            preparedStatement.setString(3, correoElectronico);
            preparedStatement.setString(4, nombreActual);
            i = preparedStatement.executeUpdate();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return i;
    }
}
