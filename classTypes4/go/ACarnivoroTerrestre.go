package main

import "fmt"
// CarnivoroTerrestre simula la clase abstracta, incrustando Mamifero e implementando Carnivoro
type CarnivoroTerrestre struct {
	Mamifero // composicion
	// no hay atributos extra
}

// NuevoCarnivoroTerrestre es el constructor
func NuevoCarnivoroTerrestre(nombreCientifico string, pesoKg float64, gestacionMeses int) CarnivoroTerrestre {
	return CarnivoroTerrestre{
		Mamifero: NuevoMamifero(nombreCientifico, pesoKg, gestacionMeses),
	}
}

// Cazar implementacion del metodo de la interfaz Carnivoro
func (c CarnivoroTerrestre) Cazar() {
	fmt.Println("el " + c.GetNombreCientifico() + " esta persiguiendo a su presa en la tierra")
}

// TecnicaDeCaza es el metodo abstracto, debe ser implementado por structs concretos
// En Go, un metodo se considera abstracto si esta en la interfaz y no esta implementado en el struct base
