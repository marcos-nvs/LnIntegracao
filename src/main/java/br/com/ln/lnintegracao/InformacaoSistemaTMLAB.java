/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ln.lnintegracao;

import br.com.ln.entities.AgendaExa;
import br.com.ln.entities.AgendaExaMaster;
import br.com.ln.hibernate.utils.SessionLNHelper;
import br.com.ln.utils.DateManipulador;
import br.com.wservice.LoteExamesXmlReceiver;
import br.com.wservice.LoteExamesXmlReceiver_Service;
import com.thoughtworks.xstream.XStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.stream.events.EndDocument;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Marcos Naves
 */
public class InformacaoSistemaTMLAB implements Serializable{
    
    public static List<AgendaExaMaster> informacaoExames(String strDbName, Integer laboratorio){
        
        Session session = SessionLNHelper.getSessionDude(strDbName);
        List<AgendaExaMaster> listaAgendaExaMaster = new ArrayList<AgendaExaMaster>();
        
        try{
            Transaction tx = session.beginTransaction();
            
            Query exame = session.getNamedQuery("AgendaExaMaster.findAgendaLaboratorio");
            exame.setInteger("codLab", laboratorio);
            
            List listaExame = exame.list();
            tx.commit();
            
            for (Object agenda : listaExame) {
                listaAgendaExaMaster.add((AgendaExaMaster) agenda);
            }
            
        } catch (Exception ex){
            System.out.println("Problemas na execução do exames");
            ex.printStackTrace();
        } finally{
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return listaAgendaExaMaster;
    }
    
    
    public static String montaXmlSolciticao(AgendaExaMaster agendaExaMaster){
        
        XmlSolicitacao solicitacao = new XmlSolicitacao();
        
        solicitacao.setUsuario("FOCUS");
        solicitacao.setSenha("#ARA4590");
        solicitacao.setTest('S');
//        solicitacao.setCodRequisicao(agendaExaMaster.getExtInt);
        solicitacao.setCodPedido(agendaExaMaster.getCodAgendaExaMaster().toString());
        solicitacao.setDataCadastro(DateManipulador.formatDateToPattern("dd/MM/yyyy", agendaExaMaster.getDataHoraColeta()));
        
        if (agendaExaMaster.getPesoPac() != null) {
            solicitacao.setPeso(agendaExaMaster.getPesoPac().toString());
        }

        if (agendaExaMaster.getAlturaPac() != null) {
            solicitacao.setAltura(agendaExaMaster.getAlturaPac().toString());
        }

        if (agendaExaMaster.getDum() != null) {
            solicitacao.setDUM(DateManipulador.formatDateToPattern("dd/MM/yyyy", agendaExaMaster.getDum()));
        }
        
        if (agendaExaMaster.getGestante() == null || agendaExaMaster.getGestante() == 0) {
            solicitacao.setGestante('N');
        } else {
            solicitacao.setGestante('S');
        }
    
        if (agendaExaMaster.getRecemNascido() == null || agendaExaMaster.getRecemNascido() == 0){
            solicitacao.setRN('N');
        } else {
            solicitacao.setRN('S');
        }
        
        solicitacao.setQuarto(agendaExaMaster.getQuarto());
        solicitacao.setLeito(agendaExaMaster.getLeito());
        solicitacao.setInfoAux(agendaExaMaster.getInfoAux());
        solicitacao.setOBS(agendaExaMaster.getObservacao());
        solicitacao.setCodConvenio(null);
        solicitacao.setHD(agendaExaMaster.getHd());
        
        if (agendaExaMaster.getCodCid() != null) {
            solicitacao.setCID(agendaExaMaster.getCodCid().toString());
        }
        
        solicitacao.setCodLocal(null);
        solicitacao.setDescLocal(null);
        solicitacao.setLocalColeta(null);
        solicitacao.setMatricula(null);
//        solicitacao.setSolicitante(new XmlSolicitante(agendaExaMaster.getCodProf().toString(), "1",agendaExaMaster.getNomeProf(), agendaExaMaster.getDescrUniSolicitante()));
        solicitacao.setSolicitante(new XmlSolicitante(agendaExaMaster.getCodProf().toString(), "1", agendaExaMaster.getNomeProf(), "SP"));
        solicitacao.setPaciente(buildPaciente(agendaExaMaster));

        solicitacao.setListXmlExames(buildListExame(agendaExaMaster));
        
        return ConverteXmlSolicitacao(solicitacao); 
        
    }

    private static XmlPaciente buildPaciente(AgendaExaMaster agendaExaMaster) {
        
        XmlPaciente paciente = new XmlPaciente();

        if (agendaExaMaster.getCodIntern() != null) {
            paciente.setPRONTUARIO(agendaExaMaster.getCodIntern().toString());
        } else {
            paciente.setPRONTUARIO("12");
        }

        paciente.setNOME(agendaExaMaster.getNomePac());
        
        if (agendaExaMaster.getDtNascPac() != null) {
            paciente.setNASCIMENTO(DateManipulador.formatDateToPattern("dd/MM/yyyy", agendaExaMaster.getDtNascPac()));
        }

        paciente.setRG(agendaExaMaster.getRgPac());
        paciente.setCPF(agendaExaMaster.getCpfPac());
        paciente.setSEXO(agendaExaMaster.getSexoPac());
        paciente.setCARTAO_SUS(agendaExaMaster.getSusPac());
        paciente.setNOME_RESP(agendaExaMaster.getNomeResp());
        
        if (agendaExaMaster.getDddFone() != null && agendaExaMaster.getFonePac() != null) {
            paciente.setTEL(agendaExaMaster.getDddFone() + agendaExaMaster.getFonePac());
        }
        
        if (agendaExaMaster.getDddCel() != null && agendaExaMaster.getCelPac() != null) {
            paciente.setCEL(agendaExaMaster.getDddCel() + agendaExaMaster.getCelPac());
        }

        paciente.setENDERECO(buildEndereco(agendaExaMaster));

        return paciente;
    }

    private static XmlEndereco buildEndereco(AgendaExaMaster agendaExaMaster) {
        
        XmlEndereco endereco = new XmlEndereco();

        if (agendaExaMaster.getEnderecoPac() != null && agendaExaMaster.getUfPac() != null && agendaExaMaster.getMunicipioPac() != null) {

            endereco.setLOGRADOURO(agendaExaMaster.getEnderecoPac());
            endereco.setUF(agendaExaMaster.getUfPac());
            endereco.setCIDADE(agendaExaMaster.getMunicipioPac());
            endereco.setNUMERO(agendaExaMaster.getNumEndPac());
            endereco.setCOMPLEMENTO(null);
            endereco.setOBS(null);
            endereco.setCEP(null);
            endereco.setBAIRRO(agendaExaMaster.getBairroPac());
            return endereco;
        } else {
            return null;
        }
    }

    private static List<XmlExame> buildListExame(AgendaExaMaster agendaExaMaster) {

        List<XmlExame> listaExames = new ArrayList<>();

        for (AgendaExa agendaExame : agendaExaMaster.getListAgendaExa()) {

            XmlExame exame = new XmlExame();
//            exame.setCodExame(agendaExame.getCodExa());
            exame.setCodExame("HEM");
            exame.setDescExame(agendaExame.getNomeExame());
            
            if (agendaExame.getCodMaterial() != null) {
                exame.setCodMaterial(agendaExame.getCodMaterial().toString());
            }
            
            exame.setDescMaterial(agendaExame.getDescrMaterial());
            exame.setNumeroAmostra(null);

            if (agendaExame.getUrgencia() == null || agendaExame.getUrgencia() == 0) {
                exame.setUrgente('N');
            } else {
                exame.setUrgente('S');
            }

            exame.setVolume(agendaExame.getVolume());
            
            if (agendaExame.getTempo() != null) {
                exame.setTempo(agendaExame.getTempo().toString());
            }
            exame.setImagem('N');
            exame.setOrdemIntegra(null);
            exame.setMaterialColetado('S');

            listaExames.add(exame);
        }

        return listaExames;
    }

    private static String ConverteXmlSolicitacao(XmlSolicitacao solicitacao) {

        XStream xstream = new XStream();

        xstream.alias("SOLICITACAO", XmlSolicitacao.class);
        xstream.aliasField("USUARIO", XmlSolicitacao.class, "usuario");
        xstream.aliasField("SENHA", XmlSolicitacao.class, "senha");
        xstream.aliasField("TEST", XmlSolicitacao.class, "test");
        xstream.aliasField("COD_REQUISICAO", XmlSolicitacao.class, "codRequisicao");
        xstream.aliasField("COD_PEDIDO", XmlSolicitacao.class, "codPedido");
        xstream.aliasField("DATA_CADASTRO", XmlSolicitacao.class, "dataCadastro");
        xstream.aliasField("PESO", XmlSolicitacao.class, "peso");
        xstream.aliasField("ALTURA", XmlSolicitacao.class, "altura");
        xstream.aliasField("GESTANTE", XmlSolicitacao.class, "gestante");
        xstream.aliasField("QUARTO", XmlSolicitacao.class, "quarto");
        xstream.aliasField("LEITO", XmlSolicitacao.class, "leito");
        xstream.aliasField("INFO_AUX", XmlSolicitacao.class, "infoAux");
        xstream.aliasField("COD_CONVENIO", XmlSolicitacao.class, "codConvenio");
        xstream.aliasField("COD_LOCAL", XmlSolicitacao.class, "codLocal");
        xstream.aliasField("DESC_LOCAL", XmlSolicitacao.class, "descLocal");
        xstream.aliasField("LOCAL_COLETA", XmlSolicitacao.class, "localColeta");
        xstream.aliasField("MATRICULA", XmlSolicitacao.class, "matricula");

        xstream.aliasField("PACIENTE", XmlSolicitacao.class, "paciente");

        xstream.aliasField("SOLICITANTE", XmlSolicitacao.class, "solicitante");
        xstream.aliasField("REGISTRO", XmlSolicitante.class, "registro");
        xstream.aliasField("REGISTRO_TIPO", XmlSolicitante.class, "registroTipo");
        xstream.aliasField("NOME", XmlSolicitante.class, "nome");

        xstream.aliasField("EXAMES", XmlSolicitacao.class, "listXmlExames");

        xstream.aliasType("EXAME", XmlExame.class);

        xstream.aliasField("COD_EXAME", XmlExame.class, "codExame");
        xstream.aliasField("DESC_EXAME", XmlExame.class, "descExame");
        xstream.aliasField("COD_MATERIAL", XmlExame.class, "codMaterial");
        xstream.aliasField("DESC_MATERIAL", XmlExame.class, "descMaterial");
        xstream.aliasField("NUMERO_AMOSTRA", XmlExame.class, "numeroAmostra");
        xstream.aliasField("URGENTE", XmlExame.class, "urgente");
        xstream.aliasField("VOLUME", XmlExame.class, "volume");
        xstream.aliasField("TEMPO", XmlExame.class, "tempo");
        xstream.aliasField("IMAGEM", XmlExame.class, "imagem");
        xstream.aliasField("ORDEM_INTEGRACAO", XmlExame.class, "ordemIntegra");
        xstream.aliasField("MATERIAL_COLETADO", XmlExame.class, "materialColetado");

        return xstream.toXML(solicitacao);
    }
    
    public static void enviaTMLab(String xml){
        
        try{
            LoteExamesXmlReceiver_Service service = new LoteExamesXmlReceiver_Service();
            LoteExamesXmlReceiver portLoteExamesXmlReceiver = service.getLoteExamesXmlReceiverPort();

            String retorno = portLoteExamesXmlReceiver.solicitacaoExames(xml);
            
            System.out.println("Retorno : " + retorno);
        }catch (Exception xcp){
            xcp.printStackTrace();
        }
        
    }
}
