package atividade.entidade;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * O aluno herda de pessoa 
 */
public class Aluno extends Pessoa {
	private String codTurma;	
	private Disciplina disciplina;
	private ArrayList<Double> notas;

	public Aluno(String nome, int cpf, String codTurma, Disciplina disciplina, ArrayList<Double> notas) {
		super(nome, cpf);
		this.codTurma = codTurma;
		this.disciplina = disciplina;
		this.notas = notas;
	}

	public Aluno() {

	}

	public void adicionarNota(double nota) {
		notas.add(nota);
	}

	public void removerNota(double nota) {
		notas.remove(nota);
	}

	public void listarNota() {
		for (int i = 0; i < notas.size(); i++) {
			System.out.println(notas.get(i));
		}
	}
/**
 * Metodo de exibir informação
 */
	@Override
	public void exibirInformacoes() {
		System.out.println(toString()+ "\ncodTurma:" + codTurma + "\ndisciplina" + disciplina
				+ "\nnotas" + notas);
	}

	public void calcularMedia() {
		double soma = 0;
		for (int i = 0; i < notas.size(); i++) {
			soma = soma + notas.get(i);
		}
		double media = soma / notas.size();
		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("reprovado");
		}
	}
	

}
