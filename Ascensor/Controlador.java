public class Controlador {
    private Boton boton;
    private Puerta puerta;
    private Piso piso;

    // Constructor vacio o con parámetros si se desea
    public Controlador() {
    }

    // Métodos indicados en el diagrama
    public void subir(int piso) {
        // lógica para subir a un piso
        System.out.println("Subiendo al piso " + piso);
    }

    public void bajar(int piso) {
        // lógica para bajar a un piso
        System.out.println("Bajando al piso " + piso);
    }

    public void abrirPuerta() {
        if (puerta != null) {
            puerta.abrir();
        } else {
            System.out.println("No hay puerta asociada.");
        }
    }

    public void cerrarPuerta() {
        if (puerta != null) {
            puerta.cerrar();
        } else {
            System.out.println("No hay puerta asociada.");
        }
    }

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
