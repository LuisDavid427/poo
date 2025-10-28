public class Pared {
    public String color;
    public String tamaño;
    public String material;

    public Pared(String color, String tamaño, String material) {
        this.color = color;
        this.tamaño = tamaño;
        this.material = material;
    }

    public Pared(){
    }

    public void delimitar(){
        System.out.println("delimita una estructura");
    }
}
