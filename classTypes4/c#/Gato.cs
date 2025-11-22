public class Gato : CarnivoroTerrestre, IDomestico{
    private string raza;
    
    // constructor 1: inicializa con parametros basicos
    public Gato(string nombreCientifico, double pesoKg, string raza) 
        : base(nombreCientifico, pesoKg, 2){
        this.raza = raza;
    }
    
    // constructor 2: sobrecarga, inicializa solo con el peso y usa valores por defecto para otros
    public Gato(double pesoKg) 
        // c# usa this para llamar a un constructor de la misma clase
        : this("felis catus", pesoKg, "comun"){

        Console.WriteLine("sobrecarga usada: gato comun creado con peso especifico.");
    }

    // metodos obligatorios implementados, usan 'override'
    public override void emitirsonido(){
        Console.WriteLine("meow meow");
    }

    public override void tecnicadecaza(){
        Console.WriteLine("el gato acecha y salta");
    }
    
    // implementacion de la interfaz idomestico
    public void jugarconhumano(){
        Console.WriteLine("el gato juega con una cuerda");
    }
}