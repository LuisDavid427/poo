public class Conductor{
    public String especializacion;


    public Conductor(String especializacion) {
        this.especializacion = especializacion;
    }

    public Conductor(){
    }

    public void Conducir(){
        System.out.println("conduce su "+ especializacion);
    }
}