package lab2;

/**
 * A classe Resumo representa um resumo de estudo, composto por um tema e um conteúdo.
 *
 * @author Ana Paula Leal Sousa
 */
public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String pegaTema() {
        return tema;
    }

    public String pegaConteudo() {
        return conteudo;
    }

    public String toString() {
        return tema + ": " + conteudo;
    }
}
