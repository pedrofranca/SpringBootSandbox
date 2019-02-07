function basicAjaxCall() {
	var xhr = new XMLHttpRequest();
	//       Verbo, endereço,           anssíncrono
	xhr.open('GET', 'resources/txt/readme.txt', true);
	
	xhr.onload = function() {
		if(this.status == 200){
			console.log(this.responseText);
		} else {
			console.log('Arquivo não encontrado ' + this.status);
		}
	}
	
	xhr.send();
	
}