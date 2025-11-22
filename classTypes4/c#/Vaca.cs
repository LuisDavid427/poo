public class Vaca : HerbivoroRumiante{
    private bool daLeche;

    // constructor obligatorio
    public Vaca(double pesoKg, bool daLeche) 
        // llama al constructor de herbivororumiante
        : base("bos taurus", pesoKg) 
    {
        this.daLeche = daLeche;
    }

    // metodos obligatorios implementados
    public override void emitirsonido(){
        Console.WriteLine("moooo!");
    }
}