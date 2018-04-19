package gameoflife;

/*
 * Regras do Jogo:
 * 1- Qualquer célula viva com menos de dois vizinhos vivos morre de solidão.
 * 2- Qualquer célula viva com mais de três vizinhos vivos morre de superpopulação.
 * 3- Qualquer célula morta com exatamente três vizinhos vivos se torna uma célula viva.
 * 4- Qualquer célula viva com dois ou três vizinhos vivos continua no mesmo estado para a próxima geração.
 * 
 */

public class Teste 
{
	
	
	public static void main(String[] args)
	{
		GameOfLife jogo = new GameOfLife(9);
		
		jogo.setCellAlive(3, 3, true);
		jogo.setCellAlive(3, 4, true);
		jogo.setCellAlive(3, 5, true);
		jogo.setCellAlive(4, 3, true);
		jogo.setCellAlive(4, 4, true);
		jogo.setCellAlive(5, 3, true);
		jogo.setCellAlive(7, 7, true);
		jogo.setCellAlive(8, 8, true);
		jogo.setCellAlive(8, 7, true);
		jogo.setCellAlive(8, 6, true);
		
		jogo.show();
		
		for (int i = 0; i < 3; i++) {
			jogo.execCycle();
		}
	}
}