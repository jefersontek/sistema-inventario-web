/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.Disco;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jeferson
 */
@Component
public class DiscoDAO {
    
    private final Session session;

    public DiscoDAO(Session session) {
        this.session = session;
    }
    
    public List<Disco> listar(){        
        List<Disco> lstDisco = this.session.createCriteria(Disco.class).list();            
        return lstDisco;
    }
    
}
