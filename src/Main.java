/**
 * Clase principal que orquestra la simulación del torneo de lucha.
 * <p>
 * En esta clase se inicializa el torneo, se crean los participantes
 * y se realizan pruebas de inscripción y búsqueda.
 * </p>
 * * @author AceRevo
 * @version 1.0
 */
public class Main {

    /**
     * Punto de entrada de la aplicación.
     * <p>
     * Este método realiza las siguientes acciones:
     * <ul>
     * <li>Instancia un objeto de tipo {@code Torneo}.</li>
     * <li>Crea diversos objetos de tipo {@code Luchador} (Kung Lao, Kitana, etc.).</li>
     * <li>Muestra por consola el resultado de las inscripciones y búsquedas.</li>
     * </ul>
     * </p>
     */
    public static void main(String[] args) {
        // Inicialización para 10 luchadores
        Torneo torneo = new Torneo(10);

        //Luchadores
        Luchador luchador1 = new Luchador(1, "Kung Lao", "Tierra(Earthrealm)", 250480);
        Luchador luchador2 = new Luchador(2, "Kitana", "Edenia", 243000);
        Luchador luchador3 = new Luchador(3, "Sub-Zero", "Tierra(Earthrealm)", 429000);
        Luchador luchador4 = new Luchador(4, "Baraka", "OutWorld", 32500);

        // Proceso de inscripción
        System.out.println("¿Inscripción de Kung Lao exitosa?: " + torneo.inscribirLuchador(luchador1));
        System.out.println("¿Inscripción de Kitana exitosa?: " + torneo.inscribirLuchador(luchador2));

        //Búsqueda por ID
        System.out.println("\nBuscando luchador con ID 1...");
        Luchador encontrado = torneo.buscarLuchador(1);

        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("Luchador no encontrado.");
        }

        // Resumen final
        System.out.println("\n======================= ESTADO DEL TORNEO =========================");
        System.out.println(torneo.totalIncritos());
    }
}