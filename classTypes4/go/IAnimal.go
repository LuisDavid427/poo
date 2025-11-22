
package main

// Animal define los metodos basicos que todo animal debe tener.
type Animal interface {
	// metodo que defne de que forma de mueve el animal
	Mover()
	
	// metodo que define el sonido que hace el animal
	EmitirSonido()
}
