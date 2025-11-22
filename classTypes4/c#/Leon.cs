// el leon hereda de carnivoroterrestre que a su vez hereda de mamifero y animalbase
public class Leon : CarnivoroTerrestre{

    // constructor con parametros
    public Leon(string nombreCientifico, double pesoKg, int gestacionMeses, string nombre) 
        // llama al constructor de la clase padre
        : base(nombreCientifico, pesoKg, gestacionMeses) {
    }

    // metodos obligatorios implementados
    public override void emitirsonido(){
        Console.WriteLine("roar!!!");
    }

    public override void tecnicadecaza(){
        Console.WriteLine("el leon caza en manada, acorralando a la presa");
    }
}