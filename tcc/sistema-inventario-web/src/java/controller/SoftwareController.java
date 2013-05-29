/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import dao.RedeDAO;
import dao.SoftwareDAO;

/**
 *
 * @author Jeferson
 */
@Resource
public class SoftwareController {
    
    private final Result result;
    private final SoftwareDAO softwareDAO;

    public SoftwareController(Result result, SoftwareDAO softwareDAO) {
        this.result = result;
        this.softwareDAO = softwareDAO;
    }
    
    public void listar(){
        this.result.include("softwares",this.softwareDAO.listar());
    }
    
}
