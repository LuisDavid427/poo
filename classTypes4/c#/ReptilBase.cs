// reptilbase.cs
public abstract class ReptilBase : AnimalBase, IReptil{
    // boolean en java es bool en c#
    private bool tieneEscamas;

    public ReptilBase(string nombreCientifico, double pesoKg, bool tieneEscamas) 
        : base(nombreCientifico, pesoKg){
        this.tieneEscamas = tieneEscamas;
    }
    
    // implementacion concreta del metodo de la interfaz ireptil
    public void termoregular(){
        Console.WriteLine("el reptil esta tomando el sol para elevar su temperatura corporal");
    }

    // metodo abstracto para un movimiento especifico
    public abstract void tipodelocomocion();
}