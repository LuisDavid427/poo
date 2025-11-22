// implementa la interfaz Carnivoro
public abstract class CarnivoroTerrestre extends Mamifero implements Carnivoro {
    
    public CarnivoroTerrestre(String nombreCientifico, double pesoKg, int gestacionMeses) {
        super(nombreCientifico, pesoKg, gestacionMeses);
    }
    
    // implementacion del método de la interfaz Carnivoro
    @Override
    public void cazar() {
        System.out.println("El " + getNombreCientifico() + " esta persiguiendo a su presa en la tierra");
    }
    
    // Nuevo metodo abstracto para una tecnica específica de caza.
    public abstract void tecnicaDeCaza();
}