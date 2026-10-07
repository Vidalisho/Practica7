package practica7;

public abstract class Sensor extends DispositivoElectronico {
    private String unidadMedida; //Unidad de la medición (ej: "°C", "Pa", "m/s^2").
    private boolean estaCalibrado; 

    public Sensor(String modelo, String fabricante, double consumoEnergia, String unidadMedida) {
        super(modelo, fabricante, consumoEnergia);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = false;
    }

    public void calibrar(){
        estaCalibrado = true;
        System.out.println("El sensor " + super.obtenerEstado() + " ha sido calibrado.");
    }

    public abstract double leerValor();
}
