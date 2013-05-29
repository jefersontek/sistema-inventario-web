/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import dao.DiscoDAO;

/**
 *
 * @author Jeferson
 */
@Resource
public class DiscoController {
    
    private final Result result;
    private final DiscoDAO discoDAO;

    public DiscoController(Result result, DiscoDAO discoDAO) {
        this.result = result;
        this.discoDAO = discoDAO;
    }
    
    public void listar(){
        this.result.include("discos", this.discoDAO.listar());
    }
    
}
