/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;


public class VentasTvs {
    private ArrayList<Televisor> televisores;

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public double obtenerPrecioTotal() {
        double precioTotal = 0;
        for (Televisor televisor : televisores) {
            precioTotal += televisor.obtenerPrecio();
        }
        return precioTotal;
    }

    public String obtenerMarcasVendidas() {
        StringBuilder marcasVendidas = new StringBuilder();
        for (Televisor televisor : televisores) {
            marcasVendidas.append(televisor.obtenerMarca()).append("\n");
        }
        return marcasVendidas.toString();
    }
}
