// extiende de animalbase para heredar atributos y el metodo mover()
public abstract class Mamifero : AnimalBase {
    // atributo especifico de mamiferos
    private int gestacionMeses;

    public Mamifero(string nombreCientifico, double pesoKg, int gestacionMeses) 
        // llama al constructor de animalbase
        : base(nombreCientifico, pesoKg){
        this.gestacionMeses = gestacionMeses;
    }
    
    // todos los mamiferos amamantan a sus crias
    public void amamantar(){
        Console.WriteLine(getNombreCientifico().ToLower() + " esta amamantando a sus crias");
    }
    
    // hereda el metodo abstracto emitirsonido() de animalbase.
}