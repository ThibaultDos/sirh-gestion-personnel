<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>\bootstrap-4.3.1-dist/css/bootstrap.css">
<meta charset="UTF-8">
<title>SGP - App</title>
</head>

<body>
	<h1>Les collaborateurs</h1>
	<ul>
		<c:forEach var="collab" items="${listeCollaborateurs}">
			<li class="row-sm-12">
				<div class="col-sm-6">nom :</div>
				<div class="col-sm-6">${collab.nom}</div>
			</li>
			<li class="row-sm-12">
				<div class="col-sm-6">prénom :</div>
				<div class="col-sm-6">${collab.prenom}</div>
			</li>
		</c:forEach>
	</ul>
</body>

</html>