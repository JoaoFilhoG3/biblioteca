package com.mycompany.biblioteca.model.DAO;

import com.mycompany.biblioteca.controller.Conexao;
import com.mycompany.biblioteca.model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class EnderecoDAO {

    public void add(Endereco endereco) {
        Connection con = Conexao.abrirConexao();
        try {
            String sql = "insert into endereco(cod_end, uf, cidade, bairro, rua, numero, cep)"
                    + "values (0, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, endereco.getUf());
            ps.setString(2, endereco.getCidade());
            ps.setString(3, endereco.getBairro());
            ps.setString(4, endereco.getRua());
            ps.setString(5, endereco.getNumero());
            ps.setString(6, endereco.getCep());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Conexao.fecharConexao(con);
    }

    public void update(Endereco endereco) {
        Connection con = Conexao.abrirConexao();
        try {
            String sql = "update endereco set "
                    + "uf = ?, "
                    + "cidade = ?, "
                    + "bairro = ?, "
                    + "rua = ?, "
                    + "numero = ?, "
                    + "cep = ? "
                    + "where cod_end = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, endereco.getUf());
            ps.setString(2, endereco.getCidade());
            ps.setString(3, endereco.getBairro());
            ps.setString(4, endereco.getRua());
            ps.setString(5, endereco.getNumero());
            ps.setString(6, endereco.getCep());
            ps.setInt(7, endereco.getCodEnd());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Conexao.fecharConexao(con);
    }

    
    
    
    
    
    
    
    public void delete(int codEnd) {
        Connection con = Conexao.abrirConexao();
        try {
            String sql = "DELETE FROM endereco WHERE cod_end = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codEnd);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Conexao.fecharConexao(con);
    }
    
    
    
    
    
    

    public List<Endereco> getAll() {

    }

    public Endereco get(int codEnd) {

    }
}
