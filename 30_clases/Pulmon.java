public class Pulmon{
    public String tamaño;
    public String estado;

    public Pulmon(String tamaño, String estado) {
        this.tamaño = tamaño;
        this.estado = estado;
    }

    public Pulmon(){
    }

    public void respirar(){
        System.out.println("entrar aire, salir aire");
    }
}