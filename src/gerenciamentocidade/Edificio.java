package gerenciamentocidade;

public class Edificio extends Edificacao 
{
	int quantosElevadores, quantasVagasBox;
	private Sala[] condominio;
	private int totSalasOcupadas = 0;
	
	public Edificio(int quantidadeAndares, String material, double areaConstruida, int quantosElevadores,
			int quantasVagasBox, int totSalaOcupadas) 
	{
		super(quantidadeAndares, material, areaConstruida);
		this.quantosElevadores = quantosElevadores;
		this.quantasVagasBox = quantasVagasBox;
		condominio = new Sala[totSalaOcupadas];
	}

	public int getQuantosElevadores() 
	{
		return quantosElevadores;
	}

	public void setQuantosElevadores(int quantosElevadores) 
	{
		this.quantosElevadores = quantosElevadores;
	}

	public int getQuantasVagasBox() 
	{
		return quantasVagasBox;
	}

	public void setQuantasVagasBox(int quantasVagasBox) 
	{
		this.quantasVagasBox = quantasVagasBox;
	}
	
	public boolean ocupaSala(Sala s)
	{
		condominio[totSalasOcupadas++] = s;
		return true;
	}
	
	public void mostraSalas()
	{
		for(int i = 0; i < condominio.length; i++) {
			if((Sala) condominio[i] instanceof ApResidencial) {
				System.out.println(((ApResidencial) condominio[i]).toString()); 
			} else if ((Sala) condominio[i] instanceof SalaComercial) {
				System.out.println(((SalaComercial) condominio[i]).toString());
			}
		}
	}
	
}
