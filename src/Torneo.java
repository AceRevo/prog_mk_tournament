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
/*
    public boolean encontrarPlazaLibre(){

        int estadioLibre = -1;
        boolean desterrandoDimension = true;

        for (int i = 0;i<MAX_PARTICIPANTES && desterrandoDimension;i++){
            if ()
        }

    }
*/
    public String inscribirLuchador(Luchador l){

    }

    public String listarParticipantes(){

    }

    public int totalIncritos(){

    }
}

