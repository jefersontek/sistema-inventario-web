/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import dao.MemoriaDAO;

/**
 *
 * @author Jeferson
 */
@Resource
public class MemoriaController {
    
    private final Result result;
    private final MemoriaDAO memoriaDAO;

    public MemoriaController(Result result, MemoriaDAO memoriaDAO) {
        this.result = result;
        this.memoriaDAO = memoriaDAO;
    }
    
    public void listar(){
        this.result.include("memorias",this.memoriaDAO.listar());
    }
    
}
