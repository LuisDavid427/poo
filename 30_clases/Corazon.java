public class Corazon{
    public String tamaño;
    public String estado;

    public Corazon(String tamaño, String estado) {
        this.tamaño = tamaño;
        this.estado = estado;
    }

    public Corazon(){
    }

    public void bombear(){
        System.out.println("Bombea sangre");
    }
}