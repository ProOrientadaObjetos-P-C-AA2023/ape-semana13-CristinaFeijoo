package paquete004;

public class PagoTelefonoConvencional extends Pago{
    double tarifa = 6.20;
    double minutosConsumidos = 100;
    double costoMinuto = 0.2;

    public double calcularPago(){
        calcularpago = tarifa + (minutosConsumidos * costoMinuto);
        return calcularpago;
    }

    @Override
    public String toString() {
        return "PagoTelefonoConvencional{" +
                "tarifa=" + tarifa +
                ", minutosConsumidos=" + minutosConsumidos +
                ", costoMinuto=" + costoMinuto +
                ", calcularpago=" + calcularpago + super.toString()+
                '}';
    }
}