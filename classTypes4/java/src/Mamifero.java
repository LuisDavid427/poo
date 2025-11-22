// extiende de AnimalBase para heredar atributos y el método mover()
public abstract class Mamifero extends AnimalBase {
    // Atributo especifico de mamiferos
    private int gestacionMeses;

    public Mamifero(String nombreCientifico, double pesoKg, int gestacionMeses) {
        // llama al constructor de AnimalBase
        super(nombreCientifico, pesoKg); 
        this.gestacionMeses = gestacionMeses;
    }
    
    //todos los mamíferos amamantan a sus crías
    public void amamantar() {
        System.out.println(getNombreCientifico() + " esta amamantando a sus crias");
    }
    
    // hereda el método abstracto emitirSonido() de AnimalBase, comprometiendo a las clases hijas a implementarlo.
}