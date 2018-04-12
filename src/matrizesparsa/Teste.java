package matrizesparsa;

	/*
	 * 
	 * Versao 3 = todos os metodos implementados,
	 * inclusive o metodo copia().
	 * 
	 */

public class Teste {

	public static void main(String[] args) {
		
		MatrizEsparsa me = new MatrizEsparsa(20, 20, 0.01); //matriz de 20x20 doubles
		
		me.setConteudoCel(7.0, 3, 2);
		me.setConteudoCel(80.0, 18, 17);
		me.setConteudoCel(5.0, 18, 2);
		
		System.out.println("Soma = " + me.soma());
		System.out.println("Menor valor = " + me.min());
		System.out.println("Maior valor = " + me.max());
		System.out.println("Existe o valor 80.0? " + me.exist(80.0));
		System.out.println("Existe o valor 100.0? " + me.exist(100.0));
		System.out.println("Valor médio dos elementos da coluna 2 = " + me.coluna(2));
		System.out.println("Valor médio dos elementos da coluna 5 = " + me.coluna(5));
		System.out.println("Valor médio dos elementos da linha 18 = " + me.linha(18));
		System.out.println("Valor médio dos elementos da linha 10 = " + me.linha(10));
		System.out.println();
		me.copia(2, 1, 3, 3);
		System.out.println();
		me.copia(17, 1, 3, 3);
		System.out.println();
		me.copia(17, 16, 3, 3);
	}

}
