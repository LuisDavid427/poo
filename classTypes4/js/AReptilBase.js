class ReptilBase extends AnimalBase {
    constructor(nombreCientifico, pesoKg, tieneEscamas) {
        super(nombreCientifico, pesoKg);
        this.tieneEscamas = tieneEscamas;
    }
    
    // implementacion concreta del metodo termoregular (de la interfaz reptil)
    termoregular() {
        console.log("el reptil esta tomando el sol para elevar su temperatura corporal");
    }

    // metodo abstracto para un movimiento especifico
    tipoDeLocomocion() {
    }
}