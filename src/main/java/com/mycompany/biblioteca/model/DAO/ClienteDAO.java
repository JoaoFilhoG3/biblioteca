package com.mycompany.biblioteca.model.DAO;

import com.mycompany.biblioteca.controller.Conexao;
import com.mycompany.biblioteca.model.Cliente;
import com.mycompany.biblioteca.model.Endereco;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    /**
     * Método responsável por adicionar um cliente no banco de dados
     */
    public void add(Cliente cli) {
        Connection con = Conexao.abrirConexao();
        try {
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO cliente(cod_cli, nome, data_nascimento, rg, cpf, email, telefone, cod_end) "
                            + "VALUES(0, ?, ?, ?, ?, ?, ?, ?);"
            );
            
            ps.setString(1, cli.getNome());
            ps.setDate(2, Date.valueOf(cli.getDataNascimento()));
            ps.setString(3, cli.getRg());
            ps.setString(4, cli.getCpf());
            ps.setString(5, cli.getEmail());
            ps.setString(6, cli.getTelefone());
            ps.setInt(7, cli.getEndereco().getCodEnd());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        Conexao.fecharConexao(con);
    }

    /**
     * Método responsável por atualizar um cliente do banco de dados
     */
    public void update() {
    }

    /**
     * Método responsável por excluir um cliente do banco de dados
     */
    public void delete() {
    }

    /**
     * Método responsável por obter todos os clientes do banco de dados
     */
    public List<Cliente> getAll() {
        Connection con = Conexao.abrirConexao();
        List<Cliente> lCli = new ArrayList<>();
        try {
            PreparedStatement ps
                    = con.prepareStatement("SELECT * FROM cliente");

            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Cliente c = new Cliente();
                    c.setCodCli(rs.getInt("cod_cli"));
                    c.setNome(rs.getString("nome"));
                    c.setDataNascimento(rs.getDate("data_nascimento").toLocalDate());
                    c.setRg(rs.getString("rg"));
                    c.setCpf(rs.getString("cpf"));
                    c.setEmail(rs.getString("email"));
                    c.setTelefone(rs.getString("telefone"));
                    c.setEndereco(new Endereco());
                    lCli.add(c);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Conexao.fecharConexao(con);
        return lCli;
    }

    /**
     * Método responsável por obter um cliente do banco de dados
     */
    public void get() {
    }

    /**
     * Método responsável por pesquisar um cliente do banco de dados
     */
    public void search() {
    }
}
