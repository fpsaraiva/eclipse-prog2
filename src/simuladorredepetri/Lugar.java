package simuladorredepetri;

public class Lugar 
{

	private int qtdeMarcas;
	private String nome;

	public Lugar(int qtdeMarcas, String nome) {
		this.qtdeMarcas = qtdeMarcas;
		this.nome = nome;
	}
	
	public Lugar() {
		this.qtdeMarcas = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQtdeMarcas() {
		return qtdeMarcas;
	}

	public void setQtdeMarcas(int qtdeMarcas) {
		this.qtdeMarcas = qtdeMarcas;
	}

}
