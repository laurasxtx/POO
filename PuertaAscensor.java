public class PuertaAscensor extends Puerta {
    public boolean abrirPuertas() {
        abrir();
        return true;
    }
    public boolean cerrarPuertas() {
        cerrar();
        return true;
    }
    public void imprimirMensaje() {
        System.out.println("Estado de las puertas: " + getEstado());
    }
}