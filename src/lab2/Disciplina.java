package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
        this.horasEstudo = 0;
        this.pesos = null;
    }
    public Disciplina(String nomeDisciplina, int numeroDeNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numeroDeNotas];
        this.horasEstudo = 0;
        this.pesos = null;
    }
    public Disciplina(String nomeDisciplina, int numeroDeNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numeroDeNotas];
        this.pesos = pesos;
    }

    public void cadastraHoras(int horas){
        horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        notas[nota-1] = valorNota;
    }

    private double calculaMedia() {
        if (pesos == null) {
            double soma = 0;

            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }

            return soma / notas.length;
        }
        double soma = 0;
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        return soma / somaPesos;
    }

    public boolean aprovado(){
        return calculaMedia() >= 7.0;
    }

    @Override
    public String toString() {
        String resultado = nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " [";
        for(int i = 0; i < notas.length; i++){
            resultado += notas[i];

            if (i < notas.length - 1){
                resultado += ", ";
            }
        }

        return resultado + "]";
    }
}
