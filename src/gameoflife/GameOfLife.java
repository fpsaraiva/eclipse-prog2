package gameoflife;

public class GameOfLife {

	private int totLinhas;
	private int totColunas;
	private boolean[][] tabuleiro;
	
	//construtor do "tabuleiro" do jogo, de acordo com as dimensoes especificadas
	
	public GameOfLife(int totLinhas, int totColunas) 
	{
		this.totLinhas = totLinhas;
		this.totColunas = totColunas;
		tabuleiro = new boolean[totLinhas][totColunas]; 
	}
	
	//torna a celula viva na proxima iteracao, de acordo com a logica do jogo
	
	/*
	public void setCellAlive(int linha, int coluna)
	{
		int contadorVivas = 0;
		boolean cellCurrentlyAlive = tabuleiro[linha][coluna];

		for(int r = -1; r <= 1; r++){
			int currentRow = row + r;
			currentRow = (currentRow < 0)? dimension - 1: currentRow;
			currentRow = (currentRow >= dimension)? 0 : currentRow;
			for(int c = -1; c <= 1; c++){
				int currentCol = col + c;
				currentCol = (currentCol < 0)? dimension - 1: currentCol;
				currentCol = (currentCol >= dimension)? 0 : currentCol;
				if(world[currentRow][currentCol]){
					liveCount++;
				}
			}
		}

		// Since all cells are counted including the cell we are calculating.
		// We must subtract 1 from the liveCount if the cell we are calculating for is alive.
		if(cellCurrentlyAlive){
			liveCount--;
		}
	
		// The game of life rules in code form.
		if(liveCount == 2 && cellCurrentlyAlive){
			return true;
		} else if(liveCount == 3){
			return true;
		} else {
			return false;
		}
	}
	
	*/
	
	public void setCellDead()
	{
		
	}
	
	public void execCycle()
	{
		
	}
	
	public void show(){
		
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {
				 System.out.print(tabuleiro[i][j] ? '@' : '.');
				 System.out.print(' ');
			}
			System.out.println();
		}
		//System.out.println("Generation:" + generation);
	}
	
}
