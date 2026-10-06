package lab2;
// Falta implementação; incompleto.
public class RegistroResumos {
    private String[] tema;
    private String[] resumo;
    private int ponteiro;
    private int limite;
    private int quantidade;
    public RegistroResumos(int nresumos){
        resumo = new String[nresumos];
        tema = new String[nresumos];
        ponteiro = 0;
        limite = nresumos;
        quantidade = 0;
    }

    public void adiciona(String tema, String conteudo) {
        this.resumo[ponteiro] = tema + ": " +conteudo;
        this.tema[ponteiro] = tema;
        ponteiro++;
        if (quantidade < limite) quantidade++;
        if (ponteiro >= limite) ponteiro = 0;
    }

    public String[] pegaResumos(){
        return resumo;
    }

    public String imprimeResumos() {
        String acc = "";
        acc += "- " + quantidade + " resumo(s) cadastrado(s) \n- ";
        for (int i=0; i<quantidade; i++){
            if (i==quantidade-1) acc += tema[i];
            else acc += tema[i] + " | ";
        }
        return acc;
    }

    public int conta() {
        return quantidade;
    }

    public boolean temResumo(String tema){
        for (String t1 : this.tema){
            if (t1 == null) continue;
            if (t1.equals(tema)) return true;
        }
        return false;
    }


}
