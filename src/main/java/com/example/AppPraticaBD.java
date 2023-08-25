package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppPraticaBD {
    String PASSWORD = "";
    String GITPOD = "gitpod";
    String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static void main(String[] args) 
    {
        new AppPraticaBD(); 
    }

    public AppPraticaBD()
    {
        try 
        {
            var conn = DriverManager.getConnection(JDBC_URL, GITPOD, PASSWORD); 
            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while(result.next())
            { 
            System.out.printf("ID: %d Nome: %s UF %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        

    }
}