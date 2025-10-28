public class Boton {
    public String color;
    public String modelo;
    public String marca;

    public Boton(String color, String modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Boton(){
    }

    public void abrocha(){
        System.out.println("abrocha");
    }
}

