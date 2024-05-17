package set_ordenacao;

public class MainOrdenacao {

	public static void main(String[] args) {
		
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1L, "Monitor", 1000, 10);
		cadastroProdutos.adicionarProduto(2L, "Notebook", 1500, 5);
		cadastroProdutos.adicionarProduto(3L, "Mouse", 30, 20);
		cadastroProdutos.adicionarProduto(4L, "CPU", 50, 15);
		
		System.out.println(cadastroProdutos.getProdutoSet());
		
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());

	}

}
