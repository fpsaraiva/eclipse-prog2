package exerciciosrecursao;

public class Fatorial {

	private int result;

	public Fatorial(int n) {
		if (n<0) throw new IllegalArgumentException("argumento inferior a 0");
		this.result = fat(n);
	}

	private int fat(int x) {
		if (x <= 0) {
			return 1;
		} else {
			return x * fat(x - 1);
		}

	}

	public int getResult() {
		return result;
	}

}
