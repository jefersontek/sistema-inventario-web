/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.Memoria;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jeferson
 */
@Component
public class MemoriaDAO {
    
    private final Session session;   

    public MemoriaDAO(Session session) {
        this.session = session;
    }
    
    public List<Memoria> listar(){        
        List<Memoria> lstMemoria = this.session.createCriteria(Memoria.class).list();
        return lstMemoria;
    }
    
}
