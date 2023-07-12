package paquete004;

import paquete002.Ciudad;

public class PagoLuzElectrica extends Pago {
    Ciudad ciudad;
    double tarifaBase = 10.20;
    double kilovatiosConsumidos = 80;
    double costoKilovatio = 0.5;

    public PagoLuzElectrica(double tarifaBase, double kilovatiosConsumidos, double costoKilovatio) {
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
    }

    public double calcularPago() {
        if (ciudad.equals("Loja")) {
            calcularpago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            calcularpago= tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
        return calcularpago;
    }

    @Override
    public String toString() {
        return "PagoLuzElectrica " +
                "ciudad " + ciudad +
                ", tarifa Base " + tarifaBase +
                ", kilovatios Consumidos=" + kilovatiosConsumidos +
                ", costo Kilovatio " + costoKilovatio +
                ", calcular pago " + calcularpago +  super.toString() +
                '}';
    }
}

