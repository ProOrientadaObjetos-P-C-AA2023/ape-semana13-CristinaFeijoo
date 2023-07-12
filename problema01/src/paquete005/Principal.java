/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import paquete004.*;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        BilleteraPagos pagos=new BilleteraPagos();
        pagos.persona=new Persona("Nowo","Oreo",34,"oncecuatro",new Ciudad("Loja"));
        pagos.mes="Oct";
        ArrayList<PagoAguaPotable> aguaCasa =new ArrayList<>();
        ArrayList<PagoAguaPotable> aguaComercio =new ArrayList<>();
        ArrayList<PagoLuzElectrica> luzCasa=new ArrayList<>();
        ArrayList<PagoLuzElectrica> luzComercio=new ArrayList<>();
        ArrayList<PagoPredial> propiedadCasa1=new ArrayList<>();
        ArrayList<PagoPredial> propiedadCasa2=new ArrayList<>();
        ArrayList<PagoTelefonoConvencional> casa=new ArrayList<>();
        ArrayList<PagoTelefonoConvencional> finca=new ArrayList<>();

        GastosTotales gastosPagos= new GastosTotales(aguaCasa,aguaComercio,luzCasa,luzComercio,propiedadCasa1,propiedadCasa2,casa,finca);

    }



}
