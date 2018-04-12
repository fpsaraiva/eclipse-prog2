package gerenciamentocidade;

public class Teste {

	public static void main(String[] args)
	{
		Cidade vi = new Cidade(10, 80, "Viamão");
		Cidade poa = new Cidade(10, 80, "Poa");
		
		Municipio mu = new Municipio(4);
		
		mu.insereCid(poa);
		mu.insereCid(new Cidade(10, 80, "Alvorada"));
		mu.insereCid(vi);
		mu.insereCid(new Cidade(10, 80, "Gravatai"));
		
		mu.mostraMunicipio();
		
		mu.removeCid("Alvorada");

		System.out.println();
		mu.mostraMunicipio();

		//Faltou implementar metodo numMedioCasas()
		//System.out.println("Num. medio de casas:"+mu.numMedioCasas());
		
		Cidade city = new Cidade(5, 5, "Gotham");
		
		Casa casaQualquer = new Casa(1, "alvenaria", 10, true, true);
		
		city.insereEdificacao(1, 2, casaQualquer);
		city.insereEdificacao(1, 1, new Casa(2, "madeira", 12, true, false));
		city.insereEdificacao(1, 3, new Edificio(5, "cimento", 30, 2, 20, 30));
		city.insereEdificacao(4, 1, new Edificio(7, "cimento", 20, 3, 10, 40));
		
		System.out.println("\n***** Mapa do município de " + city.getNome() + " *****");
		city.mostraMapa();
		
		System.out.print("\nValor IPTU: ");
		city.calculaIptu(2, 4, 3, 4);
		
		city.removeEdificacao(1, 3);
		
		//System.out.println();
		System.out.println("\n***** Mapa do município de " + city.getNome() + " *****");
		city.mostraMapa();
		
		city.pesquisaTerrenoComPiscina(casaQualquer);
		
		Sala auxS1 = new SalaComercial(50, "Pilates");
		Sala auxS2 = new SalaComercial(50, "Psicologo");
		
		((Edificio) city.getTerreno(4, 1).getEd()).ocupaSala(auxS1);
		((Edificio) city.getTerreno(4, 1).getEd()).ocupaSala(auxS2);
		((Edificio) city.getTerreno(4, 1).getEd()).ocupaSala(new SalaComercial(50, "Advogados"));
		((Edificio) city.getTerreno(4, 1).getEd()).ocupaSala(new ApResidencial(50, "Joao Gouveia"));
		
		System.out.println("******Infos do Condominio******");
		
		((Edificio) city.getTerreno(4,1).getEd()).mostraSalas();
		
	}
	
}
