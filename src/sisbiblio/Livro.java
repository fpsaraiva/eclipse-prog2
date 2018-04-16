package sisbiblio;

public class Livro
{
    
    private String nomeLivro, nomeAutor;
    private int codigoEditora, numeroPaginas, quantExemplares;

    public Livro(String nomeLivro, String nomeAutor, int codigoEditora, int numeroPaginas, int quantExemplares)
    {
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.codigoEditora = codigoEditora;
        this.numeroPaginas = numeroPaginas;
        this.quantExemplares = quantExemplares;
    }

    public Livro(String nomeLivro)
    {
    		this.nomeLivro = nomeLivro;
    }
    
    public String getNomeLivro() 
    {
		return nomeLivro;
	}
    
	public void setNomeLivro(String nomeLivro) 
	{
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() 
	{
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) 
	{
		this.nomeAutor = nomeAutor;
	}

	public int getCodigoEditora() 
	{
		return codigoEditora;
	}

	public void setCodigoEditora(int codigoEditora) 
	{
		this.codigoEditora = codigoEditora;
	}

	public int getNumeroPaginas() 
	{
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) 
	{
		this.numeroPaginas = numeroPaginas;
	}
	
    public int getQuantExemplares() 
    {
		return quantExemplares;
	}

	public void setQuantExemplares(int quantExemplares) 
	{
		this.quantExemplares = quantExemplares;
	}
	
	public String toString()
	{
	    	String retorno = "Nome do livro: " + nomeLivro;
	    	retorno += "\n";
	    	retorno += "Nome do autor: " + nomeAutor;
	    	retorno += "\n";
	    	retorno += "Código da editora: " + codigoEditora;
	    	retorno += "\n";
	    	retorno += "Número de páginas: " + numeroPaginas;
	    	retorno += "\n";
	    	return retorno;
    }

}
