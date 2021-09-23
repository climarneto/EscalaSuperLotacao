package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao1 {

    private objConexao obj;

    public Conexao1(objConexao obj){
        this.obj = obj;
    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName(obj.getDriver());
        } catch (ClassNotFoundException e) {
            new MensagemErro().getMsg(e.getMessage());
        }

        return DriverManager.getConnection(obj.getUrl(), obj.getUsuario(), obj.getSenha());
    }
}
