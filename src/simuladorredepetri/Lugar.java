package simuladorredepetri;

public class Lugar 
{
	private int qtdeMarcas;
	private String nome;

	public Lugar(int qtdeMarcas, String nome) 
	{
		this.qtdeMarcas = qtdeMarcas;
		this.nome = nome;
	}
	
	public String getNomeLugar() 
	{
		return nome;
	}
	
	public void setNomeLugar(String nome) 
	{
		this.nome = nome;
	}
	
	public int getQtdeMarcas() 
	{
		return qtdeMarcas;
	}

	public void setQtdeMarcas(int qtdeMarcas) 
	{
		this.qtdeMarcas = qtdeMarcas;
	}

	public void consumirMarcas(int peso) 
	{
		qtdeMarcas = qtdeMarcas - peso;
	}
	
	public void adicionarMarcas(int peso) 
	{
		qtdeMarcas = qtdeMarcas + peso;
	}
	
}
