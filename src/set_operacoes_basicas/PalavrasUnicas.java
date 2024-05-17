package set_operacoes_basicas;

public class PalavrasUnicas {
	private String palavra;

	public PalavrasUnicas(String palavra) {
		this.palavra = palavra;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	@Override
	public String toString() {
		return "[" 
				+ palavra 
				+ "]";
	}
	
	

}
