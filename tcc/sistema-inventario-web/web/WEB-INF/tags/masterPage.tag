<%-- 
    Document   : masterPage
    Created on : 07/05/2013, 18:59:28
    Author     : Jeferson
--%>

<%@tag description="Estrutura do layout WebApp" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link type="text/css" rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.css"/>" />
        <link type="text/css" rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap-responsive.css"/>" />
        <link type="text/css" rel="stylesheet" href="<c:url value="/css/style.css"/>" />
        <script type="text/javascript" src="<c:url value="/js/jquery.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/js/script.js"/>"></script>        
        <title>Sistema de Inventario - WEB</title>
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a style="color: white;" class="brand" href="<c:url value="/home"/>">Sistema de Inventario - WEB</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active">
                                <a href="<c:url value="/home"/>">Home</a>
                            </li>    
                            <li class="">
                                <a href="<c:url value="/detalhe"/>">Configurações</a>
                            </li>
                            <li class="">
                                <a href="<c:url value="/logoff"/>">Sair</a>
                            </li> 
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span2">
                    <!--Sidebar content-->
                    <ul class="nav nav-list bs-docs-sidenav affix">
                        <li class=""><a href="<c:url value="/micro/listar"/>"><i class="icon-chevron-right"></i> Micro-computadores</a></li>
                        <li class=""><a href="<c:url value="/software/listar"/>"><i class="icon-chevron-right"></i> Softwares</a></li>
                        <li class=""><a href="<c:url value="/memoria/listar"/>"><i class="icon-chevron-right"></i> Memorias</a></li>
                        <li class=""><a href="<c:url value="/disco/listar"/>"><i class="icon-chevron-right"></i> Discos-rigidos</a></li>
                        <li class=""><a href="<c:url value="/rede/listar"/>"><i class="icon-chevron-right"></i> Placas-de-rede</a></li>
                        <li class=""><a href="<c:url value="/inventario/listar"/>"><i class="icon-chevron-right"></i> Historico-de-inventarios</a></li>
                    </ul>
                </div>
                <div style="margin-left: 300px; margin-top: 35px;">
                    <!--Body content-->
                    <jsp:doBody/>
                </div>
            </div>
        </div>
    </body>
</html>
