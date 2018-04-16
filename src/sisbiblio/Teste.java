package sisbiblio;
import teclado.Teclado;

public class Teste 
{
	public static void main(String[] args) 
	{
	
		Biblioteca bib = new Biblioteca(Teclado.leInt("digite a quantidade de livros da biblioteca a ser criada: "), Teclado.leInt("digite quantas editoras serão cadastradas: "));
		
		boolean resultado;
		int n = 0;
		
		while(n >= 0 && n <= 13) {
		
			System.out.println();
			System.out.println("*******************");
            System.out.println("BIBLIO ONLINE v.1.0");
            System.out.println("*******************");
            System.out.println("(1) - Insere um livro");
            System.out.println("(2) - Remove um livro pelo nome");
            System.out.println("(3) - Remove um livro pela editora");
            System.out.println("(4) - Lista os livros cadastrados");
            System.out.println("(5) - Insere uma editora");
            System.out.println("(6) - Remove uma editora");
            System.out.println("(7) - Lista todas as editoras cadastradas");
            System.out.println("(8) - Retira um livro");
			System.out.println("(9) - Devolve um livro");
			System.out.println("(10) - Pesquisa livro pelo nome");
			System.out.println("(11) - Pesquisar livro pelo código da editora");
            System.out.println("(12) - Sair");
            
            System.out.println();
            int op = Teclado.leInt("digite a opção desejada: ");
			
            if(op == 1)	{
            		Livro livro = new Livro(Teclado.leString("nome do livro? "), Teclado.leString("autor do livro? "), Teclado.leInt("código da editora? "), Teclado.leInt("número de páginas? "), Teclado.leInt("quantidade de exemplares? "));
           		
    				boolean existeEditora = false;
    				for(int i = 0; i <bib.totEdits; i++) {
    					if(bib.vetorEditoras[i].getCodigoEditora() == livro.getCodigoEditora()) {
    						existeEditora = true;
    					}
    				}
    				if(!existeEditora) {
    					System.out.println("Não foi possível adicionar o livro. Código de editora não existe.");
    				} else {
    					resultado = bib.insereLivro(livro);
    					if(!resultado) {
    						System.out.println("Não foi possível adicionar o livro. Biblioteca cheia!");
    					}
    				}
            	}
            else if(op == 2) {
            		resultado = bib.removeLivroPeloNome(Teclado.leString("nome do livro a ser removido? "));
    				
            		if(resultado) {
    					System.out.println("Livro removido com sucesso!");
    				} else {
    					System.out.println("Não foi possível remover o livro digitado.");
    				}
            }
            else if (op == 3) {
            		resultado = bib.removeLivroPelaEditora(Teclado.leString("nome da editora? "));

            		if(resultado) {
    					System.out.println("Livro removido com sucesso!");
    				} else {
    					System.out.println("Não foi possível remover os livros da editora digitada.");
    				}
            }
            else if(op == 4)	 {
            		bib.listaLivros();
            }
            else if(op == 5) {
            		Editora editora = new Editora(Teclado.leString("nome da editora? "), Teclado.leInt("código da editora? "));
                
            		resultado = bib.insereEditora(editora);
            	
            		if(!resultado) {
            			System.out.println("Não foi possível adicionar a editora.");
            		}
            }
            else if(op == 6) {		
            		resultado = bib.removeEditora(Teclado.leInt("código da editora? "));
				
            		if(resultado) {
					System.out.println("Editora removida com sucesso!");
				} else {
					System.out.println("Código de editora invalido.");
				}
            }
            else if(op == 7)	 {
            		bib.listaEditoras();
            }
            else if(op == 8) {
				resultado = bib.emprestaLivro(Teclado.leString("nome do Livro? "));
				if(resultado) {
					System.out.println("Livro retirado com sucesso!");
				} else {
					System.out.println("ERRO! Verifique se o livro existe e possui exemplares disponiveis.");
				}
            }
            else if(op == 9) {
				resultado = bib.retornaLivro(Teclado.leString("nome do Livro? "));
				if(resultado) {
					System.out.println("Livro devolvido com sucesso!");
				} else {
					System.out.println("ERRO! Verifique se o nome do livro esta correto.");
				}
            }
            else if(op == 10) {
            		String info = bib.pesquisaLivro(Teclado.leString("nome do Livro? "));
				if(!info.equalsIgnoreCase("")) {
					System.out.println(info);
				} else {
					System.out.println("ERRO! Verifique se o nome do livro esta correto.");
				}
            }
            else if(op == 11) {
            		String info = bib.pesquisaLivro(Teclado.leInt("código da editora? "));
				if(!info.equalsIgnoreCase("")) {
					System.out.println(info);
				} else {
					System.out.println("ERRO! Verifique se o codigo da editora esta correto.");
				}
            }
            else if(op == 12) 		
            {
            		n = -1;
                System.out.println();
                System.out.println("Até logo!");
            }
            
		}
	}
}

/* public class Teste {

	public static void main(String[] args) {

		//classe Biblioteca contem um array de Obras
		//usando polimorfismo, pode-se inserir Livretos e DVDs neste array,
		//pois ambas sao subclasses de Obra
		Biblioteca x = new Biblioteca(10);

		//nao eh + possivel instanciar objeto tipo Obra, pois esta agora possui método abstrato!
		//x.ins(new Obra("xxx", "clovis"));
		
		x.ins(new Livreto("yyy", "eu", 100));
		x.ins(new DVD("zzz", "quem"));

		//polimorfismo em acao:
		Obra o;
		o = new Livreto("yyy", "eu", 200);
		x.ins(o);
		
		//Livreto l;
		//l = new Obra("xxx","clovis");  --> nao pode!
		
		System.out.println("\nBiblioteca de Obras (Livretos e DVDs)...");
		x.show();
		
	}

} */
