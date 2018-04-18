package exemplosstreams;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Arquivos 
{

	Arquivos()
	{	
	
	}
	
	public static void main(String args[])
	{
		File f = new File("dados.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			
			fos.write(123); //primeiro byte
			fos.write(57);  //segundo byte
			fos.close();
		}
		catch(IOException e) {
			
		}
		
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		
		if(f.exists()) System.out.println("Arquivo existe.");
		if(f.canWrite()) System.out.println("Arquivo pode ser modificado.");
		if(f.canRead()) System.out.println("Arquivo pode ser lido.");
		if(f.isDirectory()) System.out.println("E' uma pasta.");
		else System.out.println("E' um arquivo.");
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date(f.lastModified());
		System.out.println("data ultima modificacao:"+df.format(data));
			
		System.out.println("tamanho do arquivo:"+f.length());
		
		File f2 = new File("pasta");
		
		if(!f2.exists()) f2.mkdir();    //se nao existe, cria o diretorio
		
		String s[] = f2.list();
		for(int i=0; i< s.length;i++) {  //lista conteudo do diretorio
			System.out.print(s[i]); 
			if ((new File(s[i])).isDirectory()) System.out.println(" e' uma pasta.");
			else System.out.println(" e' um arquivo.");
		}
			
		try {
			FileInputStream fis = new FileInputStream("dados.txt");
			
			System.out.println(fis.read());
			System.out.println(fis.read());
			fis.close();
		}
		catch(IOException e)
		{
			
		}
	}
	
}
