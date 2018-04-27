package exerciciosrecursao;

public class Exponencial 
{
	private int result;

	public Exponencial(int m, int n) 
	{
		this.result = expo(m, n);
	}

	private int expo(int mm, int nn) 
	{
		if (nn == 0) {
			return 1;
		} else {
			mm = mm * expo(mm, nn - 1);
		}

		return mm;

	}

	public int getResult() 
	{
		return result;
	}

}
