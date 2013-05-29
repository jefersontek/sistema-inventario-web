<%-- 
    Document   : loginForm
    Created on : 06/05/2013, 21:41:21
    Author     : Jeferson
--%>

<%@taglib tagdir="/WEB-INF/tags" prefix="layout" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<layout:masterPageLogin>
    <jsp:body>
        
        <form name="loginForm" class="login_form form-horizontal" action="<c:url value="/validateLogin"/>" method="POST">
            <fieldset>
            <legend>Efetue o Login</legend>
            <label for="login">Login:</label>
            <input class="span4" id="login" type="email" name="usuario.email"/>
            <label for="senha">Senha:</label>
            <input class="span4" id="senha" type="password" name="usuario.senha"/>            
            <br>
            <br>            
            <button class="btn btn-success" type="submit">Login</button>
            <br>
            <br>
            
            <c:if test="${ not empty(errors[0].message)}">
                <div class="alert alert-error">${errors[0].message}</div>
            </c:if>           
            
            </fieldset>            
            
        </form>
            
    </jsp:body>
</layout:masterPageLogin>

