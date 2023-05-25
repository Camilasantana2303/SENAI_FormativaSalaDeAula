package atividade.entidade;

/**
 * a classe pessoa é a base para todas as entidades do projeto
 * @author Aluno
 *
 */
public abstract class Pessoa {

	private String nome;
	private int cpf;
	
	public Pessoa(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Pessoa() {}
	
	public abstract void exibirInformacoes();

	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
}
