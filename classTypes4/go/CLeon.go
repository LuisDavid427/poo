package main
import "fmt"

// Leon simula la clase Leon.
type Leon struct {
	CarnivoroTerrestre // composicion
	// no hay atributos extra
}

// NuevoLeon es el constructor
func NuevoLeon(nombreCientifico string, pesoKg float64, gestacionMeses int, nombre string) Leon {
	return Leon{
		// el nombre se ignora en la composicion, solo se usa en el constructor en el original
		CarnivoroTerrestre: NuevoCarnivoroTerrestre(nombreCientifico, pesoKg, gestacionMeses), 
	}
}

// EmitirSonido implementa el metodo de AnimalBase
func (l Leon) EmitirSonido() {
	fmt.Println("roar!!!")
}

// TecnicaDeCaza implementa el metodo de CarnivoroTerrestre
func (l Leon) TecnicaDeCaza() {
	fmt.Println("el leon caza en manada, acorralando a la presa")
}