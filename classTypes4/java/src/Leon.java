// el leon hereda de CarnivoroTerrestre que a su vez hereda de Mamifero y AnimalBase
public class Leon extends CarnivoroTerrestre {

    // constructor con parametros
    public Leon(String nombreCientifico, double pesoKg, int gestacionMeses, String nombre) {
        // llama al constructor de la clase padre (CarnivoroTerrestre/Mamifero/AnimalBase)
        super(nombreCientifico, pesoKg, gestacionMeses);
    }

    // metodos obligatorios implementados
    @Override
    public void emitirSonido() {
        System.out.println("ROAR!!!");
    }

    @Override
    public void tecnicaDeCaza() {
        System.out.println("el leon caza en manada, acorralando a la presa");
    }
}