package gerenciamentocidade;

public class Edificacao 
{
	int quantidadeAndares;
	String material;
	double areaConstruida;
	
	public Edificacao(int quantidadeAndares, String material, double areaConstruida) 
	{
		this.quantidadeAndares = quantidadeAndares;
		this.material = material;
		this.areaConstruida = areaConstruida;
	}

	public int getQuantidadeAndares() 
	{
		return quantidadeAndares;
	}

	public void setQuantidadeAndares(int quantidadeAndares) 
	{
		this.quantidadeAndares = quantidadeAndares;
	}

	public String getMaterial() 
	{
		return material;
	}

	public void setMaterial(String material) 
	{
		this.material = material;
	}

	public double getAreaConstruida() 
	{
		return areaConstruida;
	}

	public void setAreaConstruida(double areaConstruida) 
	{
		this.areaConstruida = areaConstruida;
	}
	
}
