<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="agendamento" var="linkServletAgendamento"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"/>
<link rel="stylesheet" href="style/formNovoAgendamento.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" >
<script src="script/formNovoAgendamento.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" ></script>
<meta charset="ISO-8859-1">
<title>Agendamento</title>
</head>
<body>
	<div class="container card vertical-center out-shadow">			
		<div class="row">
			<div class="col">
				<h1 class="display-4">Faça seu agendamento</h1>
				<form action="${ linkServletAgendamento }" method="post">
					<div class="form-group">
						<label for="nomeInput">Nome</label>
						<input type="text" name="nome" class="form-control" id="nomeInput" placeholder="Seu nome...">
					</div>
					<div class="form-group">
						<label for="cpfInput">CPF</label>
						<input type="text" name="cpf" class="form-control" id="cpfInput" placeholder="Seu CPF...">
						<small id="cpfAviso" class="form-text text-muted">Não compartilharemos seus dados com ninguém!</small>
					</div>
					<div class="form-group">
						<label for="contatoInput">Contato</label>
						<input type="text" name="contato" class="form-control numeric" id="contatoInput" placeholder="Seu celular...">
					</div>
					<div class="form-group">
						<label for="dataInput">Data para agendamento</label>
						<input type="date" name="data" class="form-control" id="dataInput" placeholder="dd/mm/aaaa">
					</div>
					<button type="submit" id="btnConfirmar" class="btn btn-primary w-100">Confirmar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>