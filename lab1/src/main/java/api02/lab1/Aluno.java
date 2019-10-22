package api02.lab1;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Aluno {
	
	private int id;
	private String nome;
	private int mat;
	
	@JsonCreator
	public Aluno(int id, String nome, int mat) {
		this.id = id;
		this.nome = nome;
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", mat=" + mat + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	
}
