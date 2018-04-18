package exemplosstreams;
import java.io.*;

public class Buffered 
{

	Buffered()
	{
	
	}
	
	public static void main(String args[])
	{
		
		//Lendo do console com BufferedReader...
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(is);
		
		try {
			String aux = teclado.readLine();
			System.out.println("Leu:"+aux);
		}
		catch(IOException e)
		{
			
		}

		//Lendo de arquivo com BufferedReader...
		try {
			FileReader f = new FileReader("dados.txt");
			BufferedReader in = new BufferedReader(f);
			String linha;
			while((linha=in.readLine())!=null) System.out.println("Leu:"+linha); 
			/* outras possibilidade:
			   char []vet = new char[100];
			   int quantosLeu = in.read(vet);    //se retornar -1, alcancou final da stream
			   quantosLeu = in.read(vet, 2, 4);  //le a partir da posicao 2, 4 chars
			*/ 
			in.close();
		}
		catch(IOException e)
		{
			
		}
		
		//Gravando arquivo com PrintWriter...
		try {
			FileWriter f = new FileWriter("dadosSaida.txt");
			PrintWriter out = new PrintWriter(f);
			
			out.println("primeira linha");
			out.println("segunda linha");
			out.println(123);
			 
			out.close();
		}
		catch(IOException e)
		{
			
		}
			
	}
}
