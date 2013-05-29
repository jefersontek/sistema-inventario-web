/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wsdl;

import dao.SetorDAO;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import modal.Setor;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Jeferson
 */
@WebService(serviceName = "WsdlSetor")
public class WsdlSetor {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "listar")
    public List<Setor> listar(@WebParam(name = "chave") String chave) {
        
       List<Setor> lstSetores;   
       
       Session session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       
       SetorDAO setorDAO = new SetorDAO(session);
       
       lstSetores = setorDAO.listar();
       
       return lstSetores;
    }
}
