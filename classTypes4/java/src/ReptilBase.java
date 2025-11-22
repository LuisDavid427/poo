public abstract class ReptilBase extends AnimalBase implements Reptil {
    
    private boolean tieneEscamas;

    public ReptilBase(String nombreCientifico, double pesoKg, boolean tieneEscamas) {
        super(nombreCientifico, pesoKg);
        this.tieneEscamas = tieneEscamas;
    }
    
    // implementación concreta del método de la interfaz Reptil
    @Override
    public void termoregular() {
        System.out.println("el reptil esta tomando el sol para elevar su temperatura corporal");
    }

    // Método abstracto para un movimiento específico
    public abstract void tipoDeLocomocion();
}