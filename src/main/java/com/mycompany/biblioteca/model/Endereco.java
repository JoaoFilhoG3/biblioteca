package com.mycompany.biblioteca.model;

public class Endereco {

    private int codEnd;
    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String cep;

    public Endereco() {
    }

    public Endereco(int codEnd, String uf, String cidade, String bairro, String rua, String numero, String cep) {
        this.codEnd = codEnd;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public int getCodEnd() {
        return codEnd;
    }

    public void setCodEnd(int codEnd) {
        this.codEnd = codEnd;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
