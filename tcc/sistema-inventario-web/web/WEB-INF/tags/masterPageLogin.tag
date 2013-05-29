<%-- 
    Document   : masterPageLogin
    Created on : 07/05/2013, 19:05:37
    Author     : Jeferson
--%>

<%@tag description="Estrutura do layout do login WebApp" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link type="text/css" rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.css"/>" />
        <link type="text/css" rel="stylesheet" href="<c:url value="/css/style.css"/>" />
        <script type="text/javascript" src="<c:url value="/js/jquery.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/js/script.js"/>"></script>        
        <title>Sistema de Inventario - WEB</title>
    </head>
    <body>
        <jsp:doBody/>
    </body>
</html>