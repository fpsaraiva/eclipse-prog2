package sisbiblio;

public interface SeloSeguranca 
{

	final int base = 8742; //propriedades são final 
	
	//estes métodos  são públicos
	public void setaSelo();
	public boolean verificaSelo();
	public void mostraSelo();
	
	/*
	 * Obs.:
	 * 1.interface é uma classe abstrata sem nenhuma implementacao
	 * ou seja, todos metodos são abstratos e públicos
	 * 
	 * 2.propriedades (se presentes) são constantes (final) e devem
	 * ser inicializadas
	 * 
	 * 3.uma classe pode implementar várias interfaces simultaneamente
	 * 
	 */
}
