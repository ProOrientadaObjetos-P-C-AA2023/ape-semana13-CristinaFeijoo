/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author reroes
 */
public class Propiedad {
    public double costoPropiedad;
    public UbicacionPropiedad ubicacionPropiedad;

    public Propiedad(double costoPropiedad, UbicacionPropiedad ubicacionPropiedad) {
        this.costoPropiedad = costoPropiedad;
        this.ubicacionPropiedad = ubicacionPropiedad;
    }

    public double getCostoPropiedad() {
        return costoPropiedad;
    }

    public void setCostoPropiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    public UbicacionPropiedad getUbicacionPropiedad() {
        return ubicacionPropiedad;
    }

    public void setUbicacionPropiedad(UbicacionPropiedad ubicacionPropiedad) {
        this.ubicacionPropiedad = ubicacionPropiedad;
    }
}

