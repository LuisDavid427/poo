public class Proyector {
    public String resolucion;
    public String tamaño;
    public String puertos;

    public Proyector(String resolucion, String tamaño, String puertos) {
        this.resolucion = resolucion;
        this.tamaño = tamaño;
        this.puertos = puertos;
    }


    public Proyector(){
    }


    public void Proyectar(){
        System.out.println("proyecta contenido audiovisual");
    }
}
