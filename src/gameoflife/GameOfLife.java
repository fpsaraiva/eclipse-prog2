package gameoflife;

public class GameOfLife 
{
	private boolean[][] estadoAtual;
	private boolean[][] proximoEstado;
	private int tamanho;
	
	//construtor do "tabuleiro" do jogo, de acordo com o tamanho especificado
	
	public GameOfLife(int tamanho) 
	{
		this.tamanho = tamanho;
		estadoAtual = new boolean[this.tamanho][this.tamanho];
		proximoEstado = new boolean[this.tamanho][this.tamanho]; 
		
		for(int i = 0; i < estadoAtual.length; i++) {
			for(int j = 0; j < estadoAtual[i].length; j++) {
				estadoAtual[i][j] = false;
			}
		}
		
	}
	
	//torna a celula viva
	
	
	public boolean setCellAlive(int linha, int coluna, boolean isAlive)
	{
		try {
			return estadoAtual[linha][coluna];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Vc tentou criar uma célula em uma posição inválida: linha " + linha + " e coluna " + coluna + ".");
		}
		return false;
	}
	
	//torna a celula morta
	
	public boolean setCellDead(int linha, int coluna, boolean isAlive)
	{
		try {
			return estadoAtual[linha][coluna];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Vc tentou matar uma célula em uma posição inválida: linha " + linha + " e coluna " + coluna + ".");
		}
		return false;
	}
	
	//executa um ciclo da simulação do autômato
	
	public void execCycle()
	{
		int quantVivos;
		
		for(int i = 0; i < estadoAtual.length; i++) {
			for(int j = 0; j < estadoAtual[i].length; j++) {
				quantVivos = getQuantNeighborsAlive(i, j);
				
							//para células vivas
				if(isCellAlive(i, j)) {
					setCellNextState(i, j, (quantVivos == 2 || quantVivos == 3));
				} else {	//para células mortas
					setCellNextState(i, j, (quantVivos == 3));
				}
			}
		}
		
		//realiza a alteração de estado da célula
		for(int i = 0; i < estadoAtual.length; i++) {
			for(int j = 0; j < estadoAtual[i].length; j++) {
				estadoAtual[i][j] = proximoEstado[i][j];
			}
		}
		
		show();
	}
	
	//mostra o estado atual do autômato
	
	public void show()
	{	
		for(int i = 0; i < estadoAtual.length; i++) {
			for(int j = 0; j < estadoAtual[i].length; j++) {
				 System.out.print(estadoAtual[i][j] ? 'X' : '.');
				 System.out.print(' ');
			}
			System.out.println();
		}
	}

	//métodos auxiliares
	
	private int getQuantNeighborsAlive(int linha, int coluna) 
	{
		int soma = 0;
		
		for(int i = linha - 1; i <= linha + 1; i++) {
			for(int j = coluna - 1; j <= coluna + 1; j++) {
				soma += (estadoAtual[safe(i)][safe(j)] ? 1 : 0);
			}
		}
		return soma - (estadoAtual[safe(linha)][safe(coluna)] ? 1 : 0);
	}
	
	private int safe(int i) 
	{
		return (i < 0) ? this.tamanho - 1 : i % this.tamanho;
	}
	
	//verifica se a célula está viva
	
	private boolean isCellAlive(int linha, int coluna) {
		try {
			return estadoAtual[linha][coluna];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Vc tentou verificar se uma está viva, porém em uma posição inválida: linha " + linha + " e coluna " + coluna + ".");
		}
		return false;
	}
	
	//seta o próximo estado da célula
	
	private void setCellNextState(int linha, int coluna, boolean isAlive) {
		proximoEstado[linha][coluna] = isAlive;
	}
}