public class Soporte {
    public String color;
    public String modelo;
    public String marca;

    public Soporte(String color, String modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Soporte(){
    }

    public void soportar(){
        System.out.println("soporta la tv");
    }
}

