package sisbiblio;

public class Biblio {

	Livro [] vetLivros;
	int tot;
	
	public Biblio(int tam) {
		vetLivros = new Livro[tam];
		tot = 0;
	}
	
	public void ins(Livro l ) {
		vetLivros[tot++] = l;
	}
	
	public void show() {
		for(int i=0;i<tot;i++)
			System.out.println(vetLivros[i].getNome());
	}
}
