public class Zapato {
    public String marca;
    public String tamaño;
    public String tipo;

    public Zapato(String marca, String tamaño, String tipo) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public Zapato(){
    }

    public void abrigar(){
        System.out.println("abrigar pie");
    }
}

