package banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    Connection conBanco;

    public boolean abrirConexao(){

        String url = "jdbc:mysql://localhost/pizzariaop?user=root&password=Lilidi";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conBanco = DriverManager.getConnection(url);
            return true;
        }catch(Exception erro){
            erro.printStackTrace();
            return false;
        }
    }

    public boolean fecharConexao(){
        try{
            conBanco.close();
            return true;
        }catch(Exception erro){
            erro.printStackTrace();
            return false;
        }
    }

    public Connection obterConexao(){
        return conBanco;
    }
}