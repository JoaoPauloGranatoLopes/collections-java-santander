package list_operacoes_basicas.pesquisa;

public class MainCatalogo {

	public static void main(String[] args) {

		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
	    // Adicionando livros ao catálogo
	    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
	    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
	    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
	    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
	    
	    System.out.println(catalogoLivros.pesquisarPorAutor("Peter Jandl Junior"));
	    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
	    
	    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2009, 2022));
	    System.out.println("O Codificador Limpo");
	}

}
