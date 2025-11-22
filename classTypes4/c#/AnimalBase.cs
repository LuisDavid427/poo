public abstract class AnimalBase : IAnimal // implementa la interfaz
{
    // atributos comunes
    private string nombreCientifico;
    // usamos protected para solo que las subclases puedan acceder
    public double pesoKg; 

    // constructor para inicializar atributos
    public AnimalBase(string nombreCientifico, double pesoKg){
        this.nombreCientifico = nombreCientifico;
        this.pesoKg = pesoKg;
    }

    // implementacion del metodo de la interfaz ianimal (no es abstracta ni virtual, es una implementacion base)
    public void mover(){
        Console.WriteLine("el animal se esta moviendo con sus patas");
    }
    
    // lo dejamos abstracto porque cada animal emite un sonido diferente
    // el metodo en c# debe ser declarado como 'abstract' y no lleva cuerpo
    public abstract void emitirsonido(); 

    // getter para nombrecientifico
    public string getNombreCientifico(){
        return nombreCientifico;
    }
}