package pgaparte1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Arquivo 
{
	private char[] vetor;
	private char vetorFred[][];
	private int quantLinhas;
	private int quantColunas;
	private int maxColunas;
	private int i;
	
	public void lerArquivo(String nomeArquivo) 
	{
		try {
			FileReader arquivo = new FileReader(nomeArquivo);
			BufferedReader leArquivo = new BufferedReader(arquivo);
			String linha;
			quantLinhas = 0;
			
			while((linha = leArquivo.readLine()) != null) {				
				vetor = linha.toCharArray();
				quantColunas = 0;
				
				for(int j = 0; j < vetor.length; j++) { 
					quantColunas++;
				}
				
				if(quantColunas > maxColunas) {
					maxColunas = quantColunas;
				}
				
				quantLinhas++;
			}
			
			vetorFred = new char[quantLinhas][maxColunas];
			
			arquivo = new FileReader(nomeArquivo);
			leArquivo = new BufferedReader(arquivo);
			i = 0;
			
			while((linha = leArquivo.readLine()) != null) {
				vetor = linha.toCharArray();
				
				for(int j = 0; j < vetor.length; j++){
					vetorFred[i][j] = vetor[j];
				}
				
				i++;
				
			}
			
			arquivo.close();
	
		} catch(IOException e) {
			System.out.println("Erro na abertura do arquivo!\n");
			e.getMessage();
		}

	}
	
	public void mostrarArquivo() 
	{
		for(int i = 0; i < vetorFred.length; i++) {
			for(int j = 0; j < vetorFred[0].length; j++) {
				System.out.print(vetorFred[i][j]);
			}
			System.out.println();
		}
	}
	
	public void salvarEspelhado()
	{	
		try {
			FileWriter arquivo = new FileWriter("Fred_espelhado.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			String linha;
			
			for(int i = 0; i < vetorFred.length; i++) {
				linha = "";
				for (int j = vetorFred[0].length - 1; j >= 0; j--) {
					linha += vetorFred[i][j];
				}
				gravaArquivo.println(linha);
			}
			gravaArquivo.close();
			
			System.out.print("\nArquivo espelhado criado com sucesso!");
		}
		catch(IOException e){
			System.out.println("Erro na hora de salvar o arquivo espelhado!\n");
			e.getMessage();
		}
	
	}
	
	public void salvarInvertido()
	{
		try {
			FileWriter arquivo = new FileWriter("Fred_invertido.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			String linha;
			
			for(int i = vetorFred.length - 1; i >= 0; i--) {
				linha = "";
				for(int j = 0; j< vetorFred[0].length; j++) {
					linha += vetorFred[i][j];
				}
				gravaArquivo.println(linha);
			}
			gravaArquivo.close();
			
			System.out.print("\nArquivo invertido criado com sucesso!");
		}
		catch(IOException e){
			System.out.println("Erro na hora de salvar o arquivo invertido!\n");
			e.getMessage();
		}
		
	}
	
	public void salvarLargo()
	{
		try {
			FileWriter arquivo = new FileWriter("Fred_largo.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			String linha;
			
			for(int i = 0; i < vetorFred.length; i++) {
				linha = "";
				for (int j = 0; j < vetorFred[0].length; j++) {
					linha += vetorFred[i][j];
					linha += vetorFred[i][j];
				}
				gravaArquivo.println(linha);
			}
			gravaArquivo.close();
			
			System.out.print("\nArquivo largo criado com sucesso!");
		}
		catch(IOException e){
			System.out.println("Erro na hora de salvar o arquivo largo!\n");
			e.getMessage();
		}
		
	}
	
	public void salvarMagro()
	{
		try {
			FileWriter arquivo = new FileWriter("Fred_magro.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			String linha;
			
			for (int i = 0; i < vetorFred.length; i++) {
				linha = "";
				for(int j = 0; j < vetorFred[0].length; j += 2) {
					linha += vetorFred[i][j];
				}
				gravaArquivo.println(linha);
			}
			gravaArquivo.close();
			
			System.out.print("\nArquivo magro criado com sucesso!");
		}
		catch(IOException e){
			System.out.println("Erro na hora de salvar o arquivo magro!\n");
			e.getMessage();
		}
		
	}
	
	public void salvarDeLado()
	{
		try {
			FileWriter arquivo = new FileWriter("Fred_baixo.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			String linha;
			
			for(int i = 0; i < vetorFred.length; i += 2) {
				linha = "";
				for(int j = 0; j < vetorFred[0].length; j ++) {
					linha += vetorFred[i][j];
				}
				gravaArquivo.println(linha);
			}
			gravaArquivo.close();
			
			System.out.print("\nArquivo de lado criado com sucesso!");
		}
		catch(IOException e){
			System.out.println("Erro na hora de salvar o arquivo de lado!\n");
			e.getMessage();
		}
		
	}
	
	public void salvarBaixo()
	{
		try {
			FileWriter arquivo = new FileWriter("Fred_de_lado.txt");
			PrintWriter gravaArquivo = new PrintWriter(arquivo);
			String linha;
			
			for(int i = vetorFred[0].length - 1; i >= 0; i--) {
				linha = "";
				for (int j = 0; j < vetorFred.length; j++) {
					linha += vetorFred[j][i];
				}
				gravaArquivo.println(linha);
			}
			gravaArquivo.close();
			
			System.out.print("\nArquivo baixo criado com sucesso!");
		}
		catch(IOException e){
			System.out.println("Erro na hora de salvar o arquivo baixo!\n");
			e.getMessage();
		}
		
	}
	
}
