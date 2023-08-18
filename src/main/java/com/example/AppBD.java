package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBD {
    private static final String PASSWORD = "";
    private static final String GITPOD = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static void main(String[] args) 
    {
        new AppBD(); 
    }

    public AppBD(){
        try( var conn = getConnection())
        {
            carregarDriverJDBC(); 
            listarEstados(conn); 
            LocalizarEstado(conn,"TO"); 
        }
        catch (SQLException e) 
        {
            System.err.println("Não foi possível conectar ao Banco de Dados. " + e.getMessage());
        }  


    }
    private void LocalizarEstado(Connection conn, String uf) {
        try 
        {
            var statement = conn.createStatement();   
        }
        catch(SQLException e )
        {
            System.err.println("Erro ao executar consulta SQL" + e.getMessage());
        }
        
    }

    private void listarEstados(Connection conn) {
        
        try
        {
            System.out.println("Conexão ao BD realizada com sucesso."); 
            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while(result.next())
            { 
            System.out.printf("ID: %d Nome: %s UF %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        }
        catch (SQLException e) 
        {
            System.err.println("Não foi possível realizar consulta ao Banco de Dados. " + e.getMessage());
            
        }  
         
    }

    private Connection getConnection() throws SQLException{

     return DriverManager.getConnection(JDBC_URL, GITPOD, PASSWORD); 

    }
    private void carregarDriverJDBC() {
        try 
        {
            Class.forName("org.postgresql.Driver");
        } 
        catch (ClassNotFoundException e) 
        {
            System.err.println("Não foi possível carregar a biblioteca para acesso ao Banco de Dados. " + e.getMessage());
        }
    }
    
} 
