public class AireA {
    private int cantidad;
    private double maxTemp;
    private double minTemp;

    public AireA(int cant, double maxtmp, double mintmp){
        this.cantidad=cant;
        this.maxTemp=maxtmp;
        this.minTemp=mintmp;
    }
    
    public void enfriar(){
        System.out.println("enfria");
    }
}
