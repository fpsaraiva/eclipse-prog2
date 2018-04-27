package exerciciosrecursao;

public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz ={ {1,2,-83},{1,2,3},{-1,0,-7}};
		
		MenorValorMatriz m = new MenorValorMatriz();
		System.out.println(m.menorValorMatriz(matriz));
		
		MaiorValorMatriz mm = new MaiorValorMatriz();
		System.out.println(mm.maiorValorMatriz(matriz));
		
		
	}

}
