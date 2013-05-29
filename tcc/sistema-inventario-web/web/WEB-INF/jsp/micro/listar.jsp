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
        <legend> Micro computadores </legend>
        
        <table class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>Patrimonio</th>
                    <th>Nome</th>
                    <th>Usuario</th>
                    <th>Setor</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${micros}" var="micro">
                    <tr>
                        <td>${micro.patrimonio}</td>
                        <td>${micro.nome}</td>
                        <td>${micro.usuario}</td>
                        <td>-</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </jsp:body>
</layout:masterPage>