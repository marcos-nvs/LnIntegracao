/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ln.lnintegracao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Marcos Naves
 */
public class XmlSolicitacao implements Serializable {
    
    private String usuario;
    private String senha;
    
    private Character test = 'N';
    
    private String codRequisicao;
    private String codPedido;
    private String dataCadastro;
    
    private String peso;
    private String altura;
    private String DUM;
    private Character gestante;
    private Character RN;
    private String quarto;
    private String leito;
    private String infoAux;
    private String OBS;
    private String codConvenio;
    private String descConvenio;
    private String HD;
    private String CID;
    private String codLocal;
    private String descLocal;
    
    private String sisStCodigo;
    private String localColeta;
    private String matricula;
    private String reqStGuia;

    private XmlSolicitante solicitante;
    private XmlPaciente paciente;
    private List<XmlExame> listXmlExames;

    public XmlSolicitacao() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Character getTest() {
        return test;
    }

    public void setTest(Character test) {
        this.test = test;
    }

    public String getCodRequisicao() {
        return codRequisicao;
    }

    public void setCodRequisicao(String codRequisicao) {
        this.codRequisicao = codRequisicao;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getDUM() {
        return DUM;
    }

    public void setDUM(String DUM) {
        this.DUM = DUM;
    }

    public Character getGestante() {
        return gestante;
    }

    public void setGestante(Character gestante) {
        this.gestante = gestante;
    }

    public Character getRN() {
        return RN;
    }

    public void setRN(Character RN) {
        this.RN = RN;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public String getLeito() {
        return leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }

    public String getInfoAux() {
        return infoAux;
    }

    public void setInfoAux(String infoAux) {
        this.infoAux = infoAux;
    }

    public String getOBS() {
        return OBS;
    }

    public void setOBS(String OBS) {
        this.OBS = OBS;
    }

    public String getCodConvenio() {
        return codConvenio;
    }

    public void setCodConvenio(String codConvenio) {
        this.codConvenio = codConvenio;
    }

    public String getDescConvenio() {
        return descConvenio;
    }

    public void setDescConvenio(String descConvenio) {
        this.descConvenio = descConvenio;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getCodLocal() {
        return codLocal;
    }

    public void setCodLocal(String codLocal) {
        this.codLocal = codLocal;
    }

    public String getDescLocal() {
        return descLocal;
    }

    public void setDescLocal(String descLocal) {
        this.descLocal = descLocal;
    }

    public String getSisStCodigo() {
        return sisStCodigo;
    }

    public void setSisStCodigo(String sisStCodigo) {
        this.sisStCodigo = sisStCodigo;
    }

    public String getLocalColeta() {
        return localColeta;
    }

    public void setLocalColeta(String localColeta) {
        this.localColeta = localColeta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getReqStGuia() {
        return reqStGuia;
    }

    public void setReqStGuia(String reqStGuia) {
        this.reqStGuia = reqStGuia;
    }

    public XmlSolicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(XmlSolicitante solicitante) {
        this.solicitante = solicitante;
    }

    public XmlPaciente getPaciente() {
        return paciente;
    }

    public void setPaciente(XmlPaciente paciente) {
        this.paciente = paciente;
    }

    public List<XmlExame> getListXmlExames() {
        return listXmlExames;
    }

    public void setListXmlExames(List<XmlExame> listXmlExames) {
        this.listXmlExames = listXmlExames;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.usuario);
        hash = 19 * hash + Objects.hashCode(this.senha);
        hash = 19 * hash + Objects.hashCode(this.codRequisicao);
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
        final XmlSolicitacao other = (XmlSolicitacao) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.codRequisicao, other.codRequisicao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "XmlSolicitacao{" + "usuario=" + usuario + ", senha=" + senha + ", test=" + test + ", codRequisicao=" + codRequisicao + ", codPedido=" + codPedido + ", dataCadastro=" + dataCadastro + ", peso=" + peso + ", altura=" + altura + ", DUM=" + DUM + ", gestante=" + gestante + ", RN=" + RN + ", quarto=" + quarto + ", leito=" + leito + ", infoAux=" + infoAux + ", OBS=" + OBS + ", codConvenio=" + codConvenio + ", descConvenio=" + descConvenio + ", HD=" + HD + ", CID=" + CID + ", codLocal=" + codLocal + ", descLocal=" + descLocal + ", sisStCodigo=" + sisStCodigo + ", localColeta=" + localColeta + ", matricula=" + matricula + ", reqStGuia=" + reqStGuia + ", solicitante=" + solicitante + ", paciente=" + paciente + ", listXmlExames=" + listXmlExames + '}';
    }
    
    
}
