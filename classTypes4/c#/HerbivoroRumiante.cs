// extiende de mamifero e implementa la interfaz iherbivoro
public abstract class HerbivoroRumiante : Mamifero, IHerbivoro{
    
    public HerbivoroRumiante(string nombreCientifico, double pesoKg) 
        // asumimos un valor generico para el constructor de mamifero
        : base(nombreCientifico, pesoKg, 9) {
    }
    
    // metodo que implementa de forma concreta del pastoreo para iniciar la rumia
    public void pastar() {
        Console.WriteLine(getNombreCientifico().ToLower() + " esta comiendo pasto e iniciando el proceso de rumia");
    }
    
    // metodo especifico de rumiantes
    public void rumiar() {
        Console.WriteLine(getNombreCientifico().ToLower() + " esta arrancando y masticando la vegetacion");
    }
}