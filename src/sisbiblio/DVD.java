package sisbiblio;

public class DVD extends Obra implements SeloSeguranca
{
	public DVD(String nome, String autor) 
	{
		super(nome, autor);
		this.setaSelo();
		
	}
	
	//sobrescrevendo método da super classe:
	@Override
	protected String getNome() 
	{
		return "nome:" + super.getAutor();
	}

	//implementando (obrigatoriamente) método abstrato da super classe Obra:
	@Override
	protected int calculaTamanho() 
	{	
		return  (int) (Math.random()*200+1000); //sorteia o tamanho do DVD em MB;
	}
   
	
	//implementando metodos da interface SeloSeguranca
	@Override
	public void setaSelo() 
	{
		int val = (int)(Math.random()*100);
		seloSeg = base * val;	
	}

	@Override
	public boolean verificaSelo() 
	{
		if(seloSeg % base == 0)
				return true;
		else 
			return false;
	}
	
	@Override
	public void mostraSelo() 
	{
		System.out.println("selo de seguranca n." + seloSeg);		
	}
	
}
