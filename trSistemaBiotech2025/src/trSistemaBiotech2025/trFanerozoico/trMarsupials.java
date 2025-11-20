package trSistemaBiotech2025.trFanerozoico;

public class trMarsupials extends trMammals {

    // Refactorización: No hay variables aqui ya que se lo hereda del padre.

    public trMarsupials(String nombre, Boolean aptoMutar, String colorPelaje) {
        super();
        setTrNombre(nombre);
        setTrAptoMutar(aptoMutar);
        setTrColorPelaje(colorPelaje);
        setTrTieneMano(true);
    }

    @Override
    public void trSaludar() {
        System.out.println("El marsupial " + getTrNombre() + " saluda a Robinson Tandazo.");
    }

    public void trMostrarInfo(String trNombre, Boolean trAptoMutar, String trColorPelaje){
        System.out.println("El marsupial a analizar tiene los siguientes datos:");
        System.out.println("Nombre: " + getTrNombre());
        if (getTrAptoMutar()){
            System.out.println("Apto para mutar: SI" );
        }else{
            System.out.println("Apto para mutar: NO" );
        }
        System.out.println("Color del pelaje: " + getTrColorPelaje());
        
    }

    // Refactorización: Se añadio el metodo para imprimir la jerarquia de las clases.

    @Override
    public void trMostrarJerarquia() {
        super.trMostrarJerarquia();
        System.out.println(" ooooooO Marsupials");
    }

}
