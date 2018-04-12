package matrizesparsa;

public class MatrizEsparsa {

	private Celula[] mat;
	private int totLinhas; 
	private int totColunas;
	private int naoZeros;
	
	MatrizEsparsa(int totLin, int totCol, double densidade)
	{
		this.totLinhas = totLin;
		this.totColunas = totCol;
		int tamanhoVet = (int) ((totLin * totCol)  * densidade); //densidade deve ser valor entre 0 e 1
		mat = new Celula[tamanhoVet]; //cria o vetor de celulas
		this.naoZeros = 0;
	}
	
	public double getConteudoCel(int numLinha, int numColuna)
	{
		double cont = 0;
		
		for(int i = 0; i < mat.length; i++) {
			if(mat[i] != null) {
				if(mat[i].getLinha() == numLinha && mat[i].getColuna() == numColuna) {
					cont = mat[i].getValor();
				}
			}
		}
		return cont;
	}
	
	public void setConteudoCel(double valor, int numLinha, int numColuna) 
	{
		for(int i = 0; i < mat.length; i++) {
			if(mat[i] == null) {
				mat[i] = new Celula(valor, numLinha, numColuna);
				naoZeros++;
				break;
			} else if(valor == 0) {
				mat[i] = null;
				naoZeros--;
				break;
			}
		}
	}

	public double soma()
	{
		double soma = 0;
		
		for(int i = 0; i < mat.length; i++) {
			if(mat[i] != null) {
				soma += mat[i].getValor();
			} else {
				soma += 0;
			}
		}
		return soma;
	}

	public double min()
	{
		double menorElemento = mat[0].getValor();

		for(int i = 0; i < mat.length; i++) {
			if(mat[i] != null) {
				if (mat[i].getValor() < menorElemento) {
					menorElemento = mat[i].getValor();
				}
			}
		}
		return menorElemento;
	}
	
	public double max()
	{
		double maiorElemento = mat[0].getValor();

		for(int i = 0; i < mat.length; i++) {
			if(mat[i] != null) {
				if (mat[i].getValor() > maiorElemento) {
					maiorElemento = mat[i].getValor();
				}
			}
		}
		return maiorElemento;
	}
	
	public boolean exist(double valor) 
	{
		for(int i = 0; i < mat.length; i++) {
			if(mat[i] != null) {
				if(mat[i].getValor() == valor) {
					return true;
				}
			}
		}
		return false;
	}
	
	public double coluna(int numCol)
	{
		double soma = 0;
		int cont = 0;
		
		for (int i = 0; i < mat.length; i++) {
			if(mat[i] != null) {
				if(mat[i].getColuna() == numCol) {
					if(mat[i].getValor() == 0) {
						continue;
					} else {
						soma += mat[i].getValor();
						cont++;
					}
				}
			}
			
		}
		if(soma == 0) {
			return 0;
		}
		return soma / cont;
	}
	
	public double linha(int numLin)
	{
		double soma = 0;
		int cont = 0;
		
		for (int i = 0; i < mat.length; i++) {
			if(mat[i] != null) {
				if(mat[i].getLinha() == numLin) {
					if(mat[i].getValor() == 0) {
						continue;
					} else {
						soma += mat[i].getValor();
						cont++;
					}
				}
			}
		}
		if(soma == 0) {
			return 0;
		}
		return soma / cont;
	}
	
	public double[][] copia(int primLin,int primCol, int quantasLinhas, int quantasColunas)
	{
		double[][] matriz = new double[totLinhas][totColunas];
		
		for(int k = 0; k < mat.length; k++) {
			if(mat[k] != null) {
				if(mat[k].getLinha() < totLinhas && mat[k].getColuna() < totColunas) {
					matriz[mat[k].getLinha()][mat[k].getColuna()] = mat[k].getValor();
				}
			}
		}
		
		for (int i = primLin; i < (primLin + quantasLinhas); i++) {
			for (int j = primCol; j < (primCol + quantasColunas); j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		return matriz;
	}
	
}
