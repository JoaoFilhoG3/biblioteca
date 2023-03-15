package com.mycompany.biblioteca.model.DAO;

import com.mycompany.biblioteca.controller.Conexao;
import com.mycompany.biblioteca.model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    public List<Categoria> getAll() {
        Connection con = Conexao.abrirConexao();
        List<Categoria> lCat = new ArrayList<>();
        try {
            PreparedStatement ps
                    = con.prepareStatement("SELECT * FROM categoria");
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Categoria c = new Categoria();
                    c.setCodCat(rs.getInt("cod_cat"));
                    c.setNome(rs.getString("nome"));
                    lCat.add(c);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Conexao.fecharConexao(con);
        return lCat;
    }

}
