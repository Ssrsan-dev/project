window.onload = function () {
	
	$("#btnConfirmar").on("click", function(ev){
		validaForm(ev);
	});
	
	function validaForm(ev) {
		var formEhValido = true;
		
		validaData();
		
		$('input').each(function(){
		    if (!$(this).val()) {
				formEhValido = false;
			}
		});
		
		if (!formEhValido) {
			ev.preventDefault();
			alert("Preencha todos os campos!");
			return;
		}
		
		if (!validaData()) {
			alert("Data para agendamento n\u00e3o pode ser anterior ao dia de hoje!");
			ev.preventDefault();
		}	
	}
	
	function validaData() {
		var dataDeHoje = new Date();
		var dataInserida = new Date($("#dataInput").val());
		
		console.log(dataDeHoje);
		console.log(dataInserida);
		
		if (dataInserida >= dataDeHoje) {
			console.log("é");
			return true;
		}
		
		return false;
	}
};