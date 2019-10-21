function cria_pessoa (nome){
	let pessoa = {}
	pessoa.nome = nome;
	pessoa.fale = function(){
		return "oi eu sou " + pessoa.nome
	};
	return pessoa;
}

pessoa = cria_pessoa("abril");
console.log(pessoa.fale());


function cria_disciplina(id, nome){
	let dis = {}
	dis.id = id;
	dis.nome = nome;
	pessoa = cria_pessoa("joan")  // fazendo uso da funcao criada a cima
	console.log(pessoa.fale())

	for()

	dis.dados = function(){return dis.id +" id; " + dis.nome +" nome"}
	return dis
}

d = cria_disciplina(021, "prog")
console.log(d.dados())
