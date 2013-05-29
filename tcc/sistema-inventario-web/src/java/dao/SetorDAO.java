/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.Setor;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jeferson
 */
@Component
public class SetorDAO {
    
    private final Session session;

    public SetorDAO(Session session) {
        this.session = session;
    }
    
    public List<Setor> listar(){        
        List<Setor> lstSetor = this.session.createCriteria(Setor.class).list();            
        return lstSetor;
    }
    
}
