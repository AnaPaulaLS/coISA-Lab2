package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public void defineNumeroSemanas(int valor) {
        numeroSemanas = valor;
    }

    public String getStatusGeral() {
        if (numeroSemanas == 0) {
            return "cansado";
        }
        double horasPorSemana = (double) horasDescanso / numeroSemanas;
        if (horasPorSemana >= 26) {
            return "descansado";
        }else{
         return "cansado";
        }
    }
}
