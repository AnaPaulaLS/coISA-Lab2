package lab2;

import java.util.Arrays;

public class RegistroResumos {
    private Resumo[] resumos;
    private int ponteiro;
    private int limite;
    private int quantidade;

    public RegistroResumos(int nresumos){
        this.resumos = new Resumo[nresumos];
        ponteiro = 0;
        limite = nresumos;
        quantidade = 0;
    }

    public void adiciona(String tema, String conteudo) {
        Resumo novo_resumo = new Resumo(tema,conteudo);
        resumos[ponteiro] = novo_resumo;
        ponteiro++;
        if (quantidade < limite) quantidade++;
        if (ponteiro >= limite) ponteiro = 0;
    }

    public String[] pegaResumos(){
        int limite = resumos.length;
        String[] osResumos = new String[limite];
        for (int i=0;i<quantidade;i++){
            osResumos[i] = this.resumos[i].toString();
        }
        return osResumos;
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
        for (Resumo t1 : resumos){
            if (t1 == null) continue;
            if (t1.getTema().equals(tema)) return true;
        }
        return false;
    }

    public String[] busca(String chaveDeBusca) {
        String chave = chaveDeBusca.toLowerCase();
        String[] temp = new String[quantidade];
        int n = 0;
        for (int i = 0; i < quantidade; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chave)) {
                temp[n++] = resumos[i].getTema();
            }
        }
        String[] encontrados = Arrays.copyOf(temp, n);
        Arrays.sort(encontrados);
        return encontrados;
    }

}
