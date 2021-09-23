/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ini;

import controle.VersaoDAO;
import java.io.File;
import javax.swing.JOptionPane;
import modelo.Versao;
import util.config;
import visao.TelaLinkBd;
import visao.TelaLogin;

/**
 *
 * @author Neto
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Verificando se arquivo de conexão está criado
        File file = new File(".\\Conexao.cconf");

        if (file.exists()) {
            Versao v = new Versao();
            VersaoDAO vdao = new VersaoDAO();
            //buscando versão do BD
            v = vdao.buscaVersaoBD();
            //Buscando versão da aplicacao
            String versaoApp = new config().getVersao();

            if (v.getVersao() == null ? versaoApp == null : v.getVersao().equals(versaoApp)) {

                TelaLogin p = new TelaLogin();
                p.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Versão do BD (" + v.getVersao() + ") é diferente da aplicação (" + versaoApp + ").");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Arquivo de Conexão com Banco não configurado.");
            TelaLinkBd p = new TelaLinkBd();
            p.setVisible(true);
        }
    }

}
