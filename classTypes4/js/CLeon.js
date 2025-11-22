class Leon extends CarnivoroTerrestre {
    constructor(nombreCientifico, pesoKg, gestacionMeses, nombre) {
        super(nombreCientifico, pesoKg, gestacionMeses);
        this.nombre = nombre; // atributo especifico solo de leon
    }

    // metodos obligatorios implementados
    emitirSonido() {
        console.log("roar!!!");
    }

    tecnicaDeCaza() {
        console.log("el leon caza en manada, acorralando a la presa");
    }
}