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
    
    public int login(Usuario usuario) {
        int id = 0;
        String sql = "SELECT id FROM usuario WHERE nome = ? AND senha = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                id = rs.getInt("id");
            }
            
            rs.close();
        } catch (SQLException erro) {
            throw new IllegalArgumentException(erro.getMessage());
        }
        
        return id;
    }
    
    public Usuario buscarPoId(int id) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE id = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPartida(rs.getInt("partida"));
                usuario.setVitoria(rs.getInt("vitoria"));
                usuario.setEmpate(rs.getInt("empate"));
                usuario.setDerrota(rs.getInt("derrota"));
            }
            
            rs.close();
        } catch (SQLException erro) {
            throw new IllegalArgumentException(erro.getMessage());
        }
        
        return usuario;
    }
}
