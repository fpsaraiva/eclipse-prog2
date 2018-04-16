package simuladorredepetri;

public class Rede 
{
	private int qtdeLugares, qtdeTransicoes;
	private int totLugares, totTransicoes;
	private Lugar []vetLugares;
	private Transicao []vetTransicao;
	private boolean validação;

	public Rede(int qtdeLugares, int qtdeTransicoes) 
	{
		this.qtdeLugares = qtdeLugares;
		this.qtdeTransicoes = qtdeTransicoes;
		this.vetLugares = new Lugar[qtdeLugares];
		this.vetTransicao = new Transicao[qtdeTransicoes];
	}

	public int getQtdeLugares() 
	{
		return qtdeLugares;
	}

	public void setQtdeLugares(int qtdeLugares) 
	{
		this.qtdeLugares = qtdeLugares;
	}

	public int getQtdeTransicoes() 
	{
		return qtdeTransicoes;
	}

	public void setQtdeTransicoes(int qtdeTransicoes) 
	{
		this.qtdeTransicoes = qtdeTransicoes;
	}
	
	public boolean inserirLugar(Lugar lugar) 
	{
		if (totLugares == qtdeLugares) {
			System.out.println();
			System.out.println("ERRO! Número máximo de lugares atingido!");
			return false;
		} else {
			vetLugares[totLugares++] = lugar;
			return true;
		}
	}
	
	public boolean inserirTransicao(Transicao transicao) 
	{
		if (totTransicoes == qtdeTransicoes) {
			System.out.println();
			System.out.println("ERRO! Número máximo de transições atingido!");
			return false;
		} else {
			vetTransicao[totTransicoes++] = transicao;
			return true;
		}
	}
	
	public void mostrarRede() 
	{
		String leftAlignFormat = "| %-15s | %-13d |%n";

		System.out.format("\n+-----------------+---------------+%n");
		System.out.format("| Nome do Lugar   | Qtde marcas   |%n");
		System.out.format("+-----------------+---------------+%n");
		
		for (int i = 0; i < totLugares; i++) {
		    System.out.format(leftAlignFormat, vetLugares[i].getNomeLugar(), vetLugares[i].getQtdeMarcas());
		}
		
		String leftAlignFormatBool = "| %-15s | %-16b |%n";
		
		System.out.format("+---------------------+--------------+%n");
		System.out.format("| Nome da Transição   | Habilitada   |%n");
		System.out.format("+---------------------+--------------+%n");
		
		for (int i = 0; i < totTransicoes; i++) {
		    System.out.format(leftAlignFormatBool, vetTransicao[i].getNomeTransicao(), vetTransicao[i].verificarHabilitacao());
		}
		
		System.out.format("+---------------------+--------------+%n");
	}
	
	public void executarCiclo() 
	{
		for (int i = 0; i < totTransicoes; i++) {
			if(vetTransicao[i].verificarHabilitacao()){
				vetTransicao[i].setMarcasEntrada();
				vetTransicao[i].setMarcasSaida();
			}
		}
		System.out.println("\nCiclo executado com sucesso!");
	}

	public boolean checarTransicoes()
	{
		for(int i = 0; i < vetTransicao.length; i++) {
			if(vetTransicao[i].getTotHabilitadas() == 0) {
				System.out.println("Rede travada! Não há mais transições habilitadas");
				validação = true;
			} else {
				validação = false;
			}
		}
		return validação;
	}
}