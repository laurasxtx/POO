public class BotonAscensor extends Boton {
    //*boton que esta adentro del asensor y permite seleccionar el piso */
    private String seleccionarPiso;//*piso que se selecciona dentro del ascensor */
    public BotonAscensor(int piso, String seleccionarPiso) {
        super(piso);
        this.seleccionarPiso = seleccionarPiso;
    }
    //*metodo al presionar el boton en el ascensor */
    @Override
    public void presionar() {
        super.presionar();
        
    }
}