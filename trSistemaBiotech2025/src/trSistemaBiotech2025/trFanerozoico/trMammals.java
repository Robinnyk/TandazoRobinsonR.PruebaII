package trSistemaBiotech2025.trFanerozoico;

import trSistemaBiotech2025.trProterozoico.trAmniota;

public abstract class trMammals extends trAmniota {

    // Refactorización: Me confundí en el UML, y puse los atributos en la clase hijo en vez de la clase padre.

    protected String trNombre;          
    private String trColorPelaje;
    private Boolean trTieneMano;
    private Boolean trAptoMutar;

    public String getTrNombre() {
        return trNombre;
    }

    public void setTrNombre(String trNombre) {
        this.trNombre = trNombre;
    }

    public String getTrColorPelaje() {
        return trColorPelaje;
    }

    public void setTrColorPelaje(String trColorPelaje) {
        this.trColorPelaje = trColorPelaje;
    }

    public Boolean getTrTieneMano() {
        return trTieneMano;
    }

    public void setTrTieneMano(Boolean trTieneMano) {
        this.trTieneMano = trTieneMano;
    }

    public Boolean getTrAptoMutar() {
        return trAptoMutar;
    }

    public void setTrAptoMutar(Boolean trAptoMutar) {
        this.trAptoMutar = trAptoMutar;
    }

    public void trSaludar(){
        System.out.println("El especimen " + trNombre + " hace un saludo general a TODOS.");
    }

    // Refactorización: Se añadio el metodo para imprimir la jerarquia de las clases.

    @Override
    public void trMostrarJerarquia() {
        super.trMostrarJerarquia();
        System.out.println(" oooooOo Mammals");
    }
}
