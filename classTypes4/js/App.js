
function demostrarJerarquia() {

    //  iguana (reptil base)
    // constructor sin parametros de iguana
    const iguana = new Iguana();
    // usando el metodo getnombrecientifico()
    console.log("nombre: " + iguana.getNombreCientifico());
    iguana.emitirSonido();    // implementado en iguana
    iguana.mover();           // heredado de animalbase
    iguana.termoregular();    // implementado en reptilbase
    iguana.tipoDeLocomocion(); // implementado en iguana
    
    //  vaca (herbivoro rumiante)
    // constructor obligatorio de vaca
    const lola = new Vaca(500.0, true);
    console.log("nombre: " + lola.getNombreCientifico());
    lola.emitirSonido(); // implementado en vaca
    lola.amamantar(); // heredado de mamifero
    lola.pastar(); // implementado en herbivororumiante
    lola.rumiar(); // metodo especifico de herbivororumiante

    //  gato (carnivoro terrestre y domestico)
    // constructor sobrecargado (static method en js)
    const gatoComun = Gato.crearGatoComun(4.5);
    console.log("peso: " + gatoComun.pesoKg + " kg"); 
    gatoComun.emitirSonido(); // implementado en gato
    gatoComun.cazar(); // heredado de carnivoroterrestre
    gatoComun.tecnicaDeCaza(); // implementado en gato
    gatoComun.jugarConHumano(); // implementado en gato
    
    // constructor completo de gato
    const gatoSiam = new Gato("felis catus", 5.2, "siames");
    console.log("creado segundo gato, nombre: " + gatoSiam.getNombreCientifico());
    
    //  perro (carnivoro terrestre y domestico)
    // constructor principal de perro
    const bobby = new Perro("canis lupus familiaris", 25.0, "bobby");
    bobby.emitirSonido();
    bobby.tecnicaDeCaza();
    bobby.jugarConHumano();

    // constructor copia de perro (static method en js)
    const bobbyCopia = Perro.crearCopia(bobby);
    bobbyCopia.emitirSonido(); 
    
    // leon (carnivoro terrestre)
    // constructor con parametros de leon
    const simba = new Leon("panthera leo", 190.0, 4, "simba");
    console.log("nombre: " + simba.getNombreCientifico());
    simba.emitirSonido(); // implementado en leon
    simba.cazar(); // heredado de carnivoroterrestre
    simba.tecnicaDeCaza(); // implementado en leon
    simba.amamantar(); // heredado de mamifero
}

demostrarJerarquia();