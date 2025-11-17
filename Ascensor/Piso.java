public class Piso {
    private int numeroPiso;
    public Piso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
    public void llamarElevador() {
        System.out.println("Elevador llamado en el piso " + numeroPiso);
        // Aquí se agregaría la lógica para enviar la llamada al controlador
    }
    // Getter
    public int getNumeroPiso() {
        return numeroPiso;
    }
    // Setter (opcional)
    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
}
