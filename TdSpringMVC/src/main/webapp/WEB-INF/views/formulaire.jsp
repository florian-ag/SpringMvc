<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire</title>
<link rel="stylesheet" href="<c:url value="resources/CSS/style.css"/>">

</head>
<body>
	<a href="nompersonne?mylocale=en">English </a>
	<img src="resources/img/anglais.png" width="18px" height="12px"/>
	<a href="nompersonne?mylocale=fr">Français </a>
	<img src="resources/img/france.png" width="18px" height="12px"/>


	<form:form method="POST" action="nompersonne" modelAttribute="nom">

		<form:label path="nom"> Nom : </form:label>
		<form:input path="nom" />
		<form:errors path="nom" cssClass="error" />

		<br>

		<form:label path="prenom"> Prenom : </form:label>
		<form:input path="prenom" />
		<form:errors path="prenom" cssClass="error" />

		<br>
		<form:label path="B">
					  Are u cool ?
		</form:label>
		<form:checkbox path="B" />
		<form:errors path="B" cssClass="error" />
		<input type="submit" value="send">
	</form:form>
</body>
</html>