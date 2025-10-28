public class Antena{
    public String tamaño;
    public String material;

    public Antena(String tamaño, String material) {
        this.tamaño = tamaño;
        this.material = material;
    }

    public Antena(){
    }

    public void señal(){
        System.out.println("enviar y recibir señal");
    }
}