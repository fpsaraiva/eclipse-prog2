package gerenciamentocidade;

public class Municipio 
{
	Cidade[] vetMunicipios;
	int total;

	public Municipio(int m) 
	{
		vetMunicipios = new Cidade[m];
	}
	
	public boolean insereCid(Cidade c) 
	{
		vetMunicipios[total++] = c;
		return true;
	}
	
	public boolean removeCid(String c) 
	{
		if(total == 0) {
			System.out.println();
			System.out.println("Não há cidades cadastradas!");
			return false;
		} else {
			for(int i = 0; i < total; i++) {
				if(c.equalsIgnoreCase(vetMunicipios[i].getNome())) {
					compactaVet(i);
					System.out.println();
					System.out.println("Cidade de " + vetMunicipios[i].getNome() + " removida com sucesso!");
					break;
				}
			}
		}
			return true;
	}
	
	public void mostraMunicipio() 
	{
		for(int i = 0; i < total; i++) {
			System.out.println(vetMunicipios[i].getNome());
		}
	}
	
	//metodos auxiliares
	
	private void compactaVet(int posicao) 
	{
		for(int i = posicao; i < total - 1; i++) {
			vetMunicipios[i] = vetMunicipios[i + 1];
		}
		total--;
	}

}