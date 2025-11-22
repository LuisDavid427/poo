public class Iguana : ReptilBase {
    // valor por defecto
    private string color = "verde"; 

    // constructor sin parametros
    public Iguana() 
        // valores por defecto para el constructor de la clase padre
        : base("iguana iguana", 1.5, true){
        Console.WriteLine("se ha creado una iguana con valores predeterminados (color: " + this.color.ToLower() + ")");
    }
    
    // metodos obligatorios implementados
    public override void emitirsonido() {
        Console.WriteLine("ssssssss");
    }

    public override void tipodelocomocion() {
        Console.WriteLine("la iguana camina y a veces trepa");
    }
}