package sisbiblio;

public interface SeloSeguranca {

	final int base = 8742; //propriedades sao final 
	
	
	//estes m�todos  sao publicos
	public void setaSelo();
	public boolean verificaSelo();
	public void mostraSelo();
	
	/*
	 * Obs.:
	 * 1.interface eh uma classe abstrata sem nenhuma implementacao
	 * isto eh, todos metodos sao abstratos e publicos
	 * 
	 * 2.propriedades (se presentes) sao constantes (final) e devem
	 * ser inicializadas
	 * 
	 * 3.uma classe pode implementar varias interfaces simultaneamente
	 * 
	 */
}
