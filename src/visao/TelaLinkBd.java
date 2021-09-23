/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Cursor;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.Conexao1;
import util.SenhaBanco;
import util.config;
import util.objConexao;

/**
 *
 * @author llima
 */
public class TelaLinkBd extends javax.swing.JFrame {

    private String msgErro = "";

    /**
     * Creates new form CadUsuario
     */
    public TelaLinkBd() {
        initComponents();
        //setando título
        this.setTitle(new config().getTitulo() + " | Configurando Conexão com BD");
        //setando icone
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\icon.png"));
        
        jButtonGravar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtServidor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInstancia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomeBanco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jButtonGravar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonTestar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Configurando Banco de Dados");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 280, 17);

        jPanelCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Servidor: ");
        jPanelCadastro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanelCadastro.add(txtServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 20, 560, -1));

        jLabel3.setText("Instância: ");
        jPanelCadastro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanelCadastro.add(txtInstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 60, 550, -1));

        jLabel4.setText("Porta:");
        jPanelCadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanelCadastro.add(txtPorta, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 90, 550, -1));

        jLabel5.setText("Nome Banco: ");
        jPanelCadastro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanelCadastro.add(txtNomeBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 130, 550, -1));

        jLabel6.setText("Usuário:");
        jPanelCadastro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setText("Senha:");
        jPanelCadastro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanelCadastro.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 180, 550, -1));

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonGravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        jButtonTestar.setText("Testar");
        jButtonTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestarActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonTestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));
        jPanelCadastro.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 550, -1));

        getContentPane().add(jPanelCadastro);
        jPanelCadastro.setBounds(10, 60, 710, 290);

        setSize(new java.awt.Dimension(740, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        this.limpatela();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        // TODO add your handling code here:
        if (camposValidos()) {
            Cursor cursor = Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
            this.setCursor(cursor);
            try {
                boolean sucesso = false;
                sucesso = processar();
                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Processo Finalizado ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    jButtonTestar.setEnabled(false);
                    jButtonLimpar.setEnabled(false);
                    jButtonGravar.setEnabled(false);
                    jButtonFechar.setEnabled(true);
                    this.inativarCampos();

                } else {
                    JOptionPane.showMessageDialog(null, "Falha no processo ", "Falha", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);

            } finally {
                cursor = Cursor.getDefaultCursor();

                this.setCursor(cursor);

            }
        } else {
            JOptionPane.showMessageDialog(null, msgErro);
            msgErro = "";

        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonTestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestarActionPerformed
        // TODO add your handling code here:
        if (camposValidos()) {
            objConexao obj = new objConexao();
            obj.setNome("Conexao");
            obj.setServidor(txtServidor.getText());
            obj.setInstancia(txtInstancia.getText());
            obj.setPorta(txtPorta.getText());
            obj.setBanco(txtNomeBanco.getText());
            obj.setUsuario(txtUsuario.getText());
            obj.setSenha(txtSenha.getText());
            obj.setAgente("Postgre");

            Connection conn = null;
            try {
                conn = new Conexao1(obj).getConnection();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            try {
                if (!conn.isClosed()) {
                    JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
                    conn.close();
                    jButtonGravar.setEnabled(true);
                    jButtonTestar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao realizar conexão!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaLinkBd.class.getName()).log(Level.SEVERE, null, ex);
            }


        } else {
            JOptionPane.showMessageDialog(null, msgErro);
            msgErro = "";
        }
    }//GEN-LAST:event_jButtonTestarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLinkBd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLinkBd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLinkBd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLinkBd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLinkBd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonTestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JTextField txtInstancia;
    private javax.swing.JTextField txtNomeBanco;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtServidor;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
public void limpatela() {
        //limpando os campos
        txtUsuario.setText(null);
        txtInstancia.setText(null);
        txtPorta.setText(null);
        txtNomeBanco.setText(null);
        txtSenha.setText(null);
        txtServidor.setText(null);

        //setando os botões
        jButtonLimpar.setEnabled(true);
        jButtonGravar.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonTestar.setEnabled(true);
    }

    private boolean camposValidos() {

        if (txtServidor.getText().equals("")) {
            msgErro = msgErro + "Campo servidor deve ser informado! \n";

        }

        if (msgErro.equals("")) {
            return true;

        }
        return false;

    }

    private boolean processar() {
        FileWriter arquivo = null;
        try {
            arquivo = new FileWriter(".\\Conexao.cconf", false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

            return false;

        }
        /*================================================================*/ //linha 1 = Nome Conexao
        String linha1 = "Conexao";

        try {
            linha1 = SenhaBanco.encrypt("linha1:" + linha1) + "\r\n";

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        try {
            arquivo.write(linha1);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        /*================================================================*/ //linha 2 = Nome Servidor
        String linha2 = txtServidor.getText();

        try {
            linha2 = SenhaBanco.encrypt("linha2:" + linha2) + "\r\n";

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        try {
            arquivo.write(linha2);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        /*================================================================*/ //linha 3 = Nome da Instancia
        String linha3 = txtInstancia.getText();

        try {
            linha3 = SenhaBanco.encrypt("linha3:" + linha3) + "\r\n";

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        try {
            arquivo.write(linha3);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        /*================================================================*/ //linha 4 = Porta da conexao
        String linha4 = txtPorta.getText();

        try {
            linha4 = SenhaBanco.encrypt("linha4:" + linha4) + "\r\n";

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        try {
            arquivo.write(linha4);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        /*================================================================*/ //linha 5 = Banco
        String linha5 = txtNomeBanco.getText();

        try {
            linha5 = SenhaBanco.encrypt("linha5:" + linha5) + "\r\n";

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        try {
            arquivo.write(linha5);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        /*================================================================*/ //linha 6 = Usuário
        String linha6 = txtUsuario.getText();

        try {
            linha6 = SenhaBanco.encrypt("linha6:" + linha6) + "\r\n";

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        try {
            arquivo.write(linha6);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        /*================================================================*/ //linha 7 = Senha
        String linha7 = txtSenha.getText();

        try {
            linha7 = SenhaBanco.encrypt("linha7:" + linha7) + "\r\n";

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        try {
            arquivo.write(linha7);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        /*================================================================*/ //linha 8 = Agente BD
        String linha8 = "Postgre"; //Informando o Banco tipo Postgres

        try {
            linha8 = SenhaBanco.encrypt("linha8:" + linha8) + "\r\n";

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        try {
            arquivo.write(linha8);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        /*================================================================*/
        try {
            arquivo.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

            return false;

        }
        return true;

    }
    private void acaoTelaInicial() {
        acaoLimpaCampos();
        txtServidor.setEditable(false);
        txtInstancia.setEditable(false);
        txtPorta.setEditable(false);
        txtNomeBanco.setEditable(false);
        txtUsuario.setEditable(false);
        txtSenha.setEditable(false);


    }
    private void acaoLimpaCampos() {
        txtServidor.setText("");
        txtInstancia.setText("");
        txtPorta.setText("");
        txtNomeBanco.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
    }

    private void inativarCampos() {
        txtServidor.setEnabled(false);
        txtInstancia.setEnabled(false);
        txtPorta.setEnabled(false);
        txtNomeBanco.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtSenha.setEnabled(false);
    }

}
