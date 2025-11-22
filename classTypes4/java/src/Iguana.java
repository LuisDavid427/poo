public class Iguana extends ReptilBase {
    private String color = "verde"; // Valor por defecto

    // constructor sin parametros
    public Iguana() {
        // valores por defecto para el constructor de la clase padre (ReptilBase/AnimalBase)
        super("Iguana iguana", 1.5, true); 
        System.out.println("se ha creado una Iguana con valores predeterminados (color: " + this.color + ")");
    }
    
    // metodos obligatorios implementados
    @Override
    public void emitirSonido() {
        System.out.println("ssssssss");
    }

    @Override
    public void tipoDeLocomocion() {
        System.out.println("la iguana camina y a veces trepa");
    }
}