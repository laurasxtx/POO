public class BotonPiso extends Boton {
    //*este es el boton que esta ubicado en un piso especifico, con la opcion de poder subir o bajar */ 
    private boolean subir;//* este indica si es boton para subir */ 
    private boolean bajar;//* este indica si es boton para bajar */

    //* este es el constructor que recibe el piso y si es boton de subir o bajar */
    public BotonPiso(int piso, boolean subir, boolean bajar) {
        super(piso);
        this.subir = subir;
        this.bajar = bajar;
    }

    //*al presionar el boton cambia el estado y muestra el mensaje*/
    @Override
    public void presionar() {
        super.presionar();
        if (subir) {
            mensajeSubiendo();
        } else if (bajar) {
            mensajeBajando();
        }
    }

    //* mensajes que indican que el ascensor va a subir o va a bajar */
    public void mensajeSubiendo() {
        System.out.println("Ascensor subiendo.");
    }
    public void mensajeBajando() {
        System.out.println("Ascensor bajando.");
    }
}
