/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Conexao;

/**
 *
 * @author cneto
 */
public class GenericDAO {

    protected Connection con;

    protected Connection conectar(String banco) {
        try {
            con = new Conexao(banco).getConnection();
        } catch (SQLException ex) {
            this.imprimeErro("Erro ao conectar.");
        }
        return con;
    }

    protected void fechar() {
        try {
            con.close();
        } catch (SQLException ex) {
            this.imprimeErro("Erro ao fechar conexão.");
        }

    }

    protected void imprimeErro(String e) {
        JOptionPane.showMessageDialog(null, e, "Erro Crítico!", 0);//To change body of generated methods, choose Tools | Templates.
        System.err.println(e);
    }

}
