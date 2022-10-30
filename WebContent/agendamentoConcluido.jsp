<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"/>
<link rel="stylesheet" href="style/agendamentoConcluido.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" >
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" ></script>
<meta charset="ISO-8859-1">
<title>Agendamento concluído</title>
</head>
<body>
	<div>
		<c:if test="${ not empty nome and not empty data}">
			<div class="container card text-center out-shadow">
				<div class="row">
					<div class="col">
						<i class="fa-solid fa-circle-check fa-5x"></i>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<h1 class="display-4">Agendamento realizado com sucesso!</h1>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<span>Agendamento para ${ nome } - ${ data }</span>
					</div>
				</div>
			</div>
		</c:if>
		<c:if test="${ empty nome or empty data}">
			<div class="container card text-center out-shadow">
				<div class="row">
					<div class="col">
						<i class="fa-solid fa-circle-xmark fa-5x"></i>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<h2>Não foi possível fazer o agendamento.</h2>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<span>Ocorreu um erro, tente novamente.</span>
					</div>
				</div>
			</div>
		</c:if>
	</div>
</body>
</html>