/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Versao;

/**
 *
 * @author Neto
 */
public class VersaoDAO extends GenericDAO {

    private PreparedStatement comando;

    public Versao buscaVersaoBD() {
        this.conectar("Conexao");
        Versao v = new Versao();
        ResultSet rs = null;
        String sql = "SELECT versao, data_versao "
                + "	FROM public.versao      ";

        try {
            comando = con.prepareStatement(sql);
            rs = this.comando.executeQuery();
            while (rs.next()) {
                if (rs.getString("versao") != null) {
                    //Criando Objeto da pesquisa

                    v.setVersao(rs.getString("versao"));
                    v.setDataVersao(rs.getDate("data_versao"));

                }
            }

        } catch (SQLException ex) {
            this.imprimeErro("Erro ao verificar Versão no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return v;
    }

}
