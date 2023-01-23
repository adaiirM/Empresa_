package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConection {
    //Metodo para realizar la conexion a la base de datos
    public static Connection abrirConexion() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DbConfig.URL, DbConfig.USER, DbConfig.PASSWORD);
            System.out.println("La conexión se ha realizado de manera exitosa...");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return connection;
    }

    /*
    public static void cerrarDb(Connection connection){
        try{
            connection.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }*/
}
