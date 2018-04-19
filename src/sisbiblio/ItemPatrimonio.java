package sisbiblio;

public class ItemPatrimonio implements SeloSeguranca
{
    protected int seloSeg;
    
	public ItemPatrimonio() 
	{
		this.setaSelo();
	}
	
	//implementando métodos da interface SeloSeguranca
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
