<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width" />
<title>Página JSP</title>

<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
<link rel="icon" href="<c:url value="/imagens/favicon64.png"/>">

</head>

<body>

	<!-- FORMULÃRIO PARA ADICIONAR CENTRO DE CUSTO -->
	<!-- O recurso th:object captura o objeto 'CentroCusto', adicionado no 'modelAndView' , no mÃ©todo 'listarParaView' ****(modelAndView.addObject(new CentroCusto());****        -->
	<!-- JÃ¡ o recurso th:action direciona os dados do formulÃ¡rio para o caminho especÃ­fico. Nesse caso, para 'centrocusto/novo' -->


	<form:form name="frmObra" class="form-inline" method="POST"
		style="margin: 20px 0">


		<h1>This is a JSP page</h1>

		<div style="margin: 10px 0px 0px 10px;">
			<img src="<c:url value="/imagens/jsp.png"/>" height="200px"
				width="auto" />
		</div>
		<hr>

		<div style="margin: 10px 0px 0px 10px;">
			<a href="<c:url value="/jsf.xhtml"/>" title="Go to JSF page"><img
				src="<c:url value="/imagens/primefaces.png"/>" height="50px"
				width="auto" /></a>
		</div>

		<div style="margin: 10px 0px 0px 10px;">
			<a href="<c:url value="/thymeleaf"/>" title="Go to thymeleaf page"><img
				src="<c:url value="/imagens/thymeleaf.png"/>" height="30px"
				width="auto" /></a>
		</div>



	</form:form>


	<script src="<c:url value="/js/jquery-3.5.1.min.js"/>">
		
	</script>
	<script src="<c:url value="/js/bootstrap.min.js"/>">
		
	</script>


</body>
</html>