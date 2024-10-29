import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static Policia policia1 = new Policia("José", "Perez", 123);
    static Policia policia2 = new Policia("Pedro", "Torres", 456);
    static Policia policia3 = new Policia("Tomás", "Lopez", 789);

    static ArrayList<Corta>  listaCorta = new ArrayList<>();


    static Larga larga1 = new Larga(11, 190, "Toyota", 8, "En uso", policia2, "Arma nueva", 4, true);
    static Larga larga2 = new Larga(12, 300, "Lenovo", 6, "En uso", policia3, "Arma en buen estado", 3, false);

    static ArrayList<Larga> listaLarga = new ArrayList<>();

    public static void main(String[] args) {

        listaCorta.add(new Corta(10, 210, "Fiat", 9, "en uso",policia1, true));

        listaLarga.add(new Larga(11, 190, "Toyota", 8, "En uso", policia2, "Arma nueva", 4, true));
        listaLarga.add(larga2);

        System.out.println(listaLarga.getClass().getName());

        MenuOpciones();



    }


    private static void MenuOpciones() {

        System.out.println("Menu principal:");
        System.out.println("1. Mostrar listado de armas cortas");
        System.out.println("2. Mostrar listado de armas largas");
        System.out.println("3. Agregar Arma");
        System.out.println("4. Comparar armas largas");
        System.out.println("5. Salir");
        System.out.print("Ingresa tu elección: ");


        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:

                   System.out.println("Hay "+ listaCorta.size()+ " arma/s cortas: \n");

                    for (int i = 0; i <= listaCorta.size()-1; i++) {

                        if(listaCorta.get(i).enCondicion() == true) {
                            System.out.println("Arma corta numero " + (i + 1) + ": " + listaCorta.get(i).toString()
                            + " y SI esta en condiciones");
                        }else
                        {

                                System.out.println("Arma corta numero " + (i + 1) + ": " + listaCorta.get(i).toString()
                                        + " y NO esta en condiciones");

                        }

                    }
                    MenuOpciones();
                    break;
            case 2:

                System.out.println("Hay "+ listaLarga.size()+ " arma/s largas: \n");

                for (int i = 0; i <= listaLarga.size()-1; i++)
                {
                    if(listaLarga.get(i).enCondicion() == true) {

                        System.out.println("Arma larga numero " + (i + 1) + ": " + listaLarga.get(i).toString()
                        + " y SI esta en condiciones de ser usada");
                    }
                    else
                    {
                        System.out.println("Arma larga numero " + (i + 1) + ": " + listaLarga.get(i).toString()
                                + " y NO esta en condiciones de ser usada");
                    }
                }
                MenuOpciones();

                break;
            case 3:

                AgregarArma();
                break;

            case 4:

                System.out.println("Hay "+ listaLarga.size()+ " arma/s largas: \n");
                System.out.println("Ingrese el número de la primer arma del 1 al "+ (listaLarga.size())+ " para compararlas" );
                int option2 = scanner.nextInt();

                scanner.nextLine();

                Larga ll1 = null;

                if (option2 >= 1 && option2 <= listaLarga.size()) {
                     ll1 = listaLarga.get(option2-1); // resto 1 a option2 para q se pueda tomar el elemento 0

                }


                System.out.println("Ingrese el número de la segunda arma del 1 al "+ listaLarga.size() + " sin repetir num");
                int option3 = scanner.nextInt();

                scanner.nextLine();

                if(option3 == option2){
                    System.out.println("Los números de las armas ingresados son iguales");
                    break;

                }

                Larga ll2= null;

                if (option3 >= 1 && option3 <= listaLarga.size()) {
                     ll2 = listaLarga.get(option3-1);

                }

                CompararArmasLargas(ll1, ll2);



                break;
            case 5:
                System.out.println("Saliendo...");
                return;

            default:
                System.out.println("Debe ingresar un numero entre 1 y 5, el programa se cerrara");
        }

        scanner.close();


    }


    private static void AgregarArma() {

        System.out.println("Ingrese que tipo de Arma desea ingresar: ");
        System.out.println("1. Agregar Arma CORTA");
        System.out.println("2. Agregar Arma LARGA");


        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                AgregarArmaCorta();
                break;
            case 2:
                AgregarArmaLarga();
                break;


            default:
                System.out.println("Debe ingresar un numero entre 1 y 2, el programa se cerrara");
        }


    }

    private static void AgregarArmaCorta() {

        System.out.println("Ingrese la cantidad de municiones del arma: ");
        int cantMuniones = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el alcance del arma: ");
        double alcance = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la marca del arma: ");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el calibre del arma: ");
        int calibre = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la estado del arma: ");
        String estado = scanner.nextLine();

        System.out.println("Es automatica? si/no");
        String automatica = scanner.nextLine();

        boolean cortaAutomatica;

        if (automatica.equalsIgnoreCase("si")) {
            cortaAutomatica = true;
        } else {
            cortaAutomatica = false;
        }


        listaCorta.add(new Corta(calibre, alcance, marca, calibre, estado, policia2, cortaAutomatica));

        MenuOpciones();

    }


    private static void AgregarArmaLarga() {

        System.out.println("Ingrese la cantidad de municiones del arma: ");
        int cantMuniones = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el alcance del arma: ");
        double alcance = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese la marca del arma: ");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el calibre del arma: ");
        int calibre = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la estado del arma: \n");
        System.out.println("1. NUEVA");
        System.out.println("2. EN MANTENIMIENTO");
        System.out.println("3. EN USO");
        int est = scanner.nextInt();
        scanner.nextLine();

        String estado= "";
        switch (est)
        {
            case 1:
                estado = "NUEVA";
                break;
            case 2:
                estado = "EN MANTENIMIENTO";
                break;
            case 3:
                estado = "EN USO";
                break;
            default:
                System.out.println("Debe ingresar un numero entre 1 y 3, el programa se cerrara");
        }

        System.out.println("Ingrese una justificación de uso de arma larga ");
        String justificacion1 = scanner.nextLine();

        System.out.println("Ingrese el nivel del arma larga entre 1 y 5:");
        int nivelArma1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tiene sello el arma 1? si/no");
        String sello1 = scanner.nextLine();

        boolean tieneSello1;
        if (sello1.equalsIgnoreCase("si")) {
            tieneSello1 = true;
        } else {
            tieneSello1 = false;
        }

        System.out.println("Ingrese el num de el policía que la va a portar,");
        System.out.println("1. Policía 1");
        System.out.println("2. Policía 2");
        System.out.println("3. Policía 3");
        int poli = scanner.nextInt();
        scanner.nextLine();

        Policia policia = null;
        switch (poli)
        {
            case (1):
                policia = policia1;
                break;

            case (2):
                policia = policia2;
                break;

            case (3):
                policia = policia3;
                break;

        }

        listaLarga.add(new Larga(calibre, alcance, marca, calibre, estado, policia, justificacion1, nivelArma1, tieneSello1));

        //System.out.println(listaLarga.get(listaLarga.size()-1));
         if(listaLarga.getLast().enCondicion() == true)
         {

             System.out.println("ARMA INGRESADA: \n " + listaLarga.getLast().toString() + " y SI esta en condiciones de ser usada");
         }
         else {
             System.out.println("ARMA INGRESADA: \n " + listaLarga.getLast().toString() + " y NO esta en condiciones de ser usada");
         }

        MenuOpciones();

    }


    private static void CompararArmasLargas(Larga l1, Larga l2) {


        if (l1 != null && l2 != null) {
            int resultadoComparacion = l1.compareTo(l2);

            if (resultadoComparacion > 0) {
                System.out.println("La primer arma ingresada tiene mayor nivel que la segunda ingresada.");
                if (l1.enCondicion() == true) {
                    System.out.println(l1.toString() + "y SI esta en condiciones");
                } else {
                    System.out.println(l1.toString() + "pero NO esta en condiciones");
                }


            } else if (resultadoComparacion < 0) {
                System.out.println("La segunda arma ingresada tiene mayor nivel que la primera");

                if (l2.enCondicion() == true) {
                    System.out.println(l2.toString() + "y SI esta en condiciones");
                } else {
                    System.out.println(l2.toString() + "pero NO esta en condiciones");
                }

            }


        }else
        {
            System.out.println("Los elementos son nulos");
        }


    }
}