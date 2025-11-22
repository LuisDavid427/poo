class Vaca extends HerbivoroRumiante {
    constructor(pesoKg, daLeche) {
        super("bos taurus", pesoKg); 
        this.daLeche = daLeche;
    }

    // metodos obligatorios implementados
    emitirSonido() {
        console.log("moooo!");
    }
}