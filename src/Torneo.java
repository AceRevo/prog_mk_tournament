public class Torneo {
    private Luchador[] participantes;
    private final int MAX_PARTICIPANTES;

    public Luchador buscarLuchador(int id){
        boolean invocandoLuchador = true;
        Luchador luchadorInvocado = null;

        for (int i = 0; i< MAX_PARTICIPANTES && invocandoLuchador; i++) {
            if (participantes[i] != null&& participantes[i].getId() == id){
            invocandoLuchador = false;
            luchadorInvocado = participantes[i];
            }
        }
        return luchadorInvocado
    }

    private int encontrarPlazaLibre(){

        int estadioLibre = 0;
        boolean desterrandoDimension = true;

        for (int i = 0;i<MAX_PARTICIPANTES && desterrandoDimension;i++){
            if (participantes[i] ==null){
                estadioLibre = i;
                desterrandoDimension = false;
            }
        }
        return estadioLibre;
    }

    public String inscribirLuchador(Luchador l){

    }

    public String listarParticipantes(){

    }

    public int totalIncritos(){

    }
}

