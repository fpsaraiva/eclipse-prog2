package planilhaexcel;
import java.io.*;
 
public class Planilha
{     
    public Celula[][] mat;
    private int totLinhas;
    private int totColunas;
 
    Planilha(int totLin, int totCol)
    {
        this.totLinhas = totLin;
        this.totColunas = totCol;
        mat = new Celula[totLin][totCol];
    }
 
    //coloca valor double na celula
     
    public void setCel(double Valor, int Linha, int Coluna)
    {
        mat[Linha][Coluna] = new Celula(Valor, Linha, Coluna);
    }
     
    //coloca valor String na celula
     
    public void setCel(String s, int Linha, int Coluna)
    {
        mat[Linha][Coluna] = new Celula(s, Linha, Coluna);
    }
 
    //coloca valor Formula na celula
     
    public void setCel(Formula f, int Linha, int Coluna)
    {
        mat[Linha][Coluna] = new Celula(f, Linha, Coluna);
    }
     
    //mostra todas as celulas, dentro de um intervalo passado por parametro
    
    public void mostraPlan(int primeiraLinha, int primeiraColuna, int ultimaLinha, int ultimaColuna)
    {
    	for (int i = primeiraLinha; i < ultimaLinha; i++) {
    		System.out.println();
    		for (int j = primeiraColuna; j < ultimaColuna; j++) {
    			if(mat[i][j] == null) {
    				System.out.print('-' + "\t");
                }else if(mat[i][j].getString() != null){
                    System.out.print(mat[i][j].getString() + "\t");
                }else if(mat[i][j].getFormula() instanceof Formula){
                    System.out.print(calcula(mat[i][j].getFormula()) + "\t");
                }else{
                    System.out.print(mat[i][j].getValor() + "\t");
                }   
            }
        }
    }

    //salva a plainha em um arquivo
    
    public void salvaPlan()
    {
    	
    }
    
    //limpa todas as celulas, dentro de um intervalo passado por parametro
    
	 public void limpaCels(int i, int j, int k, int l)
	 {
			mat[i][j] = null;
			
			if(j < mat[i].length-1) {
				limpaCels(i, j + 1, k, l);
			}else if(i <= k) {
				limpaCels(i + 1, j - 1, k, l);
			}
		}
	 
	 //metodo auxiliar de calculo
     
	 public double calcula(Formula f)
	 {        
		 double resultado = 0;
	 
		 if(f.getOperacao() == '+'){
			 resultado = mat[f.l1][f.c1].getValor() + mat[f.l2][f.c2].getValor();
		 }else if(f.getOperacao() == '-'){
			 resultado = mat[f.l1][f.c1].getValor() - mat[f.l2][f.c2].getValor();
		 }else if(f.getOperacao() == '*'){
			 resultado = mat[f.l1][f.c1].getValor() * mat[f.l2][f.c2].getValor();
		 }else if(f.getOperacao() == '/'){
			 if(mat[f.l2][f.c2].getValor() == 0){
				 resultado = 0;
			 }else{
				 resultado = mat[f.l1][f.c1].getValor() / mat[f.l2][f.c2].getValor();
			 }
		 }
	        
		 return resultado;
	 }
     
}