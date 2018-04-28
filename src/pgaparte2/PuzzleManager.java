package pgaparte2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PuzzleManager 
{
	private int op = 0;
	private char[] vetor;
	private char[][] matrizOriginal;
	private char[][] matrizEmbaralhada;
	private int i;
	
	public void play()
	{
		escolherArquivo();
		criarMatriz(op);
		embaralharQuadrantes(matrizOriginal);
	}
	
	public void escolherArquivo()
	{	
		try {
			//apresenta a interação
			System.out.println("Olá, escolha uma das imagens abaixo: \n");
						
			//mostra as 3 imagens
			FileReader arquivo1 = new FileReader("src/pgaparte2/arq1.txt");
			BufferedReader leArquivo1 = new BufferedReader(arquivo1);
			String linhaArquivo1;
			
			while((linhaArquivo1 = leArquivo1.readLine()) != null) {
				System.out.println(linhaArquivo1);
			}
			System.out.println();
			
			FileReader arquivo2 = new FileReader("src/pgaparte2/arq2.txt");
			BufferedReader leArquivo2 = new BufferedReader(arquivo2);
			String linhaArquivo2;
			
			while((linhaArquivo2 = leArquivo2.readLine()) != null) {
				System.out.println(linhaArquivo2);
			}
			System.out.println();
			
			FileReader arquivo3 = new FileReader("src/pgaparte2/arq3.txt");
			BufferedReader leArquivo3 = new BufferedReader(arquivo3);
			String linhaArquivo3;
			
			while((linhaArquivo3 = leArquivo3.readLine()) != null) {
				System.out.println(linhaArquivo3);
			}
			
			//usuário escolhe a imagem
			Scanner dados = new Scanner(System.in);
			System.out.println("\n1 - Inter / 2 - Flor / 3 - Casa");
			op = dados.nextInt();
			System.out.print("\nImagem escolhida: " + op);
			System.out.println("\n");
			
		} catch(IOException e) {
			System.out.println("ERRO! Não foi possível ler o(s) arquivo(s)!");
			e.getMessage();
		}
		
	}
	
	public void criarMatriz(int numeroEscolhido) 
	{
		//carrega o arquivo escolhido na matriz
		if(numeroEscolhido == 1) {
			try {
				FileReader arquivo1 = new FileReader("src/pgaparte2/arq1.txt");
				BufferedReader leArquivo1 = new BufferedReader(arquivo1);
				String linhaArquivo1;
				i = 0;
				matrizOriginal = new char[46][81];
				
				while((linhaArquivo1 = leArquivo1.readLine()) != null) {
					vetor = linhaArquivo1.toCharArray();
				
					for(int j = 0; j < vetor.length; j++) {
						matrizOriginal[i][j] = vetor[j];
					}
					
					i++;
				}
				
				arquivo1.close();	
				
			} catch(IOException e) {
				System.out.println("ERRO! Não foi possível ler o(s) arquivo(s)!");
				e.getMessage();
			}	
		}else if(numeroEscolhido == 2) {
			try {
				FileReader arquivo2 = new FileReader("src/pgaparte2/arq2.txt");
				BufferedReader leArquivo2 = new BufferedReader(arquivo2);
				String linhaArquivo2;
				i = 0;
				matrizOriginal = new char[46][81];
				
				while((linhaArquivo2 = leArquivo2.readLine()) != null) {
					vetor = linhaArquivo2.toCharArray();
				
					for(int j = 0; j < vetor.length; j++) {
						matrizOriginal[i][j] = vetor[j];
					}
					
					i++;
				}
				
				arquivo2.close();	
				
			} catch(IOException e) {
				System.out.println("ERRO! Não foi possível ler o(s) arquivo(s)!");
				e.getMessage();
			}
		} else if(numeroEscolhido == 3) {
			try {
				FileReader arquivo3 = new FileReader("src/pgaparte2/arq3.txt");
				BufferedReader leArquivo3 = new BufferedReader(arquivo3);
				String linhaArquivo3;
				i = 0;
				matrizOriginal = new char[46][81];
				
				while((linhaArquivo3 = leArquivo3.readLine()) != null) {
					vetor = linhaArquivo3.toCharArray();
				
					for(int j = 0; j < vetor.length; j++) {
						matrizOriginal[i][j] = vetor[j];
					}
					
					i++;
				}
				
				arquivo3.close();	
				
			} catch(IOException e) {
				System.out.println("ERRO! Não foi possível ler o(s) arquivo(s)!");
				e.getMessage();
			}	
		}
			

	}
	
	public void embaralharQuadrantes(char[][] matriz)
	{
		/*
		for (int i = 0; i < matrizOriginal.length; i++) {
			for (int j = 0; j < matrizOriginal[0].length; j++) {
			
				System.out.print(matrizOriginal[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		//cria os quadrantes da matriz
		//quadrante1 = new char[5][9];
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 27; j++) {
				matrizEmbaralhada[i][j] = matrizOriginal[i][j];
			}
			System.out.println();	
		}
		
		//quadrante2 = new char[5][9];
		/*
		for (int i = 5; i < 5; i++) {
			for (int j = 9; j < 9; j++) {
				System.out.print(matrizOriginal[i][j] + " ");
			}
			System.out.println();
		}
		*/
	}
	
}