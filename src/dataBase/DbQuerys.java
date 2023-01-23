package dataBase;

public class DbQuerys {
    //Query para buscar un registro por ID
    public static String consulta1(int num){
        return "SELECT id_deuda_alimento , cantidad_porciones, fecha_compra, nombre_completo, nombre_estado_pago, nombre_alimento FROM deuda_alimento, cliente,  estado_pago, alimento WHERE  cliente.id_cliente = deuda_alimento.id_cliente AND deuda_alimento.id_estado_pago = estado_pago.id_estado_pago AND  deuda_alimento.id_alimento = alimento.id_alimento AND cliente.id_cliente = "+num+";";
    }
    //Query para buscar un registro por nombre
    public static String consulta2(String nombre){
        return "SELECT id_deuda_alimento , cantidad_porciones, fecha_compra, nombre_completo, nombre_estado_pago, nombre_alimento FROM deuda_alimento, cliente,  estado_pago, alimento WHERE  cliente.id_cliente = deuda_alimento.id_cliente AND deuda_alimento.id_estado_pago = estado_pago.id_estado_pago AND  deuda_alimento.id_alimento = alimento.id_alimento AND cliente.nombre_completo = '"+nombre+"';";
    }
    //Query para buscar un registro de renta por ID
    public static String consulta3(int num){
        return "SELECT id_deuda_renta, nombre_completo, periodo_renta, numero_cuarto, costo_renta, nombre_estado_pago FROM cliente, cuarto, deuda_renta, estado_pago WHERE deuda_renta.id_cuarto = cuarto.id_cuarto AND deuda_renta.id_cliente = cliente.id_cliente AND deuda_renta.id_estado_pago = estado_pago.id_estado_pago AND cliente.id_cliente = "+num+";";
    }
    //Query para buscar un registro de renta por nombre de cliente
    public static String consulta4(String nombre){
        return "SELECT id_deuda_renta, nombre_completo, periodo_renta, numero_cuarto, costo_renta, nombre_estado_pago FROM cliente, cuarto, deuda_renta, estado_pago WHERE deuda_renta.id_cuarto = cuarto.id_cuarto AND deuda_renta.id_cliente = cliente.id_cliente AND deuda_renta.id_estado_pago = estado_pago.id_estado_pago AND cliente.nombre_completo = '"+nombre+"';";
    }
    //Query para realizar consultar todos los adeudos de alimentos
    public final static String CONSULTARTODO = "SELECT id_deuda_alimento , cantidad_porciones, fecha_compra, nombre_completo, nombre_estado_pago, nombre_alimento FROM deuda_alimento, cliente,  estado_pago, alimento WHERE  cliente.id_cliente = deuda_alimento.id_cliente AND deuda_alimento.id_estado_pago = estado_pago.id_estado_pago AND  deuda_alimento.id_alimento = alimento.id_alimento;";
    //Query para realizar consultar todos los adeudos de renta
    public final static String CONSULTARTODO2 = "SELECT id_deuda_renta, nombre_completo, periodo_renta, numero_cuarto, costo_renta, nombre_estado_pago FROM cliente, cuarto, deuda_renta, estado_pago WHERE deuda_renta.id_cuarto = cuarto.id_cuarto AND deuda_renta.id_cliente = cliente.id_cliente AND deuda_renta.id_estado_pago = estado_pago.id_estado_pago;";
    //Query para eliminar adeudos de un cliente
    public final static String ELIMINAR = "DELETE FROM deuda_alimento WHERE id_cliente = ?;";
    public final static String ELIMINAR2 = "DELETE FROM deuda_renta WHERE id_cliente = ?;";
    //Query para eliminar adeudos de un cliente
    //public final static String ELIMINARBYNOMBRE = "DELETE FROM deuda_alimento WHERE nombre_cliente = ?;";
    public final static String ELIMINARBYNOMBRE2 = "DELETE FROM deuda_renta WHERE nombre_cliente = ?;";

    public final static String UPDATE = "UPDATE cliente SET nombre_completo = ?, direccion = ?, correo_electronico = ? WHERE nombre_completo = ?;";
}
