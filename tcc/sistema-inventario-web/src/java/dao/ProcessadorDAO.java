/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.Micro;
import modal.Processador;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jeferson
 */
@Component
public class ProcessadorDAO {
    
    private final Session session;   

    public ProcessadorDAO(Session session) {
        this.session = session;
    } 
    
    public List<Processador> listar(){         
        List<Processador> lstProcessador = this.session.createCriteria(Processador.class).list();        
        return lstProcessador;
    }
    
    public void inserir(Processador processador){
        this.session.saveOrUpdate(processador);       
       
    }
    
}
