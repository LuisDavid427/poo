class CarnivoroTerrestre extends Mamifero {
    constructor(nombreCientifico, pesoKg, gestacionMeses) {
        super(nombreCientifico, pesoKg, gestacionMeses);
    }
    
    // implementacion del metodo cazar (de la interfaz carnivoro)
    cazar() {
        console.log(`el ${this.getNombreCientifico()} esta persiguiendo a su presa en la tierra`);
    }
    
    // metodo abstracto para la tecnica especifica
    tecnicaDeCaza() {
    }
}