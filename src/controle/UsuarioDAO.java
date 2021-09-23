/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import modelo.Usuario;
import util.SenhaBanco;

/**
 *
 * @author Neto
 */
public class UsuarioDAO extends GenericDAO {

    private PreparedStatement comando;

    public boolean insereUsuario(Usuario u) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        this.conectar("Conexao");
        boolean sucesso = false;
        String sql = "INSERT INTO public.usuarios(                                                           "
                + "	usuario, cpf, nome_completo, data_nascimento, telefone, email, instituicao, cargo, "
                + "	vinculo, situacao, tipo_usuario, senha, celular, tipo_senha)                                               "
                + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 'P')                                        ";

        try {

            comando = con.prepareStatement(sql);
            comando.setString(1, u.getUsuario());
            comando.setLong(2, u.getCpf());
            comando.setString(3, u.getNome());
            //convertendo util.Date em sql.Date
            java.util.Date dataUtil = u.getDataNascimento();
            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            comando.setDate(4, dataSql);
            comando.setLong(5, u.getTelefone());
            comando.setString(6, u.getEmail());
            comando.setLong(7, u.getInstituicao().getCnpj());
            comando.setString(8, u.getCargo());
            comando.setString(9, u.getVinculo());
            comando.setString(10, u.getSituacao());
            comando.setString(11, u.getTipo());
            //setando senha padrao
            String senhaPadrao = "1234";
            //Colocando senha criptografada
            comando.setString(12, SenhaBanco.encrypt(senhaPadrao));
            comando.setLong(13, u.getCelular());

            comando.execute();
            sucesso = true;
        } catch (SQLException ex) {
            this.imprimeErro("Erro ao Gravar Usuarios no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return sucesso;
    }

    public List<Usuario> buscaUsuario(String descricao) {
        this.conectar("Conexao");
        List<Usuario> lista = new ArrayList<>();

        ResultSet rs = null;
        String sql = "SELECT usuario, cpf, nome_completo, data_nascimento, telefone, email, instituicao, cargo, vinculo, situacao, "
                + "tipo_usuario, celular                                                                  "
                + "	FROM public.usuarios                                                                                  "
                + "	WHERE usuario like '%' || ? || '%'                                                                    "
                + "	OR    nome_completo like '%' || ? || '%'                                                              ";
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, descricao);
            comando.setString(2, descricao);
            rs = this.comando.executeQuery();
            while (rs.next()) {
                if (rs.getString("usuario") != null) {
                    //Criando Objeto da pesquisa
                    Usuario u = new Usuario();
                    u.setUsuario(rs.getString("usuario"));
                    u.setCpf(rs.getLong("cpf"));
                    u.setNome(rs.getString("nome_completo"));
                    u.setDataNascimento(rs.getDate("data_nascimento"));
                    u.setTelefone(rs.getLong("telefone"));
                    u.setEmail(rs.getString("email"));

                    InstituicaoDAO idao = new InstituicaoDAO();
                    u.setInstituicao(idao.buscaInstituicaoPorCnpj(rs.getLong("instituicao")));

                    u.setCargo(rs.getString("cargo"));
                    u.setVinculo(rs.getString("vinculo"));
                    u.setSituacao(rs.getString("situacao"));
                    u.setTipo(rs.getString("tipo_usuario"));
                    u.setCelular(rs.getLong("celular"));
                    //Adicionando Instituição a Lista
                    lista.add(u);
                }
            }

        } catch (SQLException ex) {
            this.imprimeErro("Erro ao verificar Usuarios Inserido no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return lista;
    }

    public Usuario buscaUsuarioPorCodigo(String usuario) {
        this.conectar("Conexao");
        Usuario u = new Usuario();
        ResultSet rs = null;
        String sql = "SELECT usuario, cpf, nome_completo, data_nascimento, telefone, email, instituicao, cargo, vinculo, "
                + "situacao, tipo_usuario, celular                                                 "
                + "	FROM public.usuarios                                                                           "
                + "	WHERE usuario = ?                                                                              ";

        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, usuario);
            rs = this.comando.executeQuery();
            while (rs.next()) {
                if (rs.getString("usuario") != null) {
                    //Criando Objeto da pesquisa

                    u.setUsuario(rs.getString("usuario"));
                    u.setCpf(rs.getLong("cpf"));
                    u.setNome(rs.getString("nome_completo"));
                    u.setDataNascimento(rs.getDate("data_nascimento"));
                    u.setTelefone(rs.getLong("telefone"));
                    u.setEmail(rs.getString("email"));

                    InstituicaoDAO idao = new InstituicaoDAO();
                    u.setInstituicao(idao.buscaInstituicaoPorCnpj(rs.getLong("instituicao")));

                    u.setCargo(rs.getString("cargo"));
                    u.setVinculo(rs.getString("vinculo"));
                    u.setSituacao(rs.getString("situacao"));
                    u.setTipo(rs.getString("tipo_usuario"));
                    u.setCelular(rs.getLong("celular"));

                }
            }

        } catch (SQLException ex) {
            this.imprimeErro("Erro ao verificar Usuarios Inserido no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return u;
    }

    public boolean editarUsuario(Usuario u) {
        this.conectar("Conexao");
        boolean sucesso = false;
        String sql = "UPDATE public.usuarios                                                                                     "
                + "	SET cpf=?, nome_completo=?, data_nascimento=?, telefone=?, email=?, instituicao=?, cargo=?, vinculo=?, "
                + "	situacao=?, tipo_usuario=?, celular=?                                                                  "
                + "	WHERE usuario = ?                                                                                      ";

        try {

            comando = con.prepareStatement(sql);
            comando.setLong(1, u.getCpf());
            comando.setString(2, u.getNome());
            comando.setDate(3, (Date) u.getDataNascimento());
            comando.setLong(4, u.getTelefone());
            comando.setString(5, u.getEmail());
            comando.setLong(6, u.getInstituicao().getCnpj());
            comando.setString(7, u.getCargo());
            comando.setString(8, u.getVinculo());
            comando.setString(9, u.getSituacao());
            comando.setString(10, u.getTipo());
            comando.setLong(11, u.getCelular());
            comando.setString(12, u.getUsuario());

            comando.execute();
            sucesso = true;
        } catch (SQLException ex) {
            this.imprimeErro("Erro ao Editar Usuarios no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return sucesso;
    }

    public boolean reiniciaSenha(String usuario) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        this.conectar("Conexao");
        boolean sucesso = false;
        String sql = "UPDATE public.usuarios         "
                + "	SET senha=?, tipo_senha= 'P' "
                + "	WHERE usuario = ?            ";

        try {

            comando = con.prepareStatement(sql);
            //setando senha padrao
            String senhaPadrao = "1234";
            //Colocando senha criptografada
            comando.setString(1, SenhaBanco.encrypt(senhaPadrao));
            comando.setString(2, usuario);

            comando.execute();
            sucesso = true;
        } catch (SQLException ex) {
            this.imprimeErro("Erro ao Reiniciar Senha do Usuario no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return sucesso;
    }

    public String buscaSenha(String usuario) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        this.conectar("Conexao");
        String senha = null;
        ResultSet rs = null;
        String sql = "SELECT senha             "
                + "	FROM public.usuarios "
                + "	WHERE usuario = ?    ";

        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, usuario);
            rs = this.comando.executeQuery();
            while (rs.next()) {
                if (rs.getString("senha") != null) {
                    senha = rs.getString("senha");
                }
            }

        } catch (SQLException ex) {
            this.imprimeErro("Erro ao verificar Senha do Usuario Inserido no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return senha;
    }
    
    public boolean checaSenhaProvisoria(String usuario) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        this.conectar("Conexao");
        String tipoSenha = null;
        boolean provisorio = true;
        ResultSet rs = null;
        String sql = "SELECT tipo_senha             "
                + "	FROM public.usuarios "
                + "	WHERE usuario = ?    ";

        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, usuario);
            rs = this.comando.executeQuery();
            while (rs.next()) {
                if (rs.getString("tipo_senha") != null) {
                    tipoSenha = rs.getString("tipo_senha");
                }
            }

        } catch (SQLException ex) {
            this.imprimeErro("Erro ao verificar Tipo da Senha do Usuário Inserido no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        if("P".equals(tipoSenha)){
            provisorio = true;
        } else {
            provisorio = false;
        }
        return provisorio;
    }
    
    public boolean atualizaSenha(String usuario, String senha) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        this.conectar("Conexao");
        boolean sucesso = false;
        String sql = "UPDATE public.usuarios         "
                + "	SET senha=?, tipo_senha= 'D' "
                + "	WHERE usuario = ?            ";

        try {

            comando = con.prepareStatement(sql);
            //Colocando senha criptografada
            comando.setString(1, SenhaBanco.encrypt(senha));
            comando.setString(2, usuario);

            comando.execute();
            sucesso = true;
        } catch (SQLException ex) {
            this.imprimeErro("Erro ao Atualizar senha do Usuario no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return sucesso;
    }

}
