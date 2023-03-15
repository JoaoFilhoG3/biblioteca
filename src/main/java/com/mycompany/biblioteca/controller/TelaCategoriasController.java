package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.model.Categoria;
import com.mycompany.biblioteca.model.DAO.CategoriaDAO;
import com.mycompany.biblioteca.view.TelaCategorias;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaCategoriasController {

    private TelaCategorias tela;

    public TelaCategoriasController(TelaCategorias tela) {
        this.tela = tela;
    }

    public void preencheTabela() {
        DefaultTableModel model = new DefaultTableModel();
        List<Categoria> lCat = new CategoriaDAO().getAll();
        String[] colunas = new String[]{"Cód.", "Nome"};
        model.setColumnIdentifiers(colunas);
        for (Categoria c : lCat) {
            model.addRow(new Object[]{
                c.getCodCat(),
                c.getNome()
            });
        }
        tela.getTblCategorias().setModel(model);
    }

}
