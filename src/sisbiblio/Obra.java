package sisbiblio;

@SuppressWarnings("unused")

public abstract class Obra 
{
	protected String nome;
	protected String autor;
    private int id;
    protected int seloSeg;
	
	
	private int getId() 
	{
		return id;
	}
	
	private void setId(int id) 
	{
		this.id = id;
	}
	
	public Obra(String nome, String autor) 
	{
		super();
		this.nome = nome;
		this.autor = autor;
	}
	
	//os seguintes métodos protegidos são herdados pelas subclasses Livreto e DVD:
	
	protected String getNome() 
	{
		return nome;
	}
	
	protected void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	protected String getAutor() 
	{
		return autor;
	}
	
	protected void setAutor(String autor) 
	{
		this.autor = autor;
	}
	
	/*
	 * método abstrato:
	 * forçam subclasses a implementarem este metodo, cada uma a sua maneira.
	 * para um Livreto, tamanho pode ser quantidade de páginas, enquanto que
	 * para um DVD, tamanho pode ser medido em MBytes, por exemplo.
	 * 
	 * não é possivel supor uma implementação para este método na super classe,
	 * uma vez que cada subclasse implementa do seu jeito este método.
	 * 
	*/
	
	protected abstract int calculaTamanho();
	
	/*
	 * Obs.:
	 * 1. métodos private, static e final não podem ser abstratos.
	 * 
	 * 2. classe abstrata não pode ser instanciada.
	 * 
	 * 3. pode haver métodos e propriedades não abstratos.
	 */

}
