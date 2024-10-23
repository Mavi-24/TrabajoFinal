import java.util.ArrayList;

public class Policia {

    private String Nombre;
    private String Apellido;
    private int Legajo;
   // private ArrayList<Arma> Armas;



    //Constructor
    public Policia (String nombre, String apellido, int legajo)
    {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Legajo = legajo;



    }
    //geters seters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getLegajo() {
        return Legajo;
    }

    public void setLegajo(int legajo) {
        Legajo = legajo;
    }



    @Override
    public String toString()
    {

        return  getNombre() + " " + getApellido() + ", legajo: " + getLegajo() + " ";
    }
}
