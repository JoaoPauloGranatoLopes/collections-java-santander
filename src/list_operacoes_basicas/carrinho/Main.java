package list_operacoes_basicas.carrinho;

public class Main {

	public static void main(String[] args) {
		//criando uma instancia do CarrinhoDeCompras
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		//Adicionando itens ao carrinho
		carrinho.adicionarItem("Cerveja", 3.50, 6);
		carrinho.adicionarItem("Carne", 40.0, 4);
		carrinho.adicionarItem("Carvão", 5.50, 2);
		carrinho.adicionarItem("Frango", 4.00, 2);
		
		//exibindo itens do carrrinho
		carrinho.exibirItens();
		
		//removendo um item do carrinho
		carrinho.removerItem("Frango");
		
		//exibindo itens do carrrinho atualizado
		carrinho.exibirItens();
		
		//calculando e exibindo o valor total da compra
		System.out.println(String.format("O valor total da compra é %.2f ", carrinho.calcularValorTotal()));
		
	}

}
