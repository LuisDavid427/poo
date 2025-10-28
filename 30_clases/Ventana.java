public class Ventana {
    public String color;
    public double tamaño;
    public double transparencia;

    public Ventana(String color, double tamaño, double transparencia) {
        this.color = color;
        this.tamaño = tamaño;
        this.transparencia = transparencia;
    }

    public Ventana(){
    }

    public void seAbre(){
        System.out.println("ventana se abre");
    }
    public void seCierra(){
        System.out.println("ventana se cierra");
    }
}
