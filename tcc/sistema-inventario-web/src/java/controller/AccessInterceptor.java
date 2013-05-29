package controller;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;
import javax.servlet.ServletContext;
import util.SessionWeb;

@Intercepts
public class AccessInterceptor implements Interceptor {

    private final SessionWeb usuarioWeb;
    private final Result result;

    public AccessInterceptor(SessionWeb usuarioWeb, Result result, ServletContext context) {
        this.usuarioWeb = usuarioWeb;
        this.result = result;
        this.result.include("contextPath",context.getContextPath());
    }

    public boolean accepts(ResourceMethod arg0) {
        return !"loginForm".equals(arg0.getMethod().getName()) && !"validateLogin".equals(arg0.getMethod().getName());
    }

    public void intercept(InterceptorStack arg0, ResourceMethod arg1, Object arg2) throws InterceptionException {
        if (this.usuarioWeb.getUsuario().getId() == null) {
            this.result.redirectTo(LoginController.class).loginForm();
        } else {
            arg0.next(arg1, arg2);
        }

    }
}
