package labirinto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Teste 
{
	static char mat[][];

	public static void main(String args[]) 
	{

		int QntLinhas = 0;
		int QntColunas = 0;
		
		try {
			FileReader f = new FileReader("labirinto.txt");
			BufferedReader in = new BufferedReader(f);
			String linha;
			while ((linha = in.readLine()) != null) {
				QntLinhas++;
				QntColunas = linha.length();
			}
			in.close();
		} 
		catch (IOException e) {
		
		}

		System.out.println(QntLinhas);
		System.out.println(QntColunas);

		mat = new char[QntLinhas][QntColunas];

		try {
			FileReader f = new FileReader("labirinto.txt");
			BufferedReader in = new BufferedReader(f);
			String linha;
			int i = 0;
			while ((linha = in.readLine()) != null) {
				for (int j = 0; j < QntColunas; j++) {
					mat[i][j] = linha.charAt(j);
				}
				i++;
			}
			in.close();
		} catch (IOException e) {
		}

		mostra(mat);
		achaSaida(12, 12);
		mostra(mat);

	}

	private static void mostra(char z[][]) 
	{
		for (int linha = 0; linha < z.length; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < z[linha].length; coluna++) {
				System.out.print(z[linha][coluna]);
			}
		}
		System.out.println();
	}

	private static void achaSaida(int x, int y) 
	{
		if (mat[x][y] == 'S'){
			System.out.println("Achei a saida em linha " + x + " coluna: " + y );	
		}
		else{
			if (mat[x][y] == '.' || mat[x][y] == 'S') {
				mat[x][y] = '+';
			}
			if (mat[x-1][y] == '.' || mat[x-1][y] == 'S') {
				achaSaida(x-1, y);
			}
			if (mat[x][y+1] == '.' || mat[x][y+1] == 'S') {
				achaSaida(x, y+1);
			}
			if (mat[x][y-1] == '.' || mat[x][y-1] == 'S') {
				achaSaida(x, y-1);
			}	
		}		
	}

}