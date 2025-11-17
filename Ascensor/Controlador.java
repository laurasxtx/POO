public class Controlador {
    // *el controlador gestiona las interraciones entre los componentes
    private Boton boton; //*Boton presionado  */
    private Puerta puerta;//*puerta actual, puede ser o la puerta piso o la puerta Ascensor */
    private Piso piso;//*piso donde se encuentra  */

    //* constructor para poder inicializar la clase Controlador
    public Controlador() {
    }

    //* metodos para que el ascensor suba a un piso especifico
    public void subir(int piso) {
        // lógica para subir a un piso
        System.out.println("Subiendo al piso " + piso);
    }
    //*metodo para que el ascensor baje a un piso especifico */
    public void bajar(int piso) {
        // lógica para bajar a un piso
        System.out.println("Bajando al piso " + piso);
    }
    //*metodo para que el ascensor abra puertas  */
    public void abrirPuerta() {
        if (puerta != null) {
            puerta.abrir();
        } else {
            System.out.println("No hay puerta asociada.");
        }
    }
    //*metodo para que el ascensor cierre puertas */
    public void cerrarPuerta() {
        if (puerta != null) {
            puerta.cerrar();
        } else {
            System.out.println("No hay puerta asociada.");
        }
    }
    //*metodo para que el ascensor se detenga */
    public void detener() {
        // lógica para detener el ascensor
        System.out.println("Ascensor detenido.");
    }

    // Getters y setters para boton, puerta, piso

    public Boton getBoton() {
        return boton;
    }

    public void setBoton(Boton boton) {
        this.boton = boton;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }
}
