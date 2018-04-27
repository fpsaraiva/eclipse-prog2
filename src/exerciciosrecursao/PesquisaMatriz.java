package exerciciosrecursao;

public class PesquisaMatriz 
{
	private int linha = 0;
	private int coluna = 0;
	private boolean result;
	private boolean r = false;

	public PesquisaMatriz(int[][] matriz, int val) 
	{
		this.result = pesquisa(matriz, val);
	}

	private boolean pesquisa(int[][] elementos, int elemento) 
	{
		if (elementos[linha].length == coluna) 
		{
			linha++;
			coluna = 0;
		}

		if (elementos.length > linha) {
			if (elementos[linha][coluna] == elemento) {
				r = true;
			}
		} else {
				coluna++;
				pesquisa(elementos, elemento);
		}
		
		return r;
	}

	public boolean isResult() 
	{
		return result;
	}

}