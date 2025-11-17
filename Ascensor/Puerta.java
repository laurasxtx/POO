public class Puerta {
    private String estado; // abierto/cerrado
    public Puerta() {
        this.estado = "cerrado";
    }
    public void abrir() {
        estado = "abierto";
        System.out.println("Puerta abierta.");
    }
    public void cerrar() {
        estado = "cerrado";
        System.out.println("Puerta cerrada.");
    }
    public String getEstado() {
        return estado;
    }
}