import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del policía: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el Apellido del policía: ");
        String apellido = sc.nextLine();

        System.out.println("Ingrese el legajo del policía: ");
        int legajo = sc.nextInt();
        sc.nextLine();



        Policia policia = new Policia(nombre, apellido, legajo);

        /////////////////////////////////////////////////////////////////////////////////



        System.out.println("Ingrese la cantidad de municiones del arma: ");
        int cantMuniones = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el alcance del arma: ");
        double alcance = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingrese la marca del arma: ");
        String marca = sc.nextLine();

        System.out.println("Ingrese el calibre del arma: ");
        int calibre = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la estado del arma: ");
        String estado = sc.nextLine();



        System.out.println("Ingrese si es una arma corta o larga ");
        String tipoArma = sc.nextLine();


        Corta corta;
        Larga larga1 = null;
        Larga larga2 = null;

        if (tipoArma.equalsIgnoreCase("Corta"))
        {
            System.out.println("Es automatica? si/no");
            String automatica = sc.nextLine();

            boolean cortaAutomatica;

            if(automatica.equalsIgnoreCase("si"))
            {
                cortaAutomatica = true;
            }
            else
            {
                cortaAutomatica = false;
            }


            corta = new Corta(calibre, alcance, marca, calibre, estado,  policia, cortaAutomatica);

            if(corta.enCondicion() == true)
            {
                System.out.println(corta.toString() +  " y NO esta en condiciones");
            }
            else {
                System.out.println(corta.toString() +  " y SI esta en condiciones");
            }


        }else if (tipoArma.equalsIgnoreCase("Larga"))
        {
            System.out.println("Ingrese una justificación de uso de arma larga 1 ");
            String justificacion1 = sc.nextLine();

            System.out.println("Ingrese el nivel del arma 1 entre 1 y 5:");
            int nivelArma1 = sc.nextInt();
            sc.nextLine();

            System.out.println("Tiene sello el arma 1? si/no");
            String sello1 = sc.nextLine();

            boolean tieneSello1;
            if(sello1.equalsIgnoreCase("si")) {
                tieneSello1 = true;
            }
            else
            {
                tieneSello1 = false;
            }

            larga1 = new Larga(calibre, alcance, marca, calibre, estado,policia, justificacion1, nivelArma1, tieneSello1);

            System.out.println("Ingrese una justificación de uso de arma larga 2 ");
            String justificacion2 = sc.nextLine();

            System.out.println("Ingrese el nivel del arma 2 entre 1 y 5: ");
            int nivelArma2 = sc.nextInt();
            sc.nextLine();

            System.out.println("Tiene sello el arma 2? si/no");
            String sello = sc.nextLine();

            boolean tieneSello2;
            if(sello.equalsIgnoreCase("si")) {
                 tieneSello2 = true;

            }
            else
            {
                tieneSello2 = false;
            }


                larga2 = new Larga(calibre, alcance, marca, calibre, estado, policia, justificacion2, nivelArma2, tieneSello2);


        }



        // Comparar las dos armas largas

        if (larga1 != null && larga2 != null) {
            int resultadoComparacion = larga1.compareTo(larga2);

            if (resultadoComparacion > 0) {
                System.out.println("El arma larga 1 tiene mayor nivel que el arma larga 2.Asi que se asigna arma 1");
                if(larga1.enCondicion() == true)
                {
                    System.out.println(larga1.toString() + "y SI esta en condiciones");
                }
                else
                {
                    System.out.println(larga1.toString() + "pero NO esta en condiciones");
                }


            } else if (resultadoComparacion < 0) {
                System.out.println("El arma larga 2 tiene mayor nivel que el arma larga 1. Asi que se asigna arma 2");

                if(larga2.enCondicion() == true)
                {
                    System.out.println(larga2.toString() + "y SI esta en condiciones");
                }
                else
                {
                    System.out.println(larga2.toString() + "pero NO esta en condiciones");
                }


            } else {
                System.out.println("Ambas armas largas tienen el mismo nivel. Ingrese el arma que desea asignar 1 o 2");
                int numArma = sc.nextInt();

                if (numArma == 1) {

                    if(larga1.enCondicion() == true)
                    {
                        System.out.println(larga1.toString() +"\n" + "y SI esta en condiciones de ser usada en un enfrentamiento");
                    }
                    else
                    {
                        System.out.println(larga1.toString() +"\n" + "pero NO esta en condiciones de ser usada en un enfrentamiento");
                    }

                } else if (numArma == 2) {

                    if(larga2.enCondicion() == true)
                    {
                        System.out.println(larga2.toString() +"\n" + "y SI esta en condiciones de ser usada en un enfrentamiento");
                    }
                    else
                    {
                        System.out.println(larga2.toString() +"\n" + "pero NO esta en condiciones de ser usada en un enfrentamiento");
                    }
                }

            }
        }

    }
}