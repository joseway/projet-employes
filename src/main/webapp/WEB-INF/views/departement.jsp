<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="header.jsp" %>

	<div class="container">
		<h3>${departement.nom}</h3>
		
		<table>
			<thead>
				<tr>
					<th>Prenom</th>
					<th>Nom</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${departement.employes}" var="emp">
				<tr>					
					<td>${emp.prenom}</td>
					<td>${emp.nom}</td>					
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>







<%@include file="footer.jsp" %>