package lab3p2_eduardocastellon;

import java.util.ArrayList;
import java.util.Random;
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
                    + "2. Crear Pokeball\n"
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
                case 2: {
                    crearPokeball();
                    break;
                }
                case 3: {
                    ordenarListar();// no sirvio el ordenar entonces solo liste para no perder tiempo
                    break;
                }
                case 4: {
                    eliminar();
                    break;
                }
                case 5: {
                    capturar();
                    break;
                }
                case 6: {
                    System.out.println("No pudo se implementado a tiempo");
//                    modificar();
                    break;
                }
            }
        }//fin while menu
    }//fin main

    public static void modificar() {
        Scanner lea = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Que tipo de pokemon desea modificar? (Fuego / Agua / Planta");
        String tipo = lea.next();
        int indice = 0;
        if (tipo.equalsIgnoreCase("fuego")) {

            for (Pokemon f : pokemones) {
                if (f instanceof FireType) {
                    System.out.println(indice + ". " + f.toString());
                }
                indice++;
            }
            System.out.println("Ingrese el indice del pokemon: ");
            int pokIndice = lea.nextInt();
            if (pokIndice < pokemones.size() && pokIndice >= 0) {
                if (pokemones.get(pokIndice) instanceof FireType) {
                    
                    System.out.println("Que desea editar?\n"
                            + "1. Nombre\n"
                            + "2. Numero de pokedex\n"
                            + "3. Potencia de llamas");
                    int opc = entrada.nextInt();
                    switch(opc){
                        case 1:{
                            System.out.println("Ingrese nuevo nombre: ");
                            String nombre = lea.next();
                            pokemones.get(pokIndice).setNombre(nombre);               
                            System.out.println("Se ha modificado exitosamente!");
                            break;
                        }
                        case 2:{
                            System.out.println("Ingrese nuevo numero: ");
                            int numDex = entrada.nextInt();
                            pokemones.get(pokIndice).setNumDex(numDex);
                            System.out.println("Se ha modificado correctamente");
                            break;
                        }   
                        case 3:{
                            System.out.println("Que potencia desea agregarle: ");
//                            int pot = entrada.nextInt();
//                            pokemones.get(pokIndice).set
                        }
                    }
                    
                } else {
                    System.out.println("ingrese un indice valido");
                }
            }else{
                System.out.println("Ingrese un indice valido");
            }

        } else if (tipo.equalsIgnoreCase("agua")) {

            for (Pokemon f : pokemones) {
                if (f instanceof WaterType) {
                    System.out.println(indice + ". " + f.toString());
                }
                indice++;
            }
            System.out.println("Ingrese el indice del pokemon: ");
            int pokIndice = lea.nextInt();
            if (pokIndice < pokemones.size() && pokIndice >= 0) {
                if (pokemones.get(pokIndice) instanceof FireType) {

                } else {
                    System.out.println("ingrese un indice valido");
                }
            }else{
                System.out.println("Ingrese un indice valido");
            }

        } else if (tipo.equalsIgnoreCase("planta")) {

            for (Pokemon f : pokemones) {
                if (f instanceof GrassType) {
                    System.out.println(indice + ". " + f.toString());
                }
                indice++;
            }
            System.out.println("Ingrese el indice del pokemon: ");
            int pokIndice = lea.nextInt();
            if (pokIndice < pokemones.size() && pokIndice >= 0) {
                if (pokemones.get(pokIndice) instanceof FireType) {

                } else {
                    System.out.println("ingrese un indice valido");
                }
            }else{
                System.out.println("Ingrese un indice valido");
            }

        } else {
            System.out.println("Ingrese un tipo valido");
        }

    }

    public static void capturar() {
        Scanner lea = new Scanner(System.in);
        Random r = new Random();
        if (balls.size() > 0) {
            if (pokemones.size() > 0) {
                int indice = 0;
                for (Pokeball ball : balls) {
                    System.out.println(indice + ". " + ball.toString());
                    indice++;
                }
                System.out.println("Elija una pokebola: ");
                int opc = lea.nextInt();
                if (opc < balls.size()) {

                    boolean encuentro = true;
                    while (encuentro) {
                        int randomPoke = 0 + r.nextInt(pokemones.size());
                        System.out.println("EL POKEMON " + pokemones.get(randomPoke).getNombre() + " HA APARECIDO!");
                        System.out.println("que desa hacer?(escriba la accion)\n"
                                + "- capturar\n"
                                + "- huir\n");
                        String accion = lea.next();
                        if (accion.equalsIgnoreCase("capturar")) {

                            int probCaptura = r.nextInt(3);
                            if (balls.get(opc).getEfi() == probCaptura || probCaptura < balls.get(opc).getEfi()) {
                                System.out.println("El pokemon ha sido capturado!");
                                pokemones.get(randomPoke).setBall(balls.get(opc));
                                balls.remove(opc);
                                encuentro = false;
                            } else {
                                System.out.println("El pokemon no ha sido capturado\n"
                                        + "-1 pokebola\n");
                                balls.remove(opc);
                                encuentro = false;
                            }

                        } else if (accion.equalsIgnoreCase("huir")) {
                            System.out.println("Se ha huido del encuentro");
                            encuentro = false;
                            break;
                        } else {
                            System.out.println("Ingrese una accion valida");
                        }
                    }
                } else {
                    System.out.println("Ingrese un indice valido");
                }
            } else {
                System.out.println("No hay pokemones creados");
            }
        } else {
            System.out.println("No hay pokebolas");
        }
    }

    public static void eliminar() {
        Scanner lea = new Scanner(System.in);
        System.out.println("Que tipo de pokemon desea eliminar? (Fuego / Agua / Planta)");
        String tipo = lea.next();
        int indice = 0;
        if (tipo.equalsIgnoreCase("fuego")) {
            for (Pokemon f : pokemones) {
                if (f instanceof FireType) {
                    System.out.println(indice + ". " + f.toString());
                }
                indice++;
            }
            System.out.println("Ingrese el indice del pokemon: ");
            int pokIndice = lea.nextInt();
            if (pokIndice < pokemones.size()) {
                if (pokemones.get(pokIndice) instanceof FireType) {
                    pokemones.remove(pokIndice);
                    System.out.println("Se ha eliminado correctamente");
                } else {
                    System.out.println("ingrese indice valido");
                }
            } else {
                System.out.println("Ingrese indice valido");
            }

        } else if (tipo.equalsIgnoreCase("agua")) {
            for (Pokemon f : pokemones) {
                if (f instanceof WaterType) {
                    System.out.println(indice + ". " + f.toString());
                }
                indice++;
            }
            System.out.println("Ingrese el indice del pokemon: ");
            int pokIndice = lea.nextInt();
            if (pokIndice < pokemones.size()) {
                if (pokemones.get(pokIndice) instanceof WaterType) {
                    pokemones.remove(pokIndice);
                    System.out.println("Se ha eliminado correctamente");
                } else {
                    System.out.println("ingrese un numero valido");
                }
            } else {
                System.out.println("Ingrese un indice valido");
            }

        } else if (tipo.equalsIgnoreCase("planta")) {
            for (Pokemon f : pokemones) {
                if (f instanceof GrassType) {
                    System.out.println(indice + ". " + f.toString());
                }
                indice++;
            }
            System.out.println("Ingrese el indice del pokemon: ");
            int pokIndice = lea.nextInt();
            if (pokIndice < pokemones.size()) {
                if (pokemones.get(pokIndice) instanceof GrassType) {
                    pokemones.remove(pokIndice);
                    System.out.println("Se ha eliminado correctamente");
                } else {
                    System.out.println("ingrese un numero valido");
                }
            } else {
                System.out.println("Ingrese indice valido");
            }
        } else {
            System.out.println("Ingrese un tipo valido");
        }
    }

    public static void ordenarListar() {
        int indice = 0;
        for (Pokemon f : pokemones) {
            System.out.println(indice + ". " + f.toString());
            indice++;
        }
    }

    public static void crearPokeball() {
        Scanner lea = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese color ");
        String color = lea.nextLine();
        System.out.println("Ingrese numero de serie: ");
        int numSerie = entrada.nextInt();
        int efi;
        boolean vali = true;
        do {
            System.out.println("Ingrese eficiancia de bola");
            efi = entrada.nextInt();
            if (efi > 3 || efi < 1) {
                System.out.println("Ingrese eficienza valida");
            } else {
                vali = false;
            }
        } while (vali);
        balls.add((Pokeball) new Pokeball(color, numSerie, efi));
        System.out.println("Ball creada!\n");
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

                pokemones.add((FireType) new FireType(nombre, numDex, naturaleza, false, pot));
                System.out.println("Pokemon creado!\n");
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
                pokemones.add((WaterType) new WaterType(nombre, numDex, naturaleza, false, respirar, nado));
                System.out.println("Pokemon creado!\n");
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
                pokemones.add((GrassType) new GrassType(nombre, numDex, naturaleza, false, habitad, domPlanta));
                System.out.println("Pokemon creado!\n");
                menuCreacion = false;

            } else {
                System.out.println("El tipo no es valido");
            }
        }
    }
}
