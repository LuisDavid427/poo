public class Flecha {
    public String material;
    public String tamaño;
    public String color;


    public Flecha(String material, String tamaño, String color) {
        this.material = material;
        this.tamaño = tamaño;
        this.color = color;
    }


    public Flecha(){
    }


    public void señalar(){
        System.out.println("señala");
    }
}