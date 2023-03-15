package com.mycompany.biblioteca.model;

public class Categoria {

    private int codCat;
    private String nome;

    public Categoria(int codCat, String nome) {
        this.codCat = codCat;
        this.nome = nome;
    }

    public Categoria() {

    }

    public int getCodCat() {
        return this.codCat;
    }

    public void setCodCat(int codCat) {
        this.codCat = codCat;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nCód.: " + this.codCat
                + "; Nome: " + this.nome + "\n";
    }

}
