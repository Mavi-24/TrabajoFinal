public class Corta extends Arma {

    boolean esAutomatica;


    public Corta(int cantMuniciones, double alcance, String marca, int calibre, String estado,  Policia policia, boolean automatica)
    {
        super(cantMuniciones, alcance, marca,  calibre,  estado, policia);
        this.esAutomatica = automatica;
    }


    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }





    public boolean efectividadMts()
    {
        if(this.alcance > 200)

        {
            return true;
        }

        return false;
    }



    @Override
    public String toString() {
        String automatica;
        if (esAutomatica == true)
        {
            automatica = "que es automatica";
        }
        else
        {
            automatica = "que no es automatica";
        }

        String efectividad;
        if (efectividadMts() == true)
        {
            efectividad = ", que se puede disparar a más de 200 mts,";
        }
        else
        {
            efectividad = ", que NO se puede disparar a más de 200 mts,";
        }

        return super.toString() + "es una arma corta, " + automatica + efectividad + "\n" +
                "y que pertenece al policía: " + policia.toString();
    }



}
