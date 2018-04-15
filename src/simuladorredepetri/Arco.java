package simuladorredepetri;

public class Arco 
{
	private Lugar lugar;
	private int peso;
	
	public Arco(Lugar lugar, int peso) 
	{
		this.lugar = lugar;
		this.peso = peso;
	}

	public Lugar getLugar() 
	{
		return lugar;
	}

	public void setLugar(Lugar lugar) 
	{
		this.lugar = lugar;
	}

	public int getPeso() 
	{
		return peso;
	}

	public void setPeso(int peso) 
	{
		this.peso = peso;
	}

}
