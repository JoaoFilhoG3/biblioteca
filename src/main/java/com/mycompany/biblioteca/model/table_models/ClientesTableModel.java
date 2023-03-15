package com.mycompany.biblioteca.model.table_models;

import com.mycompany.biblioteca.model.Cliente;
import com.mycompany.biblioteca.model.DAO.ClienteDAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClientesTableModel extends AbstractTableModel {

    private List<Cliente> lCli;
    private String[] colunas = new String[]{
        "Cód.",
        "Nome",
        "Data Nasc.",
        "RG",
        "CPF",
        "Email",
        "Telefone",
        "Endereço"
    };

    public ClientesTableModel() {
        lCli = new ClienteDAO().getAll();
    }

    @Override
    public int getRowCount() {
        return lCli.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int index){
        return colunas[index];
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lCli.get(row).getCodCli();
            case 1:
                return lCli.get(row).getNome();
            case 2:
                return lCli.get(row).getDataNascimento();
            case 3:
                return lCli.get(row).getRg();
            case 4:
                return lCli.get(row).getCpf();
            case 5:
                return lCli.get(row).getEmail();
            case 6:
                return lCli.get(row).getTelefone();
            case 7:
                return lCli.get(row).getEndereco();
            default:
                return null;

        }
    }

}
