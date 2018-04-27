package exerciciosrecursao;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fatorial f = new Fatorial(5);
		System.out.println(f.getResult());
		
		Soma s = new Soma(4);
		System.out.println(s.getResult());
		
		int[] vet = {-1, 0 ,1,2,3,4,5,6,7,8,9};
		SomaArray sa = new SomaArray(vet);
		System.out.println(sa.getResult());
		
		
		Exponencial e = new Exponencial(2,3);
		System.out.println(e.getResult());
		
		InverteArray i = new InverteArray(vet);
		System.out.println(i.toString());
		
		double[] vet2 = { 1.1, 1.3,1.4,2.99,5.674, 4.75, 3};
		InverteArrayDouble iad = new InverteArrayDouble(vet2);
		System.out.println(iad.toString());
		
		
		
		char[][] matrizChar = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		
		ImprimeMatrizChar imca = new ImprimeMatrizChar(matrizChar);
		
		
		Fibonacci fib = new Fibonacci(6);
		System.out.println(fib.getResult());
		
		//1, 0, 0, 1, 0, 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49,
		//65, 86, 114, 151, 200, 265, 351, 465, 616, 816, 1081, 1432, 1897,
		//https://oeis.org/A000931
		
		Padovan pad = new Padovan(12);
		System.out.println(pad.getResult());
		
		Regressiva r = new Regressiva(10);
		System.out.println(r.getStr());
		
		Progressiva p = new Progressiva(10);
		System.out.println(p.getStr());
		
		Palindromo pa = new Palindromo("arara");
		System.out.println(pa.ehPalindromo());
		
		pa = new Palindromo("osso");
		System.out.println(pa.ehPalindromo());
		
		pa = new Palindromo("rua");
		System.out.println(pa.ehPalindromo());
		
		UtilString u = new UtilString();
		System.out.println(u.removeAcentos("� uma boa ideia."));
		
		
		pa = new Palindromo("O galo ama o lago.");
		
		String str = u.removeAcentosEspacos("O galo ama o lago.");
		pa= new Palindromo(str);
		
		System.out.println(pa.ehPalindromo());
				
		MenorValorArray ma = new MenorValorArray(vet);
		System.out.println(ma.getResult());
		
		int[][] mat = { {1,2,3},{-10,2,7},{9,-28,6}};
		
		PesquisaMatriz pm = new PesquisaMatriz(mat, -28);
		System.out.println(pm.isResult());
		
		DecBin db = new DecBin(8);
		System.out.println(db.getStr());
		
		Pell n = new Pell(5);
		System.out.println(n.getResult());
		
		MaiorDivisorComum mad = new MaiorDivisorComum(8,4);
		System.out.println(mad.getResult());
		
		
	}

	

}
