package com.mycompany.biblioteca.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection abrirConexao() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/biblioteca",
                    "root",
                    ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public static void fecharConexao(Connection con){
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
