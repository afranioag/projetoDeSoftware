package api02.lab1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AlunoServices {
	
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Aluno addAluno(Aluno aluno) {
		alunos.add(aluno);
		return aluno;
	}
	
	public Aluno addAluno(int id, String nome, int mat) {
		Aluno aluno = new Aluno(id, nome, mat);
		alunos.add(aluno);
		return aluno;
	}
	
	public List<Aluno> exibeAlunos(){
		return alunos;
	}
	
	public Aluno exibeAluno(Integer id) {
		if(id>alunos.size() || id<0) {
			return null;
		}
		return alunos.get(id);
	}
	
	public List<Aluno> addAlunos() {
		for (int i = 0; i<30; i++ ) {
			Aluno aluno = new Aluno(i, "alunoNumero: "+i, 123456*99+(alunos.size()));
			alunos.add(aluno);
		}
		return alunos;
	}
	
}
