package trSistemaBiotech2025;

import trSistemaBiotech2025.trFanerozoico.trMammals;
import trSistemaBiotech2025.trFanerozoico.trMarsupialsMutado;

public class trTanqueDeMutacion  {

    public trMarsupialsMutado mutarMarsupial(trMammals marsupial) {

        if (!marsupial.getTrAptoMutar()) {
            System.out.println("El espécimen NO está apto para mutar.");
            return null;
        }

        System.out.println("Iniciando proceso de mutación...");

        int maximo = 1000;
        int valor = (int)(Math.random() * 901 + 100);
        mostrarBarraDeCarga(valor, maximo);
        
        System.out.println("Mutación exitosa!");

        trMarsupialsMutado mutado = new trMarsupialsMutado();

        return mutado;
    }

    // Refactorización: Se añadio el método de la barra de carga.
    
    private void mostrarBarraDeCarga(int valor, int maximo) {

        int progreso = (valor * 20) / maximo; 

        System.out.print("[");

        for (int pos = 0; pos < 20; pos++) {
            if (pos < progreso) {
                System.out.print("#"); 
            } else {
                System.out.print("-");
            }
        }

        System.out.println("] " + valor + " de " + maximo);
    }

}
