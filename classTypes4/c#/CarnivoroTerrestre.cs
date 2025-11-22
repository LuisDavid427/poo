// implementa la interfaz icarnivoro
public abstract class CarnivoroTerrestre : Mamifero, ICarnivoro 
{
    
    public CarnivoroTerrestre(string nombreCientifico, double pesoKg, int gestacionMeses) 
        // llama al constructor de la clase padre (mamifero)
        : base(nombreCientifico, pesoKg, gestacionMeses){
    }
    
    // implementacion del metodo de la interfaz icarnivoro
    public void cazar() {
        Console.WriteLine("el " + getNombreCientifico().ToLower() + " esta persiguiendo a su presa en la tierra");
    }
    
    // nuevo metodo abstracto para una tecnica especifica de caza.
    public abstract void tecnicadecaza();
}