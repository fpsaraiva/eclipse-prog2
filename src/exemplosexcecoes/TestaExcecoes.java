package exemplosexcecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaExcecoes 
{

	// === Arithmetic ================================================
	public static int dividir(int x, int y) 
	{
		int res = 0;
		try {
			res = x / y; // pode gerar uma divisao por zero
		} catch (ArithmeticException e) {
			System.out.println("Excecao: aritmetica");
			e.printStackTrace();
			System.out.println("message: "+e.getMessage());
		} catch (Exception e) {
			System.out.println("Excecao: generica");
			// e.printStackTrace();
		}
		System.out.println("saindo do metodo...");
		return res;
	}

	// === ArrayIndexOutOfBounds ====================================
	public static void inicArray(int x, int y) 
	{
		int vet[] = new int[5];
		try {
			vet[0] = x / y;
			vet[7] = 0;
		} catch (ArithmeticException e) {
			System.out.println("Excecao: aritmetica ===> " + e + " <===");
			// e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Excecao: ArrayIndexOutOfBounds");
			// e.printStackTrace();
		} finally {
			System.out.println("se houve excecao, sempre passa por aqui...");
		}
		System.out.println("saindo de inicArray...");

	}

	// === InputMismatch =======================================
	public static void leDados() 
	{
		int num;
		Scanner s = null;
		
		try {
			s = new Scanner(System.in); 
			System.out.print("Digite valores inteiros:");
			while (s.hasNext()) { // s.hasNextInt() so deixaria laco ativo no caso de
								  // leitura de int's
				//num = s.nextInt();
				num = (int) Integer.parseInt(s.next());
				if (num == 0)
					break;
			}
		} catch (NumberFormatException e) {
			System.out.println("Excecao: NumberFormat.");

		} finally {
			if(s!=null) {
				System.out.println("fechando scanner...");
				s.close();
			}
		}
	}

	// === ExcecaoEspecifica =======================================
	public static void leMaisDados() 
	{
		Scanner s=null;
		int i = 0, num[] = new int[5];
		try {
			s = new Scanner(System.in);
			System.out.print("Digite 5 valores inteiros:");

			//while (s.hasNextInt()) {
			while (s.hasNext()) {
				num[i] = s.nextInt();
				if (num[i] < 0 || num[i] > 100) {
					// poderia instanciar objeto ExcecaoEspecifica aqui:
					// ExcecaoEspecifica ee = new ExcecaoEspecifica(num);
					// throw ee;
					throw new ExcecaoEspecifica(num[i]);
				}
				i++;
			}
			
		} catch (ExcecaoEspecifica e) {
			System.out.println("Excecao: excecao especifica ==> " + e + " <==");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Excecao: ArrayIndexOutOfBounds");
		} catch (InputMismatchException e) {
			System.out.println("Excecao: InputMismatch.");
		} finally {
		    if(s!=null) {
		    	System.out.println("fechando aqui tb o scanner...");
		        s.close();
		    }
		}
		// se nao houvesse o tratador ArrayIndexOutOfBounds e ocorresse a excecao
		// ArrayIndexOutOfBounds
		// a execucao iria ser abortada com a geracao desta excecao nao tratada
	}

	// === Nao trata ExcecaoEspecifica aqui=================================
	public static void leMaisDadosMasNaoTrata() throws ExcecaoEspecifica 
	{   
		int num;
		Scanner s  =null;
		try {
			s = new Scanner(System.in);
			System.out.print("Digite + alguns valores inteiros:");
			while (s.hasNextInt()) {
				num = s.nextInt();
				if (num < 0 || num > 100)
					throw new ExcecaoEspecifica(num);
			}
		} catch (ArithmeticException e) {
			System.out.println("Excecao: aritmética.");
		} finally {
			System.out.println("fim local...");
			s.close();
		}
	}

	// ..............................................................

	public static void main(String[] args) 
	{

		System.out.println(dividir(5, 0));

		inicArray(5, 0);

		//sugestao: descomentar so uma chamada de cada vez...
		
		//leDados();

		//leMaisDados();

		/*
		try {
			leMaisDadosMasNaoTrata();
		} catch (ExcecaoEspecifica e) {
			System.out.println("Excecao tratada no main: excecao especifica ==> " + e + " <==");
		} finally {
			System.out.println("finalizando...");
		}
		*/
		

	}

}
