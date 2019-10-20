function cria_pessoa (nome){
	let pessoa = {}
	pessoa.nome = nome;
	pessoa.fale = function(){
		return "oi eu sou" + pessoa.nome
	};
	return pessoa;
}

pessoa = cria_pessoa("abril");

console.log(pessoa.fale());