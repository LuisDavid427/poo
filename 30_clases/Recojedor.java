public class Recojedor {
    public String color;
    public String tamaño;
    public String material;

    public Recojedor(String color, String tamaño, String material) {
        this.color = color;
        this.tamaño = tamaño;
        this.material = material;
    }

    public Recojedor(){
    }

    public void recojer(){
        System.out.println("recoje basura");
    }
}