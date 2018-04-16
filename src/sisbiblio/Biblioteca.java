package sisbiblio;
import java.util.Arrays;

public class Biblioteca 
{
	Livro[] vetorLivros;
	int totLivros, tamLivros;
	Editora[] vetorEditoras;
	int totEdits, tamEdits;
	
	public Biblioteca(int tamLivros, int tamEdits)
	{
		this.vetorLivros = new Livro[tamLivros];
		this.totLivros = 0;
		this.tamLivros = tamLivros;
		this.vetorEditoras = new Editora[tamEdits];
		this.totEdits = 0;
		this.tamEdits = tamEdits;
	}
	
	/*
	 * 
	 * metodos para livros
	 *  
	 */
	
	public boolean insereLivro(Livro livro) 		//insere um livro, caso o array não esteja cheio
	{ 
		if(livrosFull()) {
			System.out.println();
			System.out.println("ERRO! Número máximo de cadastros atingido!");
			return false;
		} else {
			if(totEdits == 0) {
				System.out.println();
				System.out.println("ERRO! Não há editoras cadastrados!");
				return false;
			} else {
				vetorLivros[totLivros++] = livro;
				return true;
			}
		}
	}
	
	public boolean removeLivroPeloNome(String nome)	//remove um livro do cadastro pelo seu nome
	{
		if(totLivros == 0) {
			System.out.println();
			System.out.println("ERRO! Não há livros cadastrados!");
			return false;
		} else {
			for(int i = 0; i < totLivros; i++) {
				if(nome.equalsIgnoreCase(vetorLivros[i].getNomeLivro())) {
					compactaLivro(i);
					System.out.println();
					System.out.println("Livro removido com sucesso!");
				}
			}
		}
		return true;
	}
	
	public boolean removeLivroPelaEditora(String editora)	//remove todos os livros do cadastro de determinada editora
	{
		if(totEdits == 0) {
			System.out.println();
			System.out.println("Não há editoras cadastradas!");
			return false;
		} else {
			for(int i = 0; i < totEdits; i++) {
				if(editora.equalsIgnoreCase(vetorEditoras[i].getNomeEditora())) {
					int codigo = vetorEditoras[i].getCodigoEditora();
					if(removeLivroCodigoEditora(codigo)) {
						System.out.println();
						System.out.println("Livro removido com sucesso!");
					}
				}
			}
		}
		return true;
	}

	private boolean removeLivroCodigoEditora(int codigo) 
	{
		boolean result = false;
		for(int j = 0; j < totLivros; j++) {
			if(codigo == vetorLivros[j].getCodigoEditora()) {
				compactaLivro(j);
				result = true;
			}
		}
		return result;
	}
	
	public void listaLivros() //mostra todas os livros cadastrados
	{ 
		String nomeEdit = "";
		String livroInfo = "";
		if(totLivros == 0) {
			System.out.println();
			System.out.println("Não há livros cadastrados!");
		} else {
			for(int i = 0; i < totLivros; i++) {
				nomeEdit = getNomeEditora(vetorLivros[i].getCodigoEditora());
				if(!nomeEdit.equals("")) {
					livroInfo = "Nome do Livro: " + vetorLivros[i].getNomeLivro() + "\n" +
							"Nome do Autor: " + vetorLivros[i].getNomeAutor() + "\n" +
						    "Nome da Editora: " + nomeEdit + "\n" +
						    "Numero de Paginas: " + vetorLivros[i].getNumeroPaginas() + "\n" +
						    "-----------------------------------";
							System.out.println(livroInfo);
				}
			}
		}
	}

	public boolean emprestaLivro(String nomeLivro)
	{
		int position = livroExiste(nomeLivro);
		boolean result = false;
		if(position >= 0) {
			int exemplares = vetorLivros[position].getQuantExemplares();
			if(exemplares > 0) {
				vetorLivros[position].setQuantExemplares(exemplares - 1);
				result = true;
			}
		}
		return result;
	}
	
	public boolean retornaLivro(String nomeLivro) 
	{
		boolean result = false;
		int position = livroExiste(nomeLivro);
		if(position >= 0) {
			int exemplares = vetorLivros[position].getQuantExemplares();
			vetorLivros[position].setQuantExemplares(exemplares + 1);
			result = true;
		}
		return result;
	}
	
	public String pesquisaLivro(String nomeLivro) {
		int position = livroExiste(nomeLivro);
		String livroInfo = "";
		
		if(position >= 0) {
			String nomeEdit = getNomeEditora(vetorLivros[position].getCodigoEditora());
			livroInfo = "Nome do Livro: " + vetorLivros[position].getNomeLivro() + "\n" +
				    "Nome da Editora: " + nomeEdit + "\n" +
				    "Quantidade Exemplares: " + vetorLivros[position].getQuantExemplares() + "\n" +
				    "";
		}
		return livroInfo;
	}
	
