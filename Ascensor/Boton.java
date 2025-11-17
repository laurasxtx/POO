public class Boton {
    //*Clase base para todos los botones, guardando el piso al que pertenecen y estado de presionado o no
    private int piso;       //*piso que esta asociado al boton */
    private boolean estado;// presionado/no presionado true si esta presionado o false si no esta presionado
    //*constructor para asignar piso y poner el estado inicial en el que no esta presionado el boton */
    public Boton(int piso) {
        this.piso = piso;
        this.estado = false;
    }
    //*metodo para poder simular la accion en la que se presiona el boton */
    public void presionar() {
        estado = true;
        // lógica al presionar botón
    }
    //*metodos getters y setters para los atributos privados */
    public boolean getEstado() {
        return estado;
    }
}
