public class Aprendiz{
    public String tamaño;
    public String fecha_nacimiento;

    public Aprendiz(String tamaño, String fecha_nacimiento) {
        this.tamaño = tamaño;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Aprendiz(){
    }

    public void aprende(){
        System.out.println("el aprendiz aprende");
    }
}