package main

import "fmt"

// ReptilBase simula la clase abstracta.
type ReptilBase struct {
	AnimalBase // composicion
	tieneEscamas bool
}

// NuevoReptilBase es el constructor
func NuevoReptilBase(nombreCientifico string, pesoKg float64, tieneEscamas bool) ReptilBase {
	return ReptilBase{
		AnimalBase:   NuevoAnimalBase(nombreCientifico, pesoKg),
		tieneEscamas: tieneEscamas,
	}
}

// Termoregular implementacion concreta del metodo de la interfaz Reptil
func (r ReptilBase) Termoregular() {
	fmt.Println("el reptil esta tomando el sol para elevar su temperatura corporal")
}

// TipoDeLocomocion es el metodo abstracto, debe ser implementado por structs concretos.