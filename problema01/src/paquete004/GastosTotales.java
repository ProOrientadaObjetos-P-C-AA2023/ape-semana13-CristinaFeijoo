package paquete004;

import java.util.ArrayList;

public class GastosTotales {
    ArrayList<PagoAguaPotable> aguaCasa =new ArrayList<>();
    ArrayList<PagoAguaPotable> aguaComercio =new ArrayList<>();
    ArrayList<PagoLuzElectrica> luzCasa=new ArrayList<>();
    ArrayList<PagoLuzElectrica> luzComercio=new ArrayList<>();
    ArrayList<PagoPredial> propiedadCasa1=new ArrayList<>();
    ArrayList<PagoPredial> propiedadCasa2=new ArrayList<>();
    ArrayList<PagoTelefonoConvencional> casa=new ArrayList<>();
    ArrayList<PagoTelefonoConvencional> finca=new ArrayList<>();

    public GastosTotales(ArrayList<PagoAguaPotable> aguaCasa, ArrayList<PagoAguaPotable> aguaComercio, ArrayList<PagoLuzElectrica> luzCasa, ArrayList<PagoLuzElectrica> luzComercio, ArrayList<PagoPredial> propiedadCasa1, ArrayList<PagoPredial> propiedadCasa2,
                         ArrayList<PagoTelefonoConvencional> casa, ArrayList<PagoTelefonoConvencional> finca) {
        this.aguaCasa = aguaCasa;
        this.aguaComercio = aguaComercio;
        this.luzCasa = luzCasa;
        this.luzComercio = luzComercio;
        this.propiedadCasa1 = propiedadCasa1;
        this.propiedadCasa2 = propiedadCasa2;
        this.casa = casa;
        this.finca = finca;
    }

    public double calcularGastos(){
            double gastoPagos=0;
            for(Pago pago: aguaCasa)
                gastoPagos+=pago.calcularPago();
        for(Pago pago: aguaComercio)
            gastoPagos+=pago.calcularPago();
            for (Pago pago: luzCasa)
                gastoPagos+=pago.calcularpago;
        for(Pago pago: luzComercio)
            gastoPagos+=pago.calcularPago();
            for (Pago pago: propiedadCasa1)
                gastoPagos+=pago.calcularpago;
        for(Pago pago: propiedadCasa1)
            gastoPagos+=pago.calcularPago();
            for (Pago pago: casa)
                gastoPagos+=pago.calcularpago;
        for(Pago pago: finca)
            gastoPagos+=pago.calcularPago();
            return gastoPagos;
        }
    }

