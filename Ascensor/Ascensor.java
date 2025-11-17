public class Ascensor {
    private int capacidad;
    private int pisoActual;
    private String estado; // abierto/cerrado
    private String direccion; // subiendo/bajando/detenido

    // Constructor
    public Ascensor(int capacidad, int pisoActual, String estado, String direccion) {
        this.capacidad = capacidad;
        this.pisoActual = pisoActual;
        this.estado = estado;
        this.direccion = direccion;
    }

    // Getters y setters
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
