public class PuertaPiso extends Puerta {
    //*puerta ubicada en un piso especifico */
    private int numeroPiso;
    public PuertaPiso(int numeroPiso) {
        super();
        this.numeroPiso = numeroPiso;
    }

    //*metodo para imprimir el numero de piso en el que esta la puerta */
    public void imprimirPiso() {
        System.out.println("Piso número: " + numeroPiso);
    }
}
