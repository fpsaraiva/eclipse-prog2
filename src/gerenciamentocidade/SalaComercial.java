package gerenciamentocidade;

public class SalaComercial extends Sala implements registroPrefeitura {

	double areaSala;
	String registroComercial;
	
	public SalaComercial(double area, String registro) 
	{
		this.areaSala = area;
		this.registroComercial = registro;
	}

	public double getAreaSala() 
	{
		return areaSala;
	}

	public void setAreaSala(double areaSala) 
	{
		this.areaSala = areaSala;
	}

	public String getRegistroComercial() 
	{
		return registroComercial;
	}

	public String toString()
	{
		return "\n---Sala Comercial---\n" +
			   "Registro Comercial: " + registroComercial +
			   "\nArea: " + areaSala + 
			   "\nValor do condominio: " + calcCondominio();
	}
	
	public void setRegistroComercial(String registroComercial) 
	{
		this.registroComercial = registroComercial;
	}

	@Override
	protected double calcCondominio() 
	{
		return getValor() * areaSala * 1.7;
	}

	@Override
	public double getValor()
	{
		return valorCub * 3;
	}
}
