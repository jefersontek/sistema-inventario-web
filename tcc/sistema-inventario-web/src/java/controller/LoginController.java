/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import dao.UsuarioDAO;
import modal.Usuario;
import util.SessionWeb;

/**
 *
 * @author Jeferson
 */
@Resource
@Path("/")
public class LoginController {
    
    private final Result    result; 
    private final SessionWeb usuarioWeb;
    private final Validator validator;
    private final UsuarioDAO usuarioDAO;
    

    public LoginController(Result result, Validator validator, UsuarioDAO usuarioDAO, SessionWeb usuarioWeb) {
        this.result = result;
        this.validator = validator;
        this.usuarioDAO = usuarioDAO;
        this.usuarioWeb = usuarioWeb;
    }    
    /**
     *
     */
    @Path("/")
    public void loginForm(){            
    }
        
    @Post("/validateLogin")
    public void validateLogin(Usuario usuario) {	

           Usuario carregado = null;
           carregado = usuarioDAO.autenticacao(usuario);

           if ( carregado == null ) {
               this.validator.add(new ValidationMessage("Usuario e /ou senha invalidos", 
                       "Erro de validação"));
           }			
           
           validator.onErrorUsePageOf(LoginController.class)
                   .loginForm();
           
           this.usuarioWeb.setUsuario(carregado);
           
           result.redirectTo(HomeController.class).home();
    }	
	
    @Path("/logoff")
    public void logoff(){
            this.usuarioWeb.getSession().invalidate();
            this.result.redirectTo(LoginController.class).loginForm();
    }
    
    @Path("/detalhe")
    public void detalhe(){        
    }
    
    
}
