package practica7;

public class SensorAceleracion extends Sensor {

    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia, boolean encendido) {
        super(modelo, fabricante, consumoEnergia, "m/s^2");
    }

    @Override
    public double leerValor() {
        // aleatorios entre -10 y 10 (el rango lo elijo yo, el enunciado no lo da)
        valorEjeX = -10 + Math.random() * 20;
        valorEjeY = -10 + Math.random() * 20;
        valorEjeZ = -10 + Math.random() * 20;

        System.out.printf("Leyendo aceleración -> X: %.2f, Y: %.2f, Z: %.2f%n",
                valorEjeX, valorEjeY, valorEjeZ);

        // magnitud = raíz de (x² + y² + z²)
        return Math.sqrt(valorEjeX * valorEjeX
                       + valorEjeY * valorEjeY
                       + valorEjeZ * valorEjeZ);
    }

    public double getValorEjeX() { return valorEjeX; }
    public double getValorEjeY() { return valorEjeY; }
    public double getValorEjeZ() { return valorEjeZ; }
}
