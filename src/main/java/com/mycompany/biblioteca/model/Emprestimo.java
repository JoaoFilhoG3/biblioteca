package com.mycompany.biblioteca.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Emprestimo {
    private int codEmp;
    private Cliente cliente;
    private Funcionario funcionario;
    private Livro livro;
    private LocalDateTime dataHoraEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(int codEmp, Cliente cliente, Funcionario funcionario, Livro livro, LocalDateTime dataHoraEmprestimo, LocalDate dataDevolucao) {
        this.codEmp = codEmp;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.livro = livro;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDateTime getDataHoraEmprestimo() {
        return dataHoraEmprestimo;
    }

    public void setDataHoraEmprestimo(LocalDateTime dataHoraEmprestimo) {
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    
}
