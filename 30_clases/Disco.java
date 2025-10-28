public class Disco {
    public String marca;
    public String tamaño;
    public String tipo;

    public Disco(String marca, String tamaño, String tipo) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }


    public Disco(){
    }


    public void Almacenar(){
        System.out.println("almacena informacion");
    }
}
