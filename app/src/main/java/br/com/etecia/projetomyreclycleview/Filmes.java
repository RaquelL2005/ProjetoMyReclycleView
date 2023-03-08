package br.com.etecia.projetomyreclycleview;

public class Filmes {

    private String titulo;
    private String cartegoria;
    private String descricao;

    public Filmes(String titulo, String cartegoria, String descricao) {
        this.titulo = titulo;
        this.cartegoria = cartegoria;
        this.descricao = descricao;

    }

    public String getTitulo() {
        return titulo;

    }

    public String getCartegoria() {
        return cartegoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCartegoria(String cartegoria) {
        this.cartegoria = cartegoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
