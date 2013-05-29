/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.Inventario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jeferson
 */
@Component
public class InventarioDAO {
    
    private final Session session;  

    public InventarioDAO(Session session) {
        this.session = session;
    }
    
    public List<Inventario> listar(){         
        List<Inventario> lstInventario = this.session.createCriteria(Inventario.class).list();        
        return lstInventario;
    }
    
}
