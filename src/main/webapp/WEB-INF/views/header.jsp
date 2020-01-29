<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />" />
		<title>${title}</title>
	</head>
	<body>
	
		<header class="header">
			<div class="container">
				<nav class="navbar">
					<a href="<c:url value="/" />">Accueil</a>
					<a href="<c:url value="/employes" />">Employes</a>
					<a href="<c:url value="/employes/creer" />">Creer Employe</a>
					<a href="<c:url value="/departements" />">Departements</a>
					<a href="<c:url value="/departements/nouveau-dept" />">Creer Departement</a>
				</nav>
			</div>
		</header>
