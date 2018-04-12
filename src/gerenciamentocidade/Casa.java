package gerenciamentocidade;

public class Casa extends Edificacao 
{
	boolean comGaragem, comPiscina;

	public Casa(int quantidadeAndares, String material, double areaConstruida, boolean comGaragem, boolean comPiscina) 
	{
		super(quantidadeAndares, material, areaConstruida);
		this.comGaragem = comGaragem;
		this.comPiscina = comPiscina;
	}

	public boolean isComGaragem() {
		return comGaragem;
	}

	public void setComGaragem(boolean comGaragem) {
		this.comGaragem = comGaragem;
	}

	public boolean isComPiscina() {
		return comPiscina;
	}

	public void setComPiscina(boolean comPiscina) {
		this.comPiscina = comPiscina;
	}
		
}
