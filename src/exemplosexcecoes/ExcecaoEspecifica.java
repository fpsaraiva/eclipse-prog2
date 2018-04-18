package exemplosexcecoes;

@SuppressWarnings("serial")
public class ExcecaoEspecifica extends Exception 
{
	private int valor;

	public ExcecaoEspecifica(int valor) 
	{
		this.valor = valor;
	}

	public String toString() 
	{
		return valor + " e' um valor nao permitido.";
	}
}
