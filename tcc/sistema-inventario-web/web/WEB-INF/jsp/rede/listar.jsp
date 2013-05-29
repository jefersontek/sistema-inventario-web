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
        <legend> Placas de redes</legend>
        
        <table class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>Descrição</th>
                    <th>IP</th>
                    <th>MAC-ADDRESS</th>
                    <th>Micro</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${redes}" var="rede">
                    <tr>
                        <td>${rede.descricao}</td>
                        <td>${rede.ip}</td>
                        <td>${rede.mac_address}</td>
                        <td>${rede.micro.nome}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </jsp:body>
</layout:masterPage>