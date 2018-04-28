package pgaparte1;

public class Teste 
{				
	public static void main(String[] args) 
	{
		Arquivo arq = new Arquivo();
		
		arq.lerArquivo("src/pgaparte1/fred.txt");
		arq.mostrarArquivo();
		arq.salvarEspelhado();
		arq.salvarInvertido();
		arq.salvarLargo();
		arq.salvarMagro();
		arq.salvarDeLado();
		arq.salvarBaixo();
		
	}

}
