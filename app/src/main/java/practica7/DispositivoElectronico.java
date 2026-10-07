package practica7;

public class DispositivoElectronico {
    private String modelo; //Identificador del modelo (ej: "DTH11").
    private String fabricante;
    private double consumoEnergia; //Consumo en vatios (W).
    private boolean encendido;

    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    public void encender(){
        encendido=true;
        System.out.println("El dispositivo " + modelo + " ha sido encendido.");
    }
    public void apagar(){
        encendido=false;
        System.out.println("El dispositivo " + modelo + " ha sido apagado.");
    }

    public String obtenerEstado(){
        if(encendido){
            return "El dispositivo " + modelo + " está encendido.";
        } else {
            return "El dispositivo " + modelo + " está apagado.";
        }
    }
    
}
