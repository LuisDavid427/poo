public class Hoja{
    public String tamaño;
    public String color;

    public Hoja(String tamaño, String color) {
        this.tamaño = tamaño;
        this.color = color;
    }

    public Hoja(){
    }

    public void mostrar(){
        System.out.println("muestra fisicamente algo escrito");
    }
}