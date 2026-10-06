package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
        this.horasEstudo = 0;
    }

    public void cadastraHoras(int horas){
        horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        notas[nota-1] = valorNota;
    }

    public boolean aprovado(){
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        if (media >= 7) return true;
        return false;
    }

}
