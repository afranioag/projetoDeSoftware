exports.disciplina = disciplina;

function disciplina (cod, nome, creditos, requisitos){
	let d = {};

	d.cod = cod;
	d.nome = nome;
	d.creditos = creditos;
	d.pre_requisitos = requisitos;

	d.set_nome = function(novoNome){
		d.nome = novoNome;
	}

	d.get_nome = function(){
		return d.nome;
	}

	d.id = function(){
		return d.cod;
	}
	return d;
}

function professor(mat, nome, email, cpf, url){
	let pro = {}
	pro.mat = mat
	pro.nome = nome
	pro.email = email
	pro.cpf = cpf
	pro.url = url
	pro.turma = []

	pro.aloca_turma = function (turma){
		turma.professor = pro
		pro.turma.push(turma)
	}

	pro.turma = function(semestre){
		return pro.turma.filter(t => t.periodo === semestre);
	}

	return pro;
}
function estudante(mat, nome, email, cpf, url){
	let est = {}
	est.mat = mat
	est.nome = nome
	est.email = email
	est.cpf = cpf
	est.url = url
	est.turmas = []

	est.matricula = function (turma){
		turma.alunos.push(est)
		est.turmas.push(turma)
	}

	est.turmas = function(semestre){
		return est.turmas.filter(t => t.periodo === semestre);
	}

	return est;
}



function turma (disciplina, periodo){
	let t = {}
	t.periodo = periodo
	t.status = status
	t.disci = disciplina()
	t.alunos = []
	t.professor = null

	t.cadastra_professor = function()


	return t
}