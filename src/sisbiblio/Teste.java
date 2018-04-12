package sisbiblio;

public class Teste {

	public static void main(String[] args) {

		//classe Biblio contem um array de Livros
		Biblio bi = new Biblio(20);

		bi.ins(new Livro("opa"));
		bi.ins(new Livro("oma"));

		System.out.println("Biblio de Livros...");
		bi.show();

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

}
