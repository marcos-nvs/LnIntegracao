
import br.com.ln.entities.AgendaExa;
import br.com.ln.entities.AgendaExaMaster;
import br.com.ln.hibernate.utils.SessionLNHelper;
import br.com.ln.lnintegracao.InformacaoSistemaTMLAB;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos Naves
 */
public class Teste {
    
    public static void main(String... args) {
        
        List<AgendaExaMaster> listAgendaExaMaster = InformacaoSistemaTMLAB.informacaoExames("SQLSERVER", 10);

        for (AgendaExaMaster agendaExaMaster : listAgendaExaMaster) {
            System.out.println("Agenda Master : " + agendaExaMaster.toString());
            
            for (AgendaExa ageExa : agendaExaMaster.getListAgendaExa()){
                System.out.println("Exame : " + ageExa.toString());
            }
        }
        
        
    }
}
