public class Mouse {
    public String marca;
    public String color;
    public String tipo;

    public Mouse(String marca, String color, String tipo) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
    }


    public Mouse(){
    }


    public void MoverCursor(){
        System.out.println("mover cursor");
    }
}
