/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Neto
 */
public class objConexao {

    private String nome;
    private String servidor;
    private String instancia;
    private String porta;
    private String banco;
    private String usuario;
    private String senha;
    private String agente;

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getDriver() {

        if (agente.equals("SqlServer")) {
            return "net.sourceforge.jtds.jdbc.Driver";
        }

        if (agente.equals("Oracle")) {
            return "oracle.jdbc.driver.OracleDriver";
        }

        if (agente.equals("Firebird")) {
            return "org.firebirdsql.jdbc.FBDriver";
        }

        if (agente.equals("MySql")) {
            return "com.mysql.jdbc.Driver";
        }

        if (agente.equals("Postgre")) {
            return "org.postgresql.Driver";
        }

        if (agente.equals("Cache")) {
            return "com.intersys.jdbc.CacheDriver";
        }

        return "";
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getUrl() {

        if (this.agente.equals("SqlServer")) {

            if (this.instancia.equals("") && this.porta.equals("")) {
                return "jdbc:jtds:sqlserver://" + this.servidor + ";databaseName=" + this.banco + ";";
            }

            if (this.instancia.equals("") && !this.porta.equals("")) {
                return "jdbc:jtds:sqlserver://" + this.servidor + ":" + this.porta + ";databaseName=" + this.banco + ";";
            }

            if (!this.instancia.equals("") && this.porta.equals("")) {
                return "jdbc:sqlserver://" + this.servidor + ";instanceName=" + this.instancia + ";databaseName=" + this.banco + ";";
            }

            if (!this.instancia.equals("") && !this.porta.equals("")) {
                return "jdbc:sqlserver://" + this.servidor + ";instanceName=" + this.instancia + ":" + this.porta + ";databaseName=" + this.banco + ";";
            }
        }

        if (this.agente.equals("Oracle")) {

            if (this.porta.equals("")) {
                return "jdbc:oracle:thin:@" + this.servidor + ":" + this.banco;
            }

            if (!this.porta.equals("")) {
                return "jdbc:oracle:thin:@" + this.servidor + ":" + this.porta + ":" + this.banco;
            }
        }

        if (this.agente.equals("Firebird")) {
            return "jdbc:firebirdsql:" + this.servidor + "/" + this.porta + ":" + this.banco;
        }

        if (this.agente.equals("MySql")) {

            if (this.porta.equals("")) {
                return "jdbc:mysql://" + this.servidor + "/" + this.banco;
            }

            if (!this.porta.equals("")) {
                return "jdbc:mysql://" + this.servidor + ":" + this.porta + "/" + this.banco;
            }
        }

        if (this.agente.equals("Postgre")) {

            if (this.porta.equals("")) {
                return "jdbc:postgresql://" + this.servidor + "/" + this.banco;
            }

            if (!this.porta.equals("")) {
                return "jdbc:postgresql://" + this.servidor + ":" + this.porta + "/" + this.banco;
            }
        }

        if (this.agente.equals("Cache")) {
            return "jdbc:Cache://" + this.servidor + ":" + this.porta + "/" + this.banco;
        }

        return "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
