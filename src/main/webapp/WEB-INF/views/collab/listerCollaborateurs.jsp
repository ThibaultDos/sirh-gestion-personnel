<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
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
		<%
			List<Collaborateur> listeCollaborateurs = (List<Collaborateur>)request.getAttribute("listeCollaborateurs");
			for (Collaborateur c : listeCollaborateurs) {
		%>
		<li><%=c.getNom()%></li>
		<%
			}
		%>
	</ul>
</body>

</html>