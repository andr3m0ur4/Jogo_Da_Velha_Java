package jogo.da.velha.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jogo.da.velha.model.beans.Usuario;
import jogo.da.velha.util.Conexao;

public class UsuarioDAO {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public UsuarioDAO() {
        con = Conexao.conectar();
    }
    
    public boolean cadastrar(Usuario usuario) {
        String sql = "INSERT INTO usuario VALUES (null, ?, ?, 0, 0, 0, 0)";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            return stmt.executeUpdate() == 1;
        } catch (SQLException erro) {
            throw new IllegalArgumentException(erro.getMessage());
        }
    }
    
    public String login(Usuario usuario) {
        String nome = null;
        String sql = "SELECT nome FROM usuario WHERE nome = ? AND senha = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                nome = rs.getString("nome");
            }
            
            rs.close();
        } catch (SQLException erro) {
            throw new IllegalArgumentException(erro.getMessage());
        }
        
        return nome;
    }
}
