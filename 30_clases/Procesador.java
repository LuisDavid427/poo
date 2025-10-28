public class Procesador {
    public String marca;
    public String ghz;
    public String cache;

    public Procesador(String marca, String ghz, String cache) {
        this.marca = marca;
        this.ghz = ghz;
        this.cache = cache;
    }

    public Procesador(){
    }

    public void Procesar(){
        System.out.println("procesa informacion");
    }
}
