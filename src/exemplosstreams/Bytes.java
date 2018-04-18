package exemplosstreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytes 
{

	Bytes() 
	{	
	
	}
	
	public static void main(String args[])
	{
		
		//criando o arquivo
		File f = new File("dados.txt");
		
		//armazenando (gravando) dados no arquivo
		try {
			FileOutputStream fos = new FileOutputStream(f);
			
			fos.write(83);  //primeiro byte
			fos.write(73);  //segundo byte
			fos.write(77);  //segundo byte
			
			int x = 65;
			fos.write(x);  //inteiros maiores que 255 ocupam + de um byte no arquivo
			
			fos.write('8');   //grava 56  que eh o cod. ASCII do char '8'
			fos.write(10);    //grava 10, que eh o ASCII da nova linha
			fos.write('\n');  //tambem grava 10
			
			for(int i = 0; i < 5; i++) {
				fos.write(i + 100);    //grava  100 101 102 103 104
			}
			
			String str = "Futebol";
			byte []palavra = str.getBytes();
			
			fos.write(palavra, 0, 5);   //grava um array de bytes; inicio no indice 0, total de 5 bytes
			
			fos.close();
		}
		catch(IOException e) {
			System.out.println("não foi possivel salvar no arquivo...");
		} 
		
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());  //mostra o caminho onde o arquivo foi salvo.

			
		try {
			FileInputStream fis = new FileInputStream("dados.txt");
			//poderia aqui deixar assim  ->    FileInputStream fis = new FileInputStream(f);
			
			//lendo os dados do arquivo
			for(int i = 0; i < 17; i++) {
				System.out.println(fis.read());
			}
			
			/*
			byte byteLido;
			while((byteLido = (byte) fis.read()) != -1) {   //enquanto não chegar no final do arquivo
				System.out.println(byteLido);
			}
			*/
			
			fis.close();
		}
		catch(IOException e) {
			System.out.println("não foi possivel ler do arquivo...");
		}

		//APPEND: anexando no final do arquivo
		try {
			FileOutputStream fos = new FileOutputStream(f,true); //para true informa que eh append...
			
			//grava os 3 bytes(xyz) no final do arquivo
			fos.write("xyz".getBytes(), 0, "xyz".length());
			fos.close();
		}
		catch(IOException e) {
			System.out.println("não foi possivel salvar no arquivo...");
		} 
	}
	
}
