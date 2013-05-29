/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import modal.Usuario;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Jeferson
 */
@Component
public class UsuarioDAO {
    
    private final Session session;    

    public UsuarioDAO(Session session) {
        this.session = session;
    }  
    
    public Usuario autenticacao(Usuario usuario){       
        
        Usuario usuarioAutenticado = (Usuario) this.session.createCriteria(Usuario.class)
                .add(Restrictions.eq("email", usuario.getEmail()))
                .add(Restrictions.eq("senha", usuario.getSenha()))
                .uniqueResult();            
                
        return usuarioAutenticado;
    }
    
}
