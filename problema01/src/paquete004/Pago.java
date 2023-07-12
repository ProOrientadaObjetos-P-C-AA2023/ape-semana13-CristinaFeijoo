package paquete004;

public abstract class Pago {
    double calcularpago;
    public abstract double calcularPago();

    @Override
    public String toString() {
        return "Pago{" +
                "pago=" + calcularpago +
                '}';
    }
}