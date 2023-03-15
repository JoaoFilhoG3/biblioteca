package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.view.TelaCategorias;
import com.mycompany.biblioteca.view.TelaClientes;
import com.mycompany.biblioteca.view.TelaEmprestimos;
import com.mycompany.biblioteca.view.TelaFuncionarios;
import com.mycompany.biblioteca.view.TelaLivros;
import com.mycompany.biblioteca.view.TelaPrincipal;
import javax.swing.JOptionPane;

public class TelaPrincipalController {

    private TelaPrincipal tela;

    public TelaPrincipalController(TelaPrincipal tela) {
        this.tela = tela;
    }

    public void handleAction(String action) {
        switch (action) {
            //Ação de clique do menu clientes
            case "mniClientes":
                TelaClientes telaClientes = new TelaClientes();
                telaClientes.setVisible(true);
                break;
            //Ação de clique do menu livros
            case "mniLivros":
                TelaLivros telaLivros = new TelaLivros();
                telaLivros.setVisible(true);
                break;
            //Ação de clique do menu empréstimos
            case "mniEmprestimos":
                TelaEmprestimos telaEmprestimos = new TelaEmprestimos();
                telaEmprestimos.setVisible(true);
                break;
            //Ação de clique do menu categorias
            case "mniCategorias":
                TelaCategorias telaCategorias = new TelaCategorias();
                telaCategorias.setVisible(true);
                break;
            //Ação de clique do menu funcionarios
            case "mniFuncionarios":
                TelaFuncionarios telaFuncionarios = new TelaFuncionarios();
                telaFuncionarios.setVisible(true);  
                break;
            default:
                JOptionPane.showMessageDialog(this.tela, "Opção inválida. Tente Novamente");
        }
    }

}
