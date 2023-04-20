package P1;

public class Livro {
	private String nome;
	private String editora;
	private int edicao;
	private boolean bloqueado;
	
	
	
	public Livro(String nome, String editora, int edicao) {
		this.nome = nome;
		this.editora = editora;
		this.edicao = edicao;
		this.bloqueado = false;
		
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public boolean isbloqueado() {
		return bloqueado;
	}
	
	public void bloquear() {
		this.bloqueado = true;
	}
	
	public void desbloquear() {
		this.bloqueado = false;
	}
	
	
	

	

}
