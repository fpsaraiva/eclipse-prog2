package gerenciamentocidade;

public class ApResidencial extends Sala implements registroPrefeitura {

	double areaAp;
	String nomeProprietario;
	
	public ApResidencial(double area, String nome) 
	{
		this.areaAp = area;
		this.nomeProprietario = nome;
	}

	public double getAreaAp() 
	{
		return areaAp;
	}

	public void setAreaAp(double areaAp) 
	{
		this.areaAp = areaAp;
	}

	public String getNomeProprietario() 
	{
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) 
	{
		this.nomeProprietario = nomeProprietario;
	}

	public String toString()
	{
		return "\n---Apartamento Residencial---\n" +
			   "Proprietario: " + nomeProprietario +
			   "\nArea: " + areaAp +
			   "\nValor condominio: " + calcCondominio();
	}
	
	@Override
	protected double calcCondominio() 
	{
		return getValor() * areaAp;
	}

	@Override
	public double getValor()
	{
		return valorCub * 2;
	}
}