	public String pesquisaLivro(int codigo) {
		int tamLivros = livrosMesmaEditora(codigo);
		String[] livros = new String[tamLivros];
		String nomeEdit = getNomeEditora(codigo);
		int totString = 0;
		String info = "";
		
		if(!nomeEdit.equals("")) {
			for(int i=0; i < totLivros; i++) {
				if(codigo == vetorLivros[i].getCodigoEditora()) {
					livros[totString]= new String(vetorLivros[i].getNomeLivro());
					totString++;
				}
			}
			if(livros.length > 0) {
				info = "Nome da Editora: " + nomeEdit + "\n" +
						   "Livro(s): " + Arrays.toString(livros)+ "\n" +
						    "";
			} else {
				info = "Nenhum livro cadastrado com a editora informada.";
			}
		}
		return info;
	}
	
	/*
	 * 
	 * metodos auxiliares livros
	 *  
	 */
	
	private boolean livrosFull()
	{
		return (totLivros == tamLivros);
	}

	private void compactaLivro(int posicao) 
	{
		for(int i = posicao; i < totLivros; i++) {
			vetorLivros[i] = vetorLivros[i + 1];
			totLivros--;
		}
	}
	
	private int livroExiste(String nomeLivro) 
	{
		int position = -1;
		for(int i = 0; i < totLivros; i++) {
			if(nomeLivro.equalsIgnoreCase(vetorLivros[i].getNomeLivro())) {
				position = i;
			}
		}
		return position;
	}
	
	/*
	 * 
	 * metodos para editoras
	 *  
	 */
	
	public boolean insereEditora(Editora editora) 		//insere uma editora, caso o array não esteja cheio
	{ 
		if(editorasFull()) {
			System.out.println();
			System.out.println("ERRO! Número máximo de editoras atingido!");
			return false;
		} else {
			vetorEditoras[totEdits++] = editora;
			return true;
		}
	}

	public boolean removeEditora(int codigo) 
	{
		boolean result = false;
		for(int i = 0; i < totEdits; i++) {
			if(codigo == vetorEditoras[i].getCodigoEditora()) {
				compactaEditora(i);
				removeLivroCodigoEditora(codigo);
				result = true;
			}
		}
		return result;
	}
		
	public void listaEditoras() 		//mostra todas as editoras cadastradas
	{		
		if(totEdits == 0) {
			System.out.println();
			System.out.println("Não há editoras cadastradas!");
		} else {
			for(int i = 0; i < totEdits; i++) {
				System.out.println();
				System.out.print(vetorEditoras[i].toString());			
			}
		}
	}

	/*
	 * 
	 * metodos auxiliares editoras
	 *  
	 */
	
	private boolean editorasFull()
	{
		return (totEdits == tamEdits);
	}
	
	private void compactaEditora(int posicao) 
	{
		for(int i = posicao; i < totEdits; i++) {
			vetorEditoras[i] = vetorEditoras[i + 1];
			totEdits--;
		}
	}
	
	private String getNomeEditora(int codigo) 
	{
		String nomeEdit = "";
		for(int j = 0; j < totEdits; j++) {
			if(codigo == vetorEditoras[j].getCodigoEditora()){
				nomeEdit = vetorEditoras[j].getNomeEditora();
			}
		}
		return nomeEdit;
	}
	
	private int livrosMesmaEditora(int codigo) {
		int numeroLivros = 0;
		for(int i=0; i < totLivros; i++) {
			if(codigo == vetorLivros[i].getCodigoEditora()) {
				numeroLivros++;
			}
		}
		return numeroLivros;
	}
	

	/*
	 * 	public void show() {
		for (int i = 0; i < tot; i++) {
			System.out.println("\n" + vetObras[i].getNome());

			System.out.print(vetObras[i] instanceof Obra);
			System.out.print(vetObras[i] instanceof Livreto);
			System.out.println(vetObras[i] instanceof DVD);
			
			if (vetObras[i] instanceof Livreto) {
				System.out.println(((Livreto) vetObras[i]).getEdicao());
			}
			
			if (vetObras[i] instanceof Livreto) {
				System.out.println(((Livreto) vetObras[i]).calculaTamanho() + " pags.");
				((Livreto)vetObras[i]).mostraSelo();
			} else {
				System.out.println(((DVD) vetObras[i]).calculaTamanho() + " MBs.");
				((DVD)vetObras[i]).mostraSelo();
			}
			
			
			
		}
	}
	 */
	
}
