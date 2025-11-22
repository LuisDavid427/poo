package main

import "fmt"

// Gato simula la clase Gato, incrustando CarnivoroTerrestre e implementando Domestico
type Gato struct {
	CarnivoroTerrestre // composicion
	raza string
}

// NuevoGato1 es el Constructor 1: inicializa con parametros basicos
func NuevoGato1(nombreCientifico string, pesoKg float64, raza string) Gato {
	return Gato{
		CarnivoroTerrestre: NuevoCarnivoroTerrestre(nombreCientifico, pesoKg, 2), // gestacion de 2 meses
		raza:raza,
	}
}

// NuevoGato2 constructor 2: sobrecarga, inicializa solo con el peso y usa valores por defecto
func NuevoGato2(pesoKg float64) Gato {
	gato := NuevoGato1("felis catus", pesoKg, "comun") // llama al constructor 1
	fmt.Println("sobrecarga usada: gato comun creado con peso especifico.")
	return gato
}

// EmitirSonido implementa el metodo de AnimalBase
func (g Gato) EmitirSonido() {
	fmt.Println("meow meow")
}

// TecnicaDeCaza implementa el metodo de CarnivoroTerrestre
func (g Gato) TecnicaDeCaza() {
	fmt.Println("el gato acecha y salta")
}

// JugarConHumano implementa la interfaz Domestico
func (g Gato) JugarConHumano() {
	fmt.Println("el gato juega con una cuerda")
}





