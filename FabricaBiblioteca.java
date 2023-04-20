package P1;

public class FabricaBiblioteca {
	private static int quantAlunos = 0 ;
	private static int quantLivros = 0;
	
	private FabricaBiblioteca() {
	}
	
	public static void incAlunos() {
		quantAlunos ++;
	}
	public static void incLivros() {
		quantLivros ++;
	}
	public static int getQuantLivros() {
		return quantLivros;
	}
	public static int getQuantAlunos() {
		return quantAlunos;
	}
	public static Livro criarLivro(String nome, String editora, int edicao) {
		FabricaBiblioteca.incLivros();
		return new Livro(nome, editora, edicao);	
	}
	public static Aluno criarAluno(String nome, String matricula) {
		FabricaBiblioteca.incAlunos();
		return new Aluno(nome, matricula);	
	}

}
