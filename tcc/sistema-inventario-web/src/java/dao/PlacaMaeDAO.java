/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.PlacaMae;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jeferson
 */
@Component
public class PlacaMaeDAO {
    
    private final Session session;
    /**
     *
     * @param session
     */
    public PlacaMaeDAO(Session session) {
        this.session = session;
    }
    
    public void inserir(PlacaMae placaMae){
        this.session.saveOrUpdate(placaMae);
    }
    
    public List<PlacaMae> listar(){        
        List<PlacaMae> lstPlacaMae = this.session.createCriteria(PlacaMae.class).list();            
        return lstPlacaMae;
    }
    
}
