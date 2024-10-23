import java.util.HashMap;

public abstract class Arma {

    int cantMuniciones;
    double alcance;
    String marca;
    int calibre;
    String estado;
    Policia policia;



    public Arma(int cantMuniciones, double alcance, String marca, int calibre, String estado, Policia policia) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policia = policia;
    }

    public boolean enCondicion() {
        return estado.equals("EN USO") && calibre >= 9;
    }


    @Override
    public String toString() {
        return "El arma tiene " + cantMuniciones + " municiones, un alcance de " + alcance + " mts, cuya marca es: "
                + marca + "\n"  +  "  , calibre: " +calibre + ", estado: " + estado + ", ";
    }
}
