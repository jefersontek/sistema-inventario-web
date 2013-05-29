/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.caelum.vraptor.ioc.RequestScoped;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Jeferson
 */
@RequestScoped
@Component
public class SessionFactory implements ComponentFactory<Session> {

    private static final org.hibernate.SessionFactory sessionFactory;
    private Session session;

    static {
        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    }

    @Override
    public Session getInstance() {
        return this.session;
    }

    @PostConstruct
    public void create() {
        this.session = sessionFactory.openSession();
        System.out.println("****************Abriu conexão*************");
    }

    @PreDestroy
    public void destroy() {
        if (this.session != null) {
            this.session.flush();
            this.session.clear();
            this.session.close();
        }
        System.out.println("****************Fechou conexão*************");
    }
}
