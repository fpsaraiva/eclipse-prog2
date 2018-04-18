package exemplostreamsobj;
import java.io.*;

public class ArquivoObjetos 
{

	 private Padaria []listaPadarias;
	 private int totPadarias;
	 
	  ArquivoObjetos()
	  {
		  listaPadarias = new Padaria[10]; 
		  totPadarias = 0;
	  }
	  
	  public void ins(Padaria oPadaria)
	  {
		  listaPadarias[totPadarias++] = oPadaria;
	  }
	  
	  public void esvazia()
	  {
		  totPadarias = 0;
	  }
	  
	  public void mostra() 
	  {
		  for(int i = 0; i < totPadarias; i++) {
			  System.out.println(listaPadarias[i].getNome());
		  }
	  }
	  
	  public void grava()
	  {
		  File f = new File("cadastropadarias.txt");
		  
		  try {
			  FileOutputStream fos = new FileOutputStream(f);
			  ObjectOutputStream os = new ObjectOutputStream(fos);
			  
			  for(int i = 0;i < totPadarias; i++) {
				  os.writeObject((Object)listaPadarias[i]);
			  }
					  
			  os.close(); 
			  fos.close();
		  }
		  catch(IOException e) {
			  System.out.println("nao consegui abrir o arquivo...");
		  }
	  }
	  
	public void le() 
	{
		 
		 Object o=null;
		 FileInputStream fis=null;
		 ObjectInputStream ois=null;	
		 
		 try { 
		      File f = new File("cadastropadarias.txt");
		  
		      System.out.println("tamanho:"+f.length()+" bytes.");
		  		  
		      fis = new FileInputStream(f);
		      
		      ois = new ObjectInputStream(fis);		  		  
			  		  
			  totPadarias = 0;
			  while((o=ois.readObject())!= null) {			  
				  if(o instanceof Padaria)  listaPadarias[totPadarias++] = (Padaria)o;
				 else throw new ClassNotFoundException();
			  }

			  ois.close();
			  fis.close();
		  }
		  catch(EOFException e){ 
			  System.out.println("alcancou final do Arquivo (EOF - End Of File)...");
		  }	
		  catch(FileNotFoundException e) {
			  System.out.println("não encontrei o arquivo...");
		  }
		  catch(IOException e) {
			  System.out.println("erro na leitura dos dados...");
		  } 
		  catch (ClassNotFoundException e) {
			  System.out.println("não encontrei a classe...");
		  }
		 finally { 
			 try { if (ois != null) ois.close(); } catch(IOException e) {} 
			 try { if (fis != null) fis.close(); } catch(IOException e) {} 
	      }
	}	  
}
