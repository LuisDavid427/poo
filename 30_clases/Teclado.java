public class Teclado {
    public String color;
    public String luz;
    public String tipo_swiches;

    public Teclado(String color, String luz, String tipo_swiches) {
        this.color = color;
        this.luz = luz;
        this.tipo_swiches = tipo_swiches;
    }

    public Teclado(){
    }

    public void digita(){
        System.out.println("digita lo que el usuario escribe");
    }
}
