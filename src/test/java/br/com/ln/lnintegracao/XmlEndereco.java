/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ln.lnintegracao;

import java.util.Objects;

/**
 *
 * @author Marcos Naves
 */
class XmlEndereco {
    
    private String LOGRADOURO;
    private String UF;
    private String CIDADE;
    private String NUMERO;
    private String COMPLEMENTO;
    private String OBS;
    private String CEP;
    private String BAIRRO;

    public XmlEndereco() {
    }

    public XmlEndereco(String LOGRADOURO, String UF, String CIDADE, String NUMERO, String COMPLEMENTO, String OBS, String CEP, String BAIRRO) {
        this.LOGRADOURO = LOGRADOURO;
        this.UF = UF;
        this.CIDADE = CIDADE;
        this.NUMERO = NUMERO;
        this.COMPLEMENTO = COMPLEMENTO;
        this.OBS = OBS;
        this.CEP = CEP;
        this.BAIRRO = BAIRRO;
    }

    public String getLOGRADOURO() {
        return LOGRADOURO;
    }

    public void setLOGRADOURO(String LOGRADOURO) {
        this.LOGRADOURO = LOGRADOURO;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getCOMPLEMENTO() {
        return COMPLEMENTO;
    }

    public void setCOMPLEMENTO(String COMPLEMENTO) {
        this.COMPLEMENTO = COMPLEMENTO;
    }

    public String getOBS() {
        return OBS;
    }

    public void setOBS(String OBS) {
        this.OBS = OBS;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.LOGRADOURO);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final XmlEndereco other = (XmlEndereco) obj;
        if (!Objects.equals(this.LOGRADOURO, other.LOGRADOURO)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "XmlEndereco{" + "LOGRADOURO=" + LOGRADOURO + ", UF=" + UF + ", CIDADE=" + CIDADE + ", NUMERO=" + NUMERO + ", COMPLEMENTO=" + COMPLEMENTO + ", OBS=" + OBS + ", CEP=" + CEP + ", BAIRRO=" + BAIRRO + '}';
    }
    
    
}
