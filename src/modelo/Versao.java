/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Neto
 */
public class Versao {
    private String versao;
    private Date dataVersao;

    /**
     * @return the versao
     */
    public String getVersao() {
        return versao;
    }

    /**
     * @param versao the versao to set
     */
    public void setVersao(String versao) {
        this.versao = versao;
    }

    /**
     * @return the dataVersao
     */
    public Date getDataVersao() {
        return dataVersao;
    }

    /**
     * @param dataVersao the dataVersao to set
     */
    public void setDataVersao(Date dataVersao) {
        this.dataVersao = dataVersao;
    }
    
}
