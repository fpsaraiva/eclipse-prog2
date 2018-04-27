package exerciciorecursaoalunos;
import java.util.Arrays;

public class Exercicios 
{
	// procura char em uma String
	public boolean exercicio3(String texto, char c)
	{
		if (texto==null || texto.length()==0) return false;
		return exercicio3(texto,c,0);
	}
	
	private boolean exercicio3(String texto, char c, int i){
		if(i>=texto.length()) return false;
		if(texto.charAt(i)==c) return true;
		return exercicio3(texto,c,i+1);
	}
	
	// inverte array
	public void exercicio2(double[] array)
	{
		if(array == null || array.length <2) throw new IllegalArgumentException("array nulo ou vazio ou tem menos de 2 elementos");
		exercicio2(array, 0, array.length -1);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	 private void exercicio2(double[] array, int i, int j)
	{ 	
		if(i<j){
	       double tmp = array[i];
	       array[i] = array[j];
	       array[j] = tmp;
	       exercicio2(array, i+1, j-1);
	    }   
		
	}
	
	
	// Lista de exercicio recursao 2
	public int exercicio6(Alunos[][] aluno) 
	{
		if(aluno==null) throw new IllegalArgumentException();
		return exercicio6(aluno,0,0);
	}

	private int exercicio6(Alunos[][] alunos, int i, int j )
	{
		if(i>=alunos.length) return 0; // linha
		if (j>=alunos[i].length) return exercicio6(alunos,i+1,0); // checa a coluna
		if (alunos[i][j].getNota()<6) return 1 + exercicio6(alunos,i,j+1); // reprovou
		return 0 + exercicio6(alunos,i,j+1); // esse passou

	}
	
}