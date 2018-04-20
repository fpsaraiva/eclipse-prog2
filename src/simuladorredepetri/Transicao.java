package simuladorredepetri;

public class Transicao 
{
	 private int qtdeLugaresEntrada, qtdeLugaresSaida;
	 private int totLugaresEntrada, totLugaresSaida;
	 private String nomeTransicao;
	 private boolean habilitada;
	 private Arco []vetLugaresEntrada;
	 private Arco []vetLugaresSaida;
	 	 
	public Transicao(int qtdeLugaresEntrada, int qtdeLugaresSaida, String nomeTransicao, boolean habilitada) 
	{
		this.qtdeLugaresEntrada = qtdeLugaresEntrada;
		this.qtdeLugaresSaida = qtdeLugaresSaida;
		this.nomeTransicao = nomeTransicao;
		this.habilitada = habilitada; //default para este atributo pode ser false
		this.vetLugaresEntrada = new Arco[qtdeLugaresEntrada];
		this.vetLugaresSaida = new Arco[qtdeLugaresSaida];
	}

	public String getNomeTransicao() 
	{
		return nomeTransicao;
	}
	
	public boolean inserirArcoDeEntrada(Arco conexao) 
	{
		if (totLugaresEntrada == qtdeLugaresEntrada) {
			System.out.println();
			System.out.println("ERRO! Número máximo de conexões de entrada atingido!");
			return false;
		} else {
			vetLugaresEntrada[totLugaresEntrada++] = conexao;
			return true;
		}
	}
	
	public boolean inserirArcoDeSaida(Arco conexao) 
	{
		if (totLugaresSaida == qtdeLugaresSaida) {
			System.out.println();
			System.out.println("ERRO! Número máximo de conexões de saída atingido!");
			return false;
		} else {
			vetLugaresSaida[totLugaresSaida++] = conexao;
			return true;
		}
	}
	
	public boolean verificarHabilitacao() 
	{
		for (int i = 0; i < totLugaresEntrada; i++) {
			if(vetLugaresEntrada[i].getLugar().getQtdeMarcas() >= vetLugaresEntrada[i].getPeso()) {
				habilitada = true;
			} else {
				habilitada = false;
			}
		}
		return habilitada;
	}
	
	public void setMarcasEntrada() 
	{
		for (int i = 0; i < totLugaresEntrada; i++) {
			vetLugaresEntrada[i].getLugar().consumirMarcas(vetLugaresEntrada[i].getPeso());
		}
	}
	
	public void setMarcasSaida() 
	{
		for (int i = 0; i < totLugaresSaida; i++) {
			vetLugaresSaida[i].getLugar().adicionarMarcas(vetLugaresSaida[i].getPeso());
		}
	}
	
}
