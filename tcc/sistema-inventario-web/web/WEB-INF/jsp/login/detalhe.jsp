<%-- 
    Document   : listar
    Created on : 07/05/2013, 20:35:27
    Author     : Jeferson
--%>

<%@taglib tagdir="/WEB-INF/tags" prefix="layout" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<layout:masterPage>
    <jsp:body>
        <legend> Detlhes do usuario</legend>
        
        <table class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>Nome:</th>
                    <th>${usuarioWeb.usuario.nome}</th>
                    <th><a href="" class="btn btn-mini">Editar</a></th>
                </tr>
                <tr>
                    <th>Email:</th>
                    <th>${usuarioWeb.usuario.email}</th>
                    <th><a href="" class="btn btn-mini">Editar</a></th>
                </tr>
                <tr>
                    <th>Senha:</th>
                    <th>**********</th>
                    <th><a href="" class="btn btn-mini">Editar</a></th>
                </tr>
                <tr>
                    <th>Tipo de usuario:</th>
                    <th>${usuarioWeb.usuario.tipoUsuario.descricao}</th>
                    <th><a href="" class="btn btn-mini">Editar</a></th>
                </tr>
            </thead>           
        </table>
        
    </jsp:body>
</layout:masterPage>