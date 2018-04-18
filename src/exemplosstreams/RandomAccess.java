package exemplosstreams;
import java.io.*;

public class RandomAccess 
{

	RandomAccess()
	{
	
	}
	
	public static void main(String args[])
	{
		double valor = 7.35;
		
		try
		{
		  RandomAccessFile f = new RandomAccessFile("arquivorand.txt","rw");
		  
		  f.writeBytes("primeira linha \n"); //readLine vai ler ate o \n
		  f.writeDouble(valor);
		  f.writeInt(123);
		  //f.writeByte(68);
		  
		  f.seek(0);                         //posiciona no inicio
		  String s = f.readLine();
		  System.out.println("Leu:"+s);
		  System.out.println("Leu:"+f.readDouble());
		  System.out.println("Leu:"+f.readInt());
		  //System.out.println("Leu:"+f.readByte());
		  
		  f.seek(f.length());                //posiciona no fim
		  f.write(100);
		  
		  f.close();
		}
		catch(IOException e)
		{
			
		}
	}

}