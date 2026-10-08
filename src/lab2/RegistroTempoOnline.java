package lab2;

public class RegistroTempoOnline {
    private String nomedaDisciplina;
    private int tempoOnlineEsperado;
    private int tempoInvestido;

    public RegistroTempoOnline(String nomedaDisciplina){
        this.nomedaDisciplina = nomedaDisciplina;
        tempoOnlineEsperado = 120;
        tempoInvestido = 0;
    }

    public RegistroTempoOnline(String nomedaDisciplina, int tempoOnlineEsperado){
        this.nomedaDisciplina = nomedaDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        tempoInvestido = 0;
    }

    public void adicionaTempoOnline(int tempo){
        tempoInvestido += tempo;
    }

    public boolean atingiuMeta(int tempo){
        if (tempoInvestido >= tempoOnlineEsperado) return true;
        return false;
    }

    public String toString(){
        return nomedaDisciplina + " "
                + tempoInvestido + "/" +
                tempoOnlineEsperado;
    }

    public boolean atingiuMetaTempoOnline(){
        if (tempoOnlineEsperado <= tempoInvestido){
            return true;
        }
        return false;
    }

}