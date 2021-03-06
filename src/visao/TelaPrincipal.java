/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Toolkit;
import util.config;

/**
 *
 * @author llima
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    public static String logado;
    public static String versao;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        //Colocando Título na Tela
        this.setTitle(new config().getTitulo());
        //setando icone
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\icon.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabelBemvindoCadastro = new javax.swing.JLabel();
        jButtonBemVindoCadInstituicao = new javax.swing.JButton();
        jLabelBemvindoInstituicao = new javax.swing.JLabel();
        jButtonBemvindoCadUsuario = new javax.swing.JButton();
        jLabelBemvindoUsuario = new javax.swing.JLabel();
        jLabelBemvindoInicio = new javax.swing.JLabel();
        jButtonBemvindoNEDOCS = new javax.swing.JButton();
        jLabelBemvindoNedocs = new javax.swing.JLabel();
        jButtonBemvindoCedocs = new javax.swing.JButton();
        jLabelBemvindoCedocs = new javax.swing.JLabel();
        jButtonBemVindoEdwin = new javax.swing.JButton();
        jLabelBemvindoEdwin = new javax.swing.JLabel();
        jButtonBemvindoReadi = new javax.swing.JButton();
        jLabelBemVindoReadi = new javax.swing.JLabel();
        jButtonBemvindoSonet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuItemTelaBemvindo = new javax.swing.JMenuItem();
        jMenuItemNedocs = new javax.swing.JMenuItem();
        jMenuItemCedocs = new javax.swing.JMenuItem();
        jMenuItemEdwin = new javax.swing.JMenuItem();
        jMenuItemREADI = new javax.swing.JMenuItem();
        jMenuItemSonet = new javax.swing.JMenuItem();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemcadInstituicao = new javax.swing.JMenuItem();
        jMenuItemCadUsuario = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setClosable(true);
        jInternalFrameBemVindo.setMaximizable(true);
        jInternalFrameBemVindo.setResizable(true);
        jInternalFrameBemVindo.setTitle("Bem-vindo");
        jInternalFrameBemVindo.setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabelBemvindoCadastro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBemvindoCadastro.setText("Cadastros");

        jButtonBemVindoCadInstituicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/instituicao.png"))); // NOI18N
        jButtonBemVindoCadInstituicao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBemVindoCadInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBemVindoCadInstituicaoActionPerformed(evt);
            }
        });

        jLabelBemvindoInstituicao.setText("Instituição");

        jButtonBemvindoCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.jpg"))); // NOI18N
        jButtonBemvindoCadUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBemvindoCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBemvindoCadUsuarioActionPerformed(evt);
            }
        });

        jLabelBemvindoUsuario.setText("Usuário");

        jLabelBemvindoInicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBemvindoInicio.setText("Início");

        jButtonBemvindoNEDOCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NEDOCS.gif"))); // NOI18N
        jButtonBemvindoNEDOCS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBemvindoNEDOCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBemvindoNEDOCSActionPerformed(evt);
            }
        });

        jLabelBemvindoNedocs.setText("NEDOCS");

        jButtonBemvindoCedocs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CEDOCS.gif"))); // NOI18N
        jButtonBemvindoCedocs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelBemvindoCedocs.setText("CEDOCS");

        jButtonBemVindoEdwin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EDWIN.png"))); // NOI18N
        jButtonBemVindoEdwin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelBemvindoEdwin.setText("EDWIN");

        jButtonBemvindoReadi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/READI.png"))); // NOI18N
        jButtonBemvindoReadi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelBemVindoReadi.setText("READI");

        jButtonBemvindoSonet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SONET.png"))); // NOI18N
        jButtonBemvindoSonet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBemvindoSonet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBemvindoSonetActionPerformed(evt);
            }
        });

        jLabel1.setText("SONET");

        javax.swing.GroupLayout jInternalFrameBemVindoLayout = new javax.swing.GroupLayout(jInternalFrameBemVindo.getContentPane());
        jInternalFrameBemVindo.getContentPane().setLayout(jInternalFrameBemVindoLayout);
        jInternalFrameBemVindoLayout.setHorizontalGroup(
            jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                        .addComponent(jLabelBemvindoInstituicao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                        .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBemvindoInicio)
                            .addComponent(jLabelBemvindoCadastro)
                            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonBemvindoNEDOCS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonBemVindoCadInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBemvindoCedocs)
                                    .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                                        .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonBemvindoCadUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                            .addComponent(jButtonBemvindoCedocs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonBemVindoEdwin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelBemVindoReadi))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonBemvindoReadi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelBemvindoEdwin))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jButtonBemvindoSonet, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelBemvindoUsuario)))
                            .addComponent(jLabelBemvindoNedocs))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jInternalFrameBemVindoLayout.setVerticalGroup(
            jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBemvindoInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonBemvindoNEDOCS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButtonBemvindoCedocs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBemVindoEdwin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBemvindoReadi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBemvindoSonet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBemvindoNedocs)
                    .addComponent(jLabelBemvindoCedocs)
                    .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBemVindoReadi)
                        .addComponent(jLabelBemvindoEdwin)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabelBemvindoCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBemvindoCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBemVindoCadInstituicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBemvindoInstituicao)
                    .addComponent(jLabelBemvindoUsuario))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 0, 740, 360);

        jMenuInicio.setText("Início");

        jMenuItemTelaBemvindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemvindoActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItemTelaBemvindo);

        jMenuItemNedocs.setText("NEDOCS");
        jMenuItemNedocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNedocsActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItemNedocs);

        jMenuItemCedocs.setText("CEDOCS");
        jMenuItemCedocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCedocsActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItemCedocs);

        jMenuItemEdwin.setText("EDWIN");
        jMenuItemEdwin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEdwinActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItemEdwin);

        jMenuItemREADI.setText("READI");
        jMenuItemREADI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemREADIActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItemREADI);

        jMenuItemSonet.setText("SONET");
        jMenuItemSonet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSonetActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItemSonet);

        jMenuBar1.add(jMenuInicio);

        jMenuCadastros.setText("Cadastros");

        jMenuItemcadInstituicao.setText("Cadastrar instituição");
        jMenuItemcadInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemcadInstituicaoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemcadInstituicao);

        jMenuItemCadUsuario.setText("Cadastrar usuario");
        jMenuItemCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadUsuario);

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatorios.setText("Relatórios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuConsultas.setText("Consultas");
        jMenuBar1.add(jMenuConsultas);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuSairKeyPressed(evt);
            }
        });

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(756, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemcadInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemcadInstituicaoActionPerformed
FormInstituicao tela = new FormInstituicao();
tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemcadInstituicaoActionPerformed

    private void jMenuItemCedocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCedocsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCedocsActionPerformed

    private void jMenuItemEdwinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEdwinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEdwinActionPerformed

    private void jButtonBemvindoNEDOCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBemvindoNEDOCSActionPerformed
FormNedocs Tela = new FormNedocs();
Tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBemvindoNEDOCSActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuSairKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairKeyPressed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTelaBemvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemvindoActionPerformed
TelaPrincipal tela = new TelaPrincipal();
tela.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemTelaBemvindoActionPerformed

    private void jMenuItemNedocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNedocsActionPerformed
FormNedocs Tela = new FormNedocs();
Tela.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemNedocsActionPerformed

    private void jButtonBemvindoCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBemvindoCadUsuarioActionPerformed
 FormUsuario tela = new FormUsuario();
tela.setVisible(true);
      // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBemvindoCadUsuarioActionPerformed

    private void jMenuItemCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuarioActionPerformed
   FormUsuario tela = new FormUsuario();
tela.setVisible(true);
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadUsuarioActionPerformed

    private void jButtonBemVindoCadInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBemVindoCadInstituicaoActionPerformed
     FormInstituicao tela = new FormInstituicao();
tela.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBemVindoCadInstituicaoActionPerformed

    private void jButtonBemvindoSonetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBemvindoSonetActionPerformed
     FormSonet tela = new FormSonet();
tela.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBemvindoSonetActionPerformed

    private void jMenuItemSonetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSonetActionPerformed
FormSonet tela = new FormSonet();
tela.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSonetActionPerformed

    private void jMenuItemREADIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemREADIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemREADIActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBemVindoCadInstituicao;
    private javax.swing.JButton jButtonBemVindoEdwin;
    private javax.swing.JButton jButtonBemvindoCadUsuario;
    private javax.swing.JButton jButtonBemvindoCedocs;
    private javax.swing.JButton jButtonBemvindoNEDOCS;
    private javax.swing.JButton jButtonBemvindoReadi;
    private javax.swing.JButton jButtonBemvindoSonet;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBemVindoReadi;
    private javax.swing.JLabel jLabelBemvindoCadastro;
    private javax.swing.JLabel jLabelBemvindoCedocs;
    private javax.swing.JLabel jLabelBemvindoEdwin;
    private javax.swing.JLabel jLabelBemvindoInicio;
    private javax.swing.JLabel jLabelBemvindoInstituicao;
    private javax.swing.JLabel jLabelBemvindoNedocs;
    private javax.swing.JLabel jLabelBemvindoUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItemCadUsuario;
    private javax.swing.JMenuItem jMenuItemCedocs;
    private javax.swing.JMenuItem jMenuItemEdwin;
    private javax.swing.JMenuItem jMenuItemNedocs;
    private javax.swing.JMenuItem jMenuItemREADI;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSonet;
    private javax.swing.JMenuItem jMenuItemTelaBemvindo;
    private javax.swing.JMenuItem jMenuItemcadInstituicao;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
