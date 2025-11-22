// extiende de mamifero e implementa la interfaz Herbivoro
public abstract class HerbivoroRumiante extends Mamifero implements Herbivoro {
    
    public HerbivoroRumiante(String nombreCientifico, double pesoKg) {
        // asumimos un valor genérico para el constructor de Mamifero
        super(nombreCientifico, pesoKg, 9); 
    }
    
    // metodo que implementa de forma concreta del pastoreo para iniciar la rumia
    @Override
    public void pastar() {
        System.out.println(getNombreCientifico() + " esta comiendo pasto e iniciando el proceso de rumia");
    }
    
    // metodo especifico de rumiantes
    public void rumiar() {
        System.out.println(getNombreCientifico() + " esta arrancando y masticando la vegetacion");
    }
}