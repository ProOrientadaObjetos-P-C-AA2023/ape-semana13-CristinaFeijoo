package paquete002;

public class UbicacionPropiedad extends Ciudad{
    private String direccion;
    public UbicacionPropiedad(String nombreCiudad) {
        super(nombreCiudad);
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}