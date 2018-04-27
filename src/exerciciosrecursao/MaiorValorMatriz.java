package exerciciosrecursao;

public class MaiorValorMatriz 
{	
	public int maiorValorMatriz (int[][] matriz) 
	{
		if(matriz == null || matriz.length <2 || matriz[0].length<2) {
			throw new IllegalArgumentException("array nulo ou vazio ou tem menos de 2 elementos");
		}
	
	    int menor = matriz[0][0];
		return maiorValorMatriz(matriz,0,0, menor);
	}
	
	private int maiorValorMatriz(int[][] array,int linha, int coluna, int maior)
	{
		if (linha < array.length) {
	        if (coluna < array[linha].length) {
	            if (array[linha][coluna] > maior) { 
	            	maior =array[linha][coluna];
	            }
	            return maiorValorMatriz(array, linha, coluna + 1, maior);
	        } else {
	            return maiorValorMatriz(array, linha + 1, 0, maior);
	        }
	    }else {
	    	return maior;
	    }
	}		

}	

