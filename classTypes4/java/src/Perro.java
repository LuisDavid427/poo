public class Perro extends CarnivoroTerrestre implements Domestico {
    private String nombre;
    
    // Constructor principal con parametros
    public Perro(String nombreCientifico, double pesoKg, String nombre) {
        super(nombreCientifico, pesoKg, 2); // Gestación de 2 meses
        this.nombre = nombre;
        System.out.println("perro creado: " + nombre);
    }

    // constructor Copia
    public Perro(Perro otroPerro) {
        // Llama al constructor de la clase padre con los datos del objeto a copiar
        super(otroPerro.getNombreCientifico(), otroPerro.pesoKg, 2); 
        this.nombre = "copia de " + otroPerro.nombre; // Cambia el nombre para diferenciar la copia
        System.out.println("se ha creado un duplicado (Copia) del perro: " + this.nombre);
    }

    // metodos obligatorios implementados
    @Override
    public void emitirSonido() {
        System.out.println("woof!");
    }

    @Override
    public void tecnicaDeCaza() {
        System.out.println("el perro usa la persecucion rápida");
    }
    
    @Override
    public void jugarConHumano() {
        System.out.println("el perro trae la pelota");
    }

}