public class Saco {
    public String color;
    public String tamaño;
    public String material;

    public Saco(String color, String tamaño, String material) {
        this.color = color;
        this.tamaño = tamaño;
        this.material = material;
    }


    public Saco(){
    }


    public void abrigar(){
        System.out.println("agriga");
    }
}