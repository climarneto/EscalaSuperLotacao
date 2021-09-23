/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Neto
 */
public class Conexao {

    Connection con = null;
    private objConexao obj;

    public Conexao(String banco) {
        obj = buscaDadosArquivo(banco);
    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName(obj.getDriver());
            con = DriverManager.getConnection(obj.getUrl(), obj.getUsuario(), obj.getSenha());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no sistema, se o problema persistir contate o administrador:\n Erro na Conex�o com Banco\n" + e, "ATEN��O", JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }

    private objConexao buscaDadosArquivo(String nomeArquivo) {
        InputStream is = null;
        String caminhoArquivoOrigem = ".\\" + nomeArquivo + ".cconf";
        try {
            is = new FileInputStream(caminhoArquivoOrigem);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String linha = null;

        try {
            linha = br.readLine(); // primeira linha
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        obj = new objConexao();

        while (linha != null) {
            try {
                linha = SenhaBanco.decrypt(linha);
                if (linha.contains("linha1:")) {
                    obj.setNome(linha.replace("linha1:", ""));
                }
                if (linha.contains("linha2:")) {
                    obj.setServidor(linha.replace("linha2:", ""));
                }
                if (linha.contains("linha3:")) {
                    obj.setInstancia(linha.replace("linha3:", ""));
                }
                if (linha.contains("linha4:")) {
                    obj.setPorta(linha.replace("linha4:", ""));
                }
                if (linha.contains("linha5:")) {
                    obj.setBanco(linha.replace("linha5:", ""));
                }
                if (linha.contains("linha6:")) {
                    obj.setUsuario(linha.replace("linha6:", ""));
                }
                if (linha.contains("linha7:")) {
                    obj.setSenha(linha.replace("linha7:", ""));
                }
                if (linha.contains("linha8:")) {
                    obj.setAgente(linha.replace("linha8:", ""));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            try {
                linha = br.readLine();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        try {
            br.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        return obj;
    }

    public void Close() throws SQLException {
        con.close();
    }

}
