public class Silla {
    public String color;
    public String forma;
    public String material;

    public Silla(String color, String forma, String material) {
        this.color = color;
        this.forma = forma;
        this.material = material;
    }


    public Silla(){
    }


    public void mantener(){
        System.out.println("mantiene personas");
    }
}