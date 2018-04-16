package simuladorredepetri;
import teclado.Teclado;

public class Teste {

	public static void main(String[] args) {
		
		Rede rede = new Rede(5, 2);
		
		Lugar l1 = new Lugar(1, "L1");
		Lugar l2 = new Lugar(2, "L2");
		Lugar l3 = new Lugar(0, "L3");
		Lugar l4 = new Lugar(1, "L4");
		Lugar l5 = new Lugar(0, "L5");
		
		rede.inserirLugar(l1);
		rede.inserirLugar(l2);
		rede.inserirLugar(l3);
		rede.inserirLugar(l4);
		rede.inserirLugar(l5);
		
		Transicao t1 = new Transicao(2, 2, "T1", true);
		t1.inserirArcoDeEntrada(new Arco (l1, 1));
		t1.inserirArcoDeEntrada(new Arco (l2 , 2));
		t1.inserirArcoDeSaida(new Arco (l2, 2));
		t1.inserirArcoDeSaida(new Arco (l3, 1));
		rede.inserirTransicao(t1);
		
		Transicao t2 = new Transicao(2, 1, "T2", false);
		t2.inserirArcoDeEntrada(new Arco(l3, 1));
		t2.inserirArcoDeEntrada(new Arco(l4, 1));
		t2.inserirArcoDeSaida(new Arco(l5, 1));
		rede.inserirTransicao(t2);
		
		rede.mostrarRede();
		rede.executarCiclo();
		rede.mostrarRede();
		rede.checarTransicoes();
		rede.executarCiclo();
		rede.mostrarRede();
		rede.checarTransicoes();
		
		/* segunda etapa: criar interacao com usuario na montagem da rede
		System.out.println("*******************");
        System.out.println("BEM VINDO AO SIMULADOR PETRI NET 1.0");
        System.out.println("*******************");
        int numeroLugaresRede = Teclado.leInt("\nQuantos lugares? ");
        int numeroTransicoesRede = Teclado.leInt("Quantas transições? ");
		
		Rede rede = new Rede(numeroLugaresRede, numeroTransicoesRede);
		
		for(int i = 0; i < numeroTransicoesRede ; i++) {
			Transicao T = new Transicao(Teclado.leInt("Quantidade lugares de entrada em T" + (i + 1) + ":"), Teclado.leInt("Quantidade lugares de saída em T" + (i + 1) + ":"), "T" + (i + 1),
					false); //rever habilitada
		}
		
		for(int i = 0; i < numeroLugaresRede ; i++) {
			Lugar L = new Lugar(Teclado.leInt("Quantidade de marcas em L" + (i + 1) + ": "), "T" + (i + 1));
			rede.insereLugar(L);
		}
		*/
	}

}
