package main

import "fmt"

// Mamifero simula la clase abstracta Mamifero, incrustando AnimalBase.
type Mamifero struct {
	AnimalBase // composicion (simula herencia)
	// atributo especifico de mamiferos
	gestacionMeses int
}

// NuevoMamifero es el constructor de Mamifero
func NuevoMamifero(nombreCientifico string, pesoKg float64, gestacionMeses int) Mamifero {
	return Mamifero{
		AnimalBase:     NuevoAnimalBase(nombreCientifico, pesoKg),
		gestacionMeses: gestacionMeses,
	}
}

// Amamantar implementacion para todos los mamiferos
func (m Mamifero) Amamantar() {
	fmt.Println(m.GetNombreCientifico() + " esta amamantando a sus crias")
}