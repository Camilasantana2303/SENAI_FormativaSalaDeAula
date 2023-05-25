package atividade.entidade;

public enum Disciplina {
	FPOO ("Fundamentos de Programacao Orientada a Objetos"),
	LM ("Linguagem de Marcacao"),
	SO ("Sistemas Operacionais"),
	REDES ("Hardware e Redes");
	
	private String descricao;
	
	private Disciplina (String descricao) {
		this.descricao= descricao;
	}
	public String getDescricao() {
		return descricao;
	}

}
