package trSistemaBiotech2025.trProterozoico;

public abstract class trTetrapoda extends trSarcopterygii {

    // Refactorización: Se añadio el metodo para imprimir la jerarquia de las clases.

    @Override
    public void trMostrarJerarquia() { // Refactorización: El metodo sin parametro ya que se borro la variable nombreCientifico.
        super.trMostrarJerarquia();
        System.out.println(" oooOooo Tetrapoda");
    }
}
