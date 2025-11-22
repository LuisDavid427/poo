package main
import "fmt"

// Iguana simula la clase Iguana.
type Iguana struct {
	ReptilBase // composicion
	// valor por defecto
	color string 
}

// NuevaIguana es el constructor sin parametros
func NuevaIguana() Iguana {
	iguana := Iguana{
		// valores por defecto para el constructor de la clase padre
		ReptilBase: NuevoReptilBase("iguana iguana", 1.5, true), 
		color:"verde",
	}
	fmt.Println("se ha creado una iguana con valores predeterminados (color: " + iguana.color + ")")
	return iguana
}

// EmitirSonido implementa el metodo de AnimalBase
func (i Iguana) EmitirSonido() {
	fmt.Println("ssssssss")
}

// TipoDeLocomocion implementa el metodo de ReptilBase
func (i Iguana) TipoDeLocomocion() {
	fmt.Println("la iguana camina y a veces trepa")
}