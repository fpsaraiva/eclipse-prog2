package matrizesparsa;

public class Celula {

	private double valor;
	private int linha;
	private int coluna;
	
	Celula(double valor, int linha, int coluna) 
	{
		this.valor = valor;
		this.linha = linha;
		this.coluna = coluna;
	}

	public double getValor() 
	{
		return valor;
	}

	public void setValor(double valor) 
	{
		this.valor = valor;
	}

	public int getLinha() 
	{
		return linha;
	}

	public void setLinha(int linha) 
	{
		this.linha = linha;
	}

	public int getColuna() 
	{
		return coluna;
	}

	public void setColuna(int coluna) 
	{
		this.coluna = coluna;
	}
	
}
