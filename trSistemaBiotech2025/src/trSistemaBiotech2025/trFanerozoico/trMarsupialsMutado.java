package trSistemaBiotech2025.trFanerozoico;

public class trMarsupialsMutado {

    private String nuevoNombre;
    private String claseGenerada;

    public trMarsupialsMutado() {
        this.nuevoNombre = "TandazoRobinson";
        this.claseGenerada = "Marsupial" + this.nuevoNombre;
    }

    public void mostrarInfoMutacion() {
        System.out.println("La nueva clase generada es: " + claseGenerada);
        System.out.println("El espécimen ha mutado correctamente.");
    }

    public String getClaseGenerada() {
        return claseGenerada;
    }
}

