package lab2;

/**
 * Representa um resumo de estudo, composto por um tema e um conteúdo.
 */
public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String toString() {
        return tema + ": " + conteudo;
    }

    public String getTema() {
        return tema;
    }

    public String getConteudo() {
        return conteudo;
    }
}
