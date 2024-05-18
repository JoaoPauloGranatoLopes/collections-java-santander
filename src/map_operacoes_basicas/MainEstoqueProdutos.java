package map_operacoes_basicas;

public class MainEstoqueProdutos {

	public static void main(String[] args) {
		
		EstoqueProdutos estoque = new EstoqueProdutos();
		estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
		estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
		estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
		
		estoque.exibirProdutos();
		
		System.out.println("Valor total do estoque = " + estoque.calcularValorTotalEstoque());
		
		estoque.adicionarProduto(4L,"Produto D", 2, 35.0);
		estoque.exibirProdutos();
		
		System.out.println("Valor total do estoque = " + estoque.calcularValorTotalEstoque());
		System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
		System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
	}

}
