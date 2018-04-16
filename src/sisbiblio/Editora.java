package sisbiblio;

public class Editora 
{
	private String nomeEditora;
	private int codigoEditora;

	public Editora(String nomeEditora, int codigoEditora)
	{
		this.nomeEditora = nomeEditora;
		this.codigoEditora = codigoEditora;
	}
	
	public String getNomeEditora() 
	{
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) 
	{
		this.nomeEditora = nomeEditora;
	}

	public int getCodigoEditora() 
	{
		return codigoEditora;
	}

	public void setCodigoEditora(int codigoEditora) 
	{
		this.codigoEditora = codigoEditora;
	}

	public String toString() 
	{
		String retorno = "Nome da editora: " + nomeEditora;
    	retorno += "\n";
    	retorno += "Código da editora: " + codigoEditora;
    	retorno += "\n";
    	return retorno;
	}

}
