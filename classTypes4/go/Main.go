package main

import "fmt"

func main() {

	// iguana (reptil base)
	// constructor sin parametros de iguana
	iguana := NuevaIguana()
	// usando el metodo getnombrecientifico()
	fmt.Println("nombre: " + iguana.GetNombreCientifico())
	iguana.EmitirSonido() // implementado en iguana
	iguana.Mover() // heredado de animalbase
	iguana.Termoregular() // implementado en reptilbase
	iguana.TipoDeLocomocion() // implementado en iguana
	
	// vaca (herbivoro rumiante)
	// constructor obligatorio de vaca (nuevavaca(double pesoKg, bool daLeche))
	lola := NuevaVaca(500.0, true)
	fmt.Println("nombre: " + lola.GetNombreCientifico())
	lola.EmitirSonido() // implementado en vaca
	lola.Amamantar() // heredado de mamifero
	lola.Pastar() // implementado en herbivororumiante (interfaz herbivoro)
	lola.Rumiar() // metodo especifico de herbivororumiante

	// gato (carnivoro terrestre y domestico)
	// constructor sobrecargado de gato (nuevogato2(double pesoKg))
	gatoComun := NuevoGato2(4.5)
	// pesoKg es un campo interno y accesible por el mismo paquete/struct padre
	fmt.Println("peso: ", gatoComun.pesoKg, " kg") 
	gatoComun.EmitirSonido() // implementado en gato
	gatoComun.Cazar() // implementado en carnivoroterrestre (interfaz carnivoro)
	gatoComun.TecnicaDeCaza() // implementado en gato
	gatoComun.JugarConHumano() // implementado en gato (interfaz domestico)

	// constructor completo de gato (nuevogato1(string nombrecientifico, double pesoKg, string raza))
	gatoSiam := NuevoGato1("felis catus", 5.2, "siames")
	fmt.Println("creado segundo gato, nombre: " + gatoSiam.GetNombreCientifico())
	
	// perro (carnivoro terrestre y domestico)
	// constructor principal de perro (nuevoperro(string nombrecientifico, double pesoKg, string nombre))
	bobby := NuevoPerro("canis lupus familiaris", 25.0, "bobby")
	bobby.EmitirSonido()
	bobby.TecnicaDeCaza()
	bobby.JugarConHumano()

	// constructor copia de perro
	bobbyCopia := NuevoPerroCopia(bobby)
	bobbyCopia.EmitirSonido() // el metodo funciona igual en la copia
	
	// leon (carnivoro terrestre)
	// constructor con parametros de leon
	simba := NuevoLeon("panthera leo", 190.0, 4, "simba")
	fmt.Println("nombre: " + simba.GetNombreCientifico())
	simba.EmitirSonido() // implementado en leon
	simba.Cazar() // heredado de carnivoroterrestre
	simba.TecnicaDeCaza() // implementado en leon
	simba.Amamantar() // heredado de mamifero
}