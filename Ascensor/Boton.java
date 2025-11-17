public class Boton {
    private int piso;
    private boolean estado; // presionado/no presionado
    public Boton(int piso) {
        this.piso = piso;
        this.estado = false;
    }
    public void presionar() {
        estado = true;
        // lógica al presionar botón
    }
    
    public boolean getEstado() {
        return estado;
    }
}
