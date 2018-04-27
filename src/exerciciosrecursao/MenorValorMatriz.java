package exerciciosrecursao;

public class MenorValorMatriz {
	
	public int menorValorMatriz (int[][] matriz) {
	if(matriz == null || matriz.length <2 || matriz[0].length<2) throw new IllegalArgumentException("array nulo ou vazio ou tem menos de 2 elementos");
	
	    int menor = matriz[0][0];
		return menorValorMatriz(matriz,0,0, menor);
		}
	
	private int menorValorMatriz(int[][] array,int linha, int coluna, int menor)
	{
		
		if (linha < array.length) {
	        if (coluna < array[linha].length) {
	            if (array[linha][coluna]<menor) menor =array[linha][coluna] ;
	            return menorValorMatriz(array, linha, coluna + 1, menor);
	        } else {
	        	
	            return menorValorMatriz(array, linha + 1, 0, menor);
	        }
	    }else
	    	return menor;
	}
		
}
	
	

