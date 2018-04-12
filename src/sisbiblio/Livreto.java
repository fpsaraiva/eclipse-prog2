package sisbiblio;

public class Livreto extends Obra implements SeloSeguranca{
   
	private int edicao;
	
	public int getEdicao() {
		// int id = getId();   metodo getId() de Obra nao eh herdado...
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public Livreto(String nome,String autor, int edicao) {
		super(nome, autor);
		this.edicao = edicao;
		this.setaSelo();
	}
	
	//implementando (obrigatoriamente) metodo abstrato da super classe Obra:
	@Override
	protected int calculaTamanho() {
		return (int) (Math.random()*1000); //sorteia a quantidade de pag.s do Livreto
	}

	//implementando metodos da interface SeloSeguranca
	@Override
	public void setaSelo() {
		int val = (int)(Math.random()*100);
		seloSeg = base * val;	
	}

	@Override
	public boolean verificaSelo() {
		if(seloSeg % base == 0)
				return true;
		else 
			return false;
	}

	@Override
	public void mostraSelo() {
		System.out.println("selo de seguranca n." + seloSeg);		
	}

}
