public class Ascensor {
    // *esto es para la capacidad máxima de personas en el ascensor
    private int capacidad;
    // *piso en donde se encontraria el asensor actualemnte
    private int pisoActual;
    // *determina ssi la puerta esta abierta o cerrada
    private String estado; // abierto/cerrado
    // *indica la direccion en la que se mueve el ascensor
    private String direccion; // subiendo/bajando/detenido

    // *Constructor para que se pueda inicializar la clase Ascensor 
    public Ascensor(int capacidad, int pisoActual, String estado, String direccion) {
        this.capacidad = capacidad;
        this.pisoActual = pisoActual;
        this.estado = estado;
        this.direccion = direccion;
    }

    // *estos son los getter y setters para cada uno de los atributos de la clase Ascensor
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
