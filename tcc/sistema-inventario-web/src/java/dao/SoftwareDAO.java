/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.Software;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jeferson
 */
@Component
public class SoftwareDAO {
    
    private final Session session;   

    public SoftwareDAO(Session session) {
        this.session = session;
    }
    
    public List<Software> listar(){         
        List<Software> lstSoftware = this.session.createCriteria(Software.class).list();     
        return lstSoftware;
    }
    
}
