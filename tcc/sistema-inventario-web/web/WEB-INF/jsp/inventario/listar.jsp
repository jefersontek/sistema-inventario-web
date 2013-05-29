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
        <legend> Inventarios - Historicos </legend>
        
        <table class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>Micro</th>
                    <th>Data Coleta</th>                                      
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${inventarios}" var="inventario">
                    <tr>
                        <td>${inventario.data}</td>
                        <td>${inventario.micro.patrimonio}</td>                       
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </jsp:body>
</layout:masterPage>