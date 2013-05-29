/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.Micro;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jeferson
 */
@Component
public class MicroDAO {
    
    private final Session session;   

    public MicroDAO(Session session) {
        this.session = session;
    } 
    
    public List<Micro> listar(){         
        List<Micro> lstMicros = this.session.createCriteria(Micro.class).list();        
        return lstMicros;
    }
    
    public String inserir(Micro micro){
        this.session.save(micro);          
        return micro.getPatrimonio();
    }
    
}
