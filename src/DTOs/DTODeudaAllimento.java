package DTOs;
//DTO para almacenar registros de una consulta relacionada a los alimentos del cliente
public class DTODeudaAllimento {
    public int id;
    public String date;
    public String nombreCompleto;
    public String estadoPago;
    public String alimento;

    public DTODeudaAllimento(int id, String date, String nombreCompleto, String estadoPago, String alimento) {
        this.id = id;
        this.date = date;
        this.nombreCompleto = nombreCompleto;
        this.estadoPago = estadoPago;
        this.alimento = alimento;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEstadoPago() {
        return estadoPago;
    }
    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {return  "Nombre completo: " +  nombreCompleto + "\nAlimento:  "+ alimento +
            "\nFecha de compra: " + date + "\nEstado de pago:  " + estadoPago;
    }
}
