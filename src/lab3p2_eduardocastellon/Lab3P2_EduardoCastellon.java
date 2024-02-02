package lab3p2_eduardocastellon;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_EduardoCastellon {

    public static ArrayList<Pokemon> pokemones = new ArrayList();
    public static ArrayList<Pokeball> balls = new ArrayList();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner lea = new Scanner(System.in);
        
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
            
            switch(opc){
                case 7:{
                    System.out.println("Saliendo del sistema...");
                    menu = false;
                    break;
                }
                
            }
        }

    }

}
