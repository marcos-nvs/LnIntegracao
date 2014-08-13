/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ln.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Marcos Naves
 */

@Entity
@Table(name="AgendaExa_Master")
@NamedQueries({
    @NamedQuery(name = "AgendaExaMaster.findAll", query = "SELECT r FROM AgendaExaMaster r"),
    @NamedQuery(name = "AgendaExaMaster.findCodAgendaExaMaster", 
                query = "SELECT r FROM AgendaExaMaster r where r.codAgendaExaMaster = :codAgendaExaMaster"),
    @NamedQuery(name = "AgendaExaMaster.findAgendaLaboratorio", 
                query = "SELECT r FROM AgendaExaMaster r where r.codLab = :codLab and r.coletaTotal = 1")
})

public class AgendaExaMaster implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="COD_AGENDAEXA_MASTER")
    private Integer codAgendaExaMaster;
    
    @Column(name="COD_PROF")
    private Integer codProf;
    
    @Column(name="NOME_PROF")
    private String nomeProf;
    
    @Column(name="NOME_PAC")
    private String nomePac;
    
    @Column(name="SEXO_PAC")
    private Character sexoPac;
    
    @Column(name="DT_NASC_PAC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtNascPac;
    
    @Column(name="SUS_PAC")
    private String susPac;
    
    @Column(name="PESO_PAC")
    private BigDecimal pesoPac;
    
    @Column(name="ALTURA_PAC")
    private BigDecimal alturaPac;
    
    @Column(name="DUM")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dum;

    @Column(name="GESTANTE")
    private Integer gestante;
    
    @Column(name="RECEM_NASCIDO")
    private Integer recemNascido;
    
    @Column(name="EXT_INT")
    private String extInt;
    
    @Column(name="COD_LAB")
    private Integer codLab;
    
    @Column(name="COD_COL")
    private Integer cod_col;
    
    @Column(name="DATA_EXA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataExa;
    
    @Column(name="DATA_HORA_COLETA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataHoraColeta;
    
    @Column(name="COD_INTERN")
    private Integer codIntern;
    
    @Column(name="COD_ALA")
    private Integer codAla;
    
    @Column(name="COD_QUARTO")
    private Integer codQuarto;

    @Column(name="COD_LEITO")
    private Integer codLeito;
    
    @Column(name="CNES_INTERNACAO")
    private Integer cnesInternacao;
    
    @Column(name="COD_UNISOLICITANTE")
    private Integer codUniSolicitante;
    
    @Column(name="CNES_EXECUTANTE")
    private Integer cnesExecutante;
    
    @Column(name="CNES_UNI_LOGADA")
    private Integer cnesUniLogada;
    
    @Column(name="COLETA_TOTAL")
    private Integer coletaTotal;
    
    @Column(name="URGENCIA")
    private Integer urgente;
    
    @Column(name="PROTOCOLO_AGE")
    private Integer protocoloAge;
    
    @Column(name="COD_USU_AGENDO")
    private Integer codUsuAgendo;
    
    @Column(name="MAQUINA_AGENDO")
    private String maquinaAgendo;
    
    @Column(name="DATA_HORA_AGENDO")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataHoraAgendo;
    
    @Column(name="PERMITI_NOVA_COLETA")
    private Integer permitiNovaColeta;
    
    @Column(name="ALA")
    private String ala;

    @Column(name="QUARTO")
    private String quarto;
    
    @Column(name="LEITO")
    private String leito;
    
    @Column(name="INFO_AUX")
    private String infoAux;
    
    @Column(name="OBSERVACAO")
    private String observacao;
    
    @Column(name="COD_CONV")
    private Integer codConv;
    
    @Column(name="NOME_CONV")
    private String nomeConv;
    
    @Column(name="HD")
    private String hd;
    
    @Column(name="COD_CID")
    private Integer codCid;

    @Column(name="DESC_CID")
    private String descCid;
    
    @Column(name="DESCR_UNISOLICITANTE")
    private String descrUniSolicitante;
    
    @Column(name="RG_PAC")
    private String rgPac;
    
    @Column(name="CPF_PAC")
    private String cpfPac;
    
    @Column(name="NOME_RESP")
    private String nomeResp;
    
    @Column(name="DDD_FONE")
    private String dddFone;
    
    @Column(name="FONE_PAC")
    private String fonePac;

    @Column(name="DDD_CEL")
    private String dddCel;
    
    @Column(name="CEL_PAC")
    private String celPac;

    @Column(name="COD_DOM_PAC")
    private Integer codDomPac;

    @Column(name="ENDERECO_PAC")
    private String enderecoPac;
    
    @Column(name="NUM_END_PAC")
    private String numEndPac;
    
    @Column(name="BAIRRO_PAC")
    private String bairroPac;
    
    @Column(name="MUNICIPIO_PAC")
    private String municipioPac;
    
    @Column(name="UF_PAC")
    private String ufPac;
    
    @OneToMany(mappedBy="codAgendaExaMaster",fetch =FetchType.EAGER)
    private List<AgendaExa> listAgendaExa;

    public AgendaExaMaster() {
    }

    public Integer getCodAgendaExaMaster() {
        return codAgendaExaMaster;
    }

    public void setCodAgendaExaMaster(Integer codAgendaExaMaster) {
        this.codAgendaExaMaster = codAgendaExaMaster;
    }

    public Integer getCodProf() {
        return codProf;
    }

    public void setCodProf(Integer codProf) {
        this.codProf = codProf;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getNomePac() {
        return nomePac;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    public Character getSexoPac() {
        return sexoPac;
    }

    public void setSexoPac(Character sexoPac) {
        this.sexoPac = sexoPac;
    }

    public Date getDtNascPac() {
        return dtNascPac;
    }

    public void setDtNascPac(Date dtNascPac) {
        this.dtNascPac = dtNascPac;
    }

    public String getSusPac() {
        return susPac;
    }

    public void setSusPac(String susPac) {
        this.susPac = susPac;
    }

    public BigDecimal getPesoPac() {
        return pesoPac;
    }

    public void setPesoPac(BigDecimal pesoPac) {
        this.pesoPac = pesoPac;
    }

    public BigDecimal getAlturaPac() {
        return alturaPac;
    }

    public void setAlturaPac(BigDecimal alturaPac) {
        this.alturaPac = alturaPac;
    }

    public Date getDum() {
        return dum;
    }

    public void setDum(Date dum) {
        this.dum = dum;
    }

    public Integer getGestante() {
        return gestante;
    }

    public void setGestante(Integer gestante) {
        this.gestante = gestante;
    }

    public Integer getRecemNascido() {
        return recemNascido;
    }

    public void setRecemNascido(Integer recemNascido) {
        this.recemNascido = recemNascido;
    }

    public String getExtInt() {
        return extInt;
    }

    public void setExtInt(String extInt) {
        this.extInt = extInt;
    }

    public Integer getCodLab() {
        return codLab;
    }

    public void setCodLab(Integer codLab) {
        this.codLab = codLab;
    }

    public Integer getCod_col() {
        return cod_col;
    }

    public void setCod_col(Integer cod_col) {
        this.cod_col = cod_col;
    }

    public Date getDataExa() {
        return dataExa;
    }

    public void setDataExa(Date dataExa) {
        this.dataExa = dataExa;
    }

    public Date getDataHoraColeta() {
        return dataHoraColeta;
    }

    public void setDataHoraColeta(Date dataHoraColeta) {
        this.dataHoraColeta = dataHoraColeta;
    }

    public Integer getCodIntern() {
        return codIntern;
    }

    public void setCodIntern(Integer codIntern) {
        this.codIntern = codIntern;
    }

    public Integer getCodAla() {
        return codAla;
    }

    public void setCodAla(Integer codAla) {
        this.codAla = codAla;
    }

    public Integer getCodQuarto() {
        return codQuarto;
    }

    public void setCodQuarto(Integer codQuarto) {
        this.codQuarto = codQuarto;
    }

    public Integer getCodLeito() {
        return codLeito;
    }

    public void setCodLeito(Integer codLeito) {
        this.codLeito = codLeito;
    }

    public Integer getCnesInternacao() {
        return cnesInternacao;
    }

    public void setCnesInternacao(Integer cnesInternacao) {
        this.cnesInternacao = cnesInternacao;
    }

    public Integer getCodUniSolicitante() {
        return codUniSolicitante;
    }

    public void setCodUniSolicitante(Integer codUniSolicitante) {
        this.codUniSolicitante = codUniSolicitante;
    }

    public Integer getCnesExecutante() {
        return cnesExecutante;
    }

    public void setCnesExecutante(Integer cnesExecutante) {
        this.cnesExecutante = cnesExecutante;
    }

    public Integer getCnesUniLogada() {
        return cnesUniLogada;
    }

    public void setCnesUniLogada(Integer cnesUniLogada) {
        this.cnesUniLogada = cnesUniLogada;
    }

    public Integer getColetaTotal() {
        return coletaTotal;
    }

    public void setColetaTotal(Integer coletaTotal) {
        this.coletaTotal = coletaTotal;
    }

    public Integer getUrgente() {
        return urgente;
    }

    public void setUrgente(Integer urgente) {
        this.urgente = urgente;
    }

    public Integer getProtocoloAge() {
        return protocoloAge;
    }

    public void setProtocoloAge(Integer protocoloAge) {
        this.protocoloAge = protocoloAge;
    }

    public Integer getCodUsuAgendo() {
        return codUsuAgendo;
    }

    public void setCodUsuAgendo(Integer codUsuAgendo) {
        this.codUsuAgendo = codUsuAgendo;
    }

    public String getMaquinaAgendo() {
        return maquinaAgendo;
    }

    public void setMaquinaAgendo(String maquinaAgendo) {
        this.maquinaAgendo = maquinaAgendo;
    }

    public Date getDataHoraAgendo() {
        return dataHoraAgendo;
    }

    public void setDataHoraAgendo(Date dataHoraAgendo) {
        this.dataHoraAgendo = dataHoraAgendo;
    }

    public Integer getPermitiNovaColeta() {
        return permitiNovaColeta;
    }

    public void setPermitiNovaColeta(Integer permitiNovaColeta) {
        this.permitiNovaColeta = permitiNovaColeta;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getCodConv() {
        return codConv;
    }

    public void setCodConv(Integer codConv) {
        this.codConv = codConv;
    }

    public String getNomeConv() {
        return nomeConv;
    }

    public void setNomeConv(String nomeConv) {
        this.nomeConv = nomeConv;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public Integer getCodCid() {
        return codCid;
    }

    public void setCodCid(Integer codCid) {
        this.codCid = codCid;
    }

    public String getDescCid() {
        return descCid;
    }

    public void setDescCid(String descCid) {
        this.descCid = descCid;
    }

    public String getDescrUniSolicitante() {
        return descrUniSolicitante;
    }

    public void setDescrUniSolicitante(String descrUniSolicitante) {
        this.descrUniSolicitante = descrUniSolicitante;
    }

    public String getRgPac() {
        return rgPac;
    }

    public void setRgPac(String rgPac) {
        this.rgPac = rgPac;
    }

    public String getCpfPac() {
        return cpfPac;
    }

    public void setCpfPac(String cpfPac) {
        this.cpfPac = cpfPac;
    }

    public String getNomeResp() {
        return nomeResp;
    }

    public void setNomeResp(String nomeResp) {
        this.nomeResp = nomeResp;
    }

    public String getDddFone() {
        return dddFone;
    }

    public void setDddFone(String dddFone) {
        this.dddFone = dddFone;
    }

    public String getFonePac() {
        return fonePac;
    }

    public void setFonePac(String fonePac) {
        this.fonePac = fonePac;
    }

    public String getDddCel() {
        return dddCel;
    }

    public void setDddCel(String dddCel) {
        this.dddCel = dddCel;
    }

    public String getCelPac() {
        return celPac;
    }

    public void setCelPac(String celPac) {
        this.celPac = celPac;
    }

    public Integer getCodDomPac() {
        return codDomPac;
    }

    public void setCodDomPac(Integer codDomPac) {
        this.codDomPac = codDomPac;
    }

    public String getEnderecoPac() {
        return enderecoPac;
    }

    public void setEnderecoPac(String enderecoPac) {
        this.enderecoPac = enderecoPac;
    }

    public String getNumEndPac() {
        return numEndPac;
    }

    public void setNumEndPac(String numEndPac) {
        this.numEndPac = numEndPac;
    }

    public String getBairroPac() {
        return bairroPac;
    }

    public void setBairroPac(String bairroPac) {
        this.bairroPac = bairroPac;
    }

    public String getMunicipioPac() {
        return municipioPac;
    }

    public void setMunicipioPac(String municipioPac) {
        this.municipioPac = municipioPac;
    }

    public String getUfPac() {
        return ufPac;
    }

    public void setUfPac(String ufPac) {
        this.ufPac = ufPac;
    }

    public List<AgendaExa> getListAgendaExa() {
        return listAgendaExa;
    }

    public void setListAgendaExa(List<AgendaExa> listAgendaExa) {
        this.listAgendaExa = listAgendaExa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.codAgendaExaMaster);
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
        final AgendaExaMaster other = (AgendaExaMaster) obj;
        if (!Objects.equals(this.codAgendaExaMaster, other.codAgendaExaMaster)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AgendaExaMaster{" + "codAgendaExaMaster=" + codAgendaExaMaster + ", codProf=" + codProf + ", nomeProf=" + nomeProf + ", nomePac=" + nomePac + ", sexoPac=" + sexoPac + ", dtNascPac=" + dtNascPac + ", susPac=" + susPac + ", pesoPac=" + pesoPac + ", alturaPac=" + alturaPac + ", dum=" + dum + ", gestante=" + gestante + ", recemNascido=" + recemNascido + ", extInt=" + extInt + ", codLab=" + codLab + ", cod_col=" + cod_col + ", dataExa=" + dataExa + ", dataHoraColeta=" + dataHoraColeta + ", codIntern=" + codIntern + ", codAla=" + codAla + ", codQuarto=" + codQuarto + ", codLeito=" + codLeito + ", cnesInternacao=" + cnesInternacao + ", codUniSolicitante=" + codUniSolicitante + ", cnesExecutante=" + cnesExecutante + ", cnesUniLogada=" + cnesUniLogada + ", coletaTotal=" + coletaTotal + ", urgente=" + urgente + ", protocoloAge=" + protocoloAge + ", codUsuAgendo=" + codUsuAgendo + ", maquinaAgendo=" + maquinaAgendo + ", dataHoraAgendo=" + dataHoraAgendo + ", permitiNovaColeta=" + permitiNovaColeta + ", ala=" + ala + ", quarto=" + quarto + ", leito=" + leito + ", infoAux=" + infoAux + ", observacao=" + observacao + ", codConv=" + codConv + ", nomeConv=" + nomeConv + ", hd=" + hd + ", codCid=" + codCid + ", descCid=" + descCid + ", descrUniSolicitante=" + descrUniSolicitante + ", rgPac=" + rgPac + ", cpfPac=" + cpfPac + ", nomeResp=" + nomeResp + ", dddFone=" + dddFone + ", fonePac=" + fonePac + ", dddCel=" + dddCel + ", celPac=" + celPac + ", codDomPac=" + codDomPac + ", enderecoPac=" + enderecoPac + ", numEndPac=" + numEndPac + ", bairroPac=" + bairroPac + ", municipioPac=" + municipioPac + ", ufPac=" + ufPac + ", listAgendaExa=" + listAgendaExa + '}';
    }


    
}
