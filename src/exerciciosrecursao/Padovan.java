package exerciciosrecursao;

public class Padovan 
{
	private int result;

	public Padovan(int numero) 
	{
		if (numero < 0) {
			throw new IllegalArgumentException("argumento inferior a 0");
		}
		this.result = pad(numero);
	}

	private int pad(int n) 
	{
		if (n == 0) {
			return 1; 
		} else if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 0;
		}
		return  pad(n - 2) + pad(n - 3);		
	}

	public int getResult() 
	{
		return result;
	}
	
}