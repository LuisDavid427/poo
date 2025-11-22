public class Perro : CarnivoroTerrestre, IDomestico{
    private string nombre;
    
    // constructor principal con parametros
    public Perro(string nombreCientifico, double pesoKg, string nombre) 
        : base(nombreCientifico, pesoKg, 2){
        this.nombre = nombre;
        Console.WriteLine("perro creado: " + nombre.ToLower());
    }

    // constructor copia
    public Perro(Perro otroPerro) 
        // llama al constructor de la clase padre con los datos del objeto a copiar
        : base(otroPerro.getNombreCientifico(), otroPerro.pesoKg, 2) {
        // cambia el nombre para diferenciar la copia
        this.nombre = "copia de " + otroPerro.nombre; 
        Console.WriteLine("se ha creado un duplicado (copia) del perro: " + this.nombre.ToLower());
    }

    // metodos obligatorios implementados
    public override void emitirsonido(){
        Console.WriteLine("woof!");
    }

    public override void tecnicadecaza() {
        Console.WriteLine("el perro usa la persecucion rapida");
    }
    
    // implementacion de la interfaz idomestico
    public void jugarconhumano(){
        Console.WriteLine("el perro trae la pelota");
    }
}