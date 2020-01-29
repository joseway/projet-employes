<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="header.jsp" %>

	<div class="container">
		<h3>${title}</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Nom</th>
					<th>Employes</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${departements}" var="dept">
				<tr>
					<td><a href="<c:url value="/departements/${dept.id}" />">${dept.nom}</a></td>
					<td>${dept.employes.size()}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>







<%@include file="footer.jsp" %>