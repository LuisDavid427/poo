package main

import "fmt"

// Perro simula la clase Perro.
type Perro struct {
	CarnivoroTerrestre // composicion
	nombre string
}

// NuevoPerro es el constructor principal
func NuevoPerro(nombreCientifico string, pesoKg float64, nombre string) Perro {
	perro := Perro{
		CarnivoroTerrestre: NuevoCarnivoroTerrestre(nombreCientifico, pesoKg, 2), // gestacion de 2 meses
		nombre:nombre,
	}
	fmt.Println("perro creado: " + nombre)
	return perro
}

// NuevoPerroCopia es el constructor copia
func NuevoPerroCopia(otroPerro Perro) Perro {
	// usamos los datos del perro original
	copia := Perro{
		CarnivoroTerrestre: NuevoCarnivoroTerrestre(otroPerro.GetNombreCientifico(), otroPerro.pesoKg, 2), 
		// cambia el nombre para diferenciar la copia
		nombre: "copia de " + otroPerro.nombre, 
	}
	fmt.Println("se ha creado un duplicado (copia) del perro: " + copia.nombre)
	return copia
}

// EmitirSonido implementa el metodo de AnimalBase
func (p Perro) EmitirSonido() {
	fmt.Println("woof!")
}

// TecnicaDeCaza implementa el metodo de CarnivoroTerrestre
func (p Perro) TecnicaDeCaza() {
	fmt.Println("el perro usa la persecucion rapida")
}

// JugarConHumano implementa la interfaz Domestico
func (p Perro) JugarConHumano() {
	fmt.Println("el perro trae la pelota")
}
