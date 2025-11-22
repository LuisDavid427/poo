public class App {
    public static void main(String[] args) throws Exception {


        // Constructor sin Parámetros de Iguana
        Iguana iguana = new Iguana();
        System.out.println("nombre: " + iguana.getNombreCientifico().toLowerCase());
        iguana.emitirSonido(); // implementado en Iguana
        iguana.mover(); // heredado de AnimalBase
        iguana.termoregular(); // implementado en ReptilBase
        iguana.tipoDeLocomocion(); // implementado en Iguana
        

        // Constructor Obligatorio de Vaca (Vaca(double pesoKg, boolean daLeche))
        Vaca lola = new Vaca(500.0, true);
        System.out.println("nombre: " + lola.getNombreCientifico().toLowerCase());
        lola.emitirSonido(); // implementado en Vaca
        lola.amamantar(); // heredado de Mamifero
        lola.pastar(); // implementado en HerbivoroRumiante (Interfaz Herbivoro)
        lola.rumiar(); // metodo especifico de HerbivoroRumiante


        // Constructor Sobrecargado de Gato (Gato(double pesoKg))
        Gato gatoComun = new Gato(4.5);
        System.out.println("peso: " + gatoComun.pesoKg + " kg");
        gatoComun.emitirSonido(); // implementado en Gato
        gatoComun.cazar(); // implementado en CarnivoroTerrestre (Interfaz Carnivoro)
        gatoComun.tecnicaDeCaza(); // implementado en Gato
        gatoComun.jugarConHumano(); // implementado en Gato (Interfaz Domestico)

        // Constructor Completo de Gato (Gato(String nombreCientifico, double pesoKg, String raza))
        Gato gatoSiam = new Gato("felis catus", 5.2, "siames");
        System.out.println("creado segundo gato, nombre: " + gatoSiam.getNombreCientifico().toLowerCase());
        
        // 4. Demostracion de Perro (CarnivoroTerrestre y Domestico)
        System.out.println("\n### 4. perro (carnivoro terrestre y domestico) ###");
        Perro bobby = new Perro("canis lupus familiaris", 25.0, "bobby");
        bobby.emitirSonido();
        bobby.tecnicaDeCaza();
        bobby.jugarConHumano();

        // Constructor Copia de Perro
        Perro bobbyCopia = new Perro(bobby);
        bobbyCopia.emitirSonido(); // El método funciona igual en la copia

        // Constructor con Parámetros de Leon
        Leon simba = new Leon("panthera leo", 190.0, 4, "simba");
        System.out.println("nombre: " + simba.getNombreCientifico().toLowerCase());
        simba.emitirSonido(); // implementado en Leon
        simba.cazar(); // heredado de CarnivoroTerrestre
        simba.tecnicaDeCaza(); // implementado en Leon
        simba.amamantar(); // heredado de Mamifero
    }
}