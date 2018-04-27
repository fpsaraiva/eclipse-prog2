package exerciciosrecursao;

public class Regressiva 
{
	private String str = "";

	public Regressiva(int n) 
	{
		if (n < 0) {
			throw new IllegalArgumentException("argumento inferior a 0");
		}
		
		reg(n);
	}

	private int reg(int n) 
	{
		this.str = this.str + n + "-";
	
		if (n == 0) {
			return 0;
		} else {
			return reg(n - 1);
		}
	}

	public String getStr() 
	{
		return str;
	}

}