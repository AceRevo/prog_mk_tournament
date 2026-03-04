/**
 * Representa a un guerrero participante en el torneo de artes marciales.
 * <p>
 * Cada luchador posee atributos únicos como su procedencia (reino)
 * y su capacidad de combate (nivel de poder).
 * </p>
 * * @author AceRevo
 * @version 1.0
 */
public class Luchador {

    /** Identificador único del luchador. */
    private int id;

    /** Nombre del guerrero. */
    private String nombre;

    /** Reino de origen (Earthrealm, Outworld, Edenia, etc.). */
    private String reino;

    /** Valor numérico que representa la fuerza del luchador. */
    private int nivelPoder;

    /**
     * Constructor para crear un nuevo luchador con sus estadísticas base.
     * * @param id Identificador numérico único.
     * @param nombre Nombre del guerrero.
     * @param reino Reino al que representa.
     * @param nivelPoder Valor de poder de combate.
     */
    public Luchador(int id, String nombre, String reino, int nivelPoder){
        this.id = id;
        this.nombre = nombre;
        this.reino = reino;
        this.nivelPoder = nivelPoder;
    }

    /**
     * Obtiene el ID del luchador.
     * @return El identificador único.
     */
    public int getId(){
        return this.id;
    }

    /**
     * Obtiene el nombre del luchador.
     * @return El nombre del guerrero.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene el reino de origen.
     * @return El nombre del reino.
     */
    public String getReino(){
        // Corregido: antes llamaba al mismo método infinitamente
        return this.reino;
    }

    /**
     * Obtiene el nivel de poder actual.
     * @return Valor entero del poder.
     */
    public int getNivelPoder(){
        // Corregido: antes llamaba al mismo método infinitamente
        return this.nivelPoder;
    }

    /**
     * Verifica si el luchador está en condiciones de listar o procesar participantes.
     * * @param numParticipantes Cantidad de participantes a evaluar.
     * @return {@code false} por defecto en esta implementación base.
     */
    public boolean listarParticipantes(int numParticipantes) {
        return false;
    }

    /**
     * Devuelve una representación textual formateada del luchador.
     * * @return Una cadena con el ID, nombre, reino y nivel de poder.
     */
    @Override
    public String toString() {
        return String.format("\n  [ID: %d] %-12s | Reino: %-15s | Poder: %d",
                id, nombre, reino, nivelPoder);
    }
}