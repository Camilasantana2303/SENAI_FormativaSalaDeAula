package atividade.entidade;
/*
 * Professor extende de Pessoa
 * 
 */
public class Professor extends Pessoa {

	private String especialidade;
	private Disciplina disciplina;
	private String periodo;

	public Professor(
		String nome,
		int cpf,
		String especialidade,
		Disciplina disciplina,
		String periodo
	) {
		super(nome, cpf);
		this.especialidade=especialidade;
		this.disciplina=disciplina;
		this.periodo=periodo;
	}
	
	public Professor() {}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println(
			toString() + "\nespecialidade:"+especialidade+ "\ndisciplina:"+disciplina+ "\nperiodo:"+periodo);
	}

}
