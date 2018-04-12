package sisbiblio;

@SuppressWarnings("unused")

public abstract class Obra {
	protected String nome;
	protected String autor;
    private int id;
    protected int seloSeg;
	
	
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	
	public Obra(String nome, String autor) {
		super();
		this.nome = nome;
		this.autor = autor;
	}
	
	//os seguintes metodos protegidos sao herdados pelas subclasses Livreto e DVD:
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getAutor() {
		return autor;
	}
	protected void setAutor(String autor) {
		this.autor = autor;
	}
	
	/*
	 * metodo abstrato:
	 * forcam subclasses a implementarem este metodo, cada uma a sua maneira.
	 * para um Livreto, tamanho pode ser quantidade de paginas, enquanto que
	 * para um DVD, tamanho pode ser medido em MBytes, por exemplo.
	 * 
	 * nao eh possivel supor uma implementacao para este metodo na super classe,
	 * uma vez que cada subclasse implementa do seu jeito este metodo.
	*/
	
	protected abstract int calculaTamanho();
	
	/*
	 * Obs.:
	 * 1. metodos private, static e final nao podem ser abstratos.
	 * 
	 * 2. classe abstrata nao pode ser instanciada.
	 * 
	 * 3. pode ter metodos e propriedades nao abstratos.
	 */

}
