/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ln.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Marcos Naves
 */

@Entity
@Table(name="AgendaExa")
@NamedQueries({
    @NamedQuery(name = "AgendaExa.findAll", query = "SELECT r FROM AgendaExa r"),
    @NamedQuery(name = "AgendaExa.findCodAgendaExaPro", query = "SELECT r FROM AgendaExa r where r.codAgendaExaMaster = :codAgendaExaMaster and r.codPro = :codPro"),
    @NamedQuery(name = "AgendaExa.findCodAgendaExaMaster", query = "SELECT r FROM AgendaExa r where r.codAgendaExaMaster = :codAgendaExaMaster")
})

public class AgendaExa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="COD_AGE_EXA")
    private Integer codAgeExa;

    @Column(name="COD_PRO")
    private String codPro;
    
    @Column(name="COD_PROF")
    private Integer codProf;
    
    @Column(name="EXT_INT")
    private String extInt;
    
    @Column(name="COD_EXA")
    private String codExa;
    
    @Column(name="COD_LAB")
    private String codLab;
    
    @Column(name="DATA_COL")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCol;
    
    @Column(name="COD_COL")
    private String codCol;
    
    @Column(name="DATA_EXA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataExa;
    
    @Column(name="DATA_CHE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataChe;
    
    @Column(name="DATA_RET")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataRet;
    
    @Column(name="STATUS")
    private String status;
    
    @Column(name="Num")
    private Integer num;
    
    @Column(name="COD_SUB_EXA")
    private Integer codSubExa;
    
    @Column(name="HORA_EXA")
    private String horaExa;
    
    @Column(name="COD_PROCED")
    private Integer codProced;
    
    @Column(name="NOME_EXAME")
    private String nomeExame;
    
    @Column(name="VALOR")
    private BigDecimal valor;
    
    @Column(name="AGENDADATA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date agendadata;
    
    @Column(name="OBSERVACOES")
    private String observacoes;
    
    @Column(name="DATA_RESULTADO")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataResultado;
    
    @Column(name="NOMEENTREGOU")
    private String nomeentregou;
    
    @Column(name="COD_USU")
    private Integer codUsu;
    
    @Column(name="LAUDADO")
    private Integer laudado;
    
    @Column(name="COD_UNI")
    private Integer codUni;
    
    @Column(name="COD_UNISOLICITANTE")
    private Integer codUnisolicitante;
    
    @Column(name="URGENCIA")
    private Integer urgencia;
    
    @Column(name="DATA_ENTREGA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEntrega;
    
    @Column(name="COD_USUAGENDO")
    private Integer codUsuagendo;
    
    @Column(name="COD_USUREALIZO")
    private Integer codUsuRealizo;
    
    @Column(name="COD_USUCANCELO")
    private Integer codUsucancelo;
    
    @Column(name="COD_AMOSTRAEXA")
    private Integer codAmotraexa;
    
    @Column(name="NOME_PAC")
    private String nomePac;
    
    @Column(name="SEXO_PAC")
    private Character sexoPac;
    
    @Column(name="DTNASC_PAC")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtNascPac;
    
    @Column(name="STATUS_DISPONIVEL")
    private Integer statusDisposnivel;
    
    @Column(name="COD_BPAITEN")
    private Integer codBpaiten;
    
   @Column(name="COD_EQUIPAMENTO")
    private Integer codEquipamento;
   
   @Column(name="COD_MATERIAL")
    private Integer codMaterial;
   
   @Column(name="PROTOCOLO_AGE")
    private Integer protocoloAge;
   
   @Column(name="COD_AGENDAEXA_MASTER")
    private Integer codAgendaExaMaster;
   
   @Column(name="ENDERECO_RESULTADO")
    private String enderecoResultado;
   
   @Column(name="COD_AGEEXA_COLETA")
    private Integer codAdeexaColeta;
   
   @Column(name="DESCR_MATERIAL")
    private String descrMaterial;
   
   @Column(name="VOLUME")
    private String volume;
   
   @Column(name="TEMPO")
    private Integer tempo;
   
//   @ManyToOne(fetch = FetchType.EAGER)
//   @JoinColumn(referencedColumnName = "COD_AGENDAEXA_MASTER")
//   private AgendaExaMaster agendaExaMaster;
   
    public AgendaExa() {
    }

    public Integer getCodAgeExa() {
        return codAgeExa;
    }

    public void setCodAgeExa(Integer codAgeExa) {
        this.codAgeExa = codAgeExa;
    }

    public String getCodPro() {
        return codPro;
    }

    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    public Integer getCodProf() {
        return codProf;
    }

    public void setCodProf(Integer codProf) {
        this.codProf = codProf;
    }

    public String getExtInt() {
        return extInt;
    }

    public void setExtInt(String extInt) {
        this.extInt = extInt;
    }

    public String getCodExa() {
        return codExa;
    }

    public void setCodExa(String codExa) {
        this.codExa = codExa;
    }

    public String getCodLab() {
        return codLab;
    }

    public void setCodLab(String codLab) {
        this.codLab = codLab;
    }

    public Date getDataCol() {
        return dataCol;
    }

    public void setDataCol(Date dataCol) {
        this.dataCol = dataCol;
    }

    public String getCodCol() {
        return codCol;
    }

    public void setCodCol(String codCol) {
        this.codCol = codCol;
    }

    public Date getDataExa() {
        return dataExa;
    }

    public void setDataExa(Date dataExa) {
        this.dataExa = dataExa;
    }

    public Date getDataChe() {
        return dataChe;
    }

    public void setDataChe(Date dataChe) {
        this.dataChe = dataChe;
    }

    public Date getDataRet() {
        return dataRet;
    }

    public void setDataRet(Date dataRet) {
        this.dataRet = dataRet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getCodSubExa() {
        return codSubExa;
    }

    public void setCodSubExa(Integer codSubExa) {
        this.codSubExa = codSubExa;
    }

    public String getHoraExa() {
        return horaExa;
    }

    public void setHoraExa(String horaExa) {
        this.horaExa = horaExa;
    }

    public Integer getCodProced() {
        return codProced;
    }

    public void setCodProced(Integer codProced) {
        this.codProced = codProced;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getAgendadata() {
        return agendadata;
    }

    public void setAgendadata(Date agendadata) {
        this.agendadata = agendadata;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDataResultado() {
        return dataResultado;
    }

    public void setDataResultado(Date dataResultado) {
        this.dataResultado = dataResultado;
    }

    public String getNomeentregou() {
        return nomeentregou;
    }

    public void setNomeentregou(String nomeentregou) {
        this.nomeentregou = nomeentregou;
    }

    public Integer getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Integer codUsu) {
        this.codUsu = codUsu;
    }

    public Integer getLaudado() {
        return laudado;
    }

    public void setLaudado(Integer laudado) {
        this.laudado = laudado;
    }

    public Integer getCodUni() {
        return codUni;
    }

    public void setCodUni(Integer codUni) {
        this.codUni = codUni;
    }

    public Integer getCodUnisolicitante() {
        return codUnisolicitante;
    }

    public void setCodUnisolicitante(Integer codUnisolicitante) {
        this.codUnisolicitante = codUnisolicitante;
    }

    public Integer getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(Integer urgencia) {
        this.urgencia = urgencia;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Integer getCodUsuagendo() {
        return codUsuagendo;
    }

    public void setCodUsuagendo(Integer codUsuagendo) {
        this.codUsuagendo = codUsuagendo;
    }

    public Integer getCodUsuRealizo() {
        return codUsuRealizo;
    }

    public void setCodUsuRealizo(Integer codUsuRealizo) {
        this.codUsuRealizo = codUsuRealizo;
    }

    public Integer getCodUsucancelo() {
        return codUsucancelo;
    }

    public void setCodUsucancelo(Integer codUsucancelo) {
        this.codUsucancelo = codUsucancelo;
    }

    public Integer getCodAmotraexa() {
        return codAmotraexa;
    }

    public void setCodAmotraexa(Integer codAmotraexa) {
        this.codAmotraexa = codAmotraexa;
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

    public Integer getStatusDisposnivel() {
        return statusDisposnivel;
    }

    public void setStatusDisposnivel(Integer statusDisposnivel) {
        this.statusDisposnivel = statusDisposnivel;
    }

    public Integer getCodBpaiten() {
        return codBpaiten;
    }

    public void setCodBpaiten(Integer codBpaiten) {
        this.codBpaiten = codBpaiten;
    }

    public Integer getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(Integer codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public Integer getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(Integer codMaterial) {
        this.codMaterial = codMaterial;
    }

    public Integer getProtocoloAge() {
        return protocoloAge;
    }

    public void setProtocoloAge(Integer protocoloAge) {
        this.protocoloAge = protocoloAge;
    }

    public Integer getCodAgendaExaMaster() {
        return codAgendaExaMaster;
    }

    public void setCodAgendaExaMaster(Integer codAgendaExaMaster) {
        this.codAgendaExaMaster = codAgendaExaMaster;
    }

    public String getEnderecoResultado() {
        return enderecoResultado;
    }

    public void setEnderecoResultado(String enderecoResultado) {
        this.enderecoResultado = enderecoResultado;
    }

    public Integer getCodAdeexaColeta() {
        return codAdeexaColeta;
    }

    public void setCodAdeexaColeta(Integer codAdeexaColeta) {
        this.codAdeexaColeta = codAdeexaColeta;
    }

    public String getDescrMaterial() {
        return descrMaterial;
    }

    public void setDescrMaterial(String descrMaterial) {
        this.descrMaterial = descrMaterial;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.codAgeExa);
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
        final AgendaExa other = (AgendaExa) obj;
        if (!Objects.equals(this.codAgeExa, other.codAgeExa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AgendaExa{" + "codAgeExa=" + codAgeExa + ", codPro=" + codPro + ", codProf=" + codProf + ", extInt=" + extInt + ", codExa=" + codExa + ", codLab=" + codLab + ", dataCol=" + dataCol + ", codCol=" + codCol + ", dataExa=" + dataExa + ", dataChe=" + dataChe + ", dataRet=" + dataRet + ", status=" + status + ", num=" + num + ", codSubExa=" + codSubExa + ", horaExa=" + horaExa + ", codProced=" + codProced + ", nomeExame=" + nomeExame + ", valor=" + valor + ", agendadata=" + agendadata + ", observacoes=" + observacoes + ", dataResultado=" + dataResultado + ", nomeentregou=" + nomeentregou + ", codUsu=" + codUsu + ", laudado=" + laudado + ", codUni=" + codUni + ", codUnisolicitante=" + codUnisolicitante + ", urgencia=" + urgencia + ", dataEntrega=" + dataEntrega + ", codUsuagendo=" + codUsuagendo + ", codUsuRealizo=" + codUsuRealizo + ", codUsucancelo=" + codUsucancelo + ", codAmotraexa=" + codAmotraexa + ", nomePac=" + nomePac + ", sexoPac=" + sexoPac + ", dtNascPac=" + dtNascPac + ", statusDisposnivel=" + statusDisposnivel + ", codBpaiten=" + codBpaiten + ", codEquipamento=" + codEquipamento + ", codMaterial=" + codMaterial + ", protocoloAge=" + protocoloAge + ", codAgendaExaMaster=" + codAgendaExaMaster + ", enderecoResultado=" + enderecoResultado + ", codAdeexaColeta=" + codAdeexaColeta + ", descrMaterial=" + descrMaterial + ", volume=" + volume + ", tempo=" + tempo + '}';
    }

    
}
