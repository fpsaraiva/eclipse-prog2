package gerenciamentocidade;

public class Cidade {

	private Terreno[][] mapa;
	String nome;
		
	public Cidade(int linhas, int colunas, String nome) 
	{
		mapa = new Terreno[linhas][colunas];
		
		for(int i = 0; i < mapa.length; i++) {
			for(int j = 0; j < mapa[i].length; j++) {
				mapa[i][j] = new Terreno((int) (Math.random() * 1001) + 50, null);
			}
		}	
		
		this.nome = nome;
	}
		
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void insereEdificacao(int lin, int col, Edificacao ed)
	{
		mapa[lin][col].setEd(ed);		
	}
	
	public Terreno getTerreno(int lin, int col)
	{	
		return mapa[lin][col];
	}
	
	public void removeEdificacao(int lin, int col)
	{
		mapa[lin][col].setEd(null);
	}
	
	public void mostraMapa()
	{
		for(int i = 0; i < mapa.length; i++) {
			System.out.println();
			for(int j = 0; j < mapa[i].length; j++) {
				if(((Terreno) mapa[i][j]).getEd() == null) {
					System.out.print("-" + "\t");
				} else if(((Terreno) mapa[i][j]).getEd() instanceof Casa) {
					System.out.print("C" + "\t");
				} else if (((Terreno) mapa[i][j]).getEd() instanceof Edificio) {
					System.out.print("E" + "\t");
				}
			}
		}
		System.out.println();
	}
				
	public void calculaIptu(int lin1, int lin2, int col1, int col2)
	{
	 
		int soma = 0;
		
		for(int i = lin1; i < lin2; i++) {
			for(int j = col1; j < col2; j++) {
				if(((Terreno) mapa[i][j]).getEd() == null) {
					soma += mapa[i][j].getArea() * 1.75;
				} else if(((Terreno) mapa[i][j]).getEd() instanceof Casa) {
					if(((Terreno) mapa[i][j]).getEd().getMaterial().equalsIgnoreCase("alvenaria") && ((Casa) mapa[i][j].getEd()).isComPiscina()) {
						soma += mapa[i][j].getArea() * 1.5 + mapa[i][j].getEd().getAreaConstruida() * 1.12 + 2.3;
					} else if(((Terreno) mapa[i][j]).getEd().getMaterial().equalsIgnoreCase("madeira") && ((Casa) mapa[i][j].getEd()).isComPiscina()) {
						soma += mapa[i][j].getArea() * 1.5 + mapa[i][j].getEd().getAreaConstruida() * 1.04 + 2.3;
					} else if(((Terreno) mapa[i][j]).getEd().getMaterial().equalsIgnoreCase("alvenaria")) {
						soma += mapa[i][j].getArea() * 1.5 + mapa[i][j].getEd().getAreaConstruida() * 1.12;
					} else if(((Terreno) mapa[i][j]).getEd().getMaterial().equalsIgnoreCase("madeira")) {
						soma += mapa[i][j].getArea() * 1.5 + mapa[i][j].getEd().getAreaConstruida() * 1.04;
					}
				} else if (((Terreno) mapa[i][j]).getEd() instanceof Edificio) {
					soma += mapa[i][j].getArea() * 1.4 +  mapa[i][j].getEd().getAreaConstruida() * 1.3 
							+ ((Edificio) mapa[i][j].getEd()).getQuantosElevadores() * 0.2
							+ ((Edificio) mapa[i][j].getEd()).getQuantasVagasBox() * 0.15;
				}
			}
		}
		System.out.println(soma);
	}

	public void pesquisaTerrenoComPiscina(Edificacao ed)
	{
		for(int i = 0; i < mapa.length; i++) {
			System.out.println();
			for(int j = 0; j < mapa[i].length; j++) {
				if(((Terreno) mapa[i][j]).getEd() instanceof Casa && ((Casa) ed).isComPiscina()) {
						System.out.print("ACHEI UMA CASA COM PISCINA"); //impressao pode ser melhorada
						break; 
				}
			}
		}
	}

}