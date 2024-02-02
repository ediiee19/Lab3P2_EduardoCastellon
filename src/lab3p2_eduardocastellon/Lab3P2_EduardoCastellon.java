package lab3p2_eduardocastellon;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_EduardoCastellon {

    public static ArrayList<Pokemon> pokemones = new ArrayList();
    public static ArrayList<Pokeball> balls = new ArrayList();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("|-------------------|\n"
                + "|      POKEMON      |\n"
                + "|-------------------|\n");
        boolean menu = true;
        while (menu) {
            System.out.println("---Menu---\n"
                    + "1. Crear Pokemon\n"
                    + "2. Crear Pokebala\n"
                    + "3. Listar Pokemon\n"
                    + "4. Eliminar Pokemon\n"
                    + "5. Capturar Pokemon\n"
                    + "6. Modificar Pokemon\n"
                    + "preiosna [7] para salir");
            int opc = entrada.nextInt();

            switch (opc) {
                case 7: {
                    System.out.println("Saliendo del sistema...");
                    menu = false;
                    break;
                }
                case 1: {
                    creacion();
                    break;
                }

            }
        }//fin while menu
    }//fin main

    public static void creacion() {
        Scanner lea = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        boolean menuCreacion = true;

        while (menuCreacion) {
            System.out.println("Que tipo de pokemon desea crear? (Fuego / Agua / Planta)");
            String tipo = lea.next();
            if (tipo.equalsIgnoreCase("fuego")) {
                System.out.println("Nombre del pokemon: ");
                String nombre = lea.next();
                System.out.println("Ingrese el numero de pokedex: ");
                int numDex = entrada.nextInt();
                System.out.println("Naturaleza del pokemon(Timido, Energetico, Misterioso)");
                String naturaleza = lea.next();
                System.out.println("Ingresar potencia de llama: ");
                int pot = entrada.nextInt();
                pokemones.add((FireType) new FireType(nombre, numDex, naturaleza, menuCreacion, pot));

            } else if (tipo.equalsIgnoreCase("agua")) {
                System.out.println("Nombre del pokemon: ");
                String nombre = lea.next();
                System.out.println("Ingrese el numero de pokedex: ");
                int numDex = entrada.nextInt();
                System.out.println("Naturaleza del pokemon(Timido, Energetico, Misterioso)");
                String naturaleza = lea.next();

                System.out.println("Puede respirar vivir fuera del agua?[si/no]: ");
                String resp = lea.next();

                boolean respirar = false;
                boolean valiresp = true;
                do {
                    if (resp.equalsIgnoreCase("si")) {
                        respirar = true;
                        respirar = false;
                    } else if (resp.equalsIgnoreCase("no"))  {
                        respirar = false;
                    } else {
                        System.out.println("Ingrese respuesta valida");
                    }
git a                } while (respirar);

            } else if (tipo.equalsIgnoreCase("planta")) {

            } else {
                System.out.println("El tipo no es valido");
            }
        }
    }

}
