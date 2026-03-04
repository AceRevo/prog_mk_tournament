/**
 * Representa el torneo donde se gestionan los combates y los participantes.
 * <p>
 * Esta clase se encarga de administrar un arreglo de objetos {@link Luchador},
 * permitiendo inscripciones, búsquedas y generación de listados de estado.
 * </p>
 * * @author AceRevo
 * @version 1.0
 */
public class Torneo {

    /** Arreglo que almacena a los luchadores inscritos. */
    private Luchador[] participantes;

    /** Capacidad máxima de luchadores permitidos en el torneo. */
    private final int MAX_PARTICIPANTES;

    /**
     * Constructor de la clase Torneo.
     * * @param maxParticipantes Cantidad máxima de espacios disponibles en el torneo.
     */
    public Torneo(int maxParticipantes) {
        this.MAX_PARTICIPANTES = maxParticipantes;
        this.participantes = new Luchador[maxParticipantes];
    }

    /**
     * Busca un luchador dentro del torneo utilizando su identificador único.
     * * @param id El identificador numérico del luchador a buscar.
     * @return El objeto {@link Luchador} si se encuentra; {@code null} en caso contrario.
     */
    public Luchador buscarLuchador(int id) {
        boolean invocandoLuchador = true;
        Luchador luchadorInvocado = null;

        for (int i = 0; i < MAX_PARTICIPANTES && invocandoLuchador; i++) {
            if (participantes[i] != null && participantes[i].getId() == id) {
                invocandoLuchador = false;
                luchadorInvocado = participantes[i];
            }
        }
        return luchadorInvocado;
    }

    /**
     * Localiza el primer índice vacío dentro del arreglo de participantes.
     * * @return El índice de la plaza libre o {@code -1} si el torneo está lleno.
     */
    private int encontrarPlazaLibre() {
        int estadioLibre = -1;
        boolean desterrandoDimension = true;

        for (int i = 0; i < MAX_PARTICIPANTES && desterrandoDimension; i++) {
            if (participantes[i] == null) {
                estadioLibre = i;
                desterrandoDimension = false;
            }
        }
        return estadioLibre;
    }

    /**
     * Inscribe a un nuevo luchador en el torneo, verificando que no exista previamente
     * y que haya cupo disponible.
     * * @param luchador El objeto {@link Luchador} que desea ingresar.
     * @return {@code true} si la inscripción fue exitosa; {@code false} si el ID ya existe o no hay espacio.
     */
    public Boolean inscribirLuchador(Luchador luchador) {
        boolean luchadorInscrito = false;
        int posicion;

        if (buscarLuchador(luchador.getId()) == null) {
            posicion = encontrarPlazaLibre();
            if (posicion >= 0) {
                participantes[posicion] = luchador;
                luchadorInscrito = true;
            }
        }
        return luchadorInscrito;
    }

    /**
     * Solicita a un luchador específico que liste participantes (basado en lógica interna del luchador).
     * * @param id Identificador del luchador que realizará la acción.
     * @param numParticipantes Cantidad de participantes a procesar.
     * @return {@code true} si el luchador existe y la operación se completa; {@code false} de lo contrario.
     */
    public Boolean listarParticipantes(int id, int numParticipantes) {
        boolean participantesPreparados = false;
        Luchador luchador;

        luchador = buscarLuchador(id);

        if (luchador != null) {
            participantesPreparados = luchador.listarParticipantes(numParticipantes);
        }

        return participantesPreparados;
    }

    /**
     * Genera una cadena de texto formateada con la información de todos los luchadores inscritos.
     * * @return Un {@link String} que representa la lista visual de participantes.
     */
    public String totalIncritos() {
        StringBuilder sb = new StringBuilder("\n-----LISTA DE PARTICIPANTES-----------------------------------------");

        for (int i = 0; i < MAX_PARTICIPANTES; i++) {
            if (participantes[i] != null) {
                sb.append(participantes[i].toString());
            }
        }

        sb.append("\n====================================================================");
        return sb.toString();
    }
}