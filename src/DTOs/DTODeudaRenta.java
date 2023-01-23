package DTOs;
//DTO para almacenar registros de una consulta relacionada a la renta del cliente
public class DTODeudaRenta {
    private int idRenta;
    private String nombreCompleto;
    private String periodoRenta;
    private int numeCuarto;
    private double costoRenta;
    private String estadoPago;

    public DTODeudaRenta(int idRenta, String nombreCompleto, String periodoRenta, int numeCuarto, double costoRenta, String estadoPago) {
        this.idRenta = idRenta;
        this.nombreCompleto = nombreCompleto;
        this.periodoRenta = periodoRenta;
        this.numeCuarto = numeCuarto;
        this.costoRenta = costoRenta;
        this.estadoPago = estadoPago;
    }

    public int getIdRenta() {
        return idRenta;
    }
    public void setIdRenta(int idRenta) {
        this.idRenta = idRenta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPeriodoRenta() {
        return periodoRenta;
    }
    public void setPeriodoRenta(String periodoRenta) {
        this.periodoRenta = periodoRenta;
    }

    public int getNumeCuarto() {
        return numeCuarto;
    }
    public void setNumeCuarto(int numeCuarto) {
        this.numeCuarto = numeCuarto;
    }

    public double getCostoRenta() {
        return costoRenta;
    }
    public void setCostoRenta(double costoRenta) {
        this.costoRenta = costoRenta;
    }

    public String getEstadoPago() {
        return estadoPago;
    }
    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    @Override
    public String toString() {
        return "Nombre completo:    "+nombreCompleto+"\nPeriodo de renta:   "+periodoRenta+"\nNumero de cuarto: "+numeCuarto+
                "\nCosto de la renta:   " +costoRenta+"\nEstado de pago:    "+estadoPago;
    }
}
