package atividade.entidade;

import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos = new ArrayList<>();
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public void listarAluno() {
		for(int i = 0; i < alunos.size();i++) {
			System.out.println(alunos.get(i));
		}	
	}
	
	public void editarAluno(int indice, Aluno novaInformacaoDoAluno) {
		alunos.set(indice, novaInformacaoDoAluno);
	}
	
}