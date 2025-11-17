public class PuertaAscensor extends Puerta {
    //*puerta del ascensor con metodos para abrir y cerrar que retornan boolean */
    public boolean abrirPuertas() {
        //*abrir puertas, retorna true si cambia de estado */
        abrir();
        return true;
    }
    public boolean cerrarPuertas() {
        //*cerrar puertas, retorna true si cambia de estado */
        cerrar();
        return true;
    }
    //*imprime el estado actual de las puertas */
    public void imprimirMensaje() {
        System.out.println("Estado de las puertas: " + getEstado());
    }
}