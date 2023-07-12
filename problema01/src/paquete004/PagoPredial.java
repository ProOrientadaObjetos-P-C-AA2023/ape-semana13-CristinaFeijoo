package paquete004;

public class PagoPredial extends Pago {
    double valorPropiedad = 56000;
    double porcentaje = 10;

    public double calcularPago(){
        calcularpago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
        return calcularpago;
    }

    @Override
    public String toString() {
        return "PagoPredial " +
                "valorPropiedad " + valorPropiedad +
                ", porcentaje " + porcentaje +
                ", calcularpago " + calcularpago +  super.toString() +
                '}';
    }
}

