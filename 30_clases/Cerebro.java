public class Cerebro {
    public String tamaño;
    public String neuronas;
   

    public Cerebro(String tamaño, String neuronas) {
        this.tamaño = tamaño;
        this.neuronas = neuronas;
    }

    public Cerebro(){
    }

    public void Procesar(){
        System.out.println("procesa informacion");
    }
}
