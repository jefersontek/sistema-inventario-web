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
        <legend> Memorias - RAM </legend>
        
        <table class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>Descrição</th>
                    <th>Capacidade</th>
                    <th>Micro</th>                   
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${memorias}" var="memoria">
                    <tr>
                        <td>${memoria.descricao}</td>
                        <td>${memoria.capacidade}</td>
                        <td>${memoria.micro.patrimonio}</td>
                        <td>-</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </jsp:body>
</layout:masterPage>