import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //*inicializamos arrays de pisos, puertas y botones para 5 pisos */
        Piso[] pisos = new Piso[5];
        PuertaPiso[] puertasPisos = new PuertaPiso[5];
        BotonPiso[] botonesPisos = new BotonPiso[5];

        //*este es el ciclo para inicializar cada piso con sus puertas y botones para tambien poder subir y bajar */
        for (int i = 0; i < 5; i++) {
            pisos[i] = new Piso(i + 1);
            puertasPisos[i] = new PuertaPiso(i + 1);
            boolean puedeSubir = (i != 4);
            boolean puedeBajar = (i != 0);
            botonesPisos[i] = new BotonPiso(i + 1, puedeSubir, puedeBajar);
        }
        //*esta es la creacion del ascensor con capacidad de 10, posicion y estado */
        Ascensor ascensor = new Ascensor(10, 1, "cerrado", "detenido");
        //*puerta principal del ascensor a controlar */
        PuertaAscensor puertaAscensor = new PuertaAscensor();
        //*es el controlador que servira para usar los botones y puertas */
        Controlador controlador = new Controlador();

        boolean salir = false;

        System.out.println("Simulación de Ascensor iniciado.");

        //*es el menos principal para poder manejar las acciones */
        while (!salir) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Llamar ascensor desde un piso");
            System.out.println("2. Seleccionar piso desde dentro del ascensor");
            System.out.println("3. Abrir puerta del ascensor");
            System.out.println("4. Cerrar puerta del ascensor");
            System.out.println("5. Salir");

            int opcion = 0;
            try {
                System.out.print("Opción: ");
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, intente de nuevo.");
                continue;
            }
            //*se ejecuta la accion segun la opcion escogida */
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número de piso para llamar ascensor (1-5): ");
                    int pisoLlamar = Integer.parseInt(sc.nextLine());
                    if (pisoLlamar < 1 || pisoLlamar > 5) {
                        System.out.println("Número de piso inválido.");
                        break;
                    }
                    pisos[pisoLlamar - 1].llamarElevador();
                    System.out.println("Ascensor llamado al piso " + pisoLlamar);
                    ascensor.setPisoActual(pisoLlamar);
                    ascensor.setEstado("abierto");
                    System.out.println("Ascensor ha llegado y puertas abiertas.");
                    break;

                case 2:
                    System.out.print("Ingrese piso al que quiere ir (1-5): ");
                    int pisoDestino = Integer.parseInt(sc.nextLine());
                    if (pisoDestino < 1 || pisoDestino > 5) {
                        System.out.println("Número de piso inválido.");
                        break;
                    }
                    System.out.println("Piso seleccionado: " + pisoDestino);
                    int pisoActual = ascensor.getPisoActual();
                    if (pisoDestino > pisoActual) {
                        System.out.println("Ascensor subiendo...");
                        botonesPisos[pisoActual - 1].mensajeSubiendo();
                        ascensor.setDireccion("subiendo");
                    } else if (pisoDestino < pisoActual) {
                        System.out.println("Ascensor bajando...");
                        botonesPisos[pisoActual - 1].mensajeBajando();
                        ascensor.setDireccion("bajando");
                    } else {
                        System.out.println("Ya estás en el piso " + pisoDestino);
                        break;
                    }
                    ascensor.setPisoActual(pisoDestino);
                    ascensor.setEstado("abierto");
                    ascensor.setDireccion("detenido");
                    System.out.println("Ascensor llegó al piso " + pisoDestino + " y puertas abiertas.");
                    break;

                case 3:
                    puertaAscensor.abrirPuertas();
                    break;

                case 4:
                    puertaAscensor.cerrarPuertas();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        sc.close();
        System.out.println("Simulación terminada.");
    }
}
