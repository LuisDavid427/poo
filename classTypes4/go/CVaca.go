package main

import "fmt"

// Vaca simula la clase Vaca.
type Vaca struct {
	HerbivoroRumiante // composicion
	daLeche bool
}

// NuevaVaca es el constructor
func NuevaVaca(pesoKg float64, daLeche bool) Vaca {
	return Vaca{
		// llama al constructor de herbivororumiante
		HerbivoroRumiante: NuevoHerbivoroRumiante("bos taurus", pesoKg), 
		daLeche:daLeche,
	}
}

// EmitirSonido implementa el metodo de AnimalBase
func (v Vaca) EmitirSonido() {
	fmt.Println("moooo!")
}