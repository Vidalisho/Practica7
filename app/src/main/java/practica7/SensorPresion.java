package practica7;

public class SensorPresion extends Sensor {

    private double valorActual;

    public SensorPresion(String modelo, String fabricante, double consumoEnergia, boolean encendido) {
        super(modelo, fabricante, consumoEnergia, "hPa");
    }

    @Override
    public double leerValor() {
        System.out.println("Leyendo presión atmosférica...");
        valorActual = 900.0 + Math.random() * 200.0; // entre 900 y 1100
        return valorActual;
    }

    public double getValorActual() {
        return valorActual;
    }
}