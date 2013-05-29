/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import modal.Usuario;
import java.io.Serializable;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jeferson
 */
@Component
@SessionScoped
public class SessionWeb implements Serializable{
    
    private Usuario usuario;
    private HttpSession session;

    public SessionWeb(Usuario usuario, HttpSession session) {
        this.usuario = usuario;
        this.session = session;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public HttpSession getSession() {
        return session;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    } 
    
}
