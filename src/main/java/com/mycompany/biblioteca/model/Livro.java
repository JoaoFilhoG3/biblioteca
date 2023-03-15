package com.mycompany.biblioteca.model;

public class Livro {

    private int codLiv;
    private String titulo;
    private int ano;
    private Categoria categoria;
    private int numeroPaginas;
    private int exemplares;
    private String autor;

    public Livro() {
    }

    public Livro(int codLiv, String titulo, int ano, Categoria categoria, int numeroPaginas, int exemplares, String autor) {
        this.codLiv = codLiv;
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
        this.numeroPaginas = numeroPaginas;
        this.exemplares = exemplares;
        this.autor = autor;
    }

    public int getCodLiv() {
        return codLiv;
    }

    public void setCodLiv(int codLiv) {
        this.codLiv = codLiv;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
