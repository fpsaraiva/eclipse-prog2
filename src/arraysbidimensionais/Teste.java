package arraysbidimensionais;
import teclado.Teclado;

public class Teste {

	// EXERCICIO 1

	private static void exercicio1() 
	{
	
	int matriz1[][] = new int[3][10];
	
	for (int i = 0; i < matriz1.length; i++) {
		for (int j = 0; j < matriz1[i].length; j++) {
			matriz1[i][j] = j;
		}
	}

	System.out.println("a)");
	mostraMat(matriz1);

	int matriz2[][] = new int[5][10];

	for (int i = 0; i < matriz2.length; i++) {
		for (int j = 0; j < matriz2[i].length; j++) {
			matriz2[i][j] = (j * j);
		}
	}

	System.out.println("\nb)");
	mostraMat(matriz2);

	int matriz3[][] = new int[6][6];

	for (int i = 0; i < matriz3.length; i++) {
		for (int j = 0; j < matriz3[i].length; j++) {
			matriz3[i][j] = i;
		}
	}

	System.out.println("\nc)");
	mostraMat(matriz3);

	int matriz4[][] = new int[9][6];

	for (int i = 0; i < matriz4.length; i++) {
		for (int j = 0; j < matriz4[i].length; j++) {
			if (i % 2 == 0)  {
				matriz4[i][j] = -1;
			} else {
				matriz4[i][j] = 0;
			}
		}
	}

	System.out.println("\nd)");
	mostraMat(matriz4);
	
	}
	
	// EXERCICIO 2: Preencha uma matriz de inteiros com numeros aleatorios positivos menores que 100

	private static void exercicio2()
	{
		int matriz5[][] = new int[5][5];

		for (int i = 0; i < matriz5.length; i++) {
			for (int j = 0; j < matriz5[i].length; j++) {
				matriz5[i][j] = (int) (Math.random() * 99);
			}
		}
		mostraMat(matriz5);
	}
			
	// EXERCICIO 3: Escreva um trecho Java que leia 10 valores double do teclado e armazene-os em uma matriz de dimensoes 2x5
	
	private static void exercicio3() 
	{
		double matriz6[][] = new double[2][5];

		for (int i = 0; i < matriz6.length; i++) {
			for (int j = 0; j < matriz6[i].length; j++) {
				double numeroDigitado = Teclado.leDouble("digite um numero double: ");
				matriz6[i][j] = numeroDigitado;
			}
		}
		mostraMatDouble(matriz6);
	}
	
	// EXERCICIO 4: Crie um metodo que recebe uma matriz bidimensional double e retorna a quantidade de linhas da matriz
	
	public static int quantLinhas(double[][] matriz) 
	{
		return matriz.length;
	}
	
	// EXERCICIO 5: Crie um metodo que recebe uma matriz bidimensional double e retorna a quantidade de elementos da matriz
	
	public static int quantElementos(double[][] matriz) 
	{
		int contador = 0;

		for (int i = 0; i < matriz.length; i++) {
			contador += matriz[i].length;
		}
		return contador;
	}
	
	// EXERCICIO 6: Crie um metodo que recebe uma matriz bidimensional double e devolve um String de saida para ela

	public static String retornaString(double[][] matriz) 
	{
		String m = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				m += matriz[i][j];
			}
			m += "\n";
		}
		return m;
	}
	
	// EXERCICIO 7: Crie um metodo que recebe uma matriz bidimensional double e retorna o maior valor da matriz
	
	public static double maiorValor(double[][] matriz) 
	{
		double maior = matriz[0][0];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
		}
		return maior;
	}

	// EXERCICIO 8: Crie um metodo que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz
	
	public static int somaValores(int[][] matriz) 
	{
		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
		}
		return soma;
	}

	/* EXERCICIO 9: Crie um metodo que recebe uma matriz bidimensional inteira e um
	   inteiro que indica uma de suas linhas, e retorna a media dos valores daquela
	   linha
	*/
	
	public static double mostraMediaLinha(int[][] matriz, int linha) 
	{
		double soma = 0;

		for (int j = 0; j < matriz[linha].length; j++) {
			soma += matriz[linha][j];
		}

		return soma / matriz[linha].length;
	}

	// EXERCICIO 10: Faca um metodo que devolve uma matriz de numeros lidos do teclado
	
	private static int[][] exercicio10() 
	{
		int numeroLinhas = Teclado.leInt("quantas linhas vc deseja na sua matriz? ");
		int numeroColunas = Teclado.leInt("quantas colunas vc deseja na sua matriz? ");
		
		int matriz9[][] = new int[numeroLinhas][numeroColunas];

		for (int i = 0; i < matriz9.length; i++) {
			for (int j = 0; j < matriz9[i].length; j++) {
				int numeroDigitado = Teclado.leInt("digite um numero inteiro: ");
				matriz9[i][j] = numeroDigitado;
			}
		}
		return matriz9;
	}
	
	/* EXERCICIO 11: Crie um metodo que recebe uma matriz de inteiros positivos e
	   substitui seus elementos de valor impar por -1 e os pares por +1
	*/
	
	public static void mostraNegativo() 
	{
		int matriz10[][] = new int[3][3];

		for (int i = 0; i < matriz10.length; i++) {
			for (int j = 0; j < matriz10[i].length; j++) {
				matriz10[i][j] = (int) (Math.random() * 99);
			}
		}
		
		for (int i = 0; i < matriz10.length; i++) {
			for (int j = 0; j < matriz10[i].length; j++) {
				if (matriz10[i][j] % 2 == 0) {
					matriz10[i][j] = +1;
				} else {
					matriz10[i][j] = -1;
				}
				System.out.print(matriz10[i][j] + "\t");
			}
			System.out.println();
		}
	}

	//metodos auxiliares
	
	public static void mostraMat(int[][] matriz) 
	{
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void mostraMatDouble(double[][] matriz) 
	{
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	// metodo principal

	public static void main(String[] args) 
	{

		exercicio1(); 
	
		System.out.println("\nExercicio 2.");
		exercicio2();

		System.out.println("\nExercicio 3.");
		exercicio3();
		
		System.out.println("\nExercicio 4.");
		System.out.println("Qtde de linhas da matriz: " + quantLinhas(new double[9][7]));

		System.out.println("\nExercicio 5.");
		System.out.println("Qtde de elementos da matriz: " + quantElementos(new double[9][7]));

		double matriz7[][] = new double[2][4];

		for (int i = 0; i < matriz7.length; i++) {
			for (int j = 0; j < matriz7[i].length; j++) {
				matriz7[i][j] = (int) (Math.random() * 99);
			}
		}

		System.out.println("\nExercicio 6.");
		System.out.println("matriz: " + retornaString(matriz7));

		System.out.println("\nExercicio 7.");
		System.out.println("Maior valor: " + maiorValor(matriz7));

		int matriz8[][] = new int[3][3];

		for (int i = 0; i < matriz8.length; i++) {
			for (int j = 0; j < matriz8[i].length; j++) {
				matriz8[i][j] = (int) (Math.random() * 99);
			}
		}
		
		System.out.println("\nExercicio 8.");
		System.out.println("Soma: " + somaValores(matriz8));

		System.out.println("\nExercicio 9.");
		int linha = Teclado.leInt("digite o numero de uma linha, entre 0 e 2: ");

		System.out.println();
		System.out.println("Média da linha escolhida: " + mostraMediaLinha(matriz8, linha));

		System.out.println("\nExercicio 10.");
		mostraMat(exercicio10());

		System.out.println("\nExercicio 11.");
		mostraNegativo();
		
	}

}
