public class BotonPiso extends Boton {
    private boolean subir;
    private boolean bajar;
    public BotonPiso(int piso, boolean subir, boolean bajar) {
        super(piso);
        this.subir = subir;
        this.bajar = bajar;
    }
    @Override
    public void presionar() {
        super.presionar();
        if (subir) {
            mensajeSubiendo();
        } else if (bajar) {
            mensajeBajando();
        }
    }
    public void mensajeSubiendo() {
        System.out.println("Ascensor subiendo.");
    }
    public void mensajeBajando() {
        System.out.println("Ascensor bajando.");
    }
}
