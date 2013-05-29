/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import dao.RedeDAO;

/**
 *
 * @author Jeferson
 */
@Resource
@Path("/rede")
public class RedeController {
    
    private final Result result;
    private final RedeDAO redeDAO;

    public RedeController(Result result, RedeDAO redeDAO) {
        this.result = result;
        this.redeDAO = redeDAO;
    }
    
    @Path("/listar")
    public void listar(){
        this.result.include("redes",this.redeDAO.listar());        
    }
    
}
