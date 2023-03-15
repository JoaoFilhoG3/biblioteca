package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.model.table_models.ClientesTableModel;
import com.mycompany.biblioteca.view.TelaClientes;

public class TelaClientesController {

    private TelaClientes tela;
    private ClientesTableModel tbmClientes;

    public TelaClientesController(TelaClientes tela) {
        this.tela = tela;
        tbmClientes = new ClientesTableModel();
        tela.getTblClientes().setModel(tbmClientes);
    }
}
