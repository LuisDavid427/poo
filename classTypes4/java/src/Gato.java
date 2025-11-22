public class Gato extends CarnivoroTerrestre implements Domestico {
    private String raza;
    
    // Constructor 1: inicializa con parámetros basicos
    public Gato(String nombreCientifico, double pesoKg, String raza) {
        super(nombreCientifico, pesoKg, 2); // Gestación de 2 meses
        this.raza = raza;
    }
    
    // constructor 2: sobrecarga, inicializa solo con el peso y usa valores por defecto para otros
    public Gato(double pesoKg) {
        this("felis catus", pesoKg, "Comun"); // Llama al Constructor 1
        System.out.println("sobrecarga usada: Gato comun creado con peso especifico.");
    }

    // metodos obligatorios implementados
    @Override
    public void emitirSonido() {
        System.out.println("Meow Meow");
    }

    @Override
    public void tecnicaDeCaza() {
        System.out.println("el gato acecha y salta");
    }
    
    @Override
    public void jugarConHumano() {
        System.out.println("el gato juega con una cuerda");
    }
}