package P1;

public class Principal {
	public static void main(String[] args) {
		Livro l1 = FabricaBiblioteca.criarLivro("Desing Web","Lucas Gaybriel",1);
		Livro l2 = FabricaBiblioteca.criarLivro("Desing de Pc","Rodraigo Gama",1);
		Livro l3 = FabricaBiblioteca.criarLivro("Arquitetura de Pc","João Robert",5);
		FabricaBiblioteca.criarLivro("Quando a chuva passar", "Gaylherme ",3);
		
		Aluno a1 = FabricaBiblioteca.criarAluno("Lucas Gaybriel","17");
		Aluno a3 = FabricaBiblioteca.criarAluno("Rodraigo Gama","23");
		Aluno a4 = FabricaBiblioteca.criarAluno("João Robert", "20");
		
		System.out.println("Ao todo " + FabricaBiblioteca.getQuantLivros() + " livros foram instanciados.");
		System.out.println("Ao todo " + FabricaBiblioteca.getQuantAlunos() + " alunos foram instanciados.");
		
	}

}
