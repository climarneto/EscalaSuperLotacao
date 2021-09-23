/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.objects.Global;
import modelo.Instituicao;

/**
 *
 * @author Neto
 */
public class InstituicaoDAO extends GenericDAO {

    private PreparedStatement comando;

    public boolean insereInstituicao(Instituicao i) {
        this.conectar("Conexao");
        boolean sucesso = false;
        String sql = "INSERT INTO public.instituicoes        "
                + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);                                       ";

        try {

            comando = con.prepareStatement(sql);
            comando.setLong(1, i.getCnpj());
            comando.setString(2, i.getNomeFantasia());
            comando.setLong(3, i.getCnes());
            comando.setString(4, i.getRazaoSocial());
            comando.setString(5, i.getNaturezaJuridica());
            comando.setString(6, i.getLogradouro());
            comando.setInt(7, i.getNumero());
            comando.setString(8, i.getComplemento());
            comando.setString(9, i.getBairro());
            comando.setString(10, i.getMunicipio());
            comando.setString(11, i.getUf());
            comando.setInt(12, i.getCep());
            comando.setLong(13, i.getTelefone());
            comando.setString(14, i.getTipo());
            comando.setInt(15, i.getQtdLeitos());
            comando.execute();
            sucesso = true;
        } catch (SQLException ex) {
            this.imprimeErro("Erro ao Gravar Instituicoes no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return sucesso;
    }

    public List<Instituicao> buscaInstituicao(String descricao) {
        this.conectar("Conexao");
        List<Instituicao> lista = new ArrayList<>();

        ResultSet rs = null;
        String sql = "SELECT cnpj, nome_fantasia, cnes, razao_social, natureza_juridica, logradouro, numero, "
                + "    complemento, bairro, municipio, uf, cep, telefone, tipo, qtd_leitos                "
                + "	FROM public.instituicoes                                                           "
                + "	WHERE nome_fantasia like '%' || ? || '%'                                           "
                + "	OR razao_social like '%' || ? || '%'                                               ";
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, descricao);
            comando.setString(2, descricao);
            rs = this.comando.executeQuery();
            while (rs.next()) {
                if (rs.getString("cnpj") != null) {
                    //Criando Objeto da pesquisa
                    Instituicao i = new Instituicao();
                    i.setCnpj(rs.getLong("cnpj"));
                    i.setNomeFantasia(rs.getString("nome_fantasia"));
                    i.setCnes(rs.getLong("cnes"));
                    i.setRazaoSocial(rs.getString("razao_social"));
                    i.setNaturezaJuridica(rs.getString("natureza_juridica"));
                    i.setLogradouro(rs.getString("logradouro"));
                    i.setNumero(rs.getInt("numero"));
                    i.setComplemento(rs.getString("complemento"));
                    i.setBairro(rs.getString("bairro"));
                    i.setMunicipio(rs.getString("municipio"));
                    i.setUf(rs.getString("uf"));
                    i.setCep(rs.getInt("cep"));
                    i.setTelefone(rs.getLong("telefone"));
                    i.setTipo(rs.getString("tipo"));
                    i.setQtdLeitos(rs.getInt("qtd_leitos"));
                    //Adicionando Instituição a Lista
                    lista.add(i);
                }
            }

        } catch (SQLException ex) {
            this.imprimeErro("Erro ao verificar Instituicoes Inserido no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return lista;
    }

    public Instituicao buscaInstituicaoPorCnpj(Long cnpj) {
        this.conectar("Conexao");
        Instituicao i = new Instituicao();
        ResultSet rs = null;
        String sql = "SELECT cnpj, nome_fantasia, cnes, razao_social, natureza_juridica, logradouro, numero, "
                + "    complemento, bairro, municipio, uf, cep, telefone, tipo, qtd_leitos                "
                + "	FROM public.instituicoes                                                           "
                + "	WHERE cnpj = ?                                           ";

        try {
            comando = con.prepareStatement(sql);
            comando.setLong(1, cnpj);
            rs = this.comando.executeQuery();
            while (rs.next()) {
                if (rs.getString("cnpj") != null) {
                    //Criando Objeto da pesquisa

                    i.setCnpj(rs.getLong("cnpj"));
                    i.setNomeFantasia(rs.getString("nome_fantasia"));
                    i.setCnes(rs.getLong("cnes"));
                    i.setRazaoSocial(rs.getString("razao_social"));
                    i.setNaturezaJuridica(rs.getString("natureza_juridica"));
                    i.setLogradouro(rs.getString("logradouro"));
                    i.setNumero(rs.getInt("numero"));
                    i.setComplemento(rs.getString("complemento"));
                    i.setBairro(rs.getString("bairro"));
                    i.setMunicipio(rs.getString("municipio"));
                    i.setUf(rs.getString("uf"));
                    i.setCep(rs.getInt("cep"));
                    i.setTelefone(rs.getLong("telefone"));
                    i.setTipo(rs.getString("tipo"));
                    i.setQtdLeitos(rs.getInt("qtd_leitos"));

                }
            }

        } catch (SQLException ex) {
            this.imprimeErro("Erro ao verificar Instituicoes Inserido no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return i;
    }
    
    public Instituicao buscaInstituicaoPorNomeFantasia(String nome) {
        this.conectar("Conexao");
        Instituicao i = new Instituicao();
        ResultSet rs = null;
        String sql = "SELECT cnpj, nome_fantasia, cnes, razao_social, natureza_juridica, logradouro, numero, "
                + "    complemento, bairro, municipio, uf, cep, telefone, tipo, qtd_leitos                "
                + "	FROM public.instituicoes                                                           "
                + "	WHERE nome_fantasia = ?                                           ";

        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, nome);
            rs = this.comando.executeQuery();
            while (rs.next()) {
                if (rs.getString("cnpj") != null) {
                    //Criando Objeto da pesquisa

                    i.setCnpj(rs.getLong("cnpj"));
                    i.setNomeFantasia(rs.getString("nome_fantasia"));
                    i.setCnes(rs.getLong("cnes"));
                    i.setRazaoSocial(rs.getString("razao_social"));
                    i.setNaturezaJuridica(rs.getString("natureza_juridica"));
                    i.setLogradouro(rs.getString("logradouro"));
                    i.setNumero(rs.getInt("numero"));
                    i.setComplemento(rs.getString("complemento"));
                    i.setBairro(rs.getString("bairro"));
                    i.setMunicipio(rs.getString("municipio"));
                    i.setUf(rs.getString("uf"));
                    i.setCep(rs.getInt("cep"));
                    i.setTelefone(rs.getLong("telefone"));
                    i.setTipo(rs.getString("tipo"));
                    i.setQtdLeitos(rs.getInt("qtd_leitos"));

                }
            }

        } catch (SQLException ex) {
            this.imprimeErro("Erro ao verificar Instituicoes Inserido no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return i;
    }

    public boolean editarInstituicao(Instituicao i) {
        this.conectar("Conexao");
        boolean sucesso = false;
        String sql = "UPDATE public.instituicoes                                                                        "
                + "	SET nome_fantasia=?, cnes=?, razao_social=?, natureza_juridica=?, logradouro=?,       "
                + "	numero=?, complemento=?, bairro=?, municipio=?, uf=?, cep=?, telefone=?, tipo=?, qtd_leitos=? "
                + "	WHERE cnpj = ?                                                                            ";

        try {

            comando = con.prepareStatement(sql);
            comando.setString(1, i.getNomeFantasia());
            comando.setLong(2, i.getCnes());
            comando.setString(3, i.getRazaoSocial());
            comando.setString(4, i.getNaturezaJuridica());
            comando.setString(5, i.getLogradouro());
            comando.setInt(6, i.getNumero());
            comando.setString(7, i.getComplemento());
            comando.setString(8, i.getBairro());
            comando.setString(9, i.getMunicipio());
            comando.setString(10, i.getUf());
            comando.setInt(11, i.getCep());
            comando.setLong(12, i.getTelefone());
            comando.setString(13, i.getTipo());
            comando.setInt(14, i.getQtdLeitos());

            comando.setLong(15, i.getCnpj());

            comando.execute();
            sucesso = true;
        } catch (SQLException ex) {
            this.imprimeErro("Erro ao Editar Instituicoes no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return sucesso;
    }

    public boolean excluirInstituicao(Long codigo) {
        this.conectar("Conexao");
        boolean sucesso = false;
        String sql = "DELETE FROM public.instituicoes "
                + "	WHERE cnpj = ?              ";

        try {

            comando = con.prepareStatement(sql);
            comando.setLong(1, codigo);
            comando.execute();
            sucesso = true;
        } catch (SQLException ex) {
            this.imprimeErro("Erro ao Excluir Instituicoes no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return sucesso;
    }

    public List<Instituicao> buscaTodasInstituicoes() {
        this.conectar("Conexao");
        List<Instituicao> lista = new ArrayList<>();

        ResultSet rs = null;
        String sql = "SELECT cnpj, nome_fantasia, cnes, razao_social, natureza_juridica, logradouro, numero, complemento, bairro, "
                + "municipio, uf, cep, telefone, tipo, qtd_leitos                                                              "
                + "	FROM public.instituicoes                                                                                ";
        try {
            comando = con.prepareStatement(sql);
            rs = this.comando.executeQuery();
            while (rs.next()) {
                if (rs.getString("cnpj") != null) {
                    //Criando Objeto da pesquisa
                    Instituicao i = new Instituicao();
                    i.setCnpj(rs.getLong("cnpj"));
                    i.setNomeFantasia(rs.getString("nome_fantasia"));
                    i.setCnes(rs.getLong("cnes"));
                    i.setRazaoSocial(rs.getString("razao_social"));
                    i.setNaturezaJuridica(rs.getString("natureza_juridica"));
                    i.setLogradouro(rs.getString("logradouro"));
                    i.setNumero(rs.getInt("numero"));
                    i.setComplemento(rs.getString("complemento"));
                    i.setBairro(rs.getString("bairro"));
                    i.setMunicipio(rs.getString("municipio"));
                    i.setUf(rs.getString("uf"));
                    i.setCep(rs.getInt("cep"));
                    i.setTelefone(rs.getLong("telefone"));
                    i.setTipo(rs.getString("tipo"));
                    i.setQtdLeitos(rs.getInt("qtd_leitos"));
                    //Adicionando Instituição a Lista
                    lista.add(i);
                }
            }

        } catch (SQLException ex) {
            this.imprimeErro("Erro ao verificar Instituicoes Inserido no Banco de Dados: " + ex.getMessage());
        } finally {
            this.fechar();
        }
        return lista;
    }
}
