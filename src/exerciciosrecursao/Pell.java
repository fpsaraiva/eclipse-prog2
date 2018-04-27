package exerciciosrecursao;

public class Pell {

	private int result;

	public Pell(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("argumento inferior a 0");
		}
		this.result = pell(numero);

	}

	private int pell(int n) {
		if (n == 0 ) { return 0; }
		if (n ==1 ) {return 1;}
		
		return  2*pell(n-1)+pell(n-2) ;
		
	}

	public int getResult() {
		return this.result;
	}
	
	
	
}
