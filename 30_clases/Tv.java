public class Tv {

    public String color;
    public String modelo;
    public String marca;

    public Tv(String color, String modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Tv(){
    }

    public void mostrar(){
        System.out.println("muestra");
    }
}

