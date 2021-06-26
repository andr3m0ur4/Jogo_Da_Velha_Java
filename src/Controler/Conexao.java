package Controler;

import jogo.da.velha.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    
    // Atributos
    
    public static Connection con;
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    // Métodos construtores
    
    public Conexao() {
    }
    
    // Método de conexao
    
    public static void Conectar() {
        try {
            // Obter uma conexão válida com o banco de dados
            con = DriverManager.getConnection( "jdbc:sqlite:src/jogo/da/velha/db/jogo_da_velha.db");
        } catch (SQLException erro) {
            throw new IllegalArgumentException(erro.getMessage());
        }
        
    }

}
