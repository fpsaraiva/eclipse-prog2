package exerciciosrecursao;

public class MaiorDivisorComum {

	private int result;

	public MaiorDivisorComum(int x, int y) {

		if (x <= 0) {
			throw new IllegalArgumentException("argumento x inferior ou igual a 0");
		}
		if (y <= 0) {
			throw new IllegalArgumentException("argumento y inferior ou igual a 0");
		}

		this.result = mdc(x, y);

	}

	private int mdc(int x, int y) {
		int resto = x % y;
		if (resto == 0) {
			return y;
		} else {
			return mdc(y, resto);
		}

	}

	public int getResult() {
		return this.result;
	}

}
