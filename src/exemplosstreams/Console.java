package exemplosstreams;
import java.io.*;

public class Console 
{

	void console() 
	{	
	
	}
	
	public static void main( String args[])
	{	
		char c;
		
		try { 
			System.out.println("digite:");
			c = (char) System.in.read();
			System.out.println("digitou:");
			System.out.write(c);
			System.out.flush();
		}
		
		catch(IOException e) {
			
		}
	}
	
}
