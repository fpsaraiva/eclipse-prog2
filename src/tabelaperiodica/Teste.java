package tabelaperiodica;
import teclado.Teclado;

public class Teste {

	public static void main(String[] args)
	{
	
		TabelaPeriodica tP = new TabelaPeriodica();
		
		tp.setElemento(new ElementoQuimico("Be", "Berilio", 4, 9.012182), 2, 2); //linha 2, coluna 2
		tp.setElemento(new ElementoQuimico("Cr", "Cromo", 24, 51.9661), 4, 6); //linha 4, coluna 6
		
		System.out.println(tp.getTabela()); //mostra no console (tela) a tabela periódica
		
		tp.salvarTabela("tabelaTeste.txt");
	}
	
}
