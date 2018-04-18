package exemplostreamsobj;
import java.io.Serializable;

public class Padaria implements Serializable
{
	String nome;
	int numFunc;
  
	Padaria(String nome)
	{
		this.nome = nome; 
		numFunc = (int)(Math.random()*10);
	}
	
	public String getNome()
	{
		return nome;
	}
  
}
