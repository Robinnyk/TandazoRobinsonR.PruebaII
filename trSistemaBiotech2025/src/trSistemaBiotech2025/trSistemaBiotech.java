package trSistemaBiotech2025;

import java.util.Scanner;
import trSistemaBiotech2025.trFanerozoico.trMarsupials;
import trSistemaBiotech2025.trFanerozoico.trMarsupialsMutado;

public class trSistemaBiotech {
   
    public void inicializar(){
        
        Scanner sc = new Scanner(System.in);
        trMarsupials marsupial1 = null;

        System.out.println("--------------------------------------------------");
        System.out.println("              Bienvenido al programa              ");
        System.out.println("--------------------------------------------------");

        int opc, opcRep;
        String nombre = "", pelaje = "", aptoParaMutar = "";
        Boolean apto = false;

        do {
            do {
                System.out.println();
                System.out.println("--------------------------------------------------");
                System.out.println("Por favor, ingrese la opción deseada:");
                System.out.println("(1) Registrar un marsupial");
                System.out.println("(2) Analizar las caracterísicas del marsupial");
                System.out.println("(3) Mostrar la línea de tiempo del marsupial");
                System.out.println("(4) Interactuar con el marsupial");
                System.out.println("(5) Ingresar al animal en el tanque de mutación");
                System.out.println("--------------------------------------------------");

                opc = sc.nextInt();
                sc.nextLine(); 
                System.out.println();

            } while (opc < 1 || opc > 5);

            switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre del marsupial: ");
                nombre = sc.nextLine();

                System.out.println("Ingrese si está apto para mutar (si/no): ");
                aptoParaMutar = sc.nextLine();

                if (aptoParaMutar.equalsIgnoreCase("si")) {
                    apto = true;
                } else {
                    apto = false;
                }

                System.out.println("Ingrese el color del pelaje:");
                pelaje = sc.nextLine();

                marsupial1 = new trMarsupials(nombre, apto, pelaje);
                break;

            case 2:
                if (marsupial1 == null) {
                    System.out.println("No hay ningun marsupial registrado aún.");
                } else {
                    marsupial1.trMostrarInfo(nombre, apto, pelaje);
                }
                break;

            case 3:
                if (marsupial1 == null){
                    System.out.println("No hay nignun marsupial registrado, por tanto no hay linea de tiempo.");
                }else {
                    System.out.println("Esta es la línea de tiempo del marsupial: ");
                    marsupial1.trMostrarJerarquia();
                }
                break;

            case 4:
                if (marsupial1 == null) {
                    System.out.println("Error al interactuar, no se ha registrado ningun marsupial.");
                } else {
                    marsupial1.trSaludar();
                }
                break;

            case 5:
                if (marsupial1 == null) {
                    System.out.println("No hay marsupial registrado.");
                    break;
                } 

                trTanqueDeMutacion tanque = new trTanqueDeMutacion();
                trMarsupialsMutado nuevoMutante = tanque.mutarMarsupial(marsupial1);

                if (nuevoMutante != null) {
                    nuevoMutante.mostrarInfoMutacion();
                    System.out.println("Clase generada: " + nuevoMutante.getClaseGenerada());
                }
                
                break;
            }

            System.out.println();
            System.out.println("Si desea seleccionar otra operacion digite 1.");
            opcRep = sc.nextInt();
            sc.nextLine(); 

        } while (opcRep == 1);

    }

    // Refactorización: Se añadió el mostrar la linea de tiempo en todas las clases, más no en el controller.
    
}
