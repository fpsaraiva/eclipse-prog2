package tabelaperiodica;

public class ElementoQuimico 
{
	private String simboloElemento;
	private String nomeElemento;
	private int numeroAtomico;
	private double pesoAtomico;
	
	public ElementoQuimico(String simbolo, String nome, int numero, double peso)
	{
		this.simboloElemento = simbolo;
		this.nomeElemento = nome;
		this.numeroAtomico = numero;
		this.pesoAtomico = peso;
	}

	public String getSimboloElemento() 
	{
		return simboloElemento;
	}

	public void setSimboloElemento(String simboloElemento) 
	{
		this.simboloElemento = simboloElemento;
	}

	public String getNomeElemento() 
	{
		return nomeElemento;
	}

	public void setNomeElemento(String nomeElemento) 
	{
		this.nomeElemento = nomeElemento;
	}

	public int getNumeroAtomico() 
	{
		return numeroAtomico;
	}

	public void setNumeroAtomico(int numeroAtomico) 
	{
		this.numeroAtomico = numeroAtomico;
	}

	public double getPesoAtomico() 
	{
		return pesoAtomico;
	}

	public void setPesoAtomico(double pesoAtomico) 
	{
		this.pesoAtomico = pesoAtomico;
	}
	
}
