package sisbiblio;

public class Biblioteca {

	Obra[] vetObras;
	int tot;

	public Biblioteca(int tam) {
		vetObras = new Obra[tam];
		tot = 0;
	}

	public void ins(Obra l) {
		vetObras[tot++] = l;
	}

	public void show() {
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

}
