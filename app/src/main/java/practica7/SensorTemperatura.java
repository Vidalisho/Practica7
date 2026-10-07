package practica7;

public class SensorTemperatura extends Sensor {
    public double valorActual;

    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "C");
        this.valorActual=0.0;
    }

    @Override
    public double leerValor() {
        return 20 + Math.random() * (35-20); // Retorna un valor aleatorio entre 20 y 35 °C.
    }
    
}
