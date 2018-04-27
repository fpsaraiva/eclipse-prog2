package exerciciosrecursao;

public class ImprimeMatrizChar 
{

	public ImprimeMatrizChar(char[][] m)
	{	
		matrizprint(m, 0, 0);
	}
	
	private void matrizprint(char[][] array, int linha, int coluna) 
	{
	    if (linha < array.length) {
	        if (coluna < array[linha].length) {
	            System.out.print(array[linha][coluna]);
	            matrizprint(array, linha, coluna + 1);
	        } else {
	        	System.out.println();
	            matrizprint(array, linha + 1, 0);
	        }
	    }
	}
	
}