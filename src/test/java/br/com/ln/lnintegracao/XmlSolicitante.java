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
class XmlSolicitante {
    
    private String registro;
    private String registroTipo;
    private String nome;
    private String UF;

    public XmlSolicitante() {
    }

    public XmlSolicitante(String registro, String registroTipo, String nome, String UF) {
        this.registro = registro;
        this.registroTipo = registroTipo;
        this.nome = nome;
        this.UF = UF;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistroTipo() {
        return registroTipo;
    }

    public void setRegistroTipo(String registroTipo) {
        this.registroTipo = registroTipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.registro);
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
        final XmlSolicitante other = (XmlSolicitante) obj;
        if (!Objects.equals(this.registro, other.registro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "XmlSolicitante{" + "registro=" + registro + ", registroTipo=" + registroTipo + ", nome=" + nome + ", UF=" + UF + '}';
    }
    
}
