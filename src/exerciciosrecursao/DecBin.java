package exerciciosrecursao;

public class DecBin {

	private String str = "";

	public DecBin(int n) {
		if (n < 0)
			throw new IllegalArgumentException("argumento inferior a 0");
		db(n);
	}

	private void db(int num) {
		if (num > 0) {
			db(num / 2);
			this.str = this.str + (num % 2);

		}

	}

	public String getStr() {
		return str;
	}

}
