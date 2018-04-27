package exerciciosrecursao;

public class Fibonacci {
	private int result;

	public Fibonacci(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("argumento inferior a 0");
		}
		this.result = fib(numero);

	}

	private int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public int getResult() {
		return result;
	}
	
	
}
