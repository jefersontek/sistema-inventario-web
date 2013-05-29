/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.Rede;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jeferson
 */
@Component
public class RedeDAO {
    
    private Session session;

    public RedeDAO(Session session) {
        this.session = session;
    }  
    
    public List<Rede> listar(){        
        List<Rede> lstRedes = this.session.createCriteria(Rede.class).list(); 
        return lstRedes;
    }
    
}
