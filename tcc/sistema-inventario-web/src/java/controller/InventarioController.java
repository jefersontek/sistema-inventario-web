/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import dao.InventarioDAO;

/**
 *
 * @author Jeferson
 */
@Resource
public class InventarioController {

    private final Result result;
    private final InventarioDAO inventarioDAO;

    public InventarioController(Result result, InventarioDAO inventarioDAO) {
        this.result = result;
        this.inventarioDAO = inventarioDAO;
    }  

    public void listar() {
        this.result.include("inventarios", this.inventarioDAO.listar());
    }
}
