class Perro extends CarnivoroTerrestre {
    constructor(nombreCientifico, pesoKg, nombre) {
        super(nombreCientifico, pesoKg, 2); // gestacion de 2 meses
        this.nombre = nombre;
        console.log(`perro creado: ${nombre}`);
    }

    // constructor copia usando un metodo estatico o un factory
    static crearCopia(otroPerro) {
        const copia = new Perro(otroPerro.getNombreCientifico(), otroPerro.pesoKg, `copia de ${otroPerro.nombre}`); 
        console.log(`se ha creado un duplicado (copia) del perro: ${copia.nombre}`);
        return copia;
    }

    // metodos obligatorios implementados
    emitirSonido() {
        console.log("woof!");
    }

    tecnicaDeCaza() {
        console.log("el perro usa la persecucion rapida");
    }
    
    // metodo de la interfaz domestico
    jugarConHumano() {
        console.log("el perro trae la pelota");
    }
}