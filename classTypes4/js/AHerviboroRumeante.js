class HerbivoroRumiante extends Mamifero {
    constructor(nombreCientifico, pesoKg) {
        // asumimos un valor generico para gestacion
        super(nombreCientifico, pesoKg, 9); 
    }
    
    // implementacion concreta del metodo pastar (de la interfaz herbivoro)
    pastar() {
        console.log(`${this.getNombreCientifico()} esta comiendo pasto e iniciando el proceso de rumia`);
    }
    
    // metodo especifico de rumiantes
    rumiar() {
        console.log(`${this.getNombreCientifico()} esta arrancando y masticando la vegetacion`);
    }
}
