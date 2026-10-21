package practica7;

public class Main {
    public static void main(String[] args) {
        Sensor[] sensores = {
            new SensorTemperatura("DTH11", "Aosong", 0.5),
            new SensorPresion("BMP280", "Bosch", 0.3, false),
            new SensorAceleracion("MPU6050", "InvenSense", 0.4, false)
        };

        for (Sensor s : sensores) {
            s.encender();
            s.calibrar();
            System.out.println("Valor: " + s.leerValor() + " " + s.getUnidadMedida());
            System.out.println();
        }
    }
}