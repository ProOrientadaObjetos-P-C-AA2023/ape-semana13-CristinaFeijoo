/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
import paquete004.*;

import java.util.ArrayList;

public class BilleteraPagos{
    public Persona persona;
    public double gastoPagos;
    public String mes;

    public ArrayList<PagoAguaPotable> agua;
    public ArrayList<PagoLuzElectrica> luz;
    public ArrayList<PagoPredial> propiedades;
    public ArrayList<PagoTelefonoConvencional> telefono;

    public BilleteraPagos() {
        this.persona = persona;
        this.gastoPagos = gastoPagos;
        this.mes = mes;
        this.agua = agua;
        this.luz = luz;
        this.propiedades = propiedades;
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "BilleteraPagos{" +
                "persona=" + persona +
                ", gastoPagos=" + gastoPagos +
                ", mes='" + mes + '\'' +
                ", agua=" + agua +
                ", luz=" + luz +
                ", propiedades=" + propiedades +
                ", telefono=" + telefono +
                '}';
    }
}


