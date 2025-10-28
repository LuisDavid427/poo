public class Camisa{
    public String color;
    public String modelo;
    public String marca;

    public Camisa(String color, String modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Camisa(){
    }

    public void agrigar(){
        System.out.println("abriga");
    }
}