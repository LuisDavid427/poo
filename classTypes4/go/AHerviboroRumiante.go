package main

import "fmt"

// HerbivoroRumiante simula la clase abstracta.
type HerbivoroRumiante struct {
	Mamifero // composicion
}

// NuevoHerbivoroRumiante es el constructor
func NuevoHerbivoroRumiante(nombreCientifico string, pesoKg float64) HerbivoroRumiante {
	// asumimos un valor generico para el constructor de mamifero
	return HerbivoroRumiante{
		Mamifero: NuevoMamifero(nombreCientifico, pesoKg, 9), 
	}
}

// Pastar metodo que implementa de forma concreta del pastoreo para iniciar la rumia
func (h HerbivoroRumiante) Pastar() {
	fmt.Println(h.GetNombreCientifico() + " esta comiendo pasto e iniciando el proceso de rumia")
}

// Rumiar metodo especifico de rumiantes
func (h HerbivoroRumiante) Rumiar() {
	fmt.Println(h.GetNombreCientifico() + " esta arrancando y masticando la vegetacion")
}