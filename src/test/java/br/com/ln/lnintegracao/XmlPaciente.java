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
class XmlPaciente {
    
    private String PRONTUARIO;
    private String NOME;
    private String NASCIMENTO;
    private String RG;
    private String CPF;
    private Character SEXO;
    private String CARTAO_SUS;
    private String NOME_RESP;
    private String TEL;
    private String CEL;
    private XmlEndereco  ENDERECO;

    public XmlPaciente() {
    }

    public XmlPaciente(String PRONTUARIO, String NOME, String NASCIMENTO, String RG, String CPF, Character SEXO, String CARTAO_SUS, String NOME_RESP, String TEL, String CEL, XmlEndereco ENDERECO) {
        this.PRONTUARIO = PRONTUARIO;
        this.NOME = NOME;
        this.NASCIMENTO = NASCIMENTO;
        this.RG = RG;
        this.CPF = CPF;
        this.SEXO = SEXO;
        this.CARTAO_SUS = CARTAO_SUS;
        this.NOME_RESP = NOME_RESP;
        this.TEL = TEL;
        this.CEL = CEL;
        this.ENDERECO = ENDERECO;
    }

    public String getPRONTUARIO() {
        return PRONTUARIO;
    }

    public void setPRONTUARIO(String PRONTUARIO) {
        this.PRONTUARIO = PRONTUARIO;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getNASCIMENTO() {
        return NASCIMENTO;
    }

    public void setNASCIMENTO(String NASCIMENTO) {
        this.NASCIMENTO = NASCIMENTO;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Character getSEXO() {
        return SEXO;
    }

    public void setSEXO(Character SEXO) {
        this.SEXO = SEXO;
    }

    public String getCARTAO_SUS() {
        return CARTAO_SUS;
    }

    public void setCARTAO_SUS(String CARTAO_SUS) {
        this.CARTAO_SUS = CARTAO_SUS;
    }

    public String getNOME_RESP() {
        return NOME_RESP;
    }

    public void setNOME_RESP(String NOME_RESP) {
        this.NOME_RESP = NOME_RESP;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getCEL() {
        return CEL;
    }

    public void setCEL(String CEL) {
        this.CEL = CEL;
    }

    public XmlEndereco getENDERECO() {
        return ENDERECO;
    }

    public void setENDERECO(XmlEndereco ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.PRONTUARIO);
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
        final XmlPaciente other = (XmlPaciente) obj;
        if (!Objects.equals(this.PRONTUARIO, other.PRONTUARIO)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "XmlPaciente{" + "PRONTUARIO=" + PRONTUARIO + ", NOME=" + NOME + ", NASCIMENTO=" + NASCIMENTO + ", RG=" + RG + ", CPF=" + CPF + ", SEXO=" + SEXO + ", CARTAO_SUS=" + CARTAO_SUS + ", NOME_RESP=" + NOME_RESP + ", TEL=" + TEL + ", CEL=" + CEL + ", ENDERECO=" + ENDERECO + '}';
    }
    
    
    
}
