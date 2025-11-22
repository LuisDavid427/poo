class AnimalBase {
    // atributos comunes
    // #nombreCientifico; // en js, los atributos privados se definen con #
    // en este ejemplo, usaremos el patron mas comun de js (sin # para accesibilidad en subclases)
    
    constructor(nombreCientifico, pesoKg) {
        this.nombreCientifico = nombreCientifico;
        this.pesoKg = pesoKg; // protected
    }

    // metodo que defne de que forma de mueve el animal
    mover() {
        console.log("el animal se esta moviendo con sus patas");
    }

    // lo dejamos abstracto porque cada animal emite un sonido diferente
    emitirSonido() {
    }

    // getter para nombrecientifico
    getNombreCientifico() {
        return this.nombreCientifico;
    }
}






