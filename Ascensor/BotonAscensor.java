public class BotonAscensor extends Boton {
    private String seleccionarPiso;
    public BotonAscensor(int piso, String seleccionarPiso) {
        super(piso);
        this.seleccionarPiso = seleccionarPiso;
    }
    @Override
    public void presionar() {
        super.presionar();
        // lógica adicional si es necesario
    }
}