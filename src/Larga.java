public class Larga extends Arma implements Comparable  {

    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;




    public Larga(int cantMuniciones, double alcance, String marca, int calibre, String estado, Policia policia,
                 String justifUso, int nivelArma, boolean tieneSello)
    {
        super(cantMuniciones, alcance, marca,  calibre,  estado, policia);
        this.justifUso = justifUso;
        this.nivelArma = nivelArma;
        this.tieneSello = tieneSello;
    }


    public int compareTo(Object o) {
        if (o instanceof Larga)
        {
            Larga armaLarga = (Larga) o; // Hacer cast explícito

            // Comparamos el nivel
            int comparacionNivel = Integer.compare(this.nivelArma, armaLarga.nivelArma);

            if (comparacionNivel != 0)
            {
                return comparacionNivel; // Si los niveles son diferentes, devolvemos el resultado de la comparación
            }

            return comparacionNivel;

        } else
        {

            throw new IllegalArgumentException("No son objetos del mismo tipo");
        }
    }




      @Override
    public String toString()
    {
        String sello;

        if (tieneSello == true)
        {
             sello = ", tiene sello del RENAR";
        }
        else
        {
            sello = ", no tiene el sello del RENAR";
        }



        return super.toString() + "El arma es larga se usa porque: " + justifUso + ", tiene un nivel: " + nivelArma + "\n " +
                  sello + " y pertenece al policía " + policia.toString() + "\n ";
    }

}
