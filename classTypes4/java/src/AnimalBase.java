public abstract class AnimalBase implements Animal {
    // atributos comunes
    private String nombreCientifico;
    protected double pesoKg; // Usamos protected para solo que las subclases puedan acceder

    // constructor para inicializar atributos
    public AnimalBase(String nombreCientifico, double pesoKg) {
        this.nombreCientifico = nombreCientifico;
        this.pesoKg = pesoKg;
    }

    // implementación de el método de la interfaz Animal
    @Override
    public void mover() {
        System.out.println("El animal se está moviendo con sus patas.");
    }
    
    // lo dejamos abstracto porque cada animal emite un sonido diferente
    @Override
    public abstract void emitirSonido();
    
    // Getter para nombreCientifico
    public String getNombreCientifico() {
        return nombreCientifico;
    }
}