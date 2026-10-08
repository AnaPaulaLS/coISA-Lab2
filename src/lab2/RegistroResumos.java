package lab2;

public class RegistroResumos {
    private Resumo[] resumos;
    private int ponteiro;
    private int quantidade;

    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos];
        this.ponteiro = 0;
        this.quantidade = 0;
    }

    public void adiciona(String tema, String conteudo) {
        if (temResumo(tema)) {
            return;
        }
        resumos[ponteiro] = new Resumo(tema, conteudo);

        if (quantidade < resumos.length){
            quantidade++;
        }

        if (ponteiro == resumos.length) {
            ponteiro = 0;
        }
    }

    public String[] pegaResumos(){
        String[] resultado = new String[quantidade];

        for(int i = 0; i < quantidade; i++){
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }

    public String imprimeResumos() {
        String acc = "";
        acc += "- " + quantidade + " resumo(s) cadastrado(s) \n- ";
        for (int i=0; i<quantidade; i++){
            if (i==quantidade-1) acc += resumos[i].getTema();
            else acc += resumos[i].getTema() + " | ";
        }
        return acc;
    }

    public int conta() {
        return quantidade;
    }

    public boolean temResumo(String tema){
        for (String t1 : this.resumos[i].getTema()){
            if (t1 == null) continue;
            if (t1.equals(tema)) return true;
        }
        return false;
    }


}
