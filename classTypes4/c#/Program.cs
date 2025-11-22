public class Program 
{
    public static void Main(string[] args){

        // iguana (reptil base)
        // constructor sin parametros de iguana
        Iguana iguana = new Iguana();
        // usando el metodo getnombrecientifico()
        Console.WriteLine("nombre: " + iguana.getNombreCientifico().ToLower());
        iguana.emitirsonido(); // implementado en iguana
        iguana.mover(); // heredado de animalbase
        iguana.termoregular(); // implementado en reptilbase
        iguana.tipodelocomocion(); // implementado en iguana
        
        // vaca (herbivoro rumiante)
        // constructor obligatorio de vaca (vaca(double pesoKg, bool daLeche))
        Vaca lola = new Vaca(500.0, true);
        Console.WriteLine("nombre: " + lola.getNombreCientifico().ToLower());
        lola.emitirsonido(); // implementado en vaca
        lola.amamantar(); // heredado de mamifero
        lola.pastar(); // implementado en herbivororumiante (interfaz iherbivoro)
        lola.rumiar(); // metodo especifico de herbivororumiante

        // constructor sobrecargado de gato (gato(double pesoKg))
        Gato gatoComun = new Gato(4.5);
        // pesoKg es un campo protected en animalbase
        Console.WriteLine("peso: " + gatoComun.pesoKg + " kg"); 
        gatoComun.emitirsonido(); // implementado en gato
        gatoComun.cazar(); // implementado en carnivoroterrestre (interfaz icarnivoro)
        gatoComun.tecnicadecaza(); // implementado en gato
        gatoComun.jugarconhumano(); // implementado en gato (interfaz idomestico)

        // constructor completo de gato (gato(string nombrecientifico, double pesoKg, string raza))
        Gato gatoSiam = new Gato("felis catus", 5.2, "siames");
        Console.WriteLine("creado segundo gato, nombre: " + gatoSiam.getNombreCientifico().ToLower());
        
        // perro (carnivoro terrestre y domestico)
        // constructor principal de perro (perro(string nombrecientifico, double pesoKg, string nombre))
        Perro bobby = new Perro("canis lupus familiaris", 25.0, "bobby");
        bobby.emitirsonido();
        bobby.tecnicadecaza();
        bobby.jugarconhumano();

        // constructor copia de perro
        Perro bobbyCopia = new Perro(bobby);
        bobbyCopia.emitirsonido(); // el metodo funciona igual en la copia
        
        // leon (carnivoro terrestre)
        // constructor con parametros de leon
        Leon simba = new Leon("panthera leo", 190.0, 4, "simba");
        Console.WriteLine("nombre: " + simba.getNombreCientifico().ToLower());
        simba.emitirsonido(); // implementado en leon
        simba.cazar(); // heredado de carnivoroterrestre
        simba.tecnicadecaza(); // implementado en leon
        simba.amamantar(); // heredado de mamifero
    }
}