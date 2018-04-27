package exerciciosrecursao;

public class Soma 
{
	private int result;

	public Soma(int n)
	{
		if(n <= 0) {
			throw new IllegalArgumentException("argumento inferior ou igual a zero");
		}
		this.result=s(n);
	}
	
	private int s(int n)
	{
		if(n == 1) {
			return 1;
		}
		return n + s(n - 1);
	}

	public int getResult() 
	{
		return result;
	}
	
}