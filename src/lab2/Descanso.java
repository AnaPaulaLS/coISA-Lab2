package lab2;

/**
 * Controla a rotina de descanso do aluno.
 * O aluno é considerado descansado quando descansa 26 horas por semana ou mais.
 * Se nenhuma hora ou semana foi registrada, o aluno começa cansado.
 */
public class Descanso {
    private int horasDescanso;
    private int numerosSemana;

    public Descanso(){
        horasDescanso = 0;
        numerosSemana = 0;
    }

    public void defineHorasDescanso(int ndescanso){
        horasDescanso = ndescanso;
    }

    public void defineNumeroSemanas(int valor){
        numerosSemana = valor;
    }

    public String getStatusGeral(){
        if (numerosSemana == 0) return "cansado";
        if (horasDescanso / numerosSemana >= 26 ) return "descansado";
        return "cansado";
    }
}