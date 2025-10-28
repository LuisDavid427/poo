public class Puerta {
    public String color;
    public double tamaño;
    public String material;

    public Puerta(String color, double tamaño, String material) {
        this.color = color;
        this.tamaño = tamaño;
        this.material = material;
    }

    public Puerta(){
    }

    public void seAbre(){
        System.out.println("puerta se abre");
    }
    public void seCierra(){
        System.out.println("puerta se cierra");
    }
}