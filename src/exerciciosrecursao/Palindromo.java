package exerciciosrecursao;

public class Palindromo {
	private boolean ehPalindromo;

	public Palindromo(String palavra) {
		this.ehPalindromo = ep(palavra);

	}

	private boolean ep(String string) {
		if (string.length() == 0 || string.length() == 1)
			return true;

		int first = 0;
		int last = string.length() - 1;

		if (string.charAt(first) != string.charAt(last))
			return false;

		String str = "";
		for (int i = first + 1; i < last; i++) {
			str = str + string.charAt(i);
		}
		boolean sa = ep(str);
		return sa;
	}

	public boolean ehPalindromo() {
		return ehPalindromo;

	}
}