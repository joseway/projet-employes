<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="header.jsp" %>

	<div class="container">
		<div>
			<c:url value="/departements" var="deptUrl"/>
			<form:form action="${deptUrl}" method="post" modelAttribute="departement">
				<div class="form-control">
					<label for="nom">Nom</label>
					<form:input path="nom" type="text" id="nom" />
				</div>
				<button type="submit" class="btn btn-primary">Ajout Departement</button>
			</form:form>
		</div>
	</div>







<%@include file="footer.jsp" %>