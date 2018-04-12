package gerenciamentocidade;

public class Terreno {

	double area;
	Edificacao ed;
	
	public Terreno(double area, Edificacao ed) {
		this.area = area;
		this.ed = ed;
	}

	public double getArea() 
	{
		return area;
	}

	public void setArea(double area) 
	{
		this.area = area;
	}

	public Edificacao getEd() 
	{
		return ed;
	}

	public void setEd(Edificacao ed) 
	{
		this.ed = ed;
	}
	
}
