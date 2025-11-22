class Iguana extends ReptilBase {
    constructor() {
        // valores por defecto
        super("iguana iguana", 1.5, true); 
        this.color = "verde"; 
        console.log(`se ha creado una iguana con valores predeterminados (color: ${this.color})`);
    }
    
    // metodos obligatorios implementados
    emitirSonido() {
        console.log("ssssssss");
    }

    tipoDeLocomocion() {
        console.log("la iguana camina y a veces trepa");
    }
}