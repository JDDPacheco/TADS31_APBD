package banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {
    Connection conBanco;
    public boolean abrirConexao(){
        String url ="jdbc:mysql://localhost/pizzariaOP?user=root&password=root";
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
