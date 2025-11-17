public class Puerta {
    //*esta es la clase para las puertas, que pueden estar abiertas o cerradas */
    private String estado; 
    public Puerta() {
        this.estado = "cerrado";//*estado inicial cerrado */
    }
    //*metodo para abrir la puerta */
    public void abrir() {
        estado = "abierto";
        System.out.println("Puerta abierta.");
    }
    //*metodo para cerrar la puerta */
    public void cerrar() {
        estado = "cerrado";
        System.out.println("Puerta cerrada.");
    }
    public String getEstado() {
        return estado;
    }
}