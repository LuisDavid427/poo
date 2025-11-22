package main

import "fmt"

// AnimalBase es el struct base que simula la clase abstracta AnimalBase.
type AnimalBase struct {
	// atributos comunes
	nombreCientifico string
	// usamos protected para solo que las subclases puedan acceder (en go, la minuscula simula el protected a nivel de paquete)
	pesoKg float64 
}

// NuevoAnimalBase es el constructor para inicializar atributos
func NuevoAnimalBase(nombreCientifico string, pesoKg float64) AnimalBase {
	return AnimalBase{
		nombreCientifico: nombreCientifico,
		pesoKg:           pesoKg,
	}
}

// Mover implementacion de el metodo de la interfaz Animal
func (a AnimalBase) Mover() {
	fmt.Println("el animal se esta moviendo con sus patas.")
}

// EmitirSonido lo dejamos abstracto: porque en go, se define en la interfaz,
// pero la implementacion concreta estara en las estructuras hijas.

// GetNombreCientifico es el getter para nombreCientifico
func (a AnimalBase) GetNombreCientifico() string {
	return a.nombreCientifico
}





