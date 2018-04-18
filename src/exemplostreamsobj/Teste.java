package exemplostreamsobj;

public class Teste 
{

	public static void main(String[] args) 
	{
		
		ArquivoObjetos ar = new ArquivoObjetos();
		
		ar.ins(new Padaria("Sul"));
		ar.ins(new Padaria("Central"));
		ar.ins(new Padaria("Norte"));
		ar.ins(new Padaria("Golomb"));
		
		ar.mostra();
		
		ar.grava();
		
		ar.esvazia();
		
		ar.le();
		
		ar.mostra();
	}

}
