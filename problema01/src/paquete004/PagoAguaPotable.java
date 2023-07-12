package paquete004;

public class PagoAguaPotable extends Pago{
    double tarifaFija = 2.2;
    double metrosCubicosConsumo = 100.2;
    double costoConsumoCubico = 0.2;
    String tipo;
    @Override
    public double calcularPago() {
        if(tipo.equals("comercial")){
            double tarifaFija = 2.20;
            double metrosCubicosConsumo = 100.2;
            double costoConsumoCubicos = 0.2;
            calcularpago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        }else{
            double tarifaFija = 2.20;
            double metrosCubicosConsumo = 100.2;
            double costoConsumoCubicos = 0.2;
            calcularpago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }
        return calcularpago;
    }

    @Override
    public String toString() {
        return "Pago Agua Potable " +
                "tarifa Fija " + tarifaFija +
                ", metros Cubicos Consumo " + metrosCubicosConsumo +
                ", costo Consumo Cubico " + costoConsumoCubico +
                ", tipo  " + tipo + '\'' +
                ", calcularpago=" + calcularpago + super.toString();
    }
}
