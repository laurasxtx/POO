public class instrumento {
    String tipoSonido; 

    public instrumento(String tipoSonido) {
        this.tipoSonido = tipoSonido;
    }

    public void tocar() {
        System.out.println("El instrumento produce un sonido.");
    }

    public void mostrarTipo() {
        System.out.println("Tipo de sonido: " + tipoSonido);
    }
}



    