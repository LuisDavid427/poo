public class Vaca extends HerbivoroRumiante {
    private boolean daLeche;

    // constructor obligatorio
    public Vaca(double pesoKg, boolean daLeche) {
        // Llama al constructor de HerbivoroRumiante (que a su vez llama a Mamifero)
        super("Bos taurus", pesoKg); 
        this.daLeche = daLeche;
    }

    // metodos obligatorios implementados
    @Override
    public void emitirSonido() {
        System.out.println("moooo!");
    }
}