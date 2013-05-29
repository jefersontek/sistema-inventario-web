/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

/**
 *
 * @author Jeferson
 */
@Resource
@Path("/home")
public class HomeController {
    
    private final Result result;

    public HomeController(Result result) {
        this.result = result;
    }
    
    @Path({"/",""})
    public void home(){
        
    }
    
    
}
