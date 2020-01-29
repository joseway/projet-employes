<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="header.jsp" %>

	<div class="container">
		<table>
			<thead>
				<tr>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Email</th>
					<th>Dept</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="emp" items="${employes}">
				<tr>
					<td><a href="<c:url value="/employes/${emp.id}" />">${emp.prenom}</a></td>
					<td><a href="<c:url value="/employes/${emp.id}" />">${emp.nom}</a></td>
					<td><a href="<c:url value="/employes/${emp.id}" />">${emp.email}</a></td>
					<td><a href="<c:url value="/employes/${emp.id}" />">${emp.departement.nom}</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>







<%@include file="footer.jsp" %>