/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ln.lnintegracao;

/**
 *
 * @author Marcos Naves
 */
class XmlExame {
    
    private String codExame;
    private String descExame;
    private String codMaterial;
    private String descMaterial;
    private String numeroAmostra;
    private Character urgente;
    private String volume;
    private String tempo;
    private Character imagem;
    private String ordemIntegra;
    private Character materialColetado;

    public XmlExame() {
    }

    public String getCodExame() {
        return codExame;
    }

    public void setCodExame(String codExame) {
        this.codExame = codExame;
    }

    public String getDescExame() {
        return descExame;
    }

    public void setDescExame(String descExame) {
        this.descExame = descExame;
    }

    public String getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(String codMaterial) {
        this.codMaterial = codMaterial;
    }

    public String getDescMaterial() {
        return descMaterial;
    }

    public void setDescMaterial(String descMaterial) {
        this.descMaterial = descMaterial;
    }

    public String getNumeroAmostra() {
        return numeroAmostra;
    }

    public void setNumeroAmostra(String numeroAmostra) {
        this.numeroAmostra = numeroAmostra;
    }

    public Character getUrgente() {
        return urgente;
    }

    public void setUrgente(Character urgente) {
        this.urgente = urgente;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public Character getImagem() {
        return imagem;
    }

    public void setImagem(Character imagem) {
        this.imagem = imagem;
    }

    public String getOrdemIntegra() {
        return ordemIntegra;
    }

    public void setOrdemIntegra(String ordemIntegra) {
        this.ordemIntegra = ordemIntegra;
    }

    public Character getMaterialColetado() {
        return materialColetado;
    }

    public void setMaterialColetado(Character materialColetado) {
        this.materialColetado = materialColetado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.codExame != null ? this.codExame.hashCode() : 0);
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
        final XmlExame other = (XmlExame) obj;
        if ((this.codExame == null) ? (other.codExame != null) : !this.codExame.equals(other.codExame)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "XmlExame{" + "codExame=" + codExame + ", descExame=" + descExame + ", codMaterial=" + codMaterial + ", descMaterial=" + descMaterial + ", numeroAmostra=" + numeroAmostra + ", urgente=" + urgente + ", volume=" + volume + ", tempo=" + tempo + ", imagem=" + imagem + ", ordemIntegra=" + ordemIntegra + ", materialColetado=" + materialColetado + '}';
    }
    
    
}


