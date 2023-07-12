package p1;

public abstract class Matricula {
    private double tarifa;
    public abstract void establecerTarifa();

    public double obtenerTarifa() {
        return tarifa;
    }
}
