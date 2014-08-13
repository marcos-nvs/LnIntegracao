/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ln.lnintegracao;

import br.com.ln.entities.AgendaExaMaster;
import br.com.ln.entities.LabExa;
import br.com.ln.utils.VerificaConexaoRemoto;
import java.net.MalformedURLException;
import java.util.List;

/**
 *
 * @author Marcos Naves
 */
public class ThreadsIntegracao implements Runnable{
    
    ConfigClient configClient;
    LabExa laboratorio;
    private final int minimumLoopTime;
    private int minimumLoopTimeBase;
    private final int maxmumLoopTime;

    public ThreadsIntegracao(LabExa laboratorio, ConfigClient configClient) {

        this.configClient = configClient;
        this.laboratorio = laboratorio;
        this.maxmumLoopTime = configClient.getMaxmumLoopTime();
        this.minimumLoopTime = configClient.getMinimumLoopTime();
        this.minimumLoopTimeBase = configClient.getMinimumLoopTime();
        
        Thread thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {

        try {
            while (true) {
                try {
                    if (VerificaConexaoRemoto.verificaWebServerRemoto("http://ciewebservice.dasa.com.br/wsintegra/LoteExamesXmlReceiver")) {
                        if (laboratorio.getNome().equals("CIENTIFICALAB")) {
                            List<AgendaExaMaster> listaAgendaExaMasters = InformacaoSistemaTMLAB.informacaoExames(configClient.getStrDbName(), laboratorio.getCodLab());

                            for (AgendaExaMaster agendaExaMaster : listaAgendaExaMasters) {
                                String xml = InformacaoSistemaTMLAB.montaXmlSolciticao(agendaExaMaster);
                                System.out.println("xml : " + xml );
                                InformacaoSistemaTMLAB.enviaTMLab(xml);
                            }
                            Thread.sleep(minimumLoopTime);
                        }
                    } else {
                        this.forcaSistemaDormir(1, "Computador fora da internet ou servidor inacessível indo dormir por " + (minimumLoopTimeBase + minimumLoopTimeBase));
                    }
                } catch (MalformedURLException ex) {
                    this.minimumLoopTimeBase = 0;
                    Launcher.logOneMoreLine(1, ex.getMessage());
                    Thread.sleep(minimumLoopTime);
                }
            }

        } catch (InterruptedException ex) {
            Launcher.logOneMoreLine(0, ex.getMessage() + "\\n Sistema interrompido");
        }
    }
    
    private void forcaSistemaDormir(int status, String msg) throws InterruptedException{
        
        Launcher.logOneMoreLine(1, msg);
        if (this.minimumLoopTimeBase >  this.maxmumLoopTime){
            this.minimumLoopTimeBase = 0;
        }
        
        Thread.sleep(this.minimumLoopTimeBase + this.minimumLoopTimeBase);
        this.minimumLoopTimeBase += this.minimumLoopTime;
    }
}
