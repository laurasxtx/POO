public class Ascensor {
    
    int capacidad;
    int pisoActual;
    String estado;
    String direccion;

     class PuertaAscensor {
        String estado;

        public PuertaAscensor(){
            this.estado = "cerrada";
            System.out.println("Puerta creada, estado inicial: " + this.estado);
        }
         public void abrirPuertas() {
        this.estado = "abierto"; // Declaración y asignación de valor
        System.out.println("Abriendo puertas...");
    }
        public void cerrarPuertas() {
        this.estado = "cerrado"; // Declaración y asignación de valor
        System.out.println("Cerrando puertas...");
 }
         public String getEstado() {
        return estado;
        }

    }   
         
public class Ascensor {

   
    int capacidad;         
    int pisoActual;        
    String estado;         
    String direccion;      

    PuertaAscensor puerta;

      public Ascensor(int capacidad){
        this.capacidad = capacidad;
        this.pisoActual = 0;
        this.estado = "cerrado";
        this.direccion = "detenido";
        this.puerta = new PuertaAscensor();
         System.out.println("Ascensor creado con capacidad: " + this.capacidad + ", en piso: " + this.pisoActual);
        }

        public void subir(int pisoDestino) {
        System.out.println("Subiendo de piso " + this.pisoActual + " al piso " + pisoDestino);
        this.direccion = "subiendo"; // Asignación de nuevo valor
        this.pisoActual = pisoDestino; // Asignación de nuevo valor
        System.out.println("Ahora en el piso: " + this.pisoActual);

        }
        public void bajar(int pisoDestino) {
        System.out.println("Bajando del piso " + this.pisoActual + " al piso " + pisoDestino);
        this.direccion = "bajando"; // Asignación de nuevo valor
        this.pisoActual = pisoDestino; // Asignación de nuevo valor
        System.out.println("Ahora en el piso: " + this.pisoActual);
    }
        public void abrirPuerta() {
            if (this.direccion.equals("detenido")) { 
                this.puerta.abrirPuertas();
                this.estado = "abierto";
            } else {
            System.out.println("El ascensor debe estar detenido para abrir las puertas.");
            }
        }
        public void cerrarPuerta() {
        this.puerta.cerrarPuertas();
        this.estado = "cerrado";
        }
        public void detener() {
        this.direccion = "detenido"; // Asignación de nuevo valor
        System.out.println("Ascensor detenido en el piso " + this.pisoActual);
         }
         public int getPisoActual() {
        return pisoActual;
        }
        public String getEstado() {
        return estado;
        }
        public String getDireccion() {
        return direccion;
        }
        public int getCapacidad() {
        return capacidad;
    }



    }


}

