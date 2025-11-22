
class Gato extends CarnivoroTerrestre {
    constructor(nombreCientifico, pesoKg, raza) {
        super(nombreCientifico, pesoKg, 2); // gestacion de 2 meses
        this.raza = raza;
    }
    
    // constructor sobrecarga, inicializa solo con el peso y usa valores por defecto para otros
    static crearGatoComun(pesoKg) {
        const gato = new Gato("felis catus", pesoKg, "comun");
        console.log("sobrecarga usada: gato comun creado con peso especifico.");
        return gato;
    }

    // metodos obligatorios implementados
    emitirSonido() {
        console.log("meow meow");
    }

    tecnicaDeCaza() {
        console.log("el gato acecha y salta");
    }
    
    // metodo de la interfaz domestico
    jugarConHumano() {
        console.log("el gato juega con una cuerda");
    }
}








