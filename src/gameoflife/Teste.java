package gameoflife;

/*
 * Regras do Jogo:
 * 1- Qualquer c�lula viva com menos de dois vizinhos vivos morre de solid�o.
 * 2- Qualquer c�lula viva com mais de tr�s vizinhos vivos morre de superpopula��o.
 * 3- Qualquer c�lula morta com exatamente tr�s vizinhos vivos se torna uma c�lula viva.
 * 4- Qualquer c�lula viva com dois ou tr�s vizinhos vivos continua no mesmo estado para a pr�xima gera��o.
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