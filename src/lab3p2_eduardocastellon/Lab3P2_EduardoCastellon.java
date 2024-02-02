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
                    crearPokemon();
                    break;
                }
                case 2:{
                    crearPokeball();
                    break;
                }
            }
        }//fin while menu
    }//fin main
    
    public static void crearPokeball(){
        Scanner lea = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        boolean menuCreacion = true;

         System.out.println("|-------------------|\n"
                + "|   Creacion de Pokeballs   |\n"
                + "|-------------------|\n");
         
        while (menuCreacion) {
            System.out.println("Ingrese color ");
        }
    }
    
    public static void crearPokemon() {
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
                menuCreacion = false;

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
                    } else if (resp.equalsIgnoreCase("no")) {
                        respirar = false;
                    } else {
                        System.out.println("Ingrese respuesta valida");
                    }
                } while (respirar);
                
                System.out.println("Ingrese velodcidad de nado: ");
                int nado = lea.nextInt();
                pokemones.add((WaterType) new WaterType(nombre, numDex, naturaleza, valiresp, respirar, nado));
                menuCreacion = false;

            } else if (tipo.equalsIgnoreCase("planta")) {
                System.out.println("Nombre del pokemon: ");
                String nombre = lea.next();
                System.out.println("Ingrese el numero de pokedex: ");
                int numDex = entrada.nextInt();
                System.out.println("Naturaleza del pokemon(Timido, Energetico, Misterioso)");
                String naturaleza = lea.next();
                
                System.out.println("Ingrese el habitad:  ");
                String habitad = lea.next();
                System.out.println("Ingrese dominio sobre las planta[#]: ");
                int domPlanta = entrada.nextInt(); 
                pokemones.add((GrassType) new GrassType(nombre, numDex, naturaleza, menuCreacion, habitad, domPlanta));
                menuCreacion = false;
                
            } else {
                System.out.println("El tipo no es valido");
            }
        }
    }

}
