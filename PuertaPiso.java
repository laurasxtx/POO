public class PuertaPiso extends Puerta {
    private int numeroPiso;
    public PuertaPiso(int numeroPiso) {
        super();
        this.numeroPiso = numeroPiso;
    }
    public void imprimirPiso() {
        System.out.println("Piso número: " + numeroPiso);
    }
}
