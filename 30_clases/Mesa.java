public class Mesa {
    public String color;
    public String tamaño;
    public String peso;

    public Mesa(String color, String tamaño, String peso) {
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
    }


    public Mesa(){
    }


    public void mantener(){
        System.out.println("mantiene objetos");
    }
}