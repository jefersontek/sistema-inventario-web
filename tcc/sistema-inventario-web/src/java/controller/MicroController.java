/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import dao.MicroDAO;

/**
 *
 * @author Jeferson
 */
@Resource
public class MicroController {

    private final Result result;
    private final MicroDAO microDAO;

    public MicroController(Result result, MicroDAO microDAO) {
        this.result = result;
        this.microDAO = microDAO;
    }

    /**
     *
     * @param pagina
     */
    //@Path({"/listar/{pagina}","/listar"})
    public void listar() {
        this.result.include("micros", this.microDAO.listar());
    }
}
