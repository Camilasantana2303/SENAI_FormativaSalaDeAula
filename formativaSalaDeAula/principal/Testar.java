package atividade.principal;

import java.util.ArrayList;

import atividade.entidade.Aluno;
import atividade.entidade.Disciplina;
import atividade.entidade.Professor;
import atividade.entidade.Turma;
/*
 * principal herda de todas as classes
 */
public class Testar {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.exibirInformacoes();
		Professor professor2 = new Professor("Camila",1234275680, "a", Disciplina.LM, "manha");
		professor2.exibirInformacoes();
		
		Aluno aluno = new Aluno ("Gustavo",1234275680,"mds", Disciplina.LM,new ArrayList <>());
		aluno.exibirInformacoes();
		aluno.adicionarNota(2);
		aluno.adicionarNota(3);
		aluno.adicionarNota(3);
		aluno.adicionarNota(1);
		aluno.exibirInformacoes();
		aluno.calcularMedia();
		
		Turma turma = new Turma();
		turma.adicionarAluno(aluno);
		turma.adicionarAluno(new Aluno());
		turma.listarAluno();
		turma.removerAluno(aluno);
		turma.listarAluno();
	}

}
