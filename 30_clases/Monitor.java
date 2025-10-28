public class Monitor{
    public String marca;
    public String pulgadas;
    public String hz;

    public Monitor(String marca, String pulgadas, String hz) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.hz = hz;
    }

    public Monitor(){
    }

    public void mostrar(){
        System.out.println("muestra contenido visual");
    }
}
