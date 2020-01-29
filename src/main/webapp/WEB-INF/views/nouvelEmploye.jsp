<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="header.jsp" %>

	<div class="container">
		<h3>${title}</h3>
		<div>
			<c:url value="/employes/creer" var="empUrl" />
			<form:form modelAttribute="employe" action="${empUrl}" method="post">
				<div class="form-group">
					<label for="prenom">Prenom</label>
					<form:input path="prenom" id="prenom" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="nom">Nom</label>
					<form:input path="nom" id="nom" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="email">Email</label>
					<form:input path="email" id="email" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="rue">Rue</label>
					<form:input path="adresse.rue" id="rue" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="codePostal">Code Postal</label>
					<form:input path="adresse.codePostal" id="codePostal" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="ville">Ville</label>
					<form:input path="adresse.ville" id="ville" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="departement">Departement</label>
					<form:select path="departement" class="form-control">
						<form:option value="-" label="Select Dept"></form:option>
						<form:options  items="${departements}" itemValue="id" itemLabel="nom"/>
					</form:select>
				</div>
				<button type="submit" class="btn btn-primary">Creer</button>
			</form:form>
		</div>
	</div>







<%@include file="footer.jsp" %>