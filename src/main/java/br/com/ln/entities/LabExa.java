/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ln.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Marcos Naves
 */

@Entity
@Table(name = "LabExa")
@NamedQueries({
    @NamedQuery(name = "LabExa.findAll", query = "SELECT r FROM LabExa r"),
    @NamedQuery(name = "LabExa.findCodLab", query = "SELECT r FROM LabExa r where r.codLab = :codLab"),
})

public class LabExa implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "COD_LAB")
    private Integer codLab;
    
    @Column(name = "NOME")
    private String nome;

    public LabExa() {
    }

    public Integer getCodLab() {
        return codLab;
    }

    public void setCodLab(Integer codLab) {
        this.codLab = codLab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.codLab;
        hash = 13 * hash + Objects.hashCode(this.nome);
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
        final LabExa other = (LabExa) obj;
        if (this.codLab != other.codLab) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LabExa{" + "codLab=" + codLab + ", nome=" + nome + '}';
    }
    
}
